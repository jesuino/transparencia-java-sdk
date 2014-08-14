package com.sensedia.transparencia.client.core;

import com.sensedia.transparencia.client.rest.APIRequest;

/**
 *
 * @author Josue
 */
public class TransparenciaClient {

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

}
