package org.example.factory;

import org.example.withoutFactory.cliente.RegistrarClienteDecoder;
import org.example.withoutFactory.cliente.RegistrarClienteTextFixoDecoder;
import org.example.withoutFactory.conta.RegistrarContaDecoder;
import org.example.withoutFactory.conta.RegistrarContaTextFixoDecoder;

public class TextoFixoDecoderFactory extends DecoderFactory {
    @Override
    public RegistrarClienteDecoder createRegistrarClienteDecoder() {
        return new RegistrarClienteTextFixoDecoder();
    }

    @Override
    public RegistrarContaDecoder createRegistrarContaDecoder() {
        return new RegistrarContaTextFixoDecoder();
    }
}
