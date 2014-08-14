/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sensedia.transparencia.client.core;

import com.sensedia.transparencia.client.ex.RestException;
import com.sensedia.transparencia.client.resources.Candidato;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

/**
 *
 * @author Josue
 */
public class TransparenciaClientTest {

    private TransparenciaClient client = new TransparenciaClient("1234");

    @Test
    public void testConverter() {

        try {
            List<Candidato> candidatos = client.getCandidatosByPartido(null, "");
        } catch (RestException ex) {
            Logger.getLogger(TransparenciaClientTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
