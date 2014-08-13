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
public class Estatistica {

    private String faltasPlenario;
    private String mediaPlenario;
    private String faltasComissoes;
    private String mediaCommissoes;
    private String evolucao;
    private String anoRef;
    private String emendas;
    private String mediaEmendas;

    public String getFaltasPlenario() {
        return faltasPlenario;
    }

    public void setFaltasPlenario(String faltasPlenario) {
        this.faltasPlenario = faltasPlenario;
    }

    public String getMediaPlenario() {
        return mediaPlenario;
    }

    public void setMediaPlenario(String mediaPlenario) {
        this.mediaPlenario = mediaPlenario;
    }

    public String getFaltasComissoes() {
        return faltasComissoes;
    }

    public void setFaltasComissoes(String faltasComissoes) {
        this.faltasComissoes = faltasComissoes;
    }

    public String getMediaCommissoes() {
        return mediaCommissoes;
    }

    public void setMediaCommissoes(String mediaCommissoes) {
        this.mediaCommissoes = mediaCommissoes;
    }

    public String getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(String evolucao) {
        this.evolucao = evolucao;
    }

    public String getAnoRef() {
        return anoRef;
    }

    public void setAnoRef(String anoRef) {
        this.anoRef = anoRef;
    }

    public String getEmendas() {
        return emendas;
    }

    public void setEmendas(String emendas) {
        this.emendas = emendas;
    }

    public String getMediaEmendas() {
        return mediaEmendas;
    }

    public void setMediaEmendas(String mediaEmendas) {
        this.mediaEmendas = mediaEmendas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.faltasPlenario);
        hash = 67 * hash + Objects.hashCode(this.mediaPlenario);
        hash = 67 * hash + Objects.hashCode(this.faltasComissoes);
        hash = 67 * hash + Objects.hashCode(this.mediaCommissoes);
        hash = 67 * hash + Objects.hashCode(this.evolucao);
        hash = 67 * hash + Objects.hashCode(this.anoRef);
        hash = 67 * hash + Objects.hashCode(this.emendas);
        hash = 67 * hash + Objects.hashCode(this.mediaEmendas);
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
        final Estatistica other = (Estatistica) obj;
        if (!Objects.equals(this.faltasPlenario, other.faltasPlenario)) {
            return false;
        }
        if (!Objects.equals(this.mediaPlenario, other.mediaPlenario)) {
            return false;
        }
        if (!Objects.equals(this.faltasComissoes, other.faltasComissoes)) {
            return false;
        }
        if (!Objects.equals(this.mediaCommissoes, other.mediaCommissoes)) {
            return false;
        }
        if (!Objects.equals(this.evolucao, other.evolucao)) {
            return false;
        }
        if (!Objects.equals(this.anoRef, other.anoRef)) {
            return false;
        }
        if (!Objects.equals(this.emendas, other.emendas)) {
            return false;
        }
        if (!Objects.equals(this.mediaEmendas, other.mediaEmendas)) {
            return false;
        }
        return true;
    }

}
