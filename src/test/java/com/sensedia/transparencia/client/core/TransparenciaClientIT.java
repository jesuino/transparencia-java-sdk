/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sensedia.transparencia.client.core;

import com.sensedia.transparencia.client.ex.RestException;
import com.sensedia.transparencia.client.resources.Candidato;
import com.sensedia.transparencia.client.rest.APIRequestIT;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 *
 * @author Josue
 */
public class TransparenciaClientIT {

    private TransparenciaClient client;

    public TransparenciaClientIT() {
        try {
            Properties properties = new Properties();
            properties.load(getClass().getResourceAsStream("/test-token.properties"));

            String foundToken = properties.getProperty("App-token");
            if (!StringUtils.isBlank(foundToken)) {
                client = new TransparenciaClient(foundToken);
            } else {
                throw new RuntimeException("Nenhum App-token encontrado, verifique nos recursos de teste");
            }
        } catch (IOException ex) {
            Logger.getLogger(APIRequestIT.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Test
    public void testeGetCandidatoByPartido() throws RestException {

        String estado = "SP";
        String partidoId = "1";
        String partidoSigla = "PT";

        List<Candidato> candidatos = client.getCandidatosByPartido(estado, partidoId);
        assertEquals(20, candidatos.size());
        for (Candidato c : candidatos) {
            assertEquals(c.getPartido(), partidoSigla);
        }

    }

    @Test
    public void testeGetCandidatoByCargo() throws RestException {

        String estado = "SP";
        String cargoId = "1";
        String cargoNome = "Presidente";

        List<Candidato> candidatos = client.getCandidatosByCargo(estado, cargoId);
        assertTrue(candidatos.size() > 0);
        for (Candidato c : candidatos) {
            assertEquals(c.getCargo(), cargoNome);
        }
    }

    @Test
    public void testeGetCandidatoByNome() throws RestException {

        String estado = "SP";
        String nome = "GERALDO";

        List<Candidato> candidatos = client.getCandidatosByNome(estado, nome);
        assertTrue(candidatos.size() > 0);
        for (Candidato c : candidatos) {
            assertTrue(c.getNome().contains(nome) || c.getApelido().contains(nome));
        }
    }

    @Test
    public void testeGetCandidatosLimit() throws RestException {

        String estado = "SP";
        String partidoId = "1";
        String partidoSigla = "PT";

        List<Candidato> candidatos = client.getCandidatos(estado, partidoId, null, null, 10, 0);
        assertEquals(10, candidatos.size());
        for (Candidato c : candidatos) {
            assertEquals(c.getEstado(), estado);
            assertEquals(c.getPartido(), partidoSigla);
        }
    }

    @Test
    public void testeGetCandidatoByIdNotFetch() throws RestException {

        String estado = "SP";
        String partidoId = "1";
        String partidoSigla = "PT";

        List<Candidato> candidatos = client.getCandidatos(estado, partidoId, null, null, 10, 0);
        assertEquals(10, candidatos.size());
        for (Candidato c : candidatos) {
            assertEquals(c.getEstado(), estado);
            assertEquals(c.getPartido(), partidoSigla);
        }

        Candidato candidato = client.getCandidatoById(candidatos.get(0).getId(), false);
        assertNotNull(candidato);
        assertEquals(candidatos.get(0), candidato);
        assertTrue(candidato.getBens().isEmpty());
        assertTrue(candidato.getEstatisticas().isEmpty());
        assertTrue(candidato.getBens().isEmpty());
        assertTrue(candidato.getDoadores().isEmpty());
        assertTrue(candidato.getCandidaturas().isEmpty());

    }

    @Test
    public void testeGetCandidatoByIdFetch() throws RestException {

        String estado = "SP";
        String partidoId = "1";
        String partidoSigla = "PT";

        List<Candidato> candidatos = client.getCandidatos(estado, partidoId, null, null, 10, 0);
        assertEquals(10, candidatos.size());
        for (Candidato c : candidatos) {
            assertEquals(c.getEstado(), estado);
            assertEquals(c.getPartido(), partidoSigla);
        }

        Candidato candidato = client.getCandidatoById(candidatos.get(0).getId(), true);
        assertNotNull(candidato);
        assertTrue(candidato.getBens().size() > 0);

    }

}
