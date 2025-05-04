package br.com.codewithjuliano.modelos;

public class HistoricoConversao {

    private String moedaOrigem;
    private String moedaDestino;
    private double valorInformado;
    private double valorConvertido;

    public HistoricoConversao(String moedaOrigem, String moedaDestino, double valorInformado, double valorConvertido) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.valorInformado = valorInformado;
        this.valorConvertido = valorConvertido;
    }

    public String formatar() {
        return valorInformado + " " + moedaOrigem + " = " + valorConvertido + " " + moedaDestino;
    }
}
