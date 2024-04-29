package com.br.apptecnico.deignpattners.criacionais.abstractFactory.exemplo1;

public class LinuxGuiFactory implements GuiFactory{
    @Override
    public Painel criaPainel() {
        //return new LinuxPainel(true);
        return null;
    }

    @Override
    public Botao criaBotao() {
        return new BotaoLinux();
    }
}
