package com.example.demointegration.model.opportunity;

import com.example.demointegration.model.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;


@Entity
public class Opportunity implements Serializable{


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
    private AlteradoPor AlteradoPor;



    /*Strings*/

    @Id
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

    /*Id and Name*/


    @Column
    @JsonProperty("TipoServicoId")
    private String TipoServicoId;

    @Column
    @JsonProperty("TipoServicoName")
    private String TipoServicoName;

    @Column
    @JsonProperty("ProprietarioId")
    private String ProprietarioId;

    @Column
    @JsonProperty("ProprietarioName")
    private String ProprietarioName;

    @Column
    @JsonProperty("ContaId")
    private String ContaId;

    @Column
    @JsonProperty("ContaName")
    private String ContaName;

    @Column
    @JsonProperty("UnidadeNegocioId")
    private String UnidadeNegocioId;

    @Column
    @JsonProperty("UnidadeNegocioName")
    private String UnidadeNegocioName;

    @Column
    @JsonProperty("FilialId")
    private String FilialId;

    @Column
    @JsonProperty("FilialName")
    private String FilialName;

    @Column
    @JsonProperty("GerNacAprovadorId")
    private String GerNacAprovadorId;

    @Column
    @JsonProperty("GerNacAprovadorName")
    private String GerNacAprovadorName;

    @Column
    @JsonProperty("OsId")
    private String OsId;

    @Column
    @JsonProperty("OsName")
    private String OsName;

    @Column
    @JsonProperty("CriadoPorId")
    private String CriadoPorId;

    @Column
    @JsonProperty("CriadoPorName")
    private String CriadoPorName;

    @Column
    @JsonProperty("AlteradoPorId")
    private String AlteradoPorId;

    @Column
    @JsonProperty("AlteradoPorName")
    private String AlteradoPorName;

    /*Value*/
    @Column
    @JsonProperty("ValorEstimaPropostaValue")
    private Number ValorEstimaPropostaValue;

    @Column
    @JsonProperty("ReceitaRealValue")
    private Number ReceitaRealValue;

    @Column
    @JsonProperty("GerNacStatusValue")
    private Number GerNacStatusValue;

    @Column
    @JsonProperty("StatusValue")
    private Number StatusValue;

    @Column
    @JsonProperty("RazaoStatusValue")
    private Number RazaoStatusValue;

    public Opportunity(com.example.demointegration.model.opportunity.TipoServico tipoServico, com.example.demointegration.model.opportunity.ValorEstimaProposta valorEstimaProposta, com.example.demointegration.model.opportunity.Proprietario proprietario, com.example.demointegration.model.opportunity.ReceitaReal receitaReal, com.example.demointegration.model.opportunity.Conta conta, com.example.demointegration.model.opportunity.UnidadeNegocio unidadeNegocio, com.example.demointegration.model.opportunity.Filial filial, com.example.demointegration.model.opportunity.GerNacStatus gerNacStatus, com.example.demointegration.model.opportunity.GerNacAprovador gerNacAprovador, com.example.demointegration.model.opportunity.Os os, com.example.demointegration.model.opportunity.CriadoPor criadoPor, com.example.demointegration.model.opportunity.Status status, com.example.demointegration.model.opportunity.RazaoStatus razaoStatus, com.example.demointegration.model.opportunity.AlteradoPor alteradoPor, String oportunidadeId, String topico, String clienteProvavel, String cnpj, String dataEstimadaFechamento, String probabilidade, String interesse, String fasePipeline, String dataCriacao, String numeroOportunidade, String numeroProposta, String margemBruta, String curvaUnidade, String tipoInstalacao, String facilities, String identificadoFornecedorAtual, String lqResultadoTexto, String lqPorqueBid, String lqCriterioBid, String lqOpiniao, String gerNacDescricao, String gerNacData, String dirStatus, String dirDescricao, String dirAprovador, String dirData, String dataAlteracao, String tipoServicoId, String tipoServicoName, String proprietarioId, String proprietarioName, String contaId, String contaName, String unidadeNegocioId, String unidadeNegocioName, String filialId, String filialName, String gerNacAprovadorId, String gerNacAprovadorName, String osId, String osName, String criadoPorId, String criadoPorName, String alteradoPorId, String alteradoPorName, Number valorEstimaPropostaValue, Number receitaRealValue, Number gerNacStatusValue, Number statusValue, Number razaoStatusValue) {
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
        TipoServicoId = tipoServicoId;
        TipoServicoName = tipoServicoName;
        ProprietarioId = proprietarioId;
        ProprietarioName = proprietarioName;
        ContaId = contaId;
        ContaName = contaName;
        UnidadeNegocioId = unidadeNegocioId;
        UnidadeNegocioName = unidadeNegocioName;
        FilialId = filialId;
        FilialName = filialName;
        GerNacAprovadorId = gerNacAprovadorId;
        GerNacAprovadorName = gerNacAprovadorName;
        OsId = osId;
        OsName = osName;
        CriadoPorId = criadoPorId;
        CriadoPorName = criadoPorName;
        AlteradoPorId = alteradoPorId;
        AlteradoPorName = alteradoPorName;
        ValorEstimaPropostaValue = valorEstimaPropostaValue;
        ReceitaRealValue = receitaRealValue;
        GerNacStatusValue = gerNacStatusValue;
        StatusValue = statusValue;
        RazaoStatusValue = razaoStatusValue;
    }

    public Opportunity(){};


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

    public com.example.demointegration.model.opportunity.AlteradoPor getAlteradoPor() {
        return AlteradoPor;
    }

    public void setAlteradoPor(com.example.demointegration.model.opportunity.AlteradoPor alteradoPor) {
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


    /*Inside Properties*/


    public String getTipoServicoId() {
        return TipoServico.getId();
    }

    public void setTipoServicoId(String tipoServicoId) {
        TipoServicoId = tipoServicoId;
    }

    public String getTipoServicoName() {
        return TipoServico.getName();
    }

    public void setTipoServicoName(String tipoServicoName) {
        TipoServicoName = tipoServicoName;
    }

    public String getProprietarioId() {
        return Proprietario.getId();
    }

    public void setProprietarioId(String proprietarioId) {
        ProprietarioId = proprietarioId;
    }

    public String getProprietarioName() {
        return Proprietario.getName();
    }

    public void setProprietarioName(String proprietarioName) {
        ProprietarioName = proprietarioName;
    }

    public String getContaId() {
        return Conta.getId();
    }

    public void setContaId(String contaId) {
        ContaId = contaId;
    }

    public String getContaName() {
        return Conta.getName();
    }

    public void setContaName(String contaName) {
        ContaName = contaName;
    }

    public String getUnidadeNegocioId() {
        return UnidadeNegocio.getId();
    }

    public void setUnidadeNegocioId(String unidadeNegocioId) {
        UnidadeNegocioId = unidadeNegocioId;
    }

    public String getUnidadeNegocioName() {
        return UnidadeNegocio.getName();
    }

    public void setUnidadeNegocioName(String unidadeNegocioName) {
        UnidadeNegocioName = unidadeNegocioName;
    }

    public String getFilialId() {
        return Filial.getId();
    }

    public void setFilialId(String filialId) {
        FilialId = filialId;
    }

    public String getFilialName() {
        return Filial.getName();
    }

    public void setFilialName(String filialName) {
        FilialName = filialName;
    }

    public String getGerNacAprovadorId() {
        return GerNacAprovador.getId();
    }

    public void setGerNacAprovadorId(String gerNacAprovadorId) {
        GerNacAprovadorId = gerNacAprovadorId;
    }

    public String getGerNacAprovadorName() {
        return GerNacAprovador.getName();
    }

    public void setGerNacAprovadorName(String gerNacAprovadorName) {
        GerNacAprovadorName = gerNacAprovadorName;
    }

    public String getOsId() {
        return Os.getId();
    }

    public void setOsId(String osId) {
        OsId = osId;
    }

    public String getOsName() {
        return Os.getName();
    }

    public void setOsName(String osName) {
        OsName = osName;
    }

    public String getCriadoPorId() {
        return CriadoPor.getId();
    }

    public void setCriadoPorId(String criadoPorId) {
        CriadoPorId = criadoPorId;
    }

    public String getCriadoPorName() {
        return CriadoPor.getName();
    }

    public void setCriadoPorName(String criadoPorName) {
        CriadoPorName = criadoPorName;
    }

    public String getAlteradoPorId() {
        return AlteradoPor.getId();
    }

    public void setAlteradoPorId(String alteradoPorId) {
        AlteradoPorId = alteradoPorId;
    }

    public String getAlteradoPorName() {
        return AlteradoPor.getName();
    }

    public void setAlteradoPorName(String alteradoPorName) {
        AlteradoPorName = alteradoPorName;
    }

    public Number getValorEstimaPropostaValue() {
        return ValorEstimaProposta.getValue();
    }

    public void setValorEstimaPropostaValue(Number valorEstimaPropostaValue) {
        ValorEstimaPropostaValue = valorEstimaPropostaValue;
    }

    public Number getReceitaRealValue() {
        return ReceitaReal.getValue();
    }

    public void setReceitaRealValue(Number receitaRealValue) {
        ReceitaRealValue = receitaRealValue;
    }

    public Number getGerNacStatusValue() {
        return GerNacStatus.getValue();
    }

    public void setGerNacStatusValue(Number gerNacStatusValue) {
        GerNacStatusValue = gerNacStatusValue;
    }

    public Number getStatusValue() {
        return Status.getValue();
    }

    public void setStatusValue(Number statusValue) {
        StatusValue = statusValue;
    }

    public Number getRazaoStatusValue() {
        return RazaoStatus.getValue();
    }

    public void setRazaoStatusValue(Number razaoStatusValue) {
        RazaoStatusValue = razaoStatusValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opportunity that = (Opportunity) o;
        return OportunidadeId == that.OportunidadeId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(OportunidadeId);
    }

}
