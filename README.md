# 💰 Conversor de Moedas em Tempo Real (BRL <-> USD/EUR/GBP)

[![Java](https://img.shields.io/badge/Java-17%2B-orange.svg?style=flat-square&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Desafio Back-end Java](https://img.shields.io/badge/Desafio-Back--end%20Java-blueviolet.svg?style=flat-square)](https://education.oracle.com/java-se-path/course/ojp-java-se-programming-i)

<p align="center">
  Uma aplicação Java para realizar conversões de moeda entre Real Brasileiro (BRL) e Dólar (USD), Euro (EUR) e Libra Esterlina (GBP), utilizando taxas em tempo real obtidas de uma API externa. Desenvolvida como desafio prático no curso de back-end em Java.
</p>

---

## ✨ Funcionalidades Principais

* **🔄 Consulta de Taxas Online:** Obtém as taxas de câmbio mais recentes através da API [ExchangeRate API](https://www.exchangerate-api.com/).
* **💱 Conversão Bidirecional:** Realiza conversões de BRL para USD, EUR e GBP, e vice-versa.
* **🧭 Menu Interativo:** Oferece uma interface simples em linha de comando para interação do usuário.
* **📝 Histórico de Conversões:** Mantém um registro das conversões realizadas durante a sessão.

---

## ⚙️ Pré-requisitos

* **Java:** Versão 17 ou superior instalada no seu sistema.
* **Gson:** A biblioteca [Gson](https://github.com/google/gson) deve estar no classpath do projeto.
* **Chave de API:** Uma variável de ambiente `API_KEY` deve ser definida com a sua chave da [ExchangeRate API](https://www.exchangerate-api.com/).

---

## 🚀 Como Executar

1.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/itsjuliano/conversor-moedas-poo.git](https://github.com/itsjuliano/conversor-moedas-poo.git)
    cd conversor-moedas-poo
    ```

2.  **Configure a Variável de Ambiente:**

    No terminal (Linux/Mac):
    ```bash
    export API_KEY=sua_chave_aqui
    ```

    No Windows CMD:
    ```cmd
    set API_KEY=sua_chave_aqui
    ```

3.  **Compile o Projeto:**
    ```bash
    javac -cp .:./gson-*.jar src/br/com/codewithjuliano/**/*.java
    ```

4.  **Execute o Programa:**
    ```bash
    java -cp .:./gson-*.jar src/br/com/codewithjuliano/util/Principal
    ```
    > Siga as instruções exibidas no terminal para realizar as conversões desejadas.

---

## 🛠️ Conceitos Aplicados

Este projeto demonstra a aplicação prática de:

* **Programação Orientada a Objetos (POO) em Java:** Utilização de classes, pacotes, encapsulamento e boas práticas de desenvolvimento.
* **Consumo de API HTTP:** Realização de requisições HTTP utilizando `HttpClient` e processamento de dados no formato JSON com a biblioteca Gson.
* **Tratamento de Exceções:** Implementação de mecanismos para lidar com erros de conexão de rede, entradas de usuário inválidas e ausência da variável de ambiente `API_KEY`.
* **Entrada e Saída de Dados:** Interação com o usuário através da classe `Scanner` para receber comandos e exibir resultados.
* **Estruturas de Dados:** Utilização da classe `ArrayList` para armazenar dinamicamente o histórico das conversões efetuadas.

---

## 🎓 Projeto do Curso

Este projeto foi desenvolvido como parte de um desafio prático do curso de back-end em Java, com o objetivo de consolidar conhecimentos em:

* Consumo de APIs externas e tratamento de seus dados.
* Organização e estruturação de código utilizando os princípios da POO.
* Criação de uma experiência interativa para o usuário através do terminal.

---

Feito com ❤️ por [@itsjuliano](https://github.com/itsjuliano)
