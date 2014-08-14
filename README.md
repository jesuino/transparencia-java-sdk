transparencia-java-sdk
======================

Kit de desenvolvimento Java para as APIs do Transparencia Brasil

===========

##Exemplo de uso:

```
  
  Transparencia client = new TransparenciaClient("MEU-APP-TOKEN");
  
  //Busca candidato por ID, 'true' popula automaticamente os campos 'bens', 'candidaturas', 'doadores' e 'estatisticas'
  Candidatos candidato = client.getCandidatoById("123456", true);
  
  List<Partidos> partidos = client.getPartidos();
  
  ...
```
