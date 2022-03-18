package com.vmware.tanzu.se.waasportal.controllers;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vmware.tanzu.se.waasportal.model.TrainingPortal;
import com.vmware.tanzu.se.waasportal.service.TrainingPortalService;
import com.vmware.tanzu.se.waasportal.service.WorkshopService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/trainingportals")
public class TrainingPortalController {

    Logger log = LoggerFactory.getLogger(TrainingPortalController.class);

    @Autowired
    private TrainingPortalService trainingPortalService;

    @Autowired
    private WorkshopService workshopService;

    @GetMapping
    public String index(OAuth2AuthenticationToken authentication, Model model) {
        model.addAttribute("view", "index");
        model.addAttribute("trainingPortals", trainingPortalService.getTrainingPortalsForUser(authentication.getPrincipal().getAttribute("email")));
        return "trainingPortal/index";
    }

    @GetMapping("/{name}")
    public String show(@PathVariable String name, Model model) {
        model.addAttribute("trainingPortal", trainingPortalService.getTrainingPortal(name));
        return "trainingPortal/show";
    }

    @GetMapping("/new")
    public String newForm(OAuth2AuthenticationToken authentication, Model model) {
        model.addAttribute("view", "new");

        String user = ((String)authentication.getPrincipal().getAttribute("email")).split("@")[0];
        model.addAttribute("user", user);

        List<String> zoneIds = new ArrayList<>(ZoneId.getAvailableZoneIds());
        Collections.sort(zoneIds);
        model.addAttribute("zoneIds", zoneIds);

        model.addAttribute("workshops", workshopService.getAvailableWorkshops());
        return "trainingPortal/new";
    }

    @PostMapping("/create")
    public String create(OAuth2AuthenticationToken authentication, 
        @RequestParam ZoneId zone,
        String name,
        @DateTimeFormat(pattern = "yyyy-MM-dd''T''HH:mm")
        LocalDateTime expires,
        @RequestParam String workshops[]
        ) {
        
        trainingPortalService.save(
            TrainingPortal.builder()
            .name(name)
            .expires(expires.toInstant(zone.getRules().getOffset(Instant.now())))
            .owner(authentication.getPrincipal().getAttribute("email"))
            .workshops(workshops)
            .build()
        );
        return String.format("redirect:/trainingportals");
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable String name) {
        trainingPortalService.delete(name);
        return "redirect:/trainingportals";
    }
}
