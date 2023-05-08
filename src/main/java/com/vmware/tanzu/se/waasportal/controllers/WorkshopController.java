package com.vmware.tanzu.se.waasportal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vmware.tanzu.se.waasportal.service.WorkshopService;

@Controller
@RequestMapping("/workshops")
public class WorkshopController {
  
  @Autowired
  private WorkshopService workshopService;

  @GetMapping
  public String index(Model model) {
    model.addAttribute("workshops", workshopService.getAvailableWorkshops());
    return "workshops/index.html";
  }
}
