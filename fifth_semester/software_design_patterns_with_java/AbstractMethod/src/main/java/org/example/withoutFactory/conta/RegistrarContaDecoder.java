package org.example.withoutFactory.conta;

public class RegistrarContaDecoder {
    public MsgRegistrarConta decode(String textoMsg) {
        return new MsgRegistrarConta();
    }
}
