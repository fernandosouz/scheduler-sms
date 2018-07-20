package com.example.demointegration.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Estado {

    @JsonProperty("Id")
    private String Id;

    @JsonProperty("LogicalName")
    private String LogicalName;

    @JsonProperty("Name")
    private String Name;

    @JsonProperty("KeyAttributes")
    private ArrayList KeyAttributes;

    @JsonProperty("RowVersion")
    private Number RowVersion;

    public Estado(){};

    public Estado(String id, String logicalName, String name, ArrayList keyAttributes, Number rowVersion) {
        Id = id;
        LogicalName = logicalName;
        Name = name;
        KeyAttributes = keyAttributes;
        RowVersion = rowVersion;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getLogicalName() {
        return LogicalName;
    }

    public void setLogicalName(String logicalName) {
        LogicalName = logicalName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList getKeyAttributes() {
        return KeyAttributes;
    }

    public void setKeyAttributes(ArrayList keyAttributes) {
        KeyAttributes = keyAttributes;
    }

    public Number getRowVersion() {
        return RowVersion;
    }

    public void setRowVersion(Number rowVersion) {
        RowVersion = rowVersion;
    }
}
