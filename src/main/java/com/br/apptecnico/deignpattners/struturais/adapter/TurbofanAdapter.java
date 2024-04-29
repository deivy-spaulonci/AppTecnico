package com.br.apptecnico.deignpattners.struturais.adapter;

public class TurbofanAdapter implements JetEngine {
    private Turbofan turbofan;
    public TurbofanAdapter(Turbofan turbofan) {
        this.turbofan = turbofan;
    }
    @Override
    public void ignite() {
        turbofan.start(); // Converte o método start() para ignite()
    }
}
