package com.example.demointegration.model.unity;

import com.example.demointegration.model.opportunity.Opportunity;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class Unity implements Serializable{

    /*Transient*/
    @Transient
    @JsonProperty("Conta")
    private Conta Conta;

    @Transient
    @JsonProperty("Oportunidade")
    private Oportunidade Oportunidade;

    @Transient
    @JsonProperty("TipoEndereco1")
    private TipoEndereco TipoEndereco1;

    @Transient
    @JsonProperty("TipoEndereco2")
    private TipoEndereco TipoEndereco2;

    @Transient
    @JsonProperty("TipoEndereco3")
    private TipoEndereco TipoEndereco3;

    @Transient
    @JsonProperty("TipoEndereco4")
    private TipoEndereco TipoEndereco4;

    @Transient
    @JsonProperty("TipoEndereco5")
    private TipoEndereco TipoEndereco5;

    @Transient
    @JsonProperty("Os")
    private Os Os;

    @Transient
    @JsonProperty("Cidade1")
    private Cidade Cidade1;

    @Transient
    @JsonProperty("Estado1")
    private Estado Estado1;

    @Transient
    @JsonProperty("Cidade2")
    private Cidade Cidade2;

    @Transient
    @JsonProperty("Estado2")
    private Estado Estado2;

    @Transient
    @JsonProperty("Cidade3")
    private Cidade Cidade3;

    @Transient
    @JsonProperty("Estado3")
    private Estado Estado3;

    @Transient
    @JsonProperty("Cidade4")
    private Cidade Cidade4;

    @Transient
    @JsonProperty("Estado4")
    private Estado Estado4;

    @Transient
    @JsonProperty("Cidade5")
    private Cidade Cidade5;

    @Transient
    @JsonProperty("Estado5")
    private Estado Estado5;

    @Transient
    @JsonProperty("MargemBrura")
    private MargemBruta MargemBruta;

    @Transient
    @JsonProperty("FaturamentoBruto")
    private FaturamentoBruto FaturamentoBruto;


    /*String*/
    @Id
    @Column
    @JsonProperty("UnidadeBrasanitaId")
    private String UnidadeBrasanitaId;

    @Column
    @JsonProperty("Nome")
    private String Nome;

    @Column
    @JsonProperty("Descricao")
    private String Descricao;

    @Column
    @JsonProperty("IdUnidade")
    private String IdUnidade;

    @Column
    @JsonProperty("CentroCusto")
    private String CentroCusto;

    @Column
    @JsonProperty("Cnpj")
    private String Cnpj;

    @Column
    @JsonProperty("Cep1")
    private String Cep1;

    @Column
    @JsonProperty("Logradouro1")
    private String Logradouro1;

    @Column
    @JsonProperty("Numero1")
    private String Numero1;

    @Column
    @JsonProperty("Complemento1")
    private String Complemento1;

    @Column
    @JsonProperty("Bairro1")
    private String Bairro1;

    @Column
    @JsonProperty("Pais1")
    private String Pais1;

    @Column
    @JsonProperty("Cnpj2")
    private String Cnpj2;

    @Column
    @JsonProperty("Cep2")
    private String Cep2;

    @Column
    @JsonProperty("Logradouro2")
    private String Logradouro2;

    @Column
    @JsonProperty("Numero2")
    private String Numero2;

    @Column
    @JsonProperty("Complemento2")
    private String Complemento2;

    @Column
    @JsonProperty("Bairro2")
    private String Bairro2;

    @JsonProperty("Pais2")
    private String Pais2;

    @Column
    @JsonProperty("Cnpj3")
    private String Cnpj3;

    @Column
    @JsonProperty("Cep3")
    private String Cep3;

    @Column
    @JsonProperty("Logradouro3")
    private String Logradouro3;

    @Column
    @JsonProperty("Numero3")
    private String Numero3;

    @Column
    @JsonProperty("Complemento3")
    private String Complemento3;

    @Column
    @JsonProperty("Bairro3")
    private String Bairro3;

    @Column
    @JsonProperty("Pais3")
    private String Pais3;

    @Column
    @JsonProperty("Cnpj4")
    private String Cnpj4;

    @Column
    @JsonProperty("Cep4")
    private String Cep4;

    @Column
    @JsonProperty("Logradouro4")
    private String Logradouro4;

    @Column
    @JsonProperty("Numero4")
    private String Numero4;

    @Column
    @JsonProperty("Complemento4")
    private String Complemento4;

    @Column
    @JsonProperty("Bairro4")
    private String Bairro4;

    @Column
    @JsonProperty("Pais4")
    private String Pais4;

    @Column
    @JsonProperty("Cnpj5")
    private String Cnpj5;

    @Column
    @JsonProperty("Cep5")
    private String Cep5;

    @Column
    @JsonProperty("Logradouro5")
    private String Logradouro5;

    @Column
    @JsonProperty("Numero5")
    private String Numero5;

    @Column
    @JsonProperty("Complemento5")
    private String Complemento5;

    @Column
    @JsonProperty("Bairro5")
    private String Bairro5;

    @Column
    @JsonProperty("Pais5")
    private String Pais5;

    @Column
    @JsonProperty("MargemBruraPerc")
    private Number MargemBruraPerc;

    @Column
    @JsonProperty("InscricaoEstadual")
    private String InscricaoEstadual;

    @Column
    @JsonProperty("InscricaoMunicipal")
    private String InscricaoMunicipal;

    @Column
    @JsonProperty("InscricaoEstadual2")
    private String InscricaoEstadual2;

    @Column
    @JsonProperty("InscricaoMunicipal2")
    private String InscricaoMunicipal2;

    @Column
    @JsonProperty("InscricaoEstadual3")
    private String InscricaoEstadual3;

    @Column
    @JsonProperty("InscricaoMunicipal3")
    private String InscricaoMunicipal3;

    @Column
    @JsonProperty("InscricaoEstadual4")
    private String InscricaoEstadual4;

    @Column
    @JsonProperty("InscricaoMunicipal4")
    private String InscricaoMunicipal4;

    @Column
    @JsonProperty("InscricaoEstadual5")
    private String InscricaoEstadual5;

    @Column
    @JsonProperty("InscricaoMunicipal5")
    private String InscricaoMunicipal5;

    @Column
    @JsonProperty("RazaoSocial")
    private String RazaoSocial;

    @Column
    @JsonProperty("RazaoSocial2")
    private String RazaoSocial2;

    @Column
    @JsonProperty("RazaoSocial3")
    private String RazaoSocial3;

    @Column
    @JsonProperty("RazaoSocial4")
    private String RazaoSocial4;

    @Column
    @JsonProperty("RazaoSocial5")
    private String RazaoSocial5;



    /*Id e Name*/


    @Column
    @JsonProperty("ContaId")
    private String ContaId;

    @Column
    @JsonProperty("OportunidadeId")
    private String OportunidadeId;

    @Column
    @JsonProperty("OsId")
    private String OsId;

    @Column
    @JsonProperty("Cidade1Id")
    private String Cidade1Id;

    @Column
    @JsonProperty("Estado1Id")
    private String Estado1Id;

    @Column
    @JsonProperty("Cidade2Id")
    private String Cidade2Id;

    @Column
    @JsonProperty("Estado2Id")
    private String Estado2Id;

    @Column
    @JsonProperty("Cidade3Id")
    private String Cidade3Id;

    @Column
    @JsonProperty("Estado3Id")
    private String Estado3Id;

    @Column
    @JsonProperty("Cidade4Id")
    private String Cidade4Id;

    @Column
    @JsonProperty("Estado4Id")
    private String Estado4Id;

    @Column
    @JsonProperty("Cidade5Id")
    private String Cidade5Id;

    @Column
    @JsonProperty("Estado5Id")
    private String Estado5Id;

    @Column
    @JsonProperty("MargemBrutaId")
    private String MargemBrutaId;

    @Column
    @JsonProperty("FaturamentoBrutoId")
    private String FaturamentoBrutoId;




    @Column
    @JsonProperty("ContaName")
    private String ContaName;

    @Column
    @JsonProperty("OportunidadeName")
    private String OportunidadeName;

    @Column
    @JsonProperty("OsName")
    private String OsName;

    @Column
    @JsonProperty("Cidade1Name")
    private String Cidade1Name;

    @Column
    @JsonProperty("Estado1Name")
    private String Estado1Name;

    @Column
    @JsonProperty("Cidade2Name")
    private String Cidade2Name;

    @Column
    @JsonProperty("Estado2Name")
    private String Estado2Name;

    @Column
    @JsonProperty("Cidade3Name")
    private String Cidade3Name;

    @Column
    @JsonProperty("Estado3Name")
    private String Estado3Name;

    @Column
    @JsonProperty("Cidade4Name")
    private String Cidade4Name;

    @Column
    @JsonProperty("Estado4Name")
    private String Estado4Name;

    @Column
    @JsonProperty("Cidade5Name")
    private String Cidade5Name;

    @Column
    @JsonProperty("Estado5Name")
    private String Estado5Name;

    @Column
    @JsonProperty("MargemBrutaValue")
    private Number MargemBrutaValue;

    @Column
    @JsonProperty("FaturamentoBrutoValue")
    private Number FaturamentoBrutoValue;

    /*Value*/

    @Column
    @JsonProperty("TipoEndereco1Value")
    private Number TipoEndereco1Value;

    @Column
    @JsonProperty("TipoEndereco2Value")
    private Number TipoEndereco2Value;

    @Column
    @JsonProperty("TipoEndereco3Value")
    private Number TipoEndereco3Value;

    @Column
    @JsonProperty("TipoEndereco4Value")
    private Number TipoEndereco4Value;

    @Column
    @JsonProperty("TipoEndereco5Value")
    private Number TipoEndereco5Value;

    public Unity(){};

    public Unity(com.example.demointegration.model.unity.Conta conta, com.example.demointegration.model.unity.Oportunidade oportunidade, TipoEndereco tipoEndereco1, TipoEndereco tipoEndereco2, TipoEndereco tipoEndereco3, TipoEndereco tipoEndereco4, TipoEndereco tipoEndereco5, com.example.demointegration.model.unity.Os os, Cidade cidade1, Estado estado1, Cidade cidade2, Estado estado2, Cidade cidade3, Estado estado3, Cidade cidade4, Estado estado4, Cidade cidade5, Estado estado5, com.example.demointegration.model.unity.MargemBruta margemBruta, com.example.demointegration.model.unity.FaturamentoBruto faturamentoBruto, String unidadeBrasanitaId, String nome, String descricao, String idUnidade, String centroCusto, String cnpj, String cep1, String logradouro1, String numero1, String complemento1, String bairro1, String pais1, String cnpj2, String cep2, String logradouro2, String numero2, String complemento2, String bairro2, String pais2, String cnpj3, String cep3, String logradouro3, String numero3, String complemento3, String bairro3, String pais3, String cnpj4, String cep4, String logradouro4, String numero4, String complemento4, String bairro4, String pais4, String cnpj5, String cep5, String logradouro5, String numero5, String complemento5, String bairro5, String pais5, Number margemBruraPerc, String inscricaoEstadual, String inscricaoMunicipal, String inscricaoEstadual2, String inscricaoMunicipal2, String inscricaoEstadual3, String inscricaoMunicipal3, String inscricaoEstadual4, String inscricaoMunicipal4, String inscricaoEstadual5, String inscricaoMunicipal5, String razaoSocial, String razaoSocial2, String razaoSocial3, String razaoSocial4, String razaoSocial5, String contaId, String oportunidadeId, String osId, String cidade1Id, String estado1Id, String cidade2Id, String estado2Id, String cidade3Id, String estado3Id, String cidade4Id, String estado4Id, String cidade5Id, String estado5Id, String margemBrutaId, String faturamentoBrutoId, String contaName, String oportunidadeName, String osName, String cidade1Name, String estado1Name, String cidade2Name, String estado2Name, String cidade3Name, String estado3Name, String cidade4Name, String estado4Name, String cidade5Name, String estado5Name, Number margemBrutaValue, Number faturamentoBrutoValue, Number tipoEndereco1Value, Number tipoEndereco2Value, Number tipoEndereco3Value, Number tipoEndereco4Value, Number tipoEndereco5Value) {
        Conta = conta;
        Oportunidade = oportunidade;
        TipoEndereco1 = tipoEndereco1;
        TipoEndereco2 = tipoEndereco2;
        TipoEndereco3 = tipoEndereco3;
        TipoEndereco4 = tipoEndereco4;
        TipoEndereco5 = tipoEndereco5;
        Os = os;
        Cidade1 = cidade1;
        Estado1 = estado1;
        Cidade2 = cidade2;
        Estado2 = estado2;
        Cidade3 = cidade3;
        Estado3 = estado3;
        Cidade4 = cidade4;
        Estado4 = estado4;
        Cidade5 = cidade5;
        Estado5 = estado5;
        MargemBruta = margemBruta;
        FaturamentoBruto = faturamentoBruto;
        UnidadeBrasanitaId = unidadeBrasanitaId;
        Nome = nome;
        Descricao = descricao;
        IdUnidade = idUnidade;
        CentroCusto = centroCusto;
        Cnpj = cnpj;
        Cep1 = cep1;
        Logradouro1 = logradouro1;
        Numero1 = numero1;
        Complemento1 = complemento1;
        Bairro1 = bairro1;
        Pais1 = pais1;
        Cnpj2 = cnpj2;
        Cep2 = cep2;
        Logradouro2 = logradouro2;
        Numero2 = numero2;
        Complemento2 = complemento2;
        Bairro2 = bairro2;
        Pais2 = pais2;
        Cnpj3 = cnpj3;
        Cep3 = cep3;
        Logradouro3 = logradouro3;
        Numero3 = numero3;
        Complemento3 = complemento3;
        Bairro3 = bairro3;
        Pais3 = pais3;
        Cnpj4 = cnpj4;
        Cep4 = cep4;
        Logradouro4 = logradouro4;
        Numero4 = numero4;
        Complemento4 = complemento4;
        Bairro4 = bairro4;
        Pais4 = pais4;
        Cnpj5 = cnpj5;
        Cep5 = cep5;
        Logradouro5 = logradouro5;
        Numero5 = numero5;
        Complemento5 = complemento5;
        Bairro5 = bairro5;
        Pais5 = pais5;
        MargemBruraPerc = margemBruraPerc;
        InscricaoEstadual = inscricaoEstadual;
        InscricaoMunicipal = inscricaoMunicipal;
        InscricaoEstadual2 = inscricaoEstadual2;
        InscricaoMunicipal2 = inscricaoMunicipal2;
        InscricaoEstadual3 = inscricaoEstadual3;
        InscricaoMunicipal3 = inscricaoMunicipal3;
        InscricaoEstadual4 = inscricaoEstadual4;
        InscricaoMunicipal4 = inscricaoMunicipal4;
        InscricaoEstadual5 = inscricaoEstadual5;
        InscricaoMunicipal5 = inscricaoMunicipal5;
        RazaoSocial = razaoSocial;
        RazaoSocial2 = razaoSocial2;
        RazaoSocial3 = razaoSocial3;
        RazaoSocial4 = razaoSocial4;
        RazaoSocial5 = razaoSocial5;
        ContaId = contaId;
        OportunidadeId = oportunidadeId;
        OsId = osId;
        Cidade1Id = cidade1Id;
        Estado1Id = estado1Id;
        Cidade2Id = cidade2Id;
        Estado2Id = estado2Id;
        Cidade3Id = cidade3Id;
        Estado3Id = estado3Id;
        Cidade4Id = cidade4Id;
        Estado4Id = estado4Id;
        Cidade5Id = cidade5Id;
        Estado5Id = estado5Id;
        MargemBrutaId = margemBrutaId;
        FaturamentoBrutoId = faturamentoBrutoId;
        ContaName = contaName;
        OportunidadeName = oportunidadeName;
        OsName = osName;
        Cidade1Name = cidade1Name;
        Estado1Name = estado1Name;
        Cidade2Name = cidade2Name;
        Estado2Name = estado2Name;
        Cidade3Name = cidade3Name;
        Estado3Name = estado3Name;
        Cidade4Name = cidade4Name;
        Estado4Name = estado4Name;
        Cidade5Name = cidade5Name;
        Estado5Name = estado5Name;
        MargemBrutaValue = margemBrutaValue;
        FaturamentoBrutoValue = faturamentoBrutoValue;
        TipoEndereco1Value = tipoEndereco1Value;
        TipoEndereco2Value = tipoEndereco2Value;
        TipoEndereco3Value = tipoEndereco3Value;
        TipoEndereco4Value = tipoEndereco4Value;
        TipoEndereco5Value = tipoEndereco5Value;
    }

    public com.example.demointegration.model.unity.Conta getConta() {
        return Conta;
    }

    public void setConta(com.example.demointegration.model.unity.Conta conta) {
        Conta = conta;
    }

    public com.example.demointegration.model.unity.Oportunidade getOportunidade() {
        return Oportunidade;
    }

    public void setOportunidade(com.example.demointegration.model.unity.Oportunidade oportunidade) {
        Oportunidade = oportunidade;
    }

    public TipoEndereco getTipoEndereco1() {
        return TipoEndereco1;
    }

    public void setTipoEndereco1(TipoEndereco tipoEndereco1) {
        TipoEndereco1 = tipoEndereco1;
    }

    public TipoEndereco getTipoEndereco2() {
        return TipoEndereco2;
    }

    public void setTipoEndereco2(TipoEndereco tipoEndereco2) {
        TipoEndereco2 = tipoEndereco2;
    }

    public TipoEndereco getTipoEndereco3() {
        return TipoEndereco3;
    }

    public void setTipoEndereco3(TipoEndereco tipoEndereco3) {
        TipoEndereco3 = tipoEndereco3;
    }

    public TipoEndereco getTipoEndereco4() {
        return TipoEndereco4;
    }

    public void setTipoEndereco4(TipoEndereco tipoEndereco4) {
        TipoEndereco4 = tipoEndereco4;
    }

    public TipoEndereco getTipoEndereco5() {
        return TipoEndereco5;
    }

    public void setTipoEndereco5(TipoEndereco tipoEndereco5) {
        TipoEndereco5 = tipoEndereco5;
    }

    public com.example.demointegration.model.unity.Os getOs() {
        return Os;
    }

    public void setOs(com.example.demointegration.model.unity.Os os) {
        Os = os;
    }

    public Cidade getCidade1() {
        return Cidade1;
    }

    public void setCidade1(Cidade cidade1) {
        Cidade1 = cidade1;
    }

    public Estado getEstado1() {
        return Estado1;
    }

    public void setEstado1(Estado estado1) {
        Estado1 = estado1;
    }

    public Cidade getCidade2() {
        return Cidade2;
    }

    public void setCidade2(Cidade cidade2) {
        Cidade2 = cidade2;
    }

    public Estado getEstado2() {
        return Estado2;
    }

    public void setEstado2(Estado estado2) {
        Estado2 = estado2;
    }

    public Cidade getCidade3() {
        return Cidade3;
    }

    public void setCidade3(Cidade cidade3) {
        Cidade3 = cidade3;
    }

    public Estado getEstado3() {
        return Estado3;
    }

    public void setEstado3(Estado estado3) {
        Estado3 = estado3;
    }

    public Cidade getCidade4() {
        return Cidade4;
    }

    public void setCidade4(Cidade cidade4) {
        Cidade4 = cidade4;
    }

    public Estado getEstado4() {
        return Estado4;
    }

    public void setEstado4(Estado estado4) {
        Estado4 = estado4;
    }

    public Cidade getCidade5() {
        return Cidade5;
    }

    public void setCidade5(Cidade cidade5) {
        Cidade5 = cidade5;
    }

    public Estado getEstado5() {
        return Estado5;
    }

    public void setEstado5(Estado estado5) {
        Estado5 = estado5;
    }

    public com.example.demointegration.model.unity.MargemBruta getMargemBruta() {
        return MargemBruta;
    }

    public void setMargemBruta(com.example.demointegration.model.unity.MargemBruta margemBruta) {
        MargemBruta = margemBruta;
    }

    public com.example.demointegration.model.unity.FaturamentoBruto getFaturamentoBruto() {
        return FaturamentoBruto;
    }

    public void setFaturamentoBruto(com.example.demointegration.model.unity.FaturamentoBruto faturamentoBruto) {
        FaturamentoBruto = faturamentoBruto;
    }

    public String getUnidadeBrasanitaId() {
        return UnidadeBrasanitaId;
    }

    public void setUnidadeBrasanitaId(String unidadeBrasanitaId) {
        UnidadeBrasanitaId = unidadeBrasanitaId;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getIdUnidade() {
        return IdUnidade;
    }

    public void setIdUnidade(String idUnidade) {
        IdUnidade = idUnidade;
    }

    public String getCentroCusto() {
        return CentroCusto;
    }

    public void setCentroCusto(String centroCusto) {
        CentroCusto = centroCusto;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public String getCep1() {
        return Cep1;
    }

    public void setCep1(String cep1) {
        Cep1 = cep1;
    }

    public String getLogradouro1() {
        return Logradouro1;
    }

    public void setLogradouro1(String logradouro1) {
        Logradouro1 = logradouro1;
    }

    public String getNumero1() {
        return Numero1;
    }

    public void setNumero1(String numero1) {
        Numero1 = numero1;
    }

    public String getComplemento1() {
        return Complemento1;
    }

    public void setComplemento1(String complemento1) {
        Complemento1 = complemento1;
    }

    public String getBairro1() {
        return Bairro1;
    }

    public void setBairro1(String bairro1) {
        Bairro1 = bairro1;
    }

    public String getPais1() {
        return Pais1;
    }

    public void setPais1(String pais1) {
        Pais1 = pais1;
    }

    public String getCnpj2() {
        return Cnpj2;
    }

    public void setCnpj2(String cnpj2) {
        Cnpj2 = cnpj2;
    }

    public String getCep2() {
        return Cep2;
    }

    public void setCep2(String cep2) {
        Cep2 = cep2;
    }

    public String getLogradouro2() {
        return Logradouro2;
    }

    public void setLogradouro2(String logradouro2) {
        Logradouro2 = logradouro2;
    }

    public String getNumero2() {
        return Numero2;
    }

    public void setNumero2(String numero2) {
        Numero2 = numero2;
    }

    public String getComplemento2() {
        return Complemento2;
    }

    public void setComplemento2(String complemento2) {
        Complemento2 = complemento2;
    }

    public String getBairro2() {
        return Bairro2;
    }

    public void setBairro2(String bairro2) {
        Bairro2 = bairro2;
    }

    public String getPais2() {
        return Pais2;
    }

    public void setPais2(String pais2) {
        Pais2 = pais2;
    }

    public String getCnpj3() {
        return Cnpj3;
    }

    public void setCnpj3(String cnpj3) {
        Cnpj3 = cnpj3;
    }

    public String getCep3() {
        return Cep3;
    }

    public void setCep3(String cep3) {
        Cep3 = cep3;
    }

    public String getLogradouro3() {
        return Logradouro3;
    }

    public void setLogradouro3(String logradouro3) {
        Logradouro3 = logradouro3;
    }

    public String getNumero3() {
        return Numero3;
    }

    public void setNumero3(String numero3) {
        Numero3 = numero3;
    }

    public String getComplemento3() {
        return Complemento3;
    }

    public void setComplemento3(String complemento3) {
        Complemento3 = complemento3;
    }

    public String getBairro3() {
        return Bairro3;
    }

    public void setBairro3(String bairro3) {
        Bairro3 = bairro3;
    }

    public String getPais3() {
        return Pais3;
    }

    public void setPais3(String pais3) {
        Pais3 = pais3;
    }

    public String getCnpj4() {
        return Cnpj4;
    }

    public void setCnpj4(String cnpj4) {
        Cnpj4 = cnpj4;
    }

    public String getCep4() {
        return Cep4;
    }

    public void setCep4(String cep4) {
        Cep4 = cep4;
    }

    public String getLogradouro4() {
        return Logradouro4;
    }

    public void setLogradouro4(String logradouro4) {
        Logradouro4 = logradouro4;
    }

    public String getNumero4() {
        return Numero4;
    }

    public void setNumero4(String numero4) {
        Numero4 = numero4;
    }

    public String getComplemento4() {
        return Complemento4;
    }

    public void setComplemento4(String complemento4) {
        Complemento4 = complemento4;
    }

    public String getBairro4() {
        return Bairro4;
    }

    public void setBairro4(String bairro4) {
        Bairro4 = bairro4;
    }

    public String getPais4() {
        return Pais4;
    }

    public void setPais4(String pais4) {
        Pais4 = pais4;
    }

    public String getCnpj5() {
        return Cnpj5;
    }

    public void setCnpj5(String cnpj5) {
        Cnpj5 = cnpj5;
    }

    public String getCep5() {
        return Cep5;
    }

    public void setCep5(String cep5) {
        Cep5 = cep5;
    }

    public String getLogradouro5() {
        return Logradouro5;
    }

    public void setLogradouro5(String logradouro5) {
        Logradouro5 = logradouro5;
    }

    public String getNumero5() {
        return Numero5;
    }

    public void setNumero5(String numero5) {
        Numero5 = numero5;
    }

    public String getComplemento5() {
        return Complemento5;
    }

    public void setComplemento5(String complemento5) {
        Complemento5 = complemento5;
    }

    public String getBairro5() {
        return Bairro5;
    }

    public void setBairro5(String bairro5) {
        Bairro5 = bairro5;
    }

    public String getPais5() {
        return Pais5;
    }

    public void setPais5(String pais5) {
        Pais5 = pais5;
    }

    public Number getMargemBruraPerc() {
        return MargemBruraPerc;
    }

    public void setMargemBruraPerc(Number margemBruraPerc) {
        MargemBruraPerc = margemBruraPerc;
    }

    public String getInscricaoEstadual() {
        return InscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        InscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return InscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        InscricaoMunicipal = inscricaoMunicipal;
    }

    public String getInscricaoEstadual2() {
        return InscricaoEstadual2;
    }

    public void setInscricaoEstadual2(String inscricaoEstadual2) {
        InscricaoEstadual2 = inscricaoEstadual2;
    }

    public String getInscricaoMunicipal2() {
        return InscricaoMunicipal2;
    }

    public void setInscricaoMunicipal2(String inscricaoMunicipal2) {
        InscricaoMunicipal2 = inscricaoMunicipal2;
    }

    public String getInscricaoEstadual3() {
        return InscricaoEstadual3;
    }

    public void setInscricaoEstadual3(String inscricaoEstadual3) {
        InscricaoEstadual3 = inscricaoEstadual3;
    }

    public String getInscricaoMunicipal3() {
        return InscricaoMunicipal3;
    }

    public void setInscricaoMunicipal3(String inscricaoMunicipal3) {
        InscricaoMunicipal3 = inscricaoMunicipal3;
    }

    public String getInscricaoEstadual4() {
        return InscricaoEstadual4;
    }

    public void setInscricaoEstadual4(String inscricaoEstadual4) {
        InscricaoEstadual4 = inscricaoEstadual4;
    }

    public String getInscricaoMunicipal4() {
        return InscricaoMunicipal4;
    }

    public void setInscricaoMunicipal4(String inscricaoMunicipal4) {
        InscricaoMunicipal4 = inscricaoMunicipal4;
    }

    public String getInscricaoEstadual5() {
        return InscricaoEstadual5;
    }

    public void setInscricaoEstadual5(String inscricaoEstadual5) {
        InscricaoEstadual5 = inscricaoEstadual5;
    }

    public String getInscricaoMunicipal5() {
        return InscricaoMunicipal5;
    }

    public void setInscricaoMunicipal5(String inscricaoMunicipal5) {
        InscricaoMunicipal5 = inscricaoMunicipal5;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        RazaoSocial = razaoSocial;
    }

    public String getRazaoSocial2() {
        return RazaoSocial2;
    }

    public void setRazaoSocial2(String razaoSocial2) {
        RazaoSocial2 = razaoSocial2;
    }

    public String getRazaoSocial3() {
        return RazaoSocial3;
    }

    public void setRazaoSocial3(String razaoSocial3) {
        RazaoSocial3 = razaoSocial3;
    }

    public String getRazaoSocial4() {
        return RazaoSocial4;
    }

    public void setRazaoSocial4(String razaoSocial4) {
        RazaoSocial4 = razaoSocial4;
    }

    public String getRazaoSocial5() {
        return RazaoSocial5;
    }

    public void setRazaoSocial5(String razaoSocial5) {
        RazaoSocial5 = razaoSocial5;
    }

    /*VAlue*/

    public Number getTipoEndereco1Value() {
        return TipoEndereco1.getValue();
    }

    public void setTipoEndereco1Value(Number tipoEndereco1Value) {
        TipoEndereco1Value = tipoEndereco1Value;
    }

    public Number getTipoEndereco2Value() {
        return TipoEndereco2.getValue();
    }

    public void setTipoEndereco2Value(Number tipoEndereco2Value) {
        TipoEndereco2Value = tipoEndereco2Value;
    }

    public Number getTipoEndereco3Value() {
        return TipoEndereco3.getValue();
    }

    public void setTipoEndereco3Value(Number tipoEndereco3Value) {
        TipoEndereco3Value = tipoEndereco3Value;
    }

    public Number getTipoEndereco4Value() {
        return TipoEndereco4.getValue();
    }

    public void setTipoEndereco4Value(Number tipoEndereco4Value) {
        TipoEndereco4Value = tipoEndereco4Value;
    }

    public Number getTipoEndereco5Value() {
        return TipoEndereco5.getValue();
    }

    public void setTipoEndereco5Value(Number tipoEndereco5Value) {
        TipoEndereco5Value = tipoEndereco5Value;
    }

    /*ID e NAME*/

    public String getContaId() {
        return Conta.getId();
    }

    public void setContaId(String contaId) {
        ContaId = contaId;
    }

    public String getOportunidadeId() {
        return Oportunidade.getId();
    }

    public void setOportunidadeId(String oportunidadeId) {
        OportunidadeId = oportunidadeId;
    }



    public String getOsId() {
        return Os.getId();
    }

    public void setOsId(String osId) {
        OsId = osId;
    }

    public String getCidade1Id() {
        return Cidade1.getId();
    }

    public void setCidade1Id(String cidade1Id) {
        Cidade1Id = cidade1Id;
    }

    public String getEstado1Id() {
        return Estado1.getId();
    }

    public void setEstado1Id(String estado1Id) {
        Estado1Id = estado1Id;
    }

    public String getCidade2Id() {
        return Cidade2.getId();
    }

    public void setCidade2Id(String cidade2Id) {
        Cidade2Id = cidade2Id;
    }

    public String getEstado2Id() {
        return Estado2.getId();
    }

    public void setEstado2Id(String estado2Id) {
        Estado2Id = estado2Id;
    }

    public String getCidade3Id() {
        return Cidade3.getId();
    }

    public void setCidade3Id(String cidade3Id) {
        Cidade3Id = cidade3Id;
    }

    public String getEstado3Id() {
        return Estado3.getId();
    }

    public void setEstado3Id(String estado3Id) {
        Estado3Id = estado3Id;
    }

    public String getCidade4Id() {
        return Cidade4.getId();
    }

    public void setCidade4Id(String cidade4Id) {
        Cidade4Id = cidade4Id;
    }

    public String getEstado4Id() {
        return Estado4.getId();
    }

    public void setEstado4Id(String estado4Id) {
        Estado4Id = estado4Id;
    }

    public String getCidade5Id() {
        return Cidade5.getId();
    }

    public void setCidade5Id(String cidade5Id) {
        Cidade5Id = cidade5Id;
    }

    public String getEstado5Id() {
        return Estado5.getId();
    }

    public void setEstado5Id(String estado5Id) {
        Estado5Id = estado5Id;
    }

    public String getMargemBrutaId() {
        return MargemBrutaId;
    }

    public void setMargemBrutaId(String margemBrutaId) {
        MargemBrutaId = margemBrutaId;
    }

    public String getFaturamentoBrutoId() {
        return FaturamentoBrutoId;
    }

    public void setFaturamentoBrutoId(String faturamentoBrutoId) {
        FaturamentoBrutoId = faturamentoBrutoId;
    }

    public String getContaName() {
        return ContaName;
    }

    public void setContaName(String contaName) {
        ContaName = contaName;
    }

    public String getOportunidadeName() {
        return OportunidadeName;
    }

    public void setOportunidadeName(String oportunidadeName) {
        OportunidadeName = oportunidadeName;
    }

    public String getOsName() {
        return OsName;
    }

    public void setOsName(String osName) {
        OsName = osName;
    }

    public String getCidade1Name() {
        return Cidade1Name;
    }

    public void setCidade1Name(String cidade1Name) {
        Cidade1Name = cidade1Name;
    }

    public String getEstado1Name() {
        return Estado1Name;
    }

    public void setEstado1Name(String estado1Name) {
        Estado1Name = estado1Name;
    }

    public String getCidade2Name() {
        return Cidade2Name;
    }

    public void setCidade2Name(String cidade2Name) {
        Cidade2Name = cidade2Name;
    }

    public String getEstado2Name() {
        return Estado2Name;
    }

    public void setEstado2Name(String estado2Name) {
        Estado2Name = estado2Name;
    }

    public String getCidade3Name() {
        return Cidade3Name;
    }

    public void setCidade3Name(String cidade3Name) {
        Cidade3Name = cidade3Name;
    }

    public String getEstado3Name() {
        return Estado3Name;
    }

    public void setEstado3Name(String estado3Name) {
        Estado3Name = estado3Name;
    }

    public String getCidade4Name() {
        return Cidade4Name;
    }

    public void setCidade4Name(String cidade4Name) {
        Cidade4Name = cidade4Name;
    }

    public String getEstado4Name() {
        return Estado4Name;
    }

    public void setEstado4Name(String estado4Name) {
        Estado4Name = estado4Name;
    }

    public String getCidade5Name() {
        return Cidade5Name;
    }

    public void setCidade5Name(String cidade5Name) {
        Cidade5Name = cidade5Name;
    }

    public String getEstado5Name() {
        return Estado5Name;
    }

    public void setEstado5Name(String estado5Name) {
        Estado5Name = estado5Name;
    }

    public Number getMargemBrutaValue() {
        return MargemBruta.getValue();
    }

    public void setMargemBrutaValue(Number margemBrutaValue) {
        MargemBrutaValue = margemBrutaValue;
    }

    public Number getFaturamentoBrutoValue() {
        return FaturamentoBruto.getValue();
    }

    public void setFaturamentoBrutoValue(Number faturamentoBrutoValue) {
        FaturamentoBrutoValue = faturamentoBrutoValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unity that = (Unity) o;
        return UnidadeBrasanitaId == that.UnidadeBrasanitaId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(UnidadeBrasanitaId);
    }


    public void setProperties(){
        this.setConta(this.getConta());
        this.setOportunidade(this.getOportunidade());
        this.setTipoEndereco1(this.getTipoEndereco1());
        this.setTipoEndereco2(this.getTipoEndereco2());
        this.setTipoEndereco3(this.getTipoEndereco3());
        this.setTipoEndereco4(this.getTipoEndereco4());
        this.setTipoEndereco5(this.getTipoEndereco5());
        this.setOs(this.getOs());
        this.setCidade1(this.getCidade1());
        this.setEstado1(this.getEstado1());
        this.setCidade2(this.getCidade2());
        this.setEstado2(this.getEstado2());
        this.setCidade3(this.getCidade3());
        this.setEstado3(this.getEstado3());
        this.setCidade4(this.getCidade4());
        this.setEstado4(this.getEstado4());
        this.setCidade5(this.getCidade5());
        this.setEstado5(this.getEstado5());
        this.setMargemBruta(this.getMargemBruta());
        this.setFaturamentoBruto(this.getFaturamentoBruto());
    }
}
