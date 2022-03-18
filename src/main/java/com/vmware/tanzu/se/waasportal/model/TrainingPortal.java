package com.vmware.tanzu.se.waasportal.model;

import java.time.Instant;

public class TrainingPortal {
    
    private String name;
    private Instant expires;
    private String owner;
    private String url;
    private String workshops[];

    TrainingPortal(String name, Instant expires, String owner, String url, String workshops[]) {
        this.name = name;
        this.expires = expires;
        this.owner = owner;
        this.url = url;
        this.workshops = workshops;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getExpires() {
        return expires;
    }

    public void setExpires(Instant expires) {
        this.expires = expires;
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

    public String[] getWorkshops() {
        return workshops;
    }

    public void setWorkshops(String[] workshops) {
        this.workshops = workshops;
    }

    public static TrainingPortalBuilder builder() {
        return new TrainingPortalBuilder();
    }

    public static class TrainingPortalBuilder {
        private String name;
        private Instant expires;
        private String owner;
        private String url;
        private String workshops[];

        TrainingPortalBuilder(){}

        public TrainingPortalBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TrainingPortalBuilder expires(Instant expires) {
            this.expires = expires;
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

        public TrainingPortalBuilder workshops(String[] workshops) {
            this.workshops=workshops;
            return this;
        }
  
        public TrainingPortal build() {
            return new TrainingPortal(name, expires, owner, url, workshops);
        }
    }
}
