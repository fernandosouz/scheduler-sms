package com.example.demointegration.model.opportunity;

import com.example.demointegration.model.utils.EntityReference;
import com.example.demointegration.model.utils.Money;
import com.example.demointegration.model.utils.OptionSetValue;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class Opportunity implements Serializable{

    @Transient
    @JsonProperty("ClienteProvavel")
    private EntityReference ClienteProvavel;

    @Transient
    @JsonProperty("TipoServico")
    private EntityReference TipoServico;

    @Transient
    @JsonProperty("ValorEstimaProposta")
    private Money ValorEstimaProposta;

    @Transient
    @JsonProperty("Interesse")
    private OptionSetValue Interesse;

    @Transient
    @JsonProperty("Proprietario")
    private EntityReference Proprietario;

    @Transient
    @JsonProperty("ReceitaReal")
    private Money ReceitaReal;

    @Transient
    @JsonProperty("CurvaUnidade")
    private OptionSetValue CurvaUnidade;

    @Transient
    @JsonProperty("Conta")
    private EntityReference Conta;

    @Transient
    @JsonProperty("UnidadeNegocio")
    private EntityReference UnidadeNegocio;

    @Transient
    @JsonProperty("Facilities")
    private OptionSetValue Facilities;

    @Transient
    @JsonProperty("Filial")
    private EntityReference Filial;

    @Transient
    @JsonProperty("GerNacStatus")
    private OptionSetValue GerNacStatus;

    @Transient
    @JsonProperty("GerNacAprovador")
    private EntityReference GerNacAprovador;

    @Transient
    @JsonProperty("DirStatus")
    private OptionSetValue DirStatus;

    @Transient
    @JsonProperty("DirAprovador")
    private EntityReference DirAprovador;

    @Transient
    @JsonProperty("Os")
    private EntityReference Os;

    @Transient
    @JsonProperty("CriadoPor")
    private EntityReference CriadoPor;

    @Transient
    @JsonProperty("Status")
    private OptionSetValue Status;

    @Transient
    @JsonProperty("RazaoStatus")
    private OptionSetValue RazaoStatus;

    @Transient
    @JsonProperty("AlteradoPor")
    private EntityReference AlteradoPor;

    /*Strings*/

    @Id
    @Column
    @JsonProperty("OportunidadeId")
    private String OportunidadeId;

    @Column
    @JsonProperty("Topico")
    private String Topico;

    @Column
    @JsonProperty("Cnpj")
    private String Cnpj;

    @Column
    @JsonProperty("DataEstimadaFechamento")
    private String DataEstimadaFechamento;

    @Column
    @JsonProperty("Probabilidade")
    private Number Probabilidade;

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
    @JsonProperty("TipoInstalacao")
    private String TipoInstalacao;

    @Column
    @JsonProperty("IdentificadoFornecedorAtual")
    private Boolean IdentificadoFornecedorAtual;

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
    @JsonProperty("DirDescricao")
    private String DirDescricao;

    @Column
    @JsonProperty("DirData")
    private String DirData;

    @Column
    @JsonProperty("DataAlteracao")
    private String DataAlteracao;
    
    /*Value*/

    @Column
    @JsonProperty("ValorEstimaPropostaValue")
    private Number ValorEstimaPropostaValue;

    @Column
    @JsonProperty("InteresseValue")
    private Number InteresseValue;

    @Column
    @JsonProperty("ReceitaRealValue")
    private Number ReceitaRealValue;

    @Column
    @JsonProperty("CurvaUnidadeValue")
    private Number CurvaUnidadeValue;

    @Column
    @JsonProperty("FacilitiesValue")
    private Number FacilitiesValue;

    @Column
    @JsonProperty("GerNacStatusValue")
    private Number GerNacStatusValue;

    @Column
    @JsonProperty("DirStatusValue")
    private Number DirStatusValue;

    @Column
    @JsonProperty("StatusValue")
    private Number StatusValue;
    
    @Column
    @JsonProperty("RazaoStatusValue")
    private Number RazaoStatusValue;

    /*Id */

    @Column
    @JsonProperty("ClienteProvavelId")
    private String ClienteProvavelId;
    
    @Column
    @JsonProperty("TipoServicoId")
    private String TipoServicoId;
    
    @Column
    @JsonProperty("ProprietarioId")
    private String ProprietarioId;
    
    @Column
    @JsonProperty("ContaId")
    private String ContaId;
    
    @Column
    @JsonProperty("UnidadeNegocioId")
    private String UnidadeNegocioId;

    @Column
    @JsonProperty("FilialId")
    private String FilialId;

    @Column
    @JsonProperty("GerNacAprovadorId")
    private String GerNacAprovadorId;

    @Column
    @JsonProperty("DirAprovadorId")
    private String DirAprovadorId;
    
    @Column
    @JsonProperty("OsId")
    private String OsId;
    
    @Column
    @JsonProperty("CriadoPorId")
    private String CriadoPorId;

    @Column
    @JsonProperty("AlteradoPorId")
    private String AlteradoPorId;
    
    /*Name*/

    @Column
    @JsonProperty("ClienteProvavelName")
    private String ClienteProvavelName;

    @Column
    @JsonProperty("TipoServicoName")
    private String TipoServicoName;

    @Column
    @JsonProperty("ProprietarioName")
    private String ProprietarioName;

    @Column
    @JsonProperty("ContaName")
    private String ContaName;

    @Column
    @JsonProperty("UnidadeNegocioName")
    private String UnidadeNegocioName;

    @Column
    @JsonProperty("FilialName")
    private String FilialName;

    @Column
    @JsonProperty("GerNacAprovadorName")
    private String GerNacAprovadorName;

    @Column
    @JsonProperty("DirAprovadorName")
    private String DirAprovadorName;

    @Column
    @JsonProperty("OsName")
    private String OsName;

    @Column
    @JsonProperty("CriadoPorName")
    private String CriadoPorName;

    @Column
    @JsonProperty("AlteradoPorName")
    private String AlteradoPorName;



    public Opportunity(){};

    public EntityReference getClienteProvavel() {
        return ClienteProvavel;
    }

    public void setClienteProvavel(EntityReference clienteProvavel) {
        ClienteProvavel = clienteProvavel;
    }

    public EntityReference getTipoServico() {
        return TipoServico;
    }

    public void setTipoServico(EntityReference tipoServico) {
        TipoServico = tipoServico;
    }

    public Money getValorEstimaProposta() {
        return ValorEstimaProposta;
    }

    public void setValorEstimaProposta(Money valorEstimaProposta) {
        ValorEstimaProposta = valorEstimaProposta;
    }

    public OptionSetValue getInteresse() {
        return Interesse;
    }

    public void setInteresse(OptionSetValue interesse) {
        Interesse = interesse;
    }

    public EntityReference getProprietario() {
        return Proprietario;
    }

    public void setProprietario(EntityReference proprietario) {
        Proprietario = proprietario;
    }

    public Money getReceitaReal() {
        return ReceitaReal;
    }

    public void setReceitaReal(Money receitaReal) {
        ReceitaReal = receitaReal;
    }

    public OptionSetValue getCurvaUnidade() {
        return CurvaUnidade;
    }

    public void setCurvaUnidade(OptionSetValue curvaUnidade) {
        CurvaUnidade = curvaUnidade;
    }

    public EntityReference getConta() {
        return Conta;
    }

    public void setConta(EntityReference conta) {
        Conta = conta;
    }

    public EntityReference getUnidadeNegocio() {
        return UnidadeNegocio;
    }

    public void setUnidadeNegocio(EntityReference unidadeNegocio) {
        UnidadeNegocio = unidadeNegocio;
    }

    public OptionSetValue getFacilities() {
        return Facilities;
    }

    public void setFacilities(OptionSetValue facilities) {
        Facilities = facilities;
    }

    public EntityReference getFilial() {
        return Filial;
    }

    public void setFilial(EntityReference filial) {
        Filial = filial;
    }

    public OptionSetValue getGerNacStatus() {
        return GerNacStatus;
    }

    public void setGerNacStatus(OptionSetValue gerNacStatus) {
        GerNacStatus = gerNacStatus;
    }

    public EntityReference getGerNacAprovador() {
        return GerNacAprovador;
    }

    public void setGerNacAprovador(EntityReference gerNacAprovador) {
        GerNacAprovador = gerNacAprovador;
    }

    public OptionSetValue getDirStatus() {
        return DirStatus;
    }

    public void setDirStatus(OptionSetValue dirStatus) {
        DirStatus = dirStatus;
    }

    public EntityReference getDirAprovador() {
        return DirAprovador;
    }

    public void setDirAprovador(EntityReference dirAprovador) {
        DirAprovador = dirAprovador;
    }

    public EntityReference getOs() {
        return Os;
    }

    public void setOs(EntityReference os) {
        Os = os;
    }

    public EntityReference getCriadoPor() {
        return CriadoPor;
    }

    public void setCriadoPor(EntityReference criadoPor) {
        CriadoPor = criadoPor;
    }

    public OptionSetValue getStatus() {
        return Status;
    }

    public void setStatus(OptionSetValue status) {
        Status = status;
    }

    public OptionSetValue getRazaoStatus() {
        return RazaoStatus;
    }

    public void setRazaoStatus(OptionSetValue razaoStatus) {
        RazaoStatus = razaoStatus;
    }

    public EntityReference getAlteradoPor() {
        return AlteradoPor;
    }

    public void setAlteradoPor(EntityReference alteradoPor) {
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

    public Number getProbabilidade() {
        return Probabilidade;
    }

    public void setProbabilidade(Number probabilidade) {
        Probabilidade = probabilidade;
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

    public String getTipoInstalacao() {
        return TipoInstalacao;
    }

    public void setTipoInstalacao(String tipoInstalacao) {
        TipoInstalacao = tipoInstalacao;
    }

    public Boolean getIdentificadoFornecedorAtual() {
        return IdentificadoFornecedorAtual;
    }

    public void setIdentificadoFornecedorAtual(Boolean identificadoFornecedorAtual) {
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

    public String getDirDescricao() {
        return DirDescricao;
    }

    public void setDirDescricao(String dirDescricao) {
        DirDescricao = dirDescricao;
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

    /*Value*/

    public Number getValorEstimaPropostaValue() {
        return ValorEstimaProposta != null ? ValorEstimaProposta.getValue() : 0;
    }

    public void setValorEstimaPropostaValue(Number valorEstimaPropostaValue) {
        ValorEstimaPropostaValue = valorEstimaPropostaValue;
    }

    public Number getInteresseValue() {
        return Interesse != null ? Interesse.getValue() : 0;
    }

    public void setInteresseValue(Number interesseValue) {
        InteresseValue = interesseValue;
    }

    public Number getReceitaRealValue() {
        return ReceitaReal != null ? ReceitaReal.getValue() : 0;
    }

    public void setReceitaRealValue(Number receitaRealValue) {
        ReceitaRealValue = receitaRealValue;
    }

    public Number getCurvaUnidadeValue() {
        return CurvaUnidade != null ? CurvaUnidade.getValue() : 0;
    }

    public void setCurvaUnidadeValue(Number curvaUnidadeValue) {
        CurvaUnidadeValue = curvaUnidadeValue;
    }

    public Number getFacilitiesValue() {
        return Facilities != null ? Facilities.getValue() : 0;
    }

    public void setFacilitiesValue(Number facilitiesValue) {
        FacilitiesValue = facilitiesValue;
    }

    public Number getGerNacStatusValue() {
        return GerNacStatus != null ? GerNacStatus.getValue() : 0;
    }

    public void setGerNacStatusValue(Number gerNacStatusValue) {
        GerNacStatusValue = gerNacStatusValue;
    }

    public Number getDirStatusValue() {
        return DirStatus != null ? DirStatus.getValue() : 0;
    }

    public void setDirStatusValue(Number dirStatusValue) {
        DirStatusValue = dirStatusValue;
    }

    public Number getStatusValue() {
        return Status != null ? Status.getValue() : 0;
    }

    public void setStatusValue(Number statusValue) {
        StatusValue = statusValue;
    }

    public Number getRazaoStatusValue() {
        return RazaoStatus != null? RazaoStatus.getValue() : 0;
    }

    public void setRazaoStatusValue(Number razaoStatusValue) {
        RazaoStatusValue = razaoStatusValue;
    }

    /*Id*/

    public String getClienteProvavelId() {
        return ClienteProvavel != null ? ClienteProvavel.getId() : "";
    }

    public void setClienteProvavelId(String clienteProvavelId) {
        ClienteProvavelId = clienteProvavelId;
    }

    public String getTipoServicoId() {
        return TipoServico != null ? TipoServico.getId() : "";
    }

    public void setTipoServicoId(String tipoServicoId) {
        TipoServicoId = tipoServicoId;
    }

    public String getProprietarioId() {
        return Proprietario != null ? Proprietario.getId() : "";
    }

    public void setProprietarioId(String proprietarioId) {
        ProprietarioId = proprietarioId;
    }

    public String getContaId() {
        return Conta != null ? Conta.getId() : "";
    }

    public void setContaId(String contaId) {
        ContaId = contaId;
    }

    public String getUnidadeNegocioId() {
        return UnidadeNegocio != null ? UnidadeNegocio.getId() : "";
    }

    public void setUnidadeNegocioId(String unidadeNegocioId) {
        UnidadeNegocioId = unidadeNegocioId;
    }

    public String getFilialId() {
        return Filial != null ? Filial.getId() : "";
    }

    public void setFilialId(String filialId) {
        FilialId = filialId;
    }

    public String getGerNacAprovadorId() {
        return GerNacAprovador != null ? GerNacAprovador.getId() : "";
    }

    public void setGerNacAprovadorId(String gerNacAprovadorId) {
        GerNacAprovadorId = gerNacAprovadorId;
    }

    public String getDirAprovadorId() {
        return DirAprovador != null ? DirAprovador.getId() : "";
    }

    public void setDirAprovadorId(String dirAprovadorId) {
        DirAprovadorId = dirAprovadorId;
    }

    public String getOsId() {
        return Os != null ? Os.getId() : "";
    }

    public void setOsId(String osId) {
        OsId = osId;
    }

    public String getCriadoPorId() {
        return CriadoPor != null ? CriadoPor.getId() : "";
    }

    public void setCriadoPorId(String criadoPorId) {
        CriadoPorId = criadoPorId;
    }

    public String getAlteradoPorId() {
        return AlteradoPor != null ? AlteradoPor.getId() : "";
    }

    public void setAlteradoPorId(String alteradoPorId) {
        AlteradoPorId = alteradoPorId;
    }

    /*Name*/

    public String getClienteProvavelName() {
        return ClienteProvavel != null ? ClienteProvavel.getName() : "";
    }

    public void setClienteProvavelName(String clienteProvavelName) {
        ClienteProvavelName = clienteProvavelName;
    }

    public String getTipoServicoName() {
        return TipoServico != null ? TipoServico.getName() : "";
    }

    public void setTipoServicoName(String tipoServicoName) {
        TipoServicoName = tipoServicoName;
    }

    public String getProprietarioName() {
        return Proprietario != null ? Proprietario.getName() : "";
    }

    public void setProprietarioName(String proprietarioName) {
        ProprietarioName = proprietarioName;
    }

    public String getContaName() {
        return Conta != null ? Conta.getName() : "";
    }

    public void setContaName(String contaName) {
        ContaName = contaName;
    }

    public String getUnidadeNegocioName() {
        return UnidadeNegocio != null ? UnidadeNegocio.getName() : "";
    }

    public void setUnidadeNegocioName(String unidadeNegocioName) {
        UnidadeNegocioName = unidadeNegocioName;
    }

    public String getFilialName() {
        return Filial != null ? Filial.getName() : "";
    }

    public void setFilialName(String filialName) {
        FilialName = filialName;
    }

    public String getGerNacAprovadorName() {
        return GerNacAprovador != null ? GerNacAprovador.getName() : "";
    }

    public void setGerNacAprovadorName(String gerNacAprovadorName) {
        GerNacAprovadorName = gerNacAprovadorName;
    }

    public String getDirAprovadorName() {
        return DirAprovador != null ? DirAprovador.getName() : "";
    }

    public void setDirAprovadorName(String dirAprovadorName) {
        DirAprovadorName = dirAprovadorName;
    }

    public String getOsName() {
        return Os != null ? Os.getName() : "";
    }

    public void setOsName(String osName) {
        OsName = osName;
    }

    public String getCriadoPorName() {
        return CriadoPor != null ? CriadoPor.getName() : "";
    }

    public void setCriadoPorName(String criadoPorName) {
        CriadoPorName = criadoPorName;
    }

    public String getAlteradoPorName() {
        return AlteradoPor != null ? AlteradoPor.getName() : "";
    }

    public void setAlteradoPorName(String alteradoPorName) {
        AlteradoPorName = alteradoPorName;
    }

    public void setProperties(){
        this.setValorEstimaPropostaValue(this.getValorEstimaPropostaValue());
        this.setInteresseValue(this.getInteresseValue());
        this.setReceitaRealValue(this.getReceitaRealValue());
        this.setCurvaUnidadeValue(this.getCurvaUnidadeValue());
        this.setFacilitiesValue(this.getFacilitiesValue());
        this.setGerNacStatusValue(this.getGerNacStatusValue());
        this.setDirStatusValue(this.getDirStatusValue());
        this.setStatusValue(this.getStatusValue());
        this.setRazaoStatusValue(this.getRazaoStatusValue());
        this.setClienteProvavelId(this.getClienteProvavelId());
        this.setTipoServicoId(this.getTipoServicoId());
        this.setProprietarioId(this.getProprietarioId());
        this.setContaId(this.getContaId());
        this.setUnidadeNegocioId(this.getUnidadeNegocioId());
        this.setFilialId(this.getFilialId());
        this.setGerNacAprovadorId(this.getGerNacAprovadorId());
        this.setDirAprovadorId(this.getDirAprovadorId());
        this.setOsId(this.getOsId());
        this.setCriadoPorId(this.getCriadoPorId());
        this.setAlteradoPorId(this.getAlteradoPorId());
        this.setClienteProvavelName(this.getClienteProvavelName());
        this.setTipoServicoName(this.getTipoServicoName());
        this.setProprietarioName(this.getProprietarioName());
        this.setContaName(this.getContaName());
        this.setUnidadeNegocioName(this.getUnidadeNegocioName());
        this.setFilialName(this.getFilialName());
        this.setGerNacAprovadorName(this.getGerNacAprovadorName());
        this.setDirAprovadorName(this.getDirAprovadorName());
        this.setOsName(this.getOsName());
        this.setCriadoPorName(this.getCriadoPorName());
        this.setAlteradoPorName(this.getAlteradoPorName());
    }
}
