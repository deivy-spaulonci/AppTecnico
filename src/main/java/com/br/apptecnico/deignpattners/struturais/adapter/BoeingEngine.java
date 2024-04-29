package com.br.apptecnico.deignpattners.struturais.adapter;

public class BoeingEngine implements JetEngine {
    @Override
    public void ignite() {
        System.out.println("BoeingEngine acendido");
    }
}
