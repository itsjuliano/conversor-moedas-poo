package br.com.codewithjuliano.modelos;

import java.util.Map;

public record Conversao(String base_code,
                        Map<String, Double> conversion_rates) {

    public Double obterTaxa(String moedaDestino) {
        return conversion_rates.get(moedaDestino);
    }
}

