package com.example.demointegration.model;

import com.example.demointegration.model.utils.AbstractEntity;

import javax.persistence.Entity;


@Entity
public class DataIntegration extends AbstractEntity {

    private Boolean integrated;

    private Integer integrationAttempts;

    private String phoneNumber;

    private String message;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
