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
public class Candidatura {

    private String anoEleitoral;
    private String cargo;
    private String partidoSigla;
    private String municipio;
    private String estadoSigla;
    private String resultado;
    private String votosObtidos;
    private String recursosFinanceiros;

    public String getAnoEleitoral() {
        return anoEleitoral;
    }

    public void setAnoEleitoral(String anoEleitoral) {
        this.anoEleitoral = anoEleitoral;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPartidoSigla() {
        return partidoSigla;
    }

    public void setPartidoSigla(String partidoSigla) {
        this.partidoSigla = partidoSigla;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstadoSigla() {
        return estadoSigla;
    }

    public void setEstadoSigla(String estadoSigla) {
        this.estadoSigla = estadoSigla;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getVotosObtidos() {
        return votosObtidos;
    }

    public void setVotosObtidos(String votosObtidos) {
        this.votosObtidos = votosObtidos;
    }

    public String getRecursosFinanceiros() {
        return recursosFinanceiros;
    }

    public void setRecursosFinanceiros(String recursosFinanceiros) {
        this.recursosFinanceiros = recursosFinanceiros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.anoEleitoral);
        hash = 31 * hash + Objects.hashCode(this.cargo);
        hash = 31 * hash + Objects.hashCode(this.partidoSigla);
        hash = 31 * hash + Objects.hashCode(this.municipio);
        hash = 31 * hash + Objects.hashCode(this.estadoSigla);
        hash = 31 * hash + Objects.hashCode(this.resultado);
        hash = 31 * hash + Objects.hashCode(this.votosObtidos);
        hash = 31 * hash + Objects.hashCode(this.recursosFinanceiros);
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
        final Candidatura other = (Candidatura) obj;
        if (!Objects.equals(this.anoEleitoral, other.anoEleitoral)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.partidoSigla, other.partidoSigla)) {
            return false;
        }
        if (!Objects.equals(this.municipio, other.municipio)) {
            return false;
        }
        if (!Objects.equals(this.estadoSigla, other.estadoSigla)) {
            return false;
        }
        if (!Objects.equals(this.resultado, other.resultado)) {
            return false;
        }
        if (!Objects.equals(this.votosObtidos, other.votosObtidos)) {
            return false;
        }
        if (!Objects.equals(this.recursosFinanceiros, other.recursosFinanceiros)) {
            return false;
        }
        return true;
    }

}
