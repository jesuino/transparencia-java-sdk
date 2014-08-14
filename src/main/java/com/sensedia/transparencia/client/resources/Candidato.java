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

/**
 *
 * @author Josue
 */
public class Candidato {

    private String id;
    private String apelido;
    private String nome;
    private String titulo;
    @JsonProperty("CPF")
    private String CPF;
    private String miniBio;
    private String cargos;
    private String numero;
    private String matricula;
    private String partido;
    private String idade;
    private String casaAtual;
    private String instrucao;
    private String ocupacao;
    private String previsao;
    private String bancadas;
    private String processos;
    private String foto;
    private Boolean reeleicao;
    private String estado;
    private String cargo;

    private List<Bens> bens = new ArrayList<>();
    private List<Doador> doadores = new ArrayList<>();
    private List<Candidatura> candidaturas = new ArrayList<>();
    private List<Estatistica> estatisticas = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCasaAtual() {
        return casaAtual;
    }

    public void setCasaAtual(String casaAtual) {
        this.casaAtual = casaAtual;
    }

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getPrevisao() {
        return previsao;
    }

    public void setPrevisao(String previsao) {
        this.previsao = previsao;
    }

    public String getBancadas() {
        return bancadas;
    }

    public void setBancadas(String bancadas) {
        this.bancadas = bancadas;
    }

    public String getProcessos() {
        return processos;
    }

    public void setProcessos(String processos) {
        this.processos = processos;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Boolean getReeleicao() {
        return reeleicao;
    }

    public void setReeleicao(Boolean reeleicao) {
        this.reeleicao = reeleicao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Bens> getBens() {
        return bens;
    }

    public void setBens(List<Bens> bens) {
        this.bens = bens;
    }

    public List<Doador> getDoadores() {
        return doadores;
    }

    public void setDoadores(List<Doador> doadores) {
        this.doadores = doadores;
    }

    public List<Candidatura> getCandidaturas() {
        return candidaturas;
    }

    public void setCandidaturas(List<Candidatura> candidaturas) {
        this.candidaturas = candidaturas;
    }

    public List<Estatistica> getEstatisticas() {
        return estatisticas;
    }

    public void setEstatisticas(List<Estatistica> estatisticas) {
        this.estatisticas = estatisticas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.apelido);
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.titulo);
        hash = 79 * hash + Objects.hashCode(this.CPF);
        hash = 79 * hash + Objects.hashCode(this.miniBio);
        hash = 79 * hash + Objects.hashCode(this.cargos);
        hash = 79 * hash + Objects.hashCode(this.numero);
        hash = 79 * hash + Objects.hashCode(this.matricula);
        hash = 79 * hash + Objects.hashCode(this.partido);
        hash = 79 * hash + Objects.hashCode(this.idade);
        hash = 79 * hash + Objects.hashCode(this.casaAtual);
        hash = 79 * hash + Objects.hashCode(this.instrucao);
        hash = 79 * hash + Objects.hashCode(this.ocupacao);
        hash = 79 * hash + Objects.hashCode(this.previsao);
        hash = 79 * hash + Objects.hashCode(this.bancadas);
        hash = 79 * hash + Objects.hashCode(this.processos);
        hash = 79 * hash + Objects.hashCode(this.foto);
        hash = 79 * hash + Objects.hashCode(this.reeleicao);
        hash = 79 * hash + Objects.hashCode(this.estado);
        hash = 79 * hash + Objects.hashCode(this.cargo);
        hash = 79 * hash + Objects.hashCode(this.bens);
        hash = 79 * hash + Objects.hashCode(this.doadores);
        hash = 79 * hash + Objects.hashCode(this.candidaturas);
        hash = 79 * hash + Objects.hashCode(this.estatisticas);
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
        final Candidato other = (Candidato) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.apelido, other.apelido)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        if (!Objects.equals(this.miniBio, other.miniBio)) {
            return false;
        }
        if (!Objects.equals(this.cargos, other.cargos)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.partido, other.partido)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        if (!Objects.equals(this.casaAtual, other.casaAtual)) {
            return false;
        }
        if (!Objects.equals(this.instrucao, other.instrucao)) {
            return false;
        }
        if (!Objects.equals(this.ocupacao, other.ocupacao)) {
            return false;
        }
        if (!Objects.equals(this.previsao, other.previsao)) {
            return false;
        }
        if (!Objects.equals(this.bancadas, other.bancadas)) {
            return false;
        }
        if (!Objects.equals(this.processos, other.processos)) {
            return false;
        }
        if (!Objects.equals(this.foto, other.foto)) {
            return false;
        }
        if (!Objects.equals(this.reeleicao, other.reeleicao)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.bens, other.bens)) {
            return false;
        }
        if (!Objects.equals(this.doadores, other.doadores)) {
            return false;
        }
        if (!Objects.equals(this.candidaturas, other.candidaturas)) {
            return false;
        }
        if (!Objects.equals(this.estatisticas, other.estatisticas)) {
            return false;
        }
        return true;
    }

}
