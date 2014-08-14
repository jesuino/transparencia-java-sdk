/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sensedia.transparencia.client.core;

import com.sensedia.transparencia.client.ex.RestException;
import com.sensedia.transparencia.client.resources.Bens;
import com.sensedia.transparencia.client.resources.Candidato;
import com.sensedia.transparencia.client.resources.Candidatura;
import com.sensedia.transparencia.client.resources.Cargo;
import com.sensedia.transparencia.client.resources.Doador;
import com.sensedia.transparencia.client.resources.Estado;
import com.sensedia.transparencia.client.resources.Estatistica;
import com.sensedia.transparencia.client.resources.Excelencia;
import com.sensedia.transparencia.client.resources.Partido;
import java.util.List;

/**
 *
 * @author Josue
 */
public interface NewInterface {

    List<Bens> getCandidatoBens(String candidatoId) throws RestException;

    Candidato getCandidatoById(String candidatoId, boolean fetchSubResources) throws RestException;

    List<Candidatura> getCandidatoCandidaturas(String candidatoId) throws RestException;

    List<Doador> getCandidatoDoadores(String candidatoId, String anoEleitoral) throws RestException;

    List<Estatistica> getCandidatoEstatisticas(String candidatoId) throws RestException;

    List<Candidato> getCandidatos(String estado, String partido, String nome, String cargo, int limit, int offset) throws RestException;

    List<Candidato> getCandidatos(String estado, String partido, String nome, String cargo) throws RestException;

    List<Candidato> getCandidatosByCargo(String estado, String cargo) throws RestException;

    List<Candidato> getCandidatosByNome(String estado, String nome) throws RestException;

    List<Candidato> getCandidatosByPartido(String estado, String partido) throws RestException;

    List<Cargo> getCargos() throws RestException;

    List<Estado> getEstados() throws RestException;

    List<Bens> getExcelenciaBens(String excelenciaId) throws RestException;

    Excelencia getExcelenciaById(String excelenciaId, boolean fetchSubResources) throws RestException;

    List<Excelencia> getExcelencias(String casa, String nome, String estadoId, String partidoId) throws RestException;

    List<Partido> getPartidos() throws RestException;

}
