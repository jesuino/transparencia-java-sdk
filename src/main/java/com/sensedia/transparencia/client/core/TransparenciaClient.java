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
import com.sensedia.transparencia.client.rest.APIRequest;
import java.util.List;
import org.apache.commons.lang3.ObjectUtils;

/**
 *
 * @author Josue
 */
public class TransparenciaClient {

    public static final int MAX_LIMIT = 20;
    private static final int DEFAULT_LIMIT = 20;
    private static final int DEFAULT_OFFSET = 0;

    private final APIRequest request;

    public TransparenciaClient(String token) {
        request = new APIRequest(token);
    }

    public List<Estado> getEstados() throws RestException {
        return request.getEstados();
    }

    public List<Partido> getPartidos() throws RestException {
        return request.getPartidos();
    }

    public List<Candidato> getCandidatos(String estado, String partido, String nome, String cargo, int limit, int offset)
            throws RestException {

        estado = ObjectUtils.defaultIfNull(estado, "");
        partido = ObjectUtils.defaultIfNull(partido, "");
        nome = ObjectUtils.defaultIfNull(nome, "");
        cargo = ObjectUtils.defaultIfNull(cargo, "");

        return request.getCandidatos(estado, partido, nome, cargo, limit, offset);

    }

    public List<Candidato> getCandidatos(String estado, String partido, String nome, String cargo)
            throws RestException {

        estado = ObjectUtils.defaultIfNull(estado, "");
        partido = ObjectUtils.defaultIfNull(partido, "");
        nome = ObjectUtils.defaultIfNull(nome, "");
        cargo = ObjectUtils.defaultIfNull(cargo, "");

        return request.getCandidatos(estado, partido, nome, cargo, DEFAULT_LIMIT, DEFAULT_OFFSET);

    }

    public List<Candidato> getCandidatosByPartido(String estado, String partido)
            throws RestException {

        estado = ObjectUtils.defaultIfNull(estado, "");
        partido = ObjectUtils.defaultIfNull(partido, "");

        return request.getCandidatos(estado, partido, "", "", DEFAULT_LIMIT, DEFAULT_OFFSET);

    }

    public List<Candidato> getCandidatosByCargo(String estado, String cargo)
            throws RestException {

        estado = ObjectUtils.defaultIfNull(estado, "");
        cargo = ObjectUtils.defaultIfNull(cargo, "");

        return request.getCandidatos(estado, "", "", cargo, DEFAULT_LIMIT, DEFAULT_OFFSET);

    }

    public List<Candidato> getCandidatosByNome(String estado, String nome)
            throws RestException {

        estado = ObjectUtils.defaultIfNull(estado, "");
        nome = ObjectUtils.defaultIfNull(nome, "");

        return request.getCandidatos(estado, "", nome, "", DEFAULT_LIMIT, DEFAULT_OFFSET);

    }

    public Candidato getCandidatoById(String candidatoId, boolean fetchSubResources) throws RestException {
        candidatoId = ObjectUtils.defaultIfNull(candidatoId, "null");

        Candidato foundCandidato = request.getCandidatoById(candidatoId);
        if (fetchSubResources) {
            foundCandidato.setBens(request.getCandidatoBens(candidatoId));
            foundCandidato.setCandidaturas(request.getCandidatoCandidaturas(candidatoId));
            foundCandidato.setEstatisticas(request.getCandidatoEstatisticas(candidatoId));
            foundCandidato.setDoadores(request.getCandidatoDoadores(candidatoId, ""));
        }
        return foundCandidato;
    }

    public List<Bens> getCandidatoBens(String candidatoId) throws RestException {
        candidatoId = ObjectUtils.defaultIfNull(candidatoId, "null");

        return request.getCandidatoBens(candidatoId);
    }

    public List<Doador> getCandidatoDoadores(String candidatoId, String anoEleitoral) throws RestException {

        candidatoId = ObjectUtils.defaultIfNull(candidatoId, "null");
        return request.getCandidatoDoadores(candidatoId, anoEleitoral);
    }

    public List<Cargo> getCargos() throws RestException {
        return request.getCargos();
    }

    public List<Candidatura> getCandidatoCandidaturas(String candidatoId) throws RestException {

        candidatoId = ObjectUtils.defaultIfNull(candidatoId, "null");
        return request.getCandidatoCandidaturas(candidatoId);
    }

    public List<Estatistica> getCandidatoEstatisticas(String candidatoId) throws RestException {
        candidatoId = ObjectUtils.defaultIfNull(candidatoId, "null");

        return request.getCandidatoEstatisticas(candidatoId);
    }

    public List<Excelencia> getExcelencias(String casa, String nome, String estadoId, String partidoId) throws RestException {

        return request.getExcelencias(casa, nome, estadoId, partidoId);
    }

    public Excelencia getExcelenciaById(String excelenciaId, boolean fetchSubResources) throws RestException {

        Excelencia excelencia = request.getExcelenciaById(excelenciaId);
        if (fetchSubResources) {
            excelencia.setBens(request.getExcelenciaBens(excelenciaId));
        }
        return excelencia;
    }

    public List<Bens> getExcelenciaBens(String excelenciaId) throws RestException {
        excelenciaId = ObjectUtils.defaultIfNull(excelenciaId, "null");

        return request.getCandidatoBens(excelenciaId);
    }

}
