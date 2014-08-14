transparencia-java-sdk
======================

Kit de desenvolvimento Java para as APIs do Transparencia Brasil

===========

##Exemplo de uso:

```
  
  Transparencia client = new TransparenciaClient("MEU-APP-TOKEN");
  
  //Busca candidato por ID, 'true' popula automaticamente os campos 'bens', 'candidaturas', 'doadores' e 'estatisticas'
  Candidato candidato = client.getCandidatoById("123456", true);
  
  List<Partido> partidos = client.getPartidos();
  
  ...
```
##Exceptions:
```
	try {
         Candidato candidato = client.getCandidatoById("123456", true);
    } catch (RestException ex) {
        System.err.println("Error code: " + ex.getCode());
        System.err.println("Http message: " + ex.getHttpMessage());
        System.err.println("Original error message: " + ex.getMessage());
    }

```