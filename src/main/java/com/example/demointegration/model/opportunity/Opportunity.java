package com.example.demointegration.model.opportunity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Opportunity{

    @JsonProperty("OportunidadeId")
    private String OportunidadeId;

    @JsonProperty("TipoServico")
    private TipoServico TipoServico;

    public Opportunity(){};

    public Opportunity(String oportunidadeId, TipoServico tipoServico){
        OportunidadeId = oportunidadeId;
        TipoServico = tipoServico;

    }

    public com.example.demointegration.model.opportunity.TipoServico getTipoServico() {
        return TipoServico;
    }

    public void setTipoServico(com.example.demointegration.model.opportunity.TipoServico tipoServico) {
        TipoServico = tipoServico;
    }

    public String getOportunidadeId() {
        return OportunidadeId;
    }

    public void setOportunidadeId(String oportunidadeId) {
        OportunidadeId = oportunidadeId;
    }


}
