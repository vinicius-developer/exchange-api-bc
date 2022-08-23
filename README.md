# Abstração da API de cotação de moedas disponibilizada pelo BACEN

O Bacen diponibiliza uma API que contem informações relacionadas a cotação 
do dolar dos ultimos dias. Caso esteja interessando em ler sobre os recursos da 
API, você pode encontrar essas informações [através do seguinte link.] (https://dadosabertos.bcb.gov.br/dataset/dolar-americano-usd-todos-os-boletins-diarios/resource/ae69aa94-4194-45a6-8bae-12904af7e176?inner_span=True)

A ideia dessa abstração é conseguir consumir os 5 recursos disponiblizados pela 
API para poupar a necessidade do usuário de construir seu próprio cliente da API.

## Intruções para a utilização da abstração:

Para você chamar os recursos a forma certa é utilizar o classe facotry chamada 
```ExchangeTaxesFactory``` essa classe possui um método para cada recurso, são eles:

### currency

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











