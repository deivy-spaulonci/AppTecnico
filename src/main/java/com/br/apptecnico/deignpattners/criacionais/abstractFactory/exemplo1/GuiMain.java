package com.br.apptecnico.deignpattners.criacionais.abstractFactory.exemplo1;

public class GuiMain {

    public static void main(String[] args) {

        GuiFactory factory = new WindowsGuiFactory();
        App windowsApp = new App(factory);
        windowsApp.configuracaoGuiApplication();;

        System.out.println();

        factory = new LinuxGuiFactory();
        App linuxApp = new App(factory);
        linuxApp.configuracaoGuiApplication();

    }
}
