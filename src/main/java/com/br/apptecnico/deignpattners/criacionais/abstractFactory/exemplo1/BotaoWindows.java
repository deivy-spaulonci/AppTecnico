package com.br.apptecnico.deignpattners.criacionais.abstractFactory.exemplo1;

public class BotaoWindows implements Botao {

    private final String tipoBotao = "Windows";

    @Override
    public void click() {
        System.out.println("Click " + tipoBotao);
    }

    @Override
    public String tipoBotao() {
        return "Tipo Botao: " + this.tipoBotao;
    }
}
