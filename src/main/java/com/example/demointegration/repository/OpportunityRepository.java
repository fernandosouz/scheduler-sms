package com.example.demointegration.repository;


import com.example.demointegration.model.opportunity.Opportunity;
import org.springframework.data.repository.CrudRepository;

public interface OpportunityRepository  extends CrudRepository<Opportunity, Long > {
}
