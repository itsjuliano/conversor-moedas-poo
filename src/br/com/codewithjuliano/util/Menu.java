package br.com.codewithjuliano.util;

import br.com.codewithjuliano.modelos.Conversao;
import br.com.codewithjuliano.modelos.HistoricoConversao;
import br.com.codewithjuliano.servicos.ConsultaCambio;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<HistoricoConversao> historico = new ArrayList<>();

    public void exibir() {
        Scanner entrada = new Scanner(System.in);
        ConsultaCambio consulta = new ConsultaCambio();
        Gson gson = new Gson();

        System.out.println("=== Conversor de Moedas ===");
        System.out.println("Bem-vindo! As taxas são atualizadas em tempo real.\n");

        String json = consulta.buscarDados();
        Conversao conversao = gson.fromJson(json, Conversao.class);

        int opcao = -1;

        while (true) {
            try {
                System.out.println("Escolha uma conversão:");
                System.out.println("1 - BRL para USD");
                System.out.println("2 - BRL para EUR");
                System.out.println("3 - BRL para GBP");
                System.out.println("4 - USD para BRL");
                System.out.println("5 - EUR para BRL");
                System.out.println("6 - GBP para BRL");
                System.out.println("7 - Ver histórico de conversões");
                System.out.println("0 - Sair");
                System.out.print("Digite a opção desejada: ");
                opcao = entrada.nextInt();
                entrada.nextLine();

                if (opcao < 0 || opcao > 7) {
                    System.out.println("Opção inválida! Tente novamente.\n");
                    continue;
                }

                if (opcao == 0) {
                    System.out.println("\n=== Histórico Final de Conversões ===");
                    exibirHistorico();
                    System.out.println("\nPrograma encerrado. Até logo!");
                    break;
                }

                if (opcao == 7) {
                    exibirHistorico();
                    continue;
                }

                System.out.print("Digite o valor a ser convertido: ");
                double valor = entrada.nextDouble();
                entrada.nextLine(); // limpa o buffer

                double taxa;
                double convertido = 0;
                String origem = "";
                String destino = "";

                switch (opcao) {
                    case 1:
                        taxa = conversao.obterTaxa("USD");
                        convertido = valor * taxa;
                        origem = "BRL";
                        destino = "USD";
                        System.out.println("R$ " + valor + " equivalem a $" + convertido + " (USD)\n");
                        break;
                    case 2:
                        taxa = conversao.obterTaxa("EUR");
                        convertido = valor * taxa;
                        origem = "BRL";
                        destino = "EUR";
                        System.out.println("R$ " + valor + " equivalem a €" + convertido + " (EUR)\n");
                        break;
                    case 3:
                        taxa = conversao.obterTaxa("GBP");
                        convertido = valor * taxa;
                        origem = "BRL";
                        destino = "GBP";
                        System.out.println("R$ " + valor + " equivalem a £" + convertido + " (GBP)\n");
                        break;
                    case 4:
                        taxa = 1 / conversao.obterTaxa("USD");
                        convertido = valor * taxa;
                        origem = "USD";
                        destino = "BRL";
                        System.out.println("$" + valor + " equivalem a R$ " + convertido + "\n");
                        break;
                    case 5:
                        taxa = 1 / conversao.obterTaxa("EUR");
                        convertido = valor * taxa;
                        origem = "EUR";
                        destino = "BRL";
                        System.out.println("€" + valor + " equivalem a R$ " + convertido + "\n");
                        break;
                    case 6:
                        taxa = 1 / conversao.obterTaxa("GBP");
                        convertido = valor * taxa;
                        origem = "GBP";
                        destino = "BRL";
                        System.out.println("£" + valor + " equivalem a R$ " + convertido + "\n");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.\n");
                        continue;
                }

                System.out.println("Resultado: " + valor + " " + origem + " = " + convertido + " " + destino + "\n");
                historico.add(new HistoricoConversao(origem, destino, valor, convertido));

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Insira números válidos.");
                entrada.nextLine(); // limpa o buffer
            }
        }

        entrada.close();
    }

    private void exibirHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma conversão realizada ainda.");
        } else {
            for (HistoricoConversao h : historico) {
                System.out.println("- " + h.formatar());
            }
        }
        System.out.println();
    }
}
