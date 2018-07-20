package com.example.demointegration.endpoint;

import com.example.demointegration.model.opportunity.Opportunity;

public class OpportunityResource {
    private Opportunity opportunity;

    public OpportunityResource(Opportunity opportunity) {
        this.opportunity = opportunity;
    }

    public Opportunity getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(Opportunity opportunity) {
        this.opportunity = opportunity;
    }
}
