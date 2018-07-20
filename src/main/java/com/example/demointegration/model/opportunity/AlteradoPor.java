package com.example.demointegration.model.opportunity;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class AlteradoPor {

    private String Id;
    private String LogicalName;
    private String Name;
    private ArrayList KeyAttributes;
    private Number RowVersion;

    public AlteradoPor(String id, String logicalName, String name, ArrayList keyAttributes, Number rowVersion) {
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
