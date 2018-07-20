package com.example.demointegration.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Account implements Serializable{

    @Transient
    @JsonProperty("TipoPessoa")
    private TipoPessoa TipoPessoa;

    @Transient
    @JsonProperty("Proprietario")
    private Proprietario Proprietario;

    @Transient
    @JsonProperty("OrigemCliente")
    private OrigemCliente OrigemCliente;

    @Transient
    @JsonProperty("SegmentoEmpresa")
    private SegmentoEmpresa SegmentoEmpresa;

    @Transient
    @JsonProperty("SubsegmentoEmpresa")
    private SubsegmentoEmpresa SubsegmentoEmpresa;

    @Transient
    @JsonProperty("Porte")
    private Porte Porte;

    @Transient
    @JsonProperty("Cidade")
    private Cidade Cidade;

    @Transient
    @JsonProperty("Estado")
    private Estado Estado;

    @Transient
    @JsonProperty("CriadoPor")
    private CriadoPor CriadoPor;

    @Transient
    @JsonProperty("Status")
    private Status Status;

    @Transient
    @JsonProperty("AlteradoPor")
    private AlteradoPor AlteradoPor;


    /*Columns*/
    @Id
    @Column
    @JsonProperty("ContaId")
    private String ContaId;

    @Column
    @JsonProperty("Cnpj")
    private String Cnpj;

    @Column
    @JsonProperty("RazaoSocial")
    private String RazaoSocial;

    @Column
    @JsonProperty("NomeFantasia")
    private String NomeFantasia;

    @Column
    @JsonProperty("Telefone")
    private String Telefone;

    @Column
    @JsonProperty("Site")
    private String Site;

    @Column
    @JsonProperty("InscricaoMunicipal")
    private String InscricaoMunicipal;

    @Column
    @JsonProperty("InscricaoEstadual")
    private String InscricaoEstadual;

    @Column
    @JsonProperty("ReceitaAnual")
    private String ReceitaAnual;

    @Column
    @JsonProperty("Curva")
    private String Curva;

    @Column
    @JsonProperty("Cep")
    private String Cep;

    @Column
    @JsonProperty("Rua")
    private String Rua;

    @Column
    @JsonProperty("Complemento")
    private String Complemento;

    @Column
    @JsonProperty("Numero")
    private String Numero;

    @Column
    @JsonProperty("Bairro")
    private String Bairro;

    @Column
    @JsonProperty("Regiao")
    private String Regiao;

    @Column
    @JsonProperty("DataCriacao")
    private String DataCriacao;

    @Column
    @JsonProperty("DataAlteracao")
    private String DataAlteracao;

    /*Inside Obj*/

    @Column
    @JsonProperty("ProprietarioName")
    private String ProprietarioName;

    @Column
    @JsonProperty("ProprietarioId")
    private String ProprietarioId;

    @Column
    @JsonProperty("SegmentoEmpresaName")
    private String SegmentoEmpresaName;

    @Column
    @JsonProperty("SegmentoEmpresaId")
    private String SegmentoEmpresaId;

    @Column
    @JsonProperty("SubsegmentoEmpresaName")
    private String SubsegmentoEmpresaName;

    @Column
    @JsonProperty("SubsegmentoEmpresaId")
    private String SubsegmentoEmpresaId;

    @Column
    @JsonProperty("CidadeName")
    private String CidadeName;

    @Column
    @JsonProperty("CidadeId")
    private String CidadeId;

    @Column
    @JsonProperty("EstadoName")
    private String EstadoName;

    @Column
    @JsonProperty("EstadoId")
    private String EstadoId;

    @Column
    @JsonProperty("CriadoPorName")
    private String CriadoPorName;

    @Column
    @JsonProperty("CriadoPorId")
    private String CriadoPorId;

    @Column
    @JsonProperty("AlteradoPorName")
    private String AlteradoPorName;

    @Column
    @JsonProperty("AlteradoPorId")
    private String AlteradoPorId;

    /*Value*/
    @Column
    @JsonProperty("TipoPessoaValue")
    private Number TipoPessoaValue;

    @Column
    @JsonProperty("OrigemClienteValue")
    private Number OrigemClienteValue;

    @Column
    @JsonProperty("PorteValue")
    private Number PorteValue;

    @Column
    @JsonProperty("StatusValue")
    private Number StatusValue;

    public Account(){};

    public Account(com.example.demointegration.model.account.TipoPessoa tipoPessoa, com.example.demointegration.model.account.Proprietario proprietario, com.example.demointegration.model.account.OrigemCliente origemCliente, com.example.demointegration.model.account.SegmentoEmpresa segmentoEmpresa, com.example.demointegration.model.account.SubsegmentoEmpresa subsegmentoEmpresa, com.example.demointegration.model.account.Porte porte, com.example.demointegration.model.account.Cidade cidade, com.example.demointegration.model.account.Estado estado, com.example.demointegration.model.account.CriadoPor criadoPor, com.example.demointegration.model.account.Status status, com.example.demointegration.model.account.AlteradoPor alteradoPor, String contaId, String cnpj, String razaoSocial, String nomeFantasia, String telefone, String site, String inscricaoMunicipal, String inscricaoEstadual, String receitaAnual, String curva, String cep, String rua, String complemento, String numero, String bairro, String regiao, String dataCriacao, String dataAlteracao, String proprietarioName, String proprietarioId, String segmentoEmpresaName, String segmentoEmpresaId, String subsegmentoEmpresaName, String subsegmentoEmpresaId, String cidadeName, String cidadeId, String estadoName, String estadoId, String criadoPorName, String criadoPorId, String alteradoPorName, String alteradoPorId, Number tipoPessoaValue, Number origemClienteValue, Number porteValue, Number statusValue) {
        TipoPessoa = tipoPessoa;
        Proprietario = proprietario;
        OrigemCliente = origemCliente;
        SegmentoEmpresa = segmentoEmpresa;
        SubsegmentoEmpresa = subsegmentoEmpresa;
        Porte = porte;
        Cidade = cidade;
        Estado = estado;
        CriadoPor = criadoPor;
        Status = status;
        AlteradoPor = alteradoPor;
        ContaId = contaId;
        Cnpj = cnpj;
        RazaoSocial = razaoSocial;
        NomeFantasia = nomeFantasia;
        Telefone = telefone;
        Site = site;
        InscricaoMunicipal = inscricaoMunicipal;
        InscricaoEstadual = inscricaoEstadual;
        ReceitaAnual = receitaAnual;
        Curva = curva;
        Cep = cep;
        Rua = rua;
        Complemento = complemento;
        Numero = numero;
        Bairro = bairro;
        Regiao = regiao;
        DataCriacao = dataCriacao;
        DataAlteracao = dataAlteracao;
        ProprietarioName = proprietarioName;
        ProprietarioId = proprietarioId;
        SegmentoEmpresaName = segmentoEmpresaName;
        SegmentoEmpresaId = segmentoEmpresaId;
        SubsegmentoEmpresaName = subsegmentoEmpresaName;
        SubsegmentoEmpresaId = subsegmentoEmpresaId;
        CidadeName = cidadeName;
        CidadeId = cidadeId;
        EstadoName = estadoName;
        EstadoId = estadoId;
        CriadoPorName = criadoPorName;
        CriadoPorId = criadoPorId;
        AlteradoPorName = alteradoPorName;
        AlteradoPorId = alteradoPorId;
        TipoPessoaValue = tipoPessoaValue;
        OrigemClienteValue = origemClienteValue;
        PorteValue = porteValue;
        StatusValue = statusValue;
    }

    public com.example.demointegration.model.account.TipoPessoa getTipoPessoa() {
        return TipoPessoa;
    }

    public void setTipoPessoa(com.example.demointegration.model.account.TipoPessoa tipoPessoa) {
        TipoPessoa = tipoPessoa;
    }

    public com.example.demointegration.model.account.Proprietario getProprietario() {
        return Proprietario;
    }

    public void setProprietario(com.example.demointegration.model.account.Proprietario proprietario) {
        Proprietario = proprietario;
    }

    public com.example.demointegration.model.account.OrigemCliente getOrigemCliente() {
        return OrigemCliente;
    }

    public void setOrigemCliente(com.example.demointegration.model.account.OrigemCliente origemCliente) {
        OrigemCliente = origemCliente;
    }

    public com.example.demointegration.model.account.SegmentoEmpresa getSegmentoEmpresa() {
        return SegmentoEmpresa;
    }

    public void setSegmentoEmpresa(com.example.demointegration.model.account.SegmentoEmpresa segmentoEmpresa) {
        SegmentoEmpresa = segmentoEmpresa;
    }

    public com.example.demointegration.model.account.SubsegmentoEmpresa getSubsegmentoEmpresa() {
        return SubsegmentoEmpresa;
    }

    public void setSubsegmentoEmpresa(com.example.demointegration.model.account.SubsegmentoEmpresa subsegmentoEmpresa) {
        SubsegmentoEmpresa = subsegmentoEmpresa;
    }

    public com.example.demointegration.model.account.Porte getPorte() {
        return Porte;
    }

    public void setPorte(com.example.demointegration.model.account.Porte porte) {
        Porte = porte;
    }

    public com.example.demointegration.model.account.Cidade getCidade() {
        return Cidade;
    }

    public void setCidade(com.example.demointegration.model.account.Cidade cidade) {
        Cidade = cidade;
    }

    public com.example.demointegration.model.account.Estado getEstado() {
        return Estado;
    }

    public void setEstado(com.example.demointegration.model.account.Estado estado) {
        Estado = estado;
    }

    public com.example.demointegration.model.account.CriadoPor getCriadoPor() {
        return CriadoPor;
    }

    public void setCriadoPor(com.example.demointegration.model.account.CriadoPor criadoPor) {
        CriadoPor = criadoPor;
    }

    public com.example.demointegration.model.account.Status getStatus() {
        return Status;
    }

    public void setStatus(com.example.demointegration.model.account.Status status) {
        Status = status;
    }

    public com.example.demointegration.model.account.AlteradoPor getAlteradoPor() {
        return AlteradoPor;
    }

    public void setAlteradoPor(com.example.demointegration.model.account.AlteradoPor alteradoPor) {
        AlteradoPor = alteradoPor;
    }

    public String getContaId() {
        return ContaId;
    }

    public void setContaId(String contaId) {
        ContaId = contaId;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        RazaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        NomeFantasia = nomeFantasia;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String site) {
        Site = site;
    }

    public String getInscricaoMunicipal() {
        return InscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        InscricaoMunicipal = inscricaoMunicipal;
    }

    public String getInscricaoEstadual() {
        return InscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        InscricaoEstadual = inscricaoEstadual;
    }

    public String getReceitaAnual() {
        return ReceitaAnual;
    }

    public void setReceitaAnual(String receitaAnual) {
        ReceitaAnual = receitaAnual;
    }

    public String getCurva() {
        return Curva;
    }

    public void setCurva(String curva) {
        Curva = curva;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getRegiao() {
        return Regiao;
    }

    public void setRegiao(String regiao) {
        Regiao = regiao;
    }

    public String getDataCriacao() {
        return DataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        DataCriacao = dataCriacao;
    }

    public String getDataAlteracao() {
        return DataAlteracao;
    }

    public void setDataAlteracao(String dataAlteracao) {
        DataAlteracao = dataAlteracao;
    }

    public String getProprietarioName() {
        return Proprietario.getName();
    }

    public void setProprietarioName(String proprietarioName) {
        ProprietarioName = proprietarioName;
    }

    public String getProprietarioId() {
        return Proprietario.getId();
    }

    public void setProprietarioId(String proprietarioId) {
        ProprietarioId = proprietarioId;
    }

    public String getSegmentoEmpresaName() {
        return SegmentoEmpresa.getName();
    }

    public void setSegmentoEmpresaName(String segmentoEmpresaName) {
        SegmentoEmpresaName = segmentoEmpresaName;
    }

    public String getSegmentoEmpresaId() {
        return SegmentoEmpresa.getId();
    }

    public void setSegmentoEmpresaId(String segmentoEmpresaId) {
        SegmentoEmpresaId = segmentoEmpresaId;
    }

    public String getSubsegmentoEmpresaName() {
        return SubsegmentoEmpresa.getName();
    }

    public void setSubsegmentoEmpresaName(String subsegmentoEmpresaName) {
        SubsegmentoEmpresaName = subsegmentoEmpresaName;
    }

    public String getSubsegmentoEmpresaId() {
        return SubsegmentoEmpresa.getId();
    }

    public void setSubsegmentoEmpresaId(String subsegmentoEmpresaId) {
        SubsegmentoEmpresaId = subsegmentoEmpresaId;
    }

    public String getCidadeName() {
        return Cidade.getName();
    }

    public void setCidadeName(String cidadeName) {
        CidadeName = cidadeName;
    }

    public String getCidadeId() {
        return Cidade.getId();
    }

    public void setCidadeId(String cidadeId) {
        CidadeId = cidadeId;
    }

    public String getEstadoName() {
        return Estado.getName();
    }

    public void setEstadoName(String estadoName) {
        EstadoName = estadoName;
    }

    public String getEstadoId() {
        return Estado.getId();
    }

    public void setEstadoId(String estadoId) {
        EstadoId = estadoId;
    }

    public String getCriadoPorName() {
        return CriadoPor.getName();
    }

    public void setCriadoPorName(String criadoPorName) {
        CriadoPorName = criadoPorName;
    }

    public String getCriadoPorId() {
        return CriadoPor.getId();
    }

    public void setCriadoPorId(String criadoPorId) {
        CriadoPorId = criadoPorId;
    }

    public String getAlteradoPorName() {
        return AlteradoPor.getName();
    }

    public void setAlteradoPorName(String alteradoPorName) {
        AlteradoPorName = alteradoPorName;
    }

    public String getAlteradoPorId() {
        return AlteradoPor.getId();
    }

    public void setAlteradoPorId(String alteradoPorId) {
        AlteradoPorId = alteradoPorId;
    }

    public Number getTipoPessoaValue() {
        return TipoPessoa.getValue();
    }

    public void setTipoPessoaValue(Number tipoPessoaValue) {
        TipoPessoaValue = tipoPessoaValue;
    }

    public Number getOrigemClienteValue() {
        return OrigemCliente.getValue();
    }

    public void setOrigemClienteValue(Number origemClienteValue) {
        OrigemClienteValue = origemClienteValue;
    }

    public Number getPorteValue() {
        return Porte.getValue();
    }

    public void setPorteValue(Number porteValue) {
        PorteValue = porteValue;
    }

    public Number getStatusValue() {
        return Status.getValue();
    }

    public void setStatusValue(Number statusValue) {
        StatusValue = statusValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account that = (Account) o;
        return ContaId == that.ContaId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(ContaId);
    }

    public void setProperties(){
        this.setProprietarioName(this.getProprietarioName());
        this.setProprietarioId(this.getProprietarioId());
        this.setSegmentoEmpresaName(this.getSegmentoEmpresaName());
        this.setSegmentoEmpresaId(this.getSegmentoEmpresaId());
        this.setSubsegmentoEmpresaName(this.getSubsegmentoEmpresaName());
        this.setSubsegmentoEmpresaId(this.getSubsegmentoEmpresaId());
        this.setCidadeName(this.getCidadeName());
        this.setCidadeId(this.getCidadeId());
        this.setEstadoName(this.getEstadoName());
        this.setEstadoId(this.getEstadoId());
        this.setCriadoPorName(this.getCriadoPorName());
        this.setCriadoPorId(this.getCriadoPorId());
        this.setAlteradoPorName(this.getAlteradoPorName());
        this.setAlteradoPorId(this.getAlteradoPorId());
        this.setTipoPessoaValue(this.getTipoPessoaValue());
        this.setOrigemClienteValue(this.getOrigemClienteValue());
        this.setPorteValue(this.getPorteValue());
        this.setStatusValue(this.getStatusValue());
    }
}
