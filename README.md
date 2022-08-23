# Abstração da API de cotação de moedas disponibilizada pelo BACEN

O Bacen diponibiliza uma API que contem informações relacionadas a cotação 
do dolar dos ultimos dias. Caso esteja interessando em ler sobre os recursos da 
API, você pode encontrar essas informações (através do seguinte link.) [https://dadosabertos.bcb.gov.br/dataset/dolar-americano-usd-todos-os-boletins-diarios/resource/ae69aa94-4194-45a6-8bae-12904af7e176?inner_span=True]

A ideia dessa abstração é conseguir consumir os 5 recursos disponiblizados pela 
API para poupar a necessidade do usuário de construir seu próprio cliente da API.

## Intruções para a utilização da abstração:

Para você chamar os recursos a forma certa é utilizar o classe facotry chamada 
```ExchangeTaxesFactory``` essa classe possui um método para cada recurso, são eles:

### currency()

Responsável por oferecer as informações sobre as moedas que a API consegue 
cobrir. Nós também podemos utilizar o método ```max``` para limitar a quantidade 
de valores a serem retornados.

Exemplo de utilização: 

```
  new ExchangeTaxesFactory().currency()
      .get()
      
```

ou 

```
  new ExchangeTaxesFactory().currency()
      .max()
      .get()
      
```

Mais informações sobre esse recurso pode ser encontrado (neste endereço)[https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/aplicacao#!/recursos/Moedas#eyJmb3JtdWxhcmlvIjp7IiRmb3JtYXQiOiJqc29uIiwiJHRvcCI6MTAwfSwicGVzcXVpc2FkbyI6dHJ1ZSwiYWN0aXZlVGFiIjoiZGFkb3MiLCJncmlkU3RhdGUiOnsDMAM6W3sDQgMiBDAEIiwDQQN9LHsDQgMiBDEEIiwDQQN9LHsDQgMiBDIEIiwDQQN9XSwDMQM6e30sAzIDOltdLAMzAzp7fSwDNAM6e30sAzUDOnt9fSwicGl2b3RPcHRpb25zIjp7A2EDOnt9LANiAzpbXSwDYwM6NTAwLANkAzpbXSwDZQM6W10sA2YDOltdLANnAzoia2V5X2FfdG9feiIsA2gDOiJrZXlfYV90b196IiwDaQM6e30sA2oDOnt9LANrAzo4NSwDbAM6ZmFsc2UsA20DOnt9LANuAzp7fSwDbwM6IkNvbnRhZ2VtIiwDcAM6IlRhYmxlIn19]

### dollarQuoteDay(String date)

Esse método retorna a cotação do dolar em uma data especifica. 


A API do Bacen utiliza 
utiliza o seguinte padrão para as datas MM/dd/yyyy












