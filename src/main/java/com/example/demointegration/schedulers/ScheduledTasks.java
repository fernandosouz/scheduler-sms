package com.example.demointegration.schedulers;

import com.example.demointegration.endpoint.OpportunityResource;
import com.example.demointegration.model.DataIntegration;
import com.example.demointegration.model.client.OpportunityClient;
import com.example.demointegration.model.opportunity.Opportunity;
import com.example.demointegration.repository.DataIntegrationRepository;
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
    /*private final TokenResponseRepository tokenRepositoryDAO;*/
    private final Integer n = 2000;

    @Autowired
    public ScheduledTasks(DataIntegrationRepository dataIntegrationDAO,
                          TokenResponseRepository tokenResponseRepository){
        this.dataIntegrationDAO = dataIntegrationDAO;
        this.tokenResponseDAO = tokenResponseRepository;
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
        headers.set("Authorization", "Bearer CVz9_kPmiLUTV-mK-bxeRebHIp1fg1xwT2NpSr_BWXiX41GUdPzmNcoZ5dFdTHgy7z9noHWrfkyl6XA0i_yComct7ICDr8DHwflyTYzCZX266l7edc3-IgAIvaNio6wtWOYFMRyX83Kn7v6p5c--OE6P37cVoW7cxDF88f_H2_T__wArGUZZrCQjf-jtbFOn37krxOVfSixBSKE9dP_gX6Hy2niZf_wog_Qtc3Q7JEIvbuP2MkjrBuxXqGjaxMLm3mvlNxdZlGuW8pnPTttglpof_Y313iQgiRSo3DpTcc-5FCTqMis-mScI9kQSdYvl");
        headers.set("Content-Type","application/json");

        System.out.println("Send");

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        /*ArrayList<ResponseEntity<Opportunity>> response = restTemplate.exchange(url2, HttpMethod.GET, entity, new ArrayList<ResponseEntity<Opportunity>>);*/

        /*ResponseEntity<Object[]> responseEntity = restTemplate.exchange(url2, HttpMethod.GET, entity, Object[].class);*/
        /*ResponseEntity<Opportunity[]> responseEntity = restTemplate.getForEntity(url2, Opportunity[].class);*/

        ResponseEntity < List <Opportunity>> response = restTemplate.exchange(url2,
                HttpMethod.GET, entity, new ParameterizedTypeReference < List < Opportunity >> () {});

        List < Opportunity > list = response.getBody();





        /*Não retorna*/
       /* OpportunityClient opClient = Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(OpportunityClient.class))
                .logLevel(Logger.Level.FULL)
                .target(OpportunityClient.class, "http://i4drouter.cloudapp.net/GrupoBrasanitas.Web.Api/api/Oportunidade/RecuperarOportunidades");


        List<OpportunityResource> list = opClient.findAll();

        list.forEach(o -> System.out.println(o.getOpportunity().getOportunidadeId()) );*/

    }

}