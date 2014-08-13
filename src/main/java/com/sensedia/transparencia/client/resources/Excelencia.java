/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sensedia.transparencia.client.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.codehaus.jackson.annotate.JsonProperty;

public class Excelencia {

    public static final String CAMARA_DEPUTADOS = "1";
    public static final String SENADO_FEDERAL = "2";

    private String id;
    private String nome;
    private String apelido;
    private String casa;
    private String titulo;
    @JsonProperty("CPF")
    private String CPF;
    private String estado;
    private String partido;
    private String miniBio;
    private String cargos;
    private String processos;
    private String bancadas;
    private String partidosPassados;
    private String cargosPassados;
    private String estadosPassados;
    private String municipiosPassados;
    private String votosPassados;
    private String recursosPassados;
    private String resultadosPassados;
    private String anosPassados;

    private List<Bens> bens = new ArrayList<>();

    public List<Bens> getBens() {
        return bens;
    }

    public void setBens(List<Bens> bens) {
        this.bens = bens;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getMiniBio() {
        return miniBio;
    }

    public void setMiniBio(String miniBio) {
        this.miniBio = miniBio;
    }

    public String getCargos() {
        return cargos;
    }

    public void setCargos(String cargos) {
        this.cargos = cargos;
    }

    public String getProcessos() {
        return processos;
    }

    public void setProcessos(String processos) {
        this.processos = processos;
    }

    public String getBancadas() {
        return bancadas;
    }

    public void setBancadas(String bancadas) {
        this.bancadas = bancadas;
    }

    public String getPartidosPassados() {
        return partidosPassados;
    }

    public void setPartidosPassados(String partidosPassados) {
        this.partidosPassados = partidosPassados;
    }

    public String getCargosPassados() {
        return cargosPassados;
    }

    public void setCargosPassados(String cargosPassados) {
        this.cargosPassados = cargosPassados;
    }

    public String getEstadosPassados() {
        return estadosPassados;
    }

    public void setEstadosPassados(String estadosPassados) {
        this.estadosPassados = estadosPassados;
    }

    public String getMunicipiosPassados() {
        return municipiosPassados;
    }

    public void setMunicipiosPassados(String municipiosPassados) {
        this.municipiosPassados = municipiosPassados;
    }

    public String getVotosPassados() {
        return votosPassados;
    }

    public void setVotosPassados(String votosPassados) {
        this.votosPassados = votosPassados;
    }

    public String getRecursosPassados() {
        return recursosPassados;
    }

    public void setRecursosPassados(String recursosPassados) {
        this.recursosPassados = recursosPassados;
    }

    public String getResultadosPassados() {
        return resultadosPassados;
    }

    public void setResultadosPassados(String resultadosPassados) {
        this.resultadosPassados = resultadosPassados;
    }

    public String getAnosPassados() {
        return anosPassados;
    }

    public void setAnosPassados(String anosPassados) {
        this.anosPassados = anosPassados;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.apelido);
        hash = 79 * hash + Objects.hashCode(this.casa);
        hash = 79 * hash + Objects.hashCode(this.titulo);
        hash = 79 * hash + Objects.hashCode(this.CPF);
        hash = 79 * hash + Objects.hashCode(this.estado);
        hash = 79 * hash + Objects.hashCode(this.partido);
        hash = 79 * hash + Objects.hashCode(this.miniBio);
        hash = 79 * hash + Objects.hashCode(this.cargos);
        hash = 79 * hash + Objects.hashCode(this.processos);
        hash = 79 * hash + Objects.hashCode(this.bancadas);
        hash = 79 * hash + Objects.hashCode(this.partidosPassados);
        hash = 79 * hash + Objects.hashCode(this.cargosPassados);
        hash = 79 * hash + Objects.hashCode(this.estadosPassados);
        hash = 79 * hash + Objects.hashCode(this.municipiosPassados);
        hash = 79 * hash + Objects.hashCode(this.votosPassados);
        hash = 79 * hash + Objects.hashCode(this.recursosPassados);
        hash = 79 * hash + Objects.hashCode(this.resultadosPassados);
        hash = 79 * hash + Objects.hashCode(this.anosPassados);
        hash = 79 * hash + Objects.hashCode(this.bens);
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
        final Excelencia other = (Excelencia) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.apelido, other.apelido)) {
            return false;
        }
        if (!Objects.equals(this.casa, other.casa)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.partido, other.partido)) {
            return false;
        }
        if (!Objects.equals(this.miniBio, other.miniBio)) {
            return false;
        }
        if (!Objects.equals(this.cargos, other.cargos)) {
            return false;
        }
        if (!Objects.equals(this.processos, other.processos)) {
            return false;
        }
        if (!Objects.equals(this.bancadas, other.bancadas)) {
            return false;
        }
        if (!Objects.equals(this.partidosPassados, other.partidosPassados)) {
            return false;
        }
        if (!Objects.equals(this.cargosPassados, other.cargosPassados)) {
            return false;
        }
        if (!Objects.equals(this.estadosPassados, other.estadosPassados)) {
            return false;
        }
        if (!Objects.equals(this.municipiosPassados, other.municipiosPassados)) {
            return false;
        }
        if (!Objects.equals(this.votosPassados, other.votosPassados)) {
            return false;
        }
        if (!Objects.equals(this.recursosPassados, other.recursosPassados)) {
            return false;
        }
        if (!Objects.equals(this.resultadosPassados, other.resultadosPassados)) {
            return false;
        }
        if (!Objects.equals(this.anosPassados, other.anosPassados)) {
            return false;
        }
        if (!Objects.equals(this.bens, other.bens)) {
            return false;
        }
        return true;
    }

}
