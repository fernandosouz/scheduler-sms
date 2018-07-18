package com.example.demointegration.schedulers;

import com.example.demointegration.model.DataIntegration;
import com.example.demointegration.model.TokenResponse;
import com.example.demointegration.repository.DataIntegrationRepository;
import com.example.demointegration.repository.TokenResponseRepository;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.*;


import javax.net.ssl.HttpsURLConnection;
import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;




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


    @Scheduled(fixedRate = 20000)
    public void scheduleFetchDataBase() {
        String url = "http://i4drouter.cloudapp.net/GrupoBrasanitas.Web.Api/api/token";

        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
        parts.add("username", "administrador.crm@grupobrasanitas.com.br");
        parts.add("password", "Br@s@2014");
        parts.add("grant_type", "password");

        RestTemplate restTemplate = new RestTemplate();

        System.out.println("Begin /POST request!");
        // replace http://localhost:8080 by your restful services

        TokenResponse tokenObj = restTemplate.postForObject(url, parts, TokenResponse.class);
        System.out.println(tokenObj);
        tokenResponseDAO.save(tokenObj);
    }

}