package org.example.factory;

import org.example.withoutFactory.cliente.RegistrarClienteCSVDecoder;
import org.example.withoutFactory.cliente.RegistrarClienteDecoder;
import org.example.withoutFactory.conta.RegistrarContaCSVDecoder;
import org.example.withoutFactory.conta.RegistrarContaDecoder;

public class CSVDecoderFactory extends DecoderFactory {
    public RegistrarClienteDecoder createRegistrarClienteDecoder() {
        return new RegistrarClienteCSVDecoder();
    }

    public RegistrarContaDecoder createRegistrarContaDecoder() {
        return new RegistrarContaCSVDecoder();
    }
}
