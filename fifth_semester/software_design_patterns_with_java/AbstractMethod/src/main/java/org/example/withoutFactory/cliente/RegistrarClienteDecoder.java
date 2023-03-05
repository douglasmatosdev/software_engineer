package org.example.withoutFactory.cliente;

public class RegistrarClienteDecoder {
    public MsgRegistrarCliente decode(String textoMsg) {
        return new MsgRegistrarCliente();
    }
}
