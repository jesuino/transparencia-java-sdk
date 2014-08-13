/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sensedia.transparencia.client.resources;

import java.util.Objects;

/**
 *
 * @author Josue
 */
public class Doador {

    private String nome;
    private String cgc;
    private String montante;

    public Doador() {
    }

    public Doador(String nome, String cgc, String montante) {
        this.nome = nome;
        this.cgc = cgc;
        this.montante = montante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMontante() {
        return montante;
    }

    public void setMontante(String montante) {
        this.montante = montante;
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cgc);
        hash = 97 * hash + Objects.hashCode(this.montante);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Doador other = (Doador) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cgc, other.cgc)) {
            return false;
        }
        if (!Objects.equals(this.montante, other.montante)) {
            return false;
        }
        return true;
    }

}
