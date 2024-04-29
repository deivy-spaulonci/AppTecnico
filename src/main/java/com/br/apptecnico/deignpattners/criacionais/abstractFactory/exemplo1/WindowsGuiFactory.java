package com.br.apptecnico.deignpattners.criacionais.abstractFactory.exemplo1;

public class WindowsGuiFactory  implements GuiFactory{
    @Override
    public Painel criaPainel() {
        //return new PainelWindows(true);
        return null;
    }

    @Override
    public Botao criaBotao() {
        return new BotaoWindows();
    }
}
