package com.br.apptecnico.deignpattners.criacionais.abstractFactory.exemplo1;

public class BotaoLinux implements Botao{

    private static final String tipoBotao = "Linux";

    @Override
    public void click() {
        System.out.println("Click " + tipoBotao);
    }

    @Override
    public String tipoBotao() {
        return "Tipo Botao: " + tipoBotao;
    }
}
