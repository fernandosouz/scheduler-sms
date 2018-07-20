package com.example.demointegration.schedulers;

import com.example.demointegration.endpoint.OpportunityResource;
import com.example.demointegration.model.DataIntegration;
import com.example.demointegration.model.opportunity.Opportunity;
import com.example.demointegration.repository.DataIntegrationRepository;
import com.example.demointegration.repository.OpportunityRepository;
import com.example.demointegration.repository.TokenResponseRepository;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import jdk.nashorn.api.scripting.JSObject;
import jdk.nashorn.internal.parser.JSONParser;
import org.assertj.core.util.Sets;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
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


    @Scheduled(fixedRate = 30000)
    public void scheduleFetchDataBase() {
       /* String url = "http://i4drouter.cloudapp.net/GrupoBrasanitas.Web.Api/api/token";

        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
        parts.add("username", "administrador.crm@grupobrasanitas.com.br");
        parts.add("password", "Br@s@2014");
        parts.add("grant_type", "password");

        RestTemplate restTemplate = new RestTemplate();

        System.out.println("Begin /POST request!");
        // replace http://localhost:8080 by your restful services

        TokenResponse tokenObj = restTemplate.postForObject(url, parts, TokenResponse.class);
        System.out.println(tokenObj);
        tokenResponseDAO.save(tokenObj);*/


       /*Opportunity*/

        RestTemplate restTemplate = new RestTemplate();
        String url2 = "http://i4drouter.cloudapp.net/GrupoBrasanitas.Web.Api/api/Oportunidade/RecuperarOportunidades";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer KaD3XKhxoD69adP5CqA-tSAHkXQXldyhsI7vHaTl60GF_a4tzwr0o89aTSeIH4LYTv5a_6jk8ezIAcMqSbmrcsOQRn13t1qgLcvTsNojaSdJEHV_tNxZEXSaVN3raCPTSvrWKeIqiXElQjx79jVj86RrPq6_UOcBQIn9Sd0GOrw1-9UO4776Na_2dC1Gq7sANdtraV-FXCoBVXOdgLOtolOqElAaYq1NRwp-qSIZR5I6wUKuXRxQ1OFTIzYmOhjckjtVWiiIWsnb8ACItA1b6WGRSJ3rf0l_VBWbzoGesOLTRvW_Yu93BnwTN2uCFS6G");
        headers.set("Content-Type","application/json");

        System.out.println("Send");

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity < List <Opportunity>> response = restTemplate.exchange(url2,
                HttpMethod.GET, entity, new ParameterizedTypeReference < List < Opportunity >> () {});

        List < Opportunity > list = response.getBody();

        list.forEach(o -> {
            opportunityDAO.save(o);
        });
    }

}