package com.example.demointegration.model.account;

import com.example.demointegration.model.utils.EntityReference;
import com.example.demointegration.model.utils.Money;
import com.example.demointegration.model.utils.OptionSetValue;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Account implements Serializable{

    /*Transient*/
    @Transient
    @JsonProperty("Proprietario")
    private EntityReference Proprietario;
    @Transient
    @JsonProperty("SegmentoEmpresa")
    private EntityReference SegmentoEmpresa;
    @Transient
    @JsonProperty("SubsegmentoEmpresa")
    private EntityReference SubsegmentoEmpresa;
    @Transient
    @JsonProperty("Cidade")
    private EntityReference Cidade;
    @Transient
    @JsonProperty("Estado")
    private EntityReference Estado;
    @Transient
    @JsonProperty("CriadoPor")
    private EntityReference CriadoPor;
    @Transient
    @JsonProperty("AlteradoPor")
    private EntityReference AlteradoPor;
    @Transient
    @JsonProperty("TipoPessoa")
    private OptionSetValue TipoPessoa;
    @Transient
    @JsonProperty("ReceitaAnual")
    private Money ReceitaAnual;
    @Transient
    @JsonProperty("Curva")
    private OptionSetValue Curva;
    @Transient
    @JsonProperty("OrigemCliente")
    private OptionSetValue OrigemCliente;
    @Transient
    @JsonProperty("Porte")
    private OptionSetValue Porte;
    @Transient
    @JsonProperty("Status")
    private OptionSetValue Status;


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

    /*Value*/
    
    @Column
    @JsonProperty("ReceitaAnualValue")
    private Number ReceitaAnualValue;
    @Column
    @JsonProperty("CurvaValue")
    private Number CurvaValue;
    @Column
    @JsonProperty("OrigemClienteValue")
    private Number OrigemClienteValue;
    @Column
    @JsonProperty("PorteValue")
    private Number PorteValue;
    @Column
    @JsonProperty("StatusValue")
    private Number StatusValue;
    
    
    
    /*Id*/
    
    @Column
    @JsonProperty("ProprietarioId")
    private String ProprietarioId;
    @Column
    @JsonProperty("SegmentoEmpresaId")
    private String SegmentoEmpresaId;
    @Column
    @JsonProperty("SubsegmentoEmpresaId")
    private String SubsegmentoEmpresaId;
    @Column
    @JsonProperty("CidadeId")
    private String CidadeId;
    @Column
    @JsonProperty("EstadoId")
    private String EstadoId;
    @Column
    @JsonProperty("CriadoPorId")
    private String CriadoPorId;
    @Column
    @JsonProperty("AlteradoPorId")
    private String AlteradoPorId;

    /*Name*/

    @Column
    @JsonProperty("ProprietarioName")
    private String ProprietarioName;
    @Column
    @JsonProperty("SegmentoEmpresaName")
    private String SegmentoEmpresaName;
    @Column
    @JsonProperty("SubsegmentoEmpresaName")
    private String SubsegmentoEmpresaName;
    @Column
    @JsonProperty("CidadeName")
    private String CidadeName;
    @Column
    @JsonProperty("EstadoName")
    private String EstadoName;
    @Column
    @JsonProperty("CriadoPorName")
    private String CriadoPorName;
    @Column
    @JsonProperty("AlteradoPorName")
    private String AlteradoPorName;

    public Account(){};

    public EntityReference getProprietario() {
        return Proprietario;
    }

    public void setProprietario(EntityReference proprietario) {
        Proprietario = proprietario;
    }

    public EntityReference getSegmentoEmpresa() {
        return SegmentoEmpresa;
    }

    public void setSegmentoEmpresa(EntityReference segmentoEmpresa) {
        SegmentoEmpresa = segmentoEmpresa;
    }

    public EntityReference getSubsegmentoEmpresa() {
        return SubsegmentoEmpresa;
    }

    public void setSubsegmentoEmpresa(EntityReference subsegmentoEmpresa) {
        SubsegmentoEmpresa = subsegmentoEmpresa;
    }

    public EntityReference getCidade() {
        return Cidade;
    }

    public void setCidade(EntityReference cidade) {
        Cidade = cidade;
    }

    public EntityReference getEstado() {
        return Estado;
    }

    public void setEstado(EntityReference estado) {
        Estado = estado;
    }

    public EntityReference getCriadoPor() {
        return CriadoPor;
    }

    public void setCriadoPor(EntityReference criadoPor) {
        CriadoPor = criadoPor;
    }

    public EntityReference getAlteradoPor() {
        return AlteradoPor;
    }

    public void setAlteradoPor(EntityReference alteradoPor) {
        AlteradoPor = alteradoPor;
    }

    public OptionSetValue getTipoPessoa() {
        return TipoPessoa;
    }

    public void setTipoPessoa(OptionSetValue tipoPessoa) {
        TipoPessoa = tipoPessoa;
    }

    public Money getReceitaAnual() {
        return ReceitaAnual;
    }

    public void setReceitaAnual(Money receitaAnual) {
        ReceitaAnual = receitaAnual;
    }

    public OptionSetValue getCurva() {
        return Curva;
    }

    public void setCurva(OptionSetValue curva) {
        Curva = curva;
    }

    public OptionSetValue getOrigemCliente() {
        return OrigemCliente;
    }

    public void setOrigemCliente(OptionSetValue origemCliente) {
        OrigemCliente = origemCliente;
    }

    public OptionSetValue getPorte() {
        return Porte;
    }

    public void setPorte(OptionSetValue porte) {
        Porte = porte;
    }

    public OptionSetValue getStatus() {
        return Status;
    }

    public void setStatus(OptionSetValue status) {
        Status = status;
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

    public Number getReceitaAnualValue() {
        return ReceitaAnual != null ? ReceitaAnual.getValue() : 0;
    }

    public void setReceitaAnualValue(Number receitaAnualValue) {
        ReceitaAnualValue = receitaAnualValue;
    }

    public Number getCurvaValue() {
        return Curva != null ? Curva.getValue() : 0;
    }

    public void setCurvaValue(Number curvaValue) {
        CurvaValue = curvaValue;
    }

    public Number getOrigemClienteValue() {
        return OrigemCliente != null ? OrigemCliente.getValue() : 0;
    }

    public void setOrigemClienteValue(Number origemClienteValue) {
        OrigemClienteValue = origemClienteValue;
    }

    public Number getPorteValue() {
        return Porte != null ? Porte.getValue() : 0;
    }

    public void setPorteValue(Number porteValue) {
        PorteValue = porteValue;
    }

    public Number getStatusValue() {
        return Status != null ? Status.getValue() : 0;
    }

    public void setStatusValue(Number statusValue) {
        StatusValue = statusValue;
    }

    public String getProprietarioId() {
        return Proprietario != null ? Proprietario.getId() : "";
    }

    public void setProprietarioId(String proprietarioId) {
        ProprietarioId = proprietarioId;
    }

    public String getSegmentoEmpresaId() {
        return SegmentoEmpresa != null ? SegmentoEmpresa.getId() : "";
    }

    public void setSegmentoEmpresaId(String segmentoEmpresaId) {
        SegmentoEmpresaId = segmentoEmpresaId;
    }

    public String getSubsegmentoEmpresaId() {
        return SubsegmentoEmpresa != null ? SubsegmentoEmpresa.getId() : "";
    }

    public void setSubsegmentoEmpresaId(String subsegmentoEmpresaId) {
        SubsegmentoEmpresaId = subsegmentoEmpresaId;
    }

    public String getCidadeId() {
        return Cidade != null ? Cidade.getId() : "";
    }

    public void setCidadeId(String cidadeId) {
        CidadeId = cidadeId;
    }

    public String getEstadoId() {
        return Estado != null ? Estado.getId() : "";
    }

    public void setEstadoId(String estadoId) {
        EstadoId = estadoId;
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

    public String getProprietarioName() {
        return Proprietario != null ? Proprietario.getName() : "";
    }

    public void setProprietarioName(String proprietarioName) {
        ProprietarioName = proprietarioName;
    }

    public String getSegmentoEmpresaName() {
        return SegmentoEmpresa != null ? SegmentoEmpresa.getName() : "";
    }

    public void setSegmentoEmpresaName(String segmentoEmpresaName) {
        SegmentoEmpresaName = segmentoEmpresaName;
    }

    public String getSubsegmentoEmpresaName() {
        return SubsegmentoEmpresa != null ? SubsegmentoEmpresa.getName() : "";
    }

    public void setSubsegmentoEmpresaName(String subsegmentoEmpresaName) {
        SubsegmentoEmpresaName = subsegmentoEmpresaName;
    }

    public String getCidadeName() {
        return Cidade != null ? Cidade.getName() : "";
    }

    public void setCidadeName(String cidadeName) {
        CidadeName = cidadeName;
    }

    public String getEstadoName() {
        return Estado != null ? Estado.getName() : "";
    }

    public void setEstadoName(String estadoName) {
        EstadoName = estadoName;
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

    /*equals hash code*/

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

    /*set properties*/

    public void setProperties(){
        this.setReceitaAnualValue(this.getReceitaAnualValue());
        this.setCurvaValue(this.getCurvaValue());
        this.setOrigemClienteValue(this.getOrigemClienteValue());
        this.setPorteValue(this.getPorteValue());
        this.setStatusValue(this.getStatusValue());
        this.setProprietarioId(this.getProprietarioId());
        this.setSegmentoEmpresaId(this.getSegmentoEmpresaId());
        this.setSubsegmentoEmpresaId(this.getSubsegmentoEmpresaId());
        this.setCidadeId(this.getCidadeId());
        this.setEstadoId(this.getEstadoId());
        this.setCriadoPorId(this.getCriadoPorId());
        this.setAlteradoPorId(this.getAlteradoPorId());
        this.setProprietarioName(this.getProprietarioName());
        this.setSegmentoEmpresaName(this.getSegmentoEmpresaName());
        this.setSubsegmentoEmpresaName(this.getSubsegmentoEmpresaName());
        this.setCidadeName(this.getCidadeName());
        this.setEstadoName(this.getEstadoName());
        this.setCriadoPorName(this.getCriadoPorName());
        this.setAlteradoPorName(this.getAlteradoPorName());
    }
}
