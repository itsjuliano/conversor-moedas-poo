# 💰 Conversor de Moedas em Tempo Real (BRL <-> USD/EUR/GBP)

[![Java](https://img.shields.io/badge/Java-17%2B-orange.svg?style=flat-square&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Desafio Back-end Java](https://img.shields.io/badge/Desafio-Back--end%20Java-blueviolet.svg?style=flat-square)](https://education.oracle.com/java-se-path/course/ojp-java-se-programming-i)

<p align="center">
  Uma aplicação Java simples para realizar conversões de moeda entre Real Brasileiro (BRL) e Dólar Americano (USD), Euro (EUR) e Libra Esterlina (GBP), utilizando taxas de câmbio em tempo real obtidas de uma API externa. Desenvolvida como um desafio prático no curso de back-end em Java.
</p>

---

## ✨ Funcionalidades Principais

* **Consulta de Taxas Online:** Busca as taxas de câmbio mais recentes da API exchangerate-api.com.
* **Conversão Bidirecional:** Permite converter de BRL para USD, EUR e GBP, e vice-versa.
* **Interface de Menu:** Apresenta um menu interativo para o usuário escolher a conversão desejada.
* **Registro de Histórico:** Armazena as conversões realizadas durante a execução do programa.
* **Visualização do Histórico:** Exibe as conversões anteriores sob demanda.

## 🚀 Como Executar

Para experimentar o conversor de moedas, siga estes passos:

1.  **Clone o Repositório:**
    ```bash
    git clone <URL_DO_SEU_REPOSITÓRIO>
    cd seu-projeto-cambio
    ```

2.  **Compile o Código Java:**
    Certifique-se de ter o JDK (Java Development Kit) instalado e o Gson (para manipulação de JSON) no classpath. Navegue até o diretório `src` e compile os arquivos `.java`:
    ```bash
    javac -cp .:./gson-*.jar br/com/codewithjuliano/servicos/ConsultaCambio.java br/com/codewithjuliano/modelos/Conversao.java br/com/codewithjuliano/modelos/HistoricoConversao.java br/com/codewithjuliano/util/Menu.java br/com/codewithjuliano/util/Principal.java
    ```
    (Substitua `gson-*.jar` pelo nome do arquivo JAR do Gson). Ou, compile a partir da raiz:
    ```bash
    javac -cp src:./gson-*.jar src/br/com/codewithjuliano/servicos/ConsultaCambio.java src/br/com/codewithjuliano/modelos/Conversao.java src/br/com/codewithjuliano/modelos/HistoricoConversao.java src/br/com/codewithjuliano/util/Menu.java src/br/com/codewithjuliano/util/Principal.java
    ```

3.  **Execute a Aplicação:**
    Execute a classe principal `Principal`, incluindo o Gson no classpath:
    ```bash
    java -cp src:./gson-*.jar br.com.codewithjuliano.util.Principal
    ```
    Ou, a partir da raiz do projeto:
    ```bash
    java -cp .:./gson-*.jar src/br/com/codewithjuliano/util/Principal
    ```

    Siga as instruções no console para realizar as conversões.

## 🛠️ Conceitos Aplicados

Este projeto demonstra a aplicação prática de diversos conceitos em Java, incluindo:

* **Classes e Objetos:** `ConsultaCambio`, `Conversao`, `HistoricoConversao` e `Menu`.
* **APIs e HTTP:** Utilização da classe `HttpClient` para consumir uma API externa.
* **JSON:** Processamento de dados no formato JSON com a biblioteca Gson.
* **Tratamento de Exceções:** Lidar com possíveis erros de I/O e interrupção durante a chamada da API.
* **Estruturas de Dados:** Utilização de `ArrayList` para armazenar o histórico de conversões.
* **Entrada e Saída de Dados:** Interação com o usuário através da classe `Scanner`.
* **Lógica Condicional e Repetição:** Controle do fluxo do menu de opções.

## 🎓 Desafio do Curso de Back-end em Java

Este projeto foi desenvolvido como parte de um desafio proposto durante o curso de back-end em Java, com o objetivo de consolidar os conhecimentos adquiridos sobre consumo de APIs, manipulação de dados externos e interação com o usuário em aplicações Java.

---

Feito com ❤️ por @itsjuliano
