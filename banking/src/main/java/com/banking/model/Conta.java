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
@Table(name = "conta")
@NamedQueries({
        @NamedQuery(name = "Conta.findAll", query = "SELECT c FROM Conta c"),
        @NamedQuery(name = "Conta.findByContaId", query = "SELECT c FROM Conta c WHERE c.contaId = :contaId"),
        @NamedQuery(name = "Conta.findBySaldo", query = "SELECT c FROM Conta c WHERE c.saldo = :saldo")})
public class Conta implements Serializable {

        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "conta_id")
        private Integer contaId;
        @Basic(optional = false)
        @Column(name = "saldo")
        private long saldo;

        public Conta() {
        }

        public Conta(Integer contaId) {
                this.contaId = contaId;
        }

        public Conta(Integer contaId, long saldo) {
                this.contaId = contaId;
                this.saldo = saldo;
        }

        public Integer getContaId() {
                return contaId;
        }

        public void setContaId(Integer contaId) {
                this.contaId = contaId;
        }

        public long getSaldo() {
                return saldo;
        }

        public void setSaldo(long saldo) {
                this.saldo = saldo;
        }

        @Override
        public int hashCode() {
                int hash = 0;
                hash += (contaId != null ? contaId.hashCode() : 0);
                return hash;
        }

        @Override
        public boolean equals(Object object) {
                // TODO: Warning - this method won't work in the case the id fields are not set
                if (!(object instanceof Conta)) {
                        return false;
                }
                Conta other = (Conta) object;
                if ((this.contaId == null && other.contaId != null) || (this.contaId != null && !this.contaId.equals(other.contaId))) {
                        return false;
                }
                return true;
        }

        @Override
        public String toString() {
                return "com.banking.model.Conta[ contaId=" + contaId + " ]";
        }
        
}
