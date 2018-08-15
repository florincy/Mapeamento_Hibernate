/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {

    /**
     * @return the cdEndereco
     */
    public Integer getCdEndereco() {
        return cdEndereco;
    }

    /**
     * @param cdEndereco the cdEndereco to set
     */
    public void setCdEndereco(Integer cdEndereco) {
        this.cdEndereco = cdEndereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the telefone1
     */
    public Integer getTelefone1() {
        return telefone1;
    }

    /**
     * @param telefone1 the telefone1 to set
     */
    public void setTelefone1(Integer telefone1) {
        this.telefone1 = telefone1;
    }

    /**
     * @return the telefone2
     */
    public Integer getTelefone2() {
        return telefone2;
    }

    /**
     * @param telefone2 the telefone2 to set
     */
    public void setTelefone2(Integer telefone2) {
        this.telefone2 = telefone2;
    }
    /*
    cd_endereco integer NOT NULL,
  nm_rua character varying(25),
  nr_casa numeric(10,0),
  ds_complemento text,
  nm_bairro character varying(25),
  nm_cidade character varying(25),
  ds_cep character(8),
  telefone1 numeric(13,0),
  telefone2 numeric(13,0),
  CONSTRAINT pk_endereco PRIMARY KEY (cd_endereco)
     */
    @Column(name = "nm_bairro")
    private String bairro;
    @Column(name = "ds_cep")
    private String cep;
    @Column(name = "nm_cidade")
    private String cidade;
    @Column(name = "ds_complemento")
    private String complemento;
    @Column(name = "nr_casa")
    private Integer numero;
    @Column(name = "nm_rua")
    private String rua;
    @Column
    private Integer telefone1;
    @Column
    private Integer telefone2;
    @Column(name = "cd_endereco")
    @Id
    private Integer cdEndereco;
}
