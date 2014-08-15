transparencia-java-sdk
======================

Kit de desenvolvimento Java para as APIs do Transparencia Brasil

===========

##Instalação
Baixa `transparencia-java-sdk-1.0.jar` e adicione ao classpath do projeto

> Contribuidores para disponibilizar no Maven Central são bem vindos !


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
