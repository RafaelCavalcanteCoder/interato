# Automação de Teste Exploratório em Sistema de Consulta Médica

Este é um projeto de automação de teste exploratório em um sistema de consulta médica. O objetivo deste projeto é automatizar testes que exploram a funcionalidade do sistema, identificam bugs e garantem que o sistema funcione conforme o esperado.

## Visão Geral

O projeto utiliza as seguintes tecnologias e ferramentas:

- Selenium WebDriver: Para automatizar a interação com o sistema.
- JUnit: Para escrever e executar casos de teste.
- Allure: Para geração de relatórios detalhados dos testes.
- ChromeDriver: Para automatizar testes no navegador Google Chrome (ou outro driver compatível com seu navegador alvo).

## Pré-requisitos

Antes de executar os testes, certifique-se de ter o seguinte configurado em seu ambiente de desenvolvimento:

- JDK (Java Development Kit) instalado
- Maven instalado
- ChromeDriver (ou outro driver de navegador apropriado) instalado e configurado

## Configure as dependências do Maven executando o seguinte comando:
- mvn clean install
## Executando os Testes
Para executar os testes de automação de teste exploratório, use o seguinte comando Maven:
- mvn test

Os testes serão executados automaticamente, explorando e interagindo com o sistema de consulta médica.

## Relatórios de Testes
Este projeto utiliza o Allure para gerar relatórios detalhados dos testes. Após a execução dos testes, você pode gerar o relatório usando o seguinte comando:

- mvn allure:report







  
