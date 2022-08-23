# Abstração da API de cotação de moedas disponibilizada pelo BACEN

O Bacen diponibiliza uma API que contem informações relacionadas a cotação 
do dolar dos ultimos dias. Caso esteja interessando em ler sobre os recursos da 
API, você pode encontrar essas informações [através do seguinte link.](https://dadosabertos.bcb.gov.br/dataset/dolar-americano-usd-todos-os-boletins-diarios/resource/ae69aa94-4194-45a6-8bae-12904af7e176?inner_span=True)

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
  new ExchangeTaxesFactory()
      .currency()
      .get();
      
```

ou 

```
  new ExchangeTaxesFactory()
      .currency()
      .max(3)
      .get();
```

Mais informações sobre esse recurso pode ser encontrado [neste endereço](https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/aplicacao#!/recursos/Moedas#eyJmb3JtdWxhcmlvIjp7IiRmb3JtYXQiOiJqc29uIiwiJHRvcCI6MTAwfX0=)

### dollarQuoteDay(String date)

Esse método retorna a cotação do dolar em uma data especifica. A API do Bacen utiliza 
utiliza o seguinte padrão para as datas MM/dd/yyyy caso seja passado a data diferente 
do padrão será laçando `InvalidParameterException`.

Exemplo de utilização: 

```
  // padrão de data MM/dd/yyyy
  new ExchangeTaxesFactory()
    .dollarQuoteDay("08/23/2022")
    .get();
```

Mais informações sobre esse recurso pode ser encontrado [neste endereço](https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/aplicacao#!/recursos/CotacaoDolarDia#eyJmb3JtdWxhcmlvIjp7IiRmb3JtYXQiOiJqc29uIiwiJHRvcCI6MTAwfX0=)

### dollarQuotePeriod(String start, String end)

Esse método acessa o recurso que informa a cotação do dolar durante um período
de tempo. Também utiliza o padrão de data MM/dd/yyyy.

Exemplo de utilização:

```
  // padrão de data MM/dd/yyyy
  new ExchangeTaxesFactory()
    .dollarQuotePeriod("08/12/2022", "08/23/2022")
    .get();

```
ou

```
  new ExchangeTaxesFactory()
    .dollarQuotePeriod("08/12/2022", "08/23/2022")
    .max(4)
    .get();
```

Mais informações sobre esse recurso pode ser encontrado [neste endereço](https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/aplicacao#!/recursos/CotacaoDolarPeriodo#eyJmb3JtdWxhcmlvIjp7IiRmb3JtYXQiOiJqc29uIiwiJHRvcCI6MTAwfX0=)

### reportCardQuoteDay(ContryCurrency contryCurrency, String date)

Este método acessa o recurso da API que informa com base em uma moeda 
a cotação dela algumas vezes durante um dia. Este método utiliza o Enum 
ContryCurrency para representar a moeda desejada.

Exemplo de utilização:

```
  // padrão de data MM/dd/yyyy
  new ExchangeTaxesFactory()
    .reportCardQuoteDay(ContryCurrency.DOLAR_AUSTRALIANO, "08/23/2022")
    .get();
  
 ```
 ou
 
 ```
   new ExchangeTaxesFactory()
     .reportCardQuoteDay(ContryCurrency.DOLAR_AUSTRALIANO, "08/23/2022")
     .max(3)
     .get();
 ```
 
Mais informações sobre esse recurso pode ser encontrado [neste endereço](https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/aplicacao#!/recursos/CotacaoMoedaDia#eyJmb3JtdWxhcmlvIjp7IiRmb3JtYXQiOiJqc29uIiwiJHRvcCI6MTAwfX0=)
 
 ### reportCardQuotePeriod(ContryCurrency currency, String start, String end)

Este método acessa o recurso da Api que retorna a cotação da uma moeda, em uma janela 
de tempo.

Exemplo de utilização: 

```
 // padrão de data MM/dd/yyyy
    new ExchangeTaxesFactory()
      .reportCardQuotePeriod(ContryCurrency.DOLAR_AUSTRALIANO, "08/12/2022",  "08/23/2022")
      .get();
```
ou

```
    new ExchangeTaxesFactory()
      .reportCardQuotePeriod(ContryCurrency.DOLAR_AUSTRALIANO, "08/12/2022",  "08/23/2022")
      .max(2)
      .get();
```

Mais informações sobre esse recurso pode ser encontrado [neste endereço](https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/aplicacao#!/recursos/CotacaoMoedaPeriodo#eyJmb3JtdWxhcmlvIjp7IiRmb3JtYXQiOiJqc29uIiwiJHRvcCI6MTAwfX0=)




