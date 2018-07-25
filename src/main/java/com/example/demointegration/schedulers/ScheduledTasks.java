package com.example.demointegration.schedulers;
import com.example.demointegration.model.DataIntegration;
import com.example.demointegration.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.*;


@Component
public class ScheduledTasks {

    private final DataIntegrationRepository dataIntegrationDAO;

    @Autowired
    public ScheduledTasks(DataIntegrationRepository dataIntegrationDAO){

        this.dataIntegrationDAO = dataIntegrationDAO;
    }

    @Scheduled(fixedDelayString = "${scheduler.delay}")
    public void scheduleListIntegration() {

        String user = "fernandosouzasa";
        String password = "f3rn4nd00";
        String url = "http://www.facilitamovel.com.br/api/simpleSend.ft";

        /*Variables*/
        RestTemplate restTemplate = new RestTemplate();

        /*Body Request*/

        /*Request*/
        List<DataIntegration> lista;

        Iterable iterable = dataIntegrationDAO.findDataByIntegration(false);

        lista = (List<DataIntegration>) iterable;

        for(DataIntegration data: lista) {
            String completeUrl = url + "?user="+ user +"&password="+ password +"&destinatario="+ data.getPhoneNumber()+"&msg="+ data.getMessage();

            data.setIntegrationAttempts(data.getIntegrationAttempts() + 1);
            System.out.println("Begin /POST /http://www.facilitamovel.com.br/api/simpleSend.ft");

            String response =
                    restTemplate.postForObject(completeUrl, null, String.class);

            if((response.substring(0,1).toString().equals("5") || response.substring(0,1).toString().equals("6"))){
                data.setIntegrated(true);
                System.out.println("Mensagem " +  data.getId() +" enviada!");

            }else{
                System.out.println("Mensagem " + data.getId() + " não enviada!");
                System.out.println(response);
            }
            dataIntegrationDAO.save(data);
        }
    }


}