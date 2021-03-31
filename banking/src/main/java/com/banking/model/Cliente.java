/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Fabiao
 */
@Entity
@Table(name = "cliente")
@NamedQueries({
        @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
        @NamedQuery(name = "Cliente.findByClienteId", query = "SELECT c FROM Cliente c WHERE c.clienteId = :clienteId"),
        @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
        @NamedQuery(name = "Cliente.findByNif", query = "SELECT c FROM Cliente c WHERE c.nif = :nif")})
public class Cliente implements Serializable {

        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "cliente_id")
        private Integer clienteId;
        @Basic(optional = false)
        @Column(name = "nome")
        private String nome;
        @Basic(optional = false)
        @Column(name = "nif")
        private String nif;

        public Cliente() {
        }

        public Cliente(Integer clienteId) {
                this.clienteId = clienteId;
        }

        public Cliente(Integer clienteId, String nome, String nif) {
                this.clienteId = clienteId;
                this.nome = nome;
                this.nif = nif;
        }

        public Integer getClienteId() {
                return clienteId;
        }

        public void setClienteId(Integer clienteId) {
                this.clienteId = clienteId;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getNif() {
                return nif;
        }

        public void setNif(String nif) {
                this.nif = nif;
        }

        @Override
        public int hashCode() {
                int hash = 0;
                hash += (clienteId != null ? clienteId.hashCode() : 0);
                return hash;
        }

        @Override
        public boolean equals(Object object) {
                // TODO: Warning - this method won't work in the case the id fields are not set
                if (!(object instanceof Cliente)) {
                        return false;
                }
                Cliente other = (Cliente) object;
                if ((this.clienteId == null && other.clienteId != null) || (this.clienteId != null && !this.clienteId.equals(other.clienteId))) {
                        return false;
                }
                return true;
        }

        @Override
        public String toString() {
                return "com.banking.model.Cliente[ clienteId=" + clienteId + " ]";
        }
        
}
