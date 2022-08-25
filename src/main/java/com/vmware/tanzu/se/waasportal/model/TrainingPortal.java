package com.vmware.tanzu.se.waasportal.model;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class TrainingPortal {

    private String name;
    private LocalDateTime expires;
    private ZoneId zone;
    private String owner;
    private String url;
    private TrainingPortalWorkshop workshops[];
    private String adminUsername;
    private String adminPassword;

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    TrainingPortal(String name, LocalDateTime expires, ZoneId zone, String owner, String url,
            TrainingPortalWorkshop workshops[], String adminUsername, String adminPassword) {
        this.name = name;
        this.expires = expires;
        this.zone = zone;
        this.owner = owner;
        this.url = url;
        this.workshops = workshops;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getExpires() {
        return expires;
    }

    public void setExpires(LocalDateTime expires) {
        this.expires = expires;
    }

    public ZoneId getZone() {
        return zone;
    }

    public void setZone(ZoneId zone) {
        this.zone = zone;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TrainingPortalWorkshop[] getWorkshops() {
        return workshops;
    }

    public void setWorkshops(TrainingPortalWorkshop[] workshops) {
        this.workshops = workshops;
    }

    public static TrainingPortalBuilder builder() {
        return new TrainingPortalBuilder();
    }

    public static class TrainingPortalBuilder {
        private String name;
        private LocalDateTime expires;
        private ZoneId zone;
        private String owner;
        private String url;
        private TrainingPortalWorkshop workshops[];
        private String adminUsername;
        private String adminPassword;
    
        TrainingPortalBuilder() {
        }

        public TrainingPortalBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TrainingPortalBuilder expires(LocalDateTime expires) {
            this.expires = expires;
            return this;
        }

        public TrainingPortalBuilder zone(ZoneId zone) {
            this.zone = zone;
            return this;
        }

        public TrainingPortalBuilder owner(String owner) {
            this.owner = owner;
            return this;
        }

        public TrainingPortalBuilder url(String url) {
            this.url = url;
            return this;
        }

        public TrainingPortalBuilder workshops(TrainingPortalWorkshop[] workshops) {
            this.workshops = workshops;
            return this;
        }

        public TrainingPortalBuilder adminUsername(String adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }

        public TrainingPortalBuilder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public TrainingPortal build() {
            return new TrainingPortal(name, expires, zone, owner, url, workshops, adminUsername, adminPassword);
        }
    }
}
