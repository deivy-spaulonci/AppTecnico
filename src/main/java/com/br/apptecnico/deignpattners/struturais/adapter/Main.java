package com.br.apptecnico.deignpattners.struturais.adapter;

public class Main {
    public static void main(String[] args) {
        Turbofan airbusEngine = new AirbusEngine();
        JetEngine boeingEngine = new TurbofanAdapter(airbusEngine);
        boeingEngine.ignite(); // Isso chama o método start() do AirbusEngine
    }
}
