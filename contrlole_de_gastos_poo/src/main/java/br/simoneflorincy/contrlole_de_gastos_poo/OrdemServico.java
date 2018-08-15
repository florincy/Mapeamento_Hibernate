/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "ordem_servico")
public class OrdemServico implements Serializable {

    /**
     * @return the bool_fechado
     */
    public boolean isBool_fechado() {
        return bool_fechado;
    }

    /**
     * @param bool_fechado the bool_fechado to set
     */
    public void setBool_fechado(boolean bool_fechado) {
        this.bool_fechado = bool_fechado;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Column(name = "dt_ordem_servico")
    private Date data;
    @Column(name = "vl_total")
    private double valorTotal;
    @Column(name = "funcionario_cd_funcionario")
    @OneToMany(fetch = FetchType.EAGER)
    private Funcionario funcionario;
    @Column(name = " cliente_cd_cliente")
    @OneToMany(fetch = FetchType.EAGER)
    private Cliente cliente;
    @Column
    private boolean bool_fechado;
    @Column
    @Id
    Integer cd_ordem_servico;
    /* cd_ordem_servico integer NOT NULL,
  funcionario_cd_funcionario integer NOT NULL,
  cliente_cd_cliente integer,
  dt_ordem_servico date,
  vl_total numeric(100,2),
  bool_fechado boolean,
     */
}
