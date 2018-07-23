package com.example.demointegration.model;

import com.example.demointegration.model.utils.AbstractEntity;

import javax.persistence.Entity;


@Entity
public class DataIntegration extends AbstractEntity {

    private String name;

    private Boolean integrated;

    private Integer integrationAttempts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIntegrated() {
        return integrated;
    }

    public void setIntegrated(Boolean integrated) {
        this.integrated = integrated;
    }

    public Integer getIntegrationAttempts() {
        return integrationAttempts;
    }

    public void setIntegrationAttempts(Integer integrationAttempts) {
        this.integrationAttempts = integrationAttempts;
    }
}
