# Symposium Report Portlet

## Visão Geral

Implementação de exemplo para demonstrar o uso do Liferay Message Bus a fim de paralelizar o processamento computacional dentro da plataforma Liferay.

O caso de uso que esse projeto resolve é a criação de múltiplos relatórios (entidade Report) de forma paralela. Cada relatório possui cinco seções:

* Summary
* Costs
* ROI
* Metrics
* Recommendations

Cada seção deve coletar dados a partir de um serviço RESTful remoto, o projeto para criar o serviço pode ser encontrado em:

[https://github.com/andrefabbro/dummy-rest-service](https://github.com/andrefabbro/dummy-rest-service)

Uma vez que o serviço esteja rodando, a criação de cada seção do relatório é feita a partir de um GET ao serviço no formato /relatorio/processar/{$report\_id}/secao/{$section\_name}, exemplo:

    curl -i http://localhost:9090/relatorio/processar/1000/secao/summary

## Build e Deploy

    mvn clean package liferay:deploy -P Liferay-Tomcat-7.0.42
