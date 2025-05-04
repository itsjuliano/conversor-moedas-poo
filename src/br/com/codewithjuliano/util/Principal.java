package br.com.codewithjuliano.util;

import br.com.codewithjuliano.modelos.Conversao;
import br.com.codewithjuliano.servicos.ConsultaCambio;
import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibir();
    }
}
