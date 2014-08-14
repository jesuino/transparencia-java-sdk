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

/**
 *
 * @author Josue
 */
public class TransparenciaClient {

    public static final int MAX_LIMIT = 20;
    private static final int DEFAULT_LIMIT = 20;
    private static final int DEFAULT_OFFSET = 0;

    public static enum CANDIDATO_EAGER_FETCH {

        BENS, DOADORES, CANDIDATURAS, ESTATISTICAS
    }

    public static enum EXCELENCIA_EAGER_FETCH {

        BENS
    }

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

    public List<Candidato> getCandidatos(String estado, String partido, String nome, String cargo, CANDIDATO_EAGER_FETCH... fetch)
            throws RestException {

        return request.getCandidatos(estado, partido, nome, cargo, DEFAULT_LIMIT, DEFAULT_OFFSET);

    }

    public List<Candidato> getCandidatosByPartido(String estado, String partido, CANDIDATO_EAGER_FETCH... fetch)
            throws RestException {

        return request.getCandidatos(estado, partido, "", "", DEFAULT_LIMIT, DEFAULT_OFFSET);

    }

    public List<Candidato> getCandidatosByCargo(String estado, String cargo, CANDIDATO_EAGER_FETCH... fetch)
            throws RestException {

        return request.getCandidatos(estado, "", "", cargo, DEFAULT_LIMIT, DEFAULT_OFFSET);

    }

    public List<Candidato> getCandidatosByNome(String estado, String nome, CANDIDATO_EAGER_FETCH... fetch)
            throws RestException {

        return request.getCandidatos(estado, "", nome, "", DEFAULT_LIMIT, DEFAULT_OFFSET);

    }

    public List<Candidato> getCandidatos(String estado, String partido, String nome, String cargo, int limit, int offset, CANDIDATO_EAGER_FETCH... fetch)
            throws RestException {

        return request.getCandidatos(estado, partido, nome, cargo, limit, offset);

    }

    public Candidato getCandidatoById(String candidatoId) throws RestException {
        return request.getCandidatoById(candidatoId);
    }

    public List<Bens> getCandidatoBens(String candidatoId) throws RestException {
        return request.getCandidatoBens(candidatoId);
    }

    public List<Doador> getCandidatoDoadores(String candidatoId, String anoEleitoral) throws RestException {
        return request.getCandidatoDoadores(candidatoId, anoEleitoral);
    }

    public List<Cargo> getCargos() throws RestException {
        return request.getCargos();
    }

    public List<Candidatura> getCandidatoCandidaturas(String candidatoId) throws RestException {
        return request.getCandidatoCandidaturas(candidatoId);
    }

    public List<Estatistica> getCandidatoEstatisticas(String candidatoId) throws RestException {
        return request.getCandidatoEstatisticas(candidatoId);
    }

    public List<Excelencia> getExcelencias(String casa, String nome, String estadoId, String partidoId) throws RestException {
        return request.getExcelencias(casa, nome, estadoId, partidoId);
    }

    public Excelencia getExcelenciaById(String excelenciaId) throws RestException {
        return request.getExcelenciaById(excelenciaId);
    }

    public List<Bens> getExcelenciaBens(String excelenciaId) throws RestException {
        return request.getCandidatoBens(excelenciaId);
    }

}
