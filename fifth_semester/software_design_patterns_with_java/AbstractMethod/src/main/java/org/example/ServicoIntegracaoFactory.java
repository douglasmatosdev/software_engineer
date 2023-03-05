package org.example;

import org.example.withoutFactory.cliente.MsgRegistrarCliente;
import org.example.withoutFactory.cliente.RegistrarClienteDecoder;
import org.example.withoutFactory.conta.MsgRegistrarConta;
import org.example.withoutFactory.conta.RegistrarContaDecoder;
import org.example.factory.DecoderFactory;

public class ServicoIntegracaoFactory {
    public void registrarCliente(String textoMsg, String origem) {
        DecoderFactory decoderFactory = DecoderFactory.fabricaParaOrigem(origem);
        RegistrarClienteDecoder msgDecoder = decoderFactory.createRegistrarClienteDecoder();
        MsgRegistrarCliente msg = msgDecoder.decode(textoMsg);


        //... código para tratamento da mensagem MsgRegistrarCliente
    }

    public void registrarConta(String textoMsg, String origem) {
        DecoderFactory decoderFactory = DecoderFactory.fabricaParaOrigem(origem);
        RegistrarContaDecoder msgDecoder = decoderFactory.createRegistrarContaDecoder();
        MsgRegistrarConta msg = msgDecoder.decode(textoMsg);

        //... código para tratamento da mensagem MsgRegistrarConta
    }

    //... código para demais mensagens
}
