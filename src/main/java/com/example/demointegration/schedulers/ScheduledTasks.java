package com.example.demointegration.schedulers;

import com.example.demointegration.model.DataIntegration;
import com.example.demointegration.repository.DataIntegrationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Random;


import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;




@Component
public class ScheduledTasks {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private final DataIntegrationRepository dataIntegrationDAO;

    @Autowired
    public ScheduledTasks(DataIntegrationRepository dataIntegrationDAO){
        this.dataIntegrationDAO = dataIntegrationDAO;
    }

    @Scheduled(fixedRate = 2000)
    public void scheduleListIntegration() {
        List<DataIntegration> lista;

        Iterable iterable = dataIntegrationDAO.findDataByIntegration(false);

        lista = (List<DataIntegration>) iterable;

        /*Criar list das conexões do ponto que está sendo incluído*/
        for(DataIntegration data: lista) {
            data.setIntegrationAttempts(data.getIntegrationAttempts() + 1);
            Random rand = new Random();
            if((rand.nextInt(50) + 1) < 5){
                data.setIntegrated(true);
                System.out.println("Atualizando o pra verdadeiro o ID: " + data.getId());
            }
            dataIntegrationDAO.save(data);
        }
    }


    @Scheduled(fixedRate = 10000)
    public void scheduleFetchDataBase() {
        System.out.println("Integrando o banco de dados...");
    }

}