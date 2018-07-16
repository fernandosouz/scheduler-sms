package com.example.demointegration.endpoint;

import com.example.demointegration.model.DataIntegration;
import com.example.demointegration.repository.DataIntegrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("dataintegration")

public class DataIntegrationEndpoint {

    private final DataIntegrationRepository dataIntegrationDAO;

    @Autowired
    public DataIntegrationEndpoint(DataIntegrationRepository dataIntegrationDAO){
        this.dataIntegrationDAO = dataIntegrationDAO;
    }

    @GetMapping(path="/listall")
    public ResponseEntity list() {
        return new ResponseEntity<>(dataIntegrationDAO.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody DataIntegration data) {
        return new ResponseEntity<>(dataIntegrationDAO.save(data), HttpStatus.OK);
    }

}
