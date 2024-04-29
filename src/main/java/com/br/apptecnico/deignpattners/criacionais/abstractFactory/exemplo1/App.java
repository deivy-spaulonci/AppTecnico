package com.br.apptecnico.deignpattners.criacionais.abstractFactory.exemplo1;

public class App {
    private Painel painel;
    private Botao botao;

    public App(GuiFactory guiFactory) {
        this.painel = guiFactory.criaPainel();
        this.botao = guiFactory.criaBotao();
    }

    public void configuracaoGuiApplication(){
        System.out.println(this.painel.tipoPainel());
        System.out.println(this.botao.tipoBotao());
    }
}
