transparencia-java-sdk
======================

Kit de desenvolvimento Java para as APIs do Transparencia Brasil

===========

##Instalação
Apenas baixe `transparencia-java-sdk-1.0.jar` e adicione ao classpath do projeto.

####Maven
Baixe o codigo e execute
`mvn install`

Adicione ao seu `pom.xml`:
```
    <dependency>
        <groupId>com.sensedia</groupId>
        <artifactId>transparencia-java-sdk</artifactId>
        <version>1.0</version>
    </dependency>
```

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
