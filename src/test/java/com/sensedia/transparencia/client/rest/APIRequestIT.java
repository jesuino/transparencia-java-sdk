/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sensedia.transparencia.client.rest;

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
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Josue
 */
public class APIRequestIT {

    private APIRequest request;

    private final String estado = "sp";
    private final String partido = "1";
    private final String nome = "";
    private final String cargo = "";

    private final int max_limit = 20;
    private final int limit = 20;
    private final int offset = 0;

    public APIRequestIT() {
        try {
            Properties properties = new Properties();
            properties.load(getClass().getResourceAsStream("/test-token.properties"));

            String foundToken = properties.getProperty("App-token");
            if (!StringUtils.isBlank(foundToken)) {
                request = new APIRequest(foundToken);
            } else {
                throw new RuntimeException("Nenhum App-token encontrado, verifique nos recursos de teste");
            }

        } catch (IOException ex) {
            Logger.getLogger(APIRequestIT.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Before
    public void throttling() throws InterruptedException {
        //avoid request limit
        Thread.sleep(500);
    }

    @Test
    public void testgetEstados() throws RestException {
        List<Estado> estados = request.getEstados();
        assertNotNull(estados);
        assertEquals(28, estados.size());
    }

    @Test
    public void testGetPartidos() throws RestException {
        List<Partido> partidos = request.getPartidos();
        assertNotNull(partidos);
        assertTrue(partidos.size() > 0);
    }

    @Test
    public void testGetCargos() throws RestException {
        List<Cargo> cargos = request.getCargos();
        assertNotNull(cargos);
        assertEquals(10, cargos.size());
    }

    @Test
    public void testGetCandidatos() throws RestException {

        List<Candidato> candidatos = request.getCandidatos(estado, partido, nome, cargo, limit, offset);
        assertNotNull(candidatos);
        assertEquals(limit, candidatos.size());
    }

    @Test
    public void testGetCandidatosLimit() throws RestException {

        List<Candidato> candidatos = request.getCandidatos(estado, partido, nome, cargo, 100000000, offset);
        assertNotNull(candidatos);
        assertEquals(max_limit, candidatos.size());
    }

    @Test
    public void testGetCandidatosLimitNegativo() throws RestException {

        List<Candidato> candidatos = request.getCandidatos(estado, partido, nome, cargo, -1, offset);
        assertNotNull(candidatos);
        assertEquals(max_limit, candidatos.size());
    }

    @Test
    public void testGetCandidatoById() throws RestException {

        List<Candidato> candidatos = request.getCandidatos(estado, partido, nome, cargo, limit, offset);
        assertNotNull(candidatos);
        assertEquals(limit, candidatos.size());

        Candidato foundCandidato = request.getCandidatoById(candidatos.get(0).getId());
        assertNotNull(foundCandidato);
        assertEquals(candidatos.get(0), foundCandidato);

    }

    @Test
    public void testGetCandidatoBens() throws RestException {

        List<Candidato> candidatos = request.getCandidatos(estado, partido, nome, cargo, limit, offset);
        assertNotNull(candidatos);
        assertEquals(limit, candidatos.size());

        List<Bens> foundBens = request.getCandidatoBens(candidatos.get(0).getId());
        assertNotNull(foundBens);

    }

    @Test
    public void testGetCandidatoDoadores() throws RestException {
        String anoEleitoral = "2010";

        List<Candidato> candidatos = request.getCandidatos(estado, partido, nome, cargo, limit, offset);
        assertNotNull(candidatos);
        assertEquals(limit, candidatos.size());

        List<Doador> foundBens = request.getCandidatoDoadores(candidatos.get(0).getId(), anoEleitoral);
        assertNotNull(foundBens);

    }

    @Test
    public void testGetCandidatoCandidaturas() throws RestException {

        List<Candidato> candidatos = request.getCandidatos(estado, partido, nome, cargo, limit, offset);
        assertNotNull(candidatos);
        assertEquals(limit, candidatos.size());

        List<Candidatura> foundCandidaturas = request.getCandidatoCandidaturas(candidatos.get(0).getId());
        assertNotNull(foundCandidaturas);

    }

    @Test
    public void testGetCandidatoEstatisticas() throws RestException {

        List<Candidato> candidatos = request.getCandidatos(estado, partido, nome, cargo, limit, offset);
        assertNotNull(candidatos);
        assertEquals(limit, candidatos.size());

        List<Estatistica> foundEstatisticas = request.getCandidatoEstatisticas(candidatos.get(0).getId());
        assertNotNull(foundEstatisticas);

    }

    @Test
    public void testGetExcelencias() throws RestException {

        List<Excelencia> excelencias = request.getExcelencias(Excelencia.CAMARA_DEPUTADOS, "", "sp", "1");
        assertNotNull(excelencias);
        assertTrue(excelencias.size() > 0);

    }

    @Test
    public void testGetExcelenciaById() throws RestException {

        List<Excelencia> excelencias = request.getExcelencias(Excelencia.CAMARA_DEPUTADOS, "", "sp", "1");
        assertNotNull(excelencias);
        assertTrue(excelencias.size() > 0);

        Excelencia foundExcelencia = request.getExcelenciaById(excelencias.get(0).getId());
        assertNotNull(foundExcelencia);

    }

    //Testes de exceptions
    @Test
    public void testGetCandidatoByIdNotFound() {
        try {
            request.getCandidatoById("id-inexistente");
            fail("Deveria ter lancado excecao");
        } catch (RestException ex) {
            assertEquals(404, ex.getCode());
            assertEquals("Not Found", ex.getMessage());
            assertNotNull(ex.getHttpMessage());

        }

    }

}
