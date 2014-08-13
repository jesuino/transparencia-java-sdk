/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sensedia.transparencia.client.rest;

import com.sensedia.transparencia.client.ex.ClientException;
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
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import java.util.List;
import javax.ws.rs.core.MediaType;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

/**
 *
 * @author Josue
 */
public class APIRequest {

    private static final String BASE_URI = "http://api.transparencia.org.br/api/v1";

    private static final String ESTADO_RESOURCE = "/estados";
    private static final String PARTIDO_RESOURCE = "/partidos";
    private static final String CARGO_RESOURCE = "/cargos";
    private static final String BENS_RESOURCE = "/bens";
    private static final String DOADORES_RESOURCE = "/doadores";

    private static final String CANDIDATO_RESOURCE = "/candidatos";
    private static final String CANDIDATURAS_RESOURCE = "/candidaturas";
    private static final String ESTATISTICAS_RESOURCE = "/estatisticas";

    private static final String EXCELENCIAS_RESOURCE = "/excelencias";

    private static final String TOKEN_HEADER = "App-token";
    private final String token;

    private final Client client;
    private final WebResource webResource;

    public APIRequest(String token) {

        ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getClasses().add(JacksonJsonProvider.class);
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

        client = Client.create(clientConfig);
        webResource = client.resource(BASE_URI);

        this.token = token;

    }

    public List<Estado> getEstados() throws RestException {

        ClientResponse response = webResource.path(ESTADO_RESOURCE).type(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

        checkException(response);

        try {
            return response.getEntity(new GenericType<List<Estado>>() {
            });
        } catch (Exception ex) {
            throw new ClientException();
        }
    }

    public List<Partido> getPartidos() throws RestException {
        List<Partido> response = webResource.path(PARTIDO_RESOURCE).type(MediaType.APPLICATION_JSON).header(TOKEN_HEADER, token)
                .accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Partido>>() {
                });

        return response;

    }

    public List<Candidato> getCandidatos(String estado, String partido, String nome, String cargo, int limit, int offset)
            throws RestException {

        List<Candidato> response = webResource.path(CANDIDATO_RESOURCE).queryParam("estado", estado)
                .queryParam("partido", partido).queryParam("nome", nome).queryParam("cargo", cargo)
                .queryParam("_limit", String.valueOf(limit)).queryParam("_offset", String.valueOf(offset)).header(TOKEN_HEADER, token)
                .type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Candidato>>() {
                });

        return response;
    }

    // Busca por id, por padrao retorna um array pelo transparencia
    public Candidato getCandidatoById(String candidatoId) throws RestException {

        Candidato response = webResource.path(CANDIDATO_RESOURCE).path(candidatoId).header(TOKEN_HEADER, token)
                .type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).get(Candidato.class);

        return response;

    }

    public List<Bens> getCandidatoBens(String candidatoId) throws RestException {
        List<Bens> response = webResource.path(CANDIDATO_RESOURCE).path(candidatoId).path(BENS_RESOURCE).header(TOKEN_HEADER, token)
                .type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Bens>>() {
                });
        return response;
    }

    public List<Doador> getCandidatoDoadores(String candidatoId, String anoEleitoral) {
        List<Doador> response = webResource.path(CANDIDATO_RESOURCE).path(candidatoId).path(DOADORES_RESOURCE)
                .queryParam("anoEleitoral", anoEleitoral).header(TOKEN_HEADER, token).type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Doador>>() {
                });

        return response;

    }

    public List<Cargo> getCargos() {
        List<Cargo> response = webResource.path(CARGO_RESOURCE).type(MediaType.APPLICATION_JSON).header(TOKEN_HEADER, token)
                .accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Cargo>>() {
                });

        return response;
    }

    public List<Candidatura> getCandidatoCandidaturas(String candidatoId) {
        List<Candidatura> response = webResource.path(CANDIDATO_RESOURCE).path(candidatoId).path(CANDIDATURAS_RESOURCE).header(TOKEN_HEADER, token)
                .type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Candidatura>>() {
                });

        return response;

    }

    public List<Estatistica> getCandidatoEstatisticas(String candidatoId) throws RestException {
        List<Estatistica> response = webResource.path(CANDIDATO_RESOURCE).path(candidatoId).path(ESTATISTICAS_RESOURCE).header(TOKEN_HEADER, token)
                .type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Estatistica>>() {
                });

        return response;
    }

    public List<Excelencia> getExcelencias(String casa, String nome, String estadoId, String partidoId) {
        List<Excelencia> response = webResource.path(EXCELENCIAS_RESOURCE).queryParam("estado", estadoId)
                .queryParam("partido", partidoId).queryParam("nome", nome).queryParam("casa", casa).header(TOKEN_HEADER, token)
                .type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Excelencia>>() {
                });
        return response;

    }

    public Excelencia getExcelenciaById(String excelenciaId) throws RestException {

        Excelencia response = webResource.path(EXCELENCIAS_RESOURCE).path(excelenciaId)
                .type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).get(Excelencia.class);
        return response;

    }

    public List<Bens> getExcelenciaBens(String excelenciaId) throws RestException {
        List<Bens> response = webResource.path(EXCELENCIAS_RESOURCE).path(excelenciaId).path(BENS_RESOURCE).header(TOKEN_HEADER, token)
                .type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Bens>>() {
                });
        return response;
    }

    private void checkException(ClientResponse response) throws RestException {
        if (response.getStatusInfo().getStatusCode() != 200) {
            throw new RestException(response.getStatusInfo().getStatusCode(), response.getStatusInfo().getReasonPhrase());
        }
    }

}
