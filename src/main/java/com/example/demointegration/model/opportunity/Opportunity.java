package com.example.demointegration.model.opportunity;

import com.example.demointegration.model.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.Map;


@Entity
public class Opportunity extends AbstractEntity{

    @Transient
    @JsonProperty("TipoServico")
    private TipoServico TipoServico;

    @Transient
    @JsonProperty("ValorEstimaProposta")
    private ValorEstimaProposta ValorEstimaProposta;

    @Transient
    @JsonProperty("Proprietario")
    private Proprietario Proprietario;

    @Transient
    @JsonProperty("ReceitaReal")
    private ReceitaReal ReceitaReal;

    @Transient
    @JsonProperty("Conta")
    private Conta Conta;

    @Transient
    @JsonProperty("UnidadeNegocio")
    private UnidadeNegocio UnidadeNegocio;

    @Transient
    @JsonProperty("Filial")
    private Filial Filial;

    @Transient
    @JsonProperty("GerNacStatus")
    private GerNacStatus GerNacStatus;

    @Transient
    @JsonProperty("GerNacAprovador")
    private GerNacAprovador GerNacAprovador;

    @Transient
    @JsonProperty("Os")
    private Os Os;

    @Transient
    @JsonProperty("CriadoPor")
    private CriadoPor CriadoPor;

    @Transient
    @JsonProperty("Status")
    private Status Status;

    @Transient
    @JsonProperty("RazaoStatus")
    private RazaoStatus RazaoStatus;

    @Transient
    @JsonProperty("AlteradoPor")
    private Status AlteradoPor;

    @Column
    @JsonProperty("OportunidadeId")
    private String OportunidadeId;

    @Column
    @JsonProperty("Topico")
    private String Topico;

    @Column
    @JsonProperty("ClienteProvavel")
    private String ClienteProvavel;

    @Column
    @JsonProperty("Cnpj")
    private String Cnpj;

    @Column
    @JsonProperty("DataEstimadaFechamento")
    private String DataEstimadaFechamento;

    @Column
    @JsonProperty("Probabilidade")
    private String Probabilidade;

    @Column
    @JsonProperty("Interesse")
    private String Interesse;

    @Column
    @JsonProperty("FasePipeline")
    private String FasePipeline;

    @Column
    @JsonProperty("DataCriacao")
    private String DataCriacao;

    @Column
    @JsonProperty("NumeroOportunidade")
    private String NumeroOportunidade;

    @Column
    @JsonProperty("NumeroProposta")
    private String NumeroProposta;

    @Column
    @JsonProperty("MargemBruta")
    private String MargemBruta;

    @Column
    @JsonProperty("CurvaUnidade")
    private String CurvaUnidade;

    @Column
    @JsonProperty("TipoInstalacao")
    private String TipoInstalacao;

    @Column
    @JsonProperty("Facilities")
    private String Facilities;

    @Column
    @JsonProperty("IdentificadoFornecedorAtual")
    private String IdentificadoFornecedorAtual;

    @Column
    @JsonProperty("LqResultadoTexto")
    private String LqResultadoTexto;

    @Column
    @JsonProperty("LqPorqueBid")
    private String LqPorqueBid;

    @Column
    @JsonProperty("LqCriterioBid")
    private String LqCriterioBid;

    @Column
    @JsonProperty("LqOpiniao")
    private String LqOpiniao;

    @Column
    @JsonProperty("GerNacDescricao")
    private String GerNacDescricao;

    @Column
    @JsonProperty("GerNacData")
    private String GerNacData;

    @Column
    @JsonProperty("DirStatus")
    private String DirStatus;

    @Column
    @JsonProperty("DirDescricao")
    private String DirDescricao;

    @Column
    @JsonProperty("DirAprovador")
    private String DirAprovador;

    @Column
    @JsonProperty("DirData")
    private String DirData;

    @Column
    @JsonProperty("DataAlteracao")
    private String DataAlteracao;

    Opportunity(){};

    public Opportunity(com.example.demointegration.model.opportunity.TipoServico tipoServico, com.example.demointegration.model.opportunity.ValorEstimaProposta valorEstimaProposta, com.example.demointegration.model.opportunity.Proprietario proprietario, com.example.demointegration.model.opportunity.ReceitaReal receitaReal, com.example.demointegration.model.opportunity.Conta conta, com.example.demointegration.model.opportunity.UnidadeNegocio unidadeNegocio, com.example.demointegration.model.opportunity.Filial filial, com.example.demointegration.model.opportunity.GerNacStatus gerNacStatus, com.example.demointegration.model.opportunity.GerNacAprovador gerNacAprovador, com.example.demointegration.model.opportunity.Os os, com.example.demointegration.model.opportunity.CriadoPor criadoPor, com.example.demointegration.model.opportunity.Status status, com.example.demointegration.model.opportunity.RazaoStatus razaoStatus, com.example.demointegration.model.opportunity.Status alteradoPor, String oportunidadeId, String topico, String clienteProvavel, String cnpj, String dataEstimadaFechamento, String probabilidade, String interesse, String fasePipeline, String dataCriacao, String numeroOportunidade, String numeroProposta, String margemBruta, String curvaUnidade, String tipoInstalacao, String facilities, String identificadoFornecedorAtual, String lqResultadoTexto, String lqPorqueBid, String lqCriterioBid, String lqOpiniao, String gerNacDescricao, String gerNacData, String dirStatus, String dirDescricao, String dirAprovador, String dirData, String dataAlteracao) {
        TipoServico = tipoServico;
        ValorEstimaProposta = valorEstimaProposta;
        Proprietario = proprietario;
        ReceitaReal = receitaReal;
        Conta = conta;
        UnidadeNegocio = unidadeNegocio;
        Filial = filial;
        GerNacStatus = gerNacStatus;
        GerNacAprovador = gerNacAprovador;
        Os = os;
        CriadoPor = criadoPor;
        Status = status;
        RazaoStatus = razaoStatus;
        AlteradoPor = alteradoPor;
        OportunidadeId = oportunidadeId;
        Topico = topico;
        ClienteProvavel = clienteProvavel;
        Cnpj = cnpj;
        DataEstimadaFechamento = dataEstimadaFechamento;
        Probabilidade = probabilidade;
        Interesse = interesse;
        FasePipeline = fasePipeline;
        DataCriacao = dataCriacao;
        NumeroOportunidade = numeroOportunidade;
        NumeroProposta = numeroProposta;
        MargemBruta = margemBruta;
        CurvaUnidade = curvaUnidade;
        TipoInstalacao = tipoInstalacao;
        Facilities = facilities;
        IdentificadoFornecedorAtual = identificadoFornecedorAtual;
        LqResultadoTexto = lqResultadoTexto;
        LqPorqueBid = lqPorqueBid;
        LqCriterioBid = lqCriterioBid;
        LqOpiniao = lqOpiniao;
        GerNacDescricao = gerNacDescricao;
        GerNacData = gerNacData;
        DirStatus = dirStatus;
        DirDescricao = dirDescricao;
        DirAprovador = dirAprovador;
        DirData = dirData;
        DataAlteracao = dataAlteracao;
    }


    public com.example.demointegration.model.opportunity.TipoServico getTipoServico() {
        return TipoServico;
    }

    public void setTipoServico(com.example.demointegration.model.opportunity.TipoServico tipoServico) {
        TipoServico = tipoServico;
    }

    public com.example.demointegration.model.opportunity.ValorEstimaProposta getValorEstimaProposta() {
        return ValorEstimaProposta;
    }

    public void setValorEstimaProposta(com.example.demointegration.model.opportunity.ValorEstimaProposta valorEstimaProposta) {
        ValorEstimaProposta = valorEstimaProposta;
    }

    public com.example.demointegration.model.opportunity.Proprietario getProprietario() {
        return Proprietario;
    }

    public void setProprietario(com.example.demointegration.model.opportunity.Proprietario proprietario) {
        Proprietario = proprietario;
    }

    public com.example.demointegration.model.opportunity.ReceitaReal getReceitaReal() {
        return ReceitaReal;
    }

    public void setReceitaReal(com.example.demointegration.model.opportunity.ReceitaReal receitaReal) {
        ReceitaReal = receitaReal;
    }

    public com.example.demointegration.model.opportunity.Conta getConta() {
        return Conta;
    }

    public void setConta(com.example.demointegration.model.opportunity.Conta conta) {
        Conta = conta;
    }

    public com.example.demointegration.model.opportunity.UnidadeNegocio getUnidadeNegocio() {
        return UnidadeNegocio;
    }

    public void setUnidadeNegocio(com.example.demointegration.model.opportunity.UnidadeNegocio unidadeNegocio) {
        UnidadeNegocio = unidadeNegocio;
    }

    public com.example.demointegration.model.opportunity.Filial getFilial() {
        return Filial;
    }

    public void setFilial(com.example.demointegration.model.opportunity.Filial filial) {
        Filial = filial;
    }

    public com.example.demointegration.model.opportunity.GerNacStatus getGerNacStatus() {
        return GerNacStatus;
    }

    public void setGerNacStatus(com.example.demointegration.model.opportunity.GerNacStatus gerNacStatus) {
        GerNacStatus = gerNacStatus;
    }

    public com.example.demointegration.model.opportunity.GerNacAprovador getGerNacAprovador() {
        return GerNacAprovador;
    }

    public void setGerNacAprovador(com.example.demointegration.model.opportunity.GerNacAprovador gerNacAprovador) {
        GerNacAprovador = gerNacAprovador;
    }

    public com.example.demointegration.model.opportunity.Os getOs() {
        return Os;
    }

    public void setOs(com.example.demointegration.model.opportunity.Os os) {
        Os = os;
    }

    public com.example.demointegration.model.opportunity.CriadoPor getCriadoPor() {
        return CriadoPor;
    }

    public void setCriadoPor(com.example.demointegration.model.opportunity.CriadoPor criadoPor) {
        CriadoPor = criadoPor;
    }

    public com.example.demointegration.model.opportunity.Status getStatus() {
        return Status;
    }

    public void setStatus(com.example.demointegration.model.opportunity.Status status) {
        Status = status;
    }

    public com.example.demointegration.model.opportunity.RazaoStatus getRazaoStatus() {
        return RazaoStatus;
    }

    public void setRazaoStatus(com.example.demointegration.model.opportunity.RazaoStatus razaoStatus) {
        RazaoStatus = razaoStatus;
    }

    public com.example.demointegration.model.opportunity.Status getAlteradoPor() {
        return AlteradoPor;
    }

    public void setAlteradoPor(com.example.demointegration.model.opportunity.Status alteradoPor) {
        AlteradoPor = alteradoPor;
    }

    public String getOportunidadeId() {
        return OportunidadeId;
    }

    public void setOportunidadeId(String oportunidadeId) {
        OportunidadeId = oportunidadeId;
    }

    public String getTopico() {
        return Topico;
    }

    public void setTopico(String topico) {
        Topico = topico;
    }

    public String getClienteProvavel() {
        return ClienteProvavel;
    }

    public void setClienteProvavel(String clienteProvavel) {
        ClienteProvavel = clienteProvavel;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public String getDataEstimadaFechamento() {
        return DataEstimadaFechamento;
    }

    public void setDataEstimadaFechamento(String dataEstimadaFechamento) {
        DataEstimadaFechamento = dataEstimadaFechamento;
    }

    public String getProbabilidade() {
        return Probabilidade;
    }

    public void setProbabilidade(String probabilidade) {
        Probabilidade = probabilidade;
    }

    public String getInteresse() {
        return Interesse;
    }

    public void setInteresse(String interesse) {
        Interesse = interesse;
    }

    public String getFasePipeline() {
        return FasePipeline;
    }

    public void setFasePipeline(String fasePipeline) {
        FasePipeline = fasePipeline;
    }

    public String getDataCriacao() {
        return DataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        DataCriacao = dataCriacao;
    }

    public String getNumeroOportunidade() {
        return NumeroOportunidade;
    }

    public void setNumeroOportunidade(String numeroOportunidade) {
        NumeroOportunidade = numeroOportunidade;
    }

    public String getNumeroProposta() {
        return NumeroProposta;
    }

    public void setNumeroProposta(String numeroProposta) {
        NumeroProposta = numeroProposta;
    }

    public String getMargemBruta() {
        return MargemBruta;
    }

    public void setMargemBruta(String margemBruta) {
        MargemBruta = margemBruta;
    }

    public String getCurvaUnidade() {
        return CurvaUnidade;
    }

    public void setCurvaUnidade(String curvaUnidade) {
        CurvaUnidade = curvaUnidade;
    }

    public String getTipoInstalacao() {
        return TipoInstalacao;
    }

    public void setTipoInstalacao(String tipoInstalacao) {
        TipoInstalacao = tipoInstalacao;
    }

    public String getFacilities() {
        return Facilities;
    }

    public void setFacilities(String facilities) {
        Facilities = facilities;
    }

    public String getIdentificadoFornecedorAtual() {
        return IdentificadoFornecedorAtual;
    }

    public void setIdentificadoFornecedorAtual(String identificadoFornecedorAtual) {
        IdentificadoFornecedorAtual = identificadoFornecedorAtual;
    }

    public String getLqResultadoTexto() {
        return LqResultadoTexto;
    }

    public void setLqResultadoTexto(String lqResultadoTexto) {
        LqResultadoTexto = lqResultadoTexto;
    }

    public String getLqPorqueBid() {
        return LqPorqueBid;
    }

    public void setLqPorqueBid(String lqPorqueBid) {
        LqPorqueBid = lqPorqueBid;
    }

    public String getLqCriterioBid() {
        return LqCriterioBid;
    }

    public void setLqCriterioBid(String lqCriterioBid) {
        LqCriterioBid = lqCriterioBid;
    }

    public String getLqOpiniao() {
        return LqOpiniao;
    }

    public void setLqOpiniao(String lqOpiniao) {
        LqOpiniao = lqOpiniao;
    }

    public String getGerNacDescricao() {
        return GerNacDescricao;
    }

    public void setGerNacDescricao(String gerNacDescricao) {
        GerNacDescricao = gerNacDescricao;
    }

    public String getGerNacData() {
        return GerNacData;
    }

    public void setGerNacData(String gerNacData) {
        GerNacData = gerNacData;
    }

    public String getDirStatus() {
        return DirStatus;
    }

    public void setDirStatus(String dirStatus) {
        DirStatus = dirStatus;
    }

    public String getDirDescricao() {
        return DirDescricao;
    }

    public void setDirDescricao(String dirDescricao) {
        DirDescricao = dirDescricao;
    }

    public String getDirAprovador() {
        return DirAprovador;
    }

    public void setDirAprovador(String dirAprovador) {
        DirAprovador = dirAprovador;
    }

    public String getDirData() {
        return DirData;
    }

    public void setDirData(String dirData) {
        DirData = dirData;
    }

    public String getDataAlteracao() {
        return DataAlteracao;
    }

    public void setDataAlteracao(String dataAlteracao) {
        DataAlteracao = dataAlteracao;
    }
}
