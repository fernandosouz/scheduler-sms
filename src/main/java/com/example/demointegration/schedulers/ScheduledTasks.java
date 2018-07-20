package com.example.demointegration.schedulers;
import com.example.demointegration.model.TokenResponse;
import com.example.demointegration.model.opportunity.Opportunity;
import com.example.demointegration.repository.DataIntegrationRepository;
import com.example.demointegration.repository.OpportunityRepository;
import com.example.demointegration.repository.TokenResponseRepository;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.*;


@Component
public class ScheduledTasks {

    private final DataIntegrationRepository dataIntegrationDAO;
    private final TokenResponseRepository tokenResponseDAO;
    private final OpportunityRepository opportunityDAO;
    /*private final TokenResponseRepository tokenRepositoryDAO;*/
    private final Integer n = 2000;

    @Autowired
    public ScheduledTasks(DataIntegrationRepository dataIntegrationDAO,
                          TokenResponseRepository tokenResponseRepository,
                          OpportunityRepository opportunityRepository){
        this.dataIntegrationDAO = dataIntegrationDAO;
        this.tokenResponseDAO = tokenResponseRepository;
        this.opportunityDAO = opportunityRepository;
    }

    @Autowired
    private Environment env;

    /*@Scheduled(fixedDelayString = "${connector.delay}")
    public void scheduleListIntegration() {
        List<DataIntegration> lista;

        Iterable iterable = dataIntegrationDAO.findDataByIntegration(false);

        lista = (List<DataIntegration>) iterable;

        *//*Criar list das conexões do ponto que está sendo incluído*//*
        for(DataIntegration data: lista) {
            data.setIntegrationAttempts(data.getIntegrationAttempts() + 1);
            Random rand = new Random();
            if((rand.nextInt(50) + 1) < 10){
                data.setIntegrated(true);
                System.out.println("Atualizando o pra verdadeiro o ID: " + data.getId());
            }
            dataIntegrationDAO.save(data);
        }
    }*/


    @Scheduled(fixedRateString = "${scheduler.token}")
    public void scheduleUpdateToken() {
        /*Variables*/
        RestTemplate restTemplate = new RestTemplate();

        /*Body*/
        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
        parts.add("username", "administrador.crm@grupobrasanitas.com.br");
        parts.add("password", "Br@s@2014");
        parts.add("grant_type", "password");

        /*Request*/
        System.out.println("Begin /POST /token");
        TokenResponse tokenObj = restTemplate.postForObject("http://i4drouter.cloudapp.net/GrupoBrasanitas.Web.Api/api/token", parts, TokenResponse.class);
        System.out.println(tokenObj);
        tokenResponseDAO.save(tokenObj);
    }


    @Scheduled(fixedRateString = "${scheduler.opportunity}")
    public void scheduleFetchOpportunity() {
        /*Variables*/
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        /*TODO Colocar paths no application properties*/
        String url = "http://i4drouter.cloudapp.net/GrupoBrasanitas.Web.Api/api/Oportunidade/RecuperarOportunidades";
        TokenResponse tk = tokenResponseDAO.findLastOne();

        /*Headers Request*/
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + tk.getAccess_token());
        headers.set("Content-Type","application/json");

        /*Request*/
        System.out.println("Begin /GET /Oportunidade/RecuperarOportunidades");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        ResponseEntity <List<Opportunity>> response = restTemplate.exchange(url,
                HttpMethod.GET, entity, new ParameterizedTypeReference <List<Opportunity>> () {});
        List <Opportunity> list = response.getBody();


        /*Persist*/
        list.forEach(o -> {
            o.setProperties();
            opportunityDAO.save(o);
        });
    }

}