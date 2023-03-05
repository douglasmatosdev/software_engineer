package org.example.factory;

import org.example.withoutFactory.cliente.RegistrarClienteDecoder;
import org.example.withoutFactory.cliente.RegistrarClienteXMLDecoder;
import org.example.withoutFactory.conta.RegistrarContaDecoder;
import org.example.withoutFactory.conta.RegistrarContaXMLDecoder;

public class XMLDecoderFactory extends DecoderFactory {
    public RegistrarClienteDecoder createRegistrarClienteDecoder() {
        return new RegistrarClienteXMLDecoder();
    }

    public RegistrarContaDecoder createRegistrarContaDecoder() {
        return new RegistrarContaXMLDecoder();
    }
}
