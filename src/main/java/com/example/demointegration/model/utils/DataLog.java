package com.example.demointegration.model.utils;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class DataLog extends AbstractEntity{

    @Column(length = 1000)
    private String request_data;

    @Column(length = 1000)
    private String response_data;

    @Column
    private String service_name;

    public DataLog(){};

    public DataLog(String request_data, String response_data, String service_name) {
        this.request_data = request_data;
        this.response_data = response_data;
        this.service_name = service_name;
    }

    public String getRequest_data() {
        return request_data;
    }

    public void setRequest_data(String request_data) {
        this.request_data = request_data;
    }

    public String getResponse_data() {
        return response_data;
    }

    public void setResponse_data(String response_data) {
        this.response_data = response_data;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }
}
