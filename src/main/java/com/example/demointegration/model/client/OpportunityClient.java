package com.example.demointegration.model.client;

import com.example.demointegration.endpoint.OpportunityResource;
import com.example.demointegration.model.opportunity.Opportunity;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface OpportunityClient {
    @RequestLine("GET")
    @Headers("Authorization: Bearer e9oHwioRJ_SzmmQAsdls2D5fV4-2Fn8xHGN4DJBfFKB8_k7P_m-zL4mb8oElI6lV6OA1Kk-RHmHDHl0sHsRKaVw_JFjlrr4RKT31eKz8qFxlh99kqLwRbkNZXMW15qSV8nT8GsoalbPgLMduOpQ9n4M9greoWSZr4xiQa9WI-8Jwn_FpWLZO03yMPKcCzuAeJFWYumTr3SO9Nib8as3pCDseOklQp5qGUaMC9qwIbXQPiDhkKw3tS9WowY_Q-evGLHAPZOLGeWrPTa4TpIyEbVtsriHQb0Zv4rqyOV4AIuIo6IDl_8ewpOwb4mox6e1V")
    List<OpportunityResource> findAll();
}
