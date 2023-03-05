package org.example;

import org.example.withoutFactory.cliente.*;
import org.example.withoutFactory.conta.*;

public class ServicoIntegracaoWithoutFactory {
    public void registrarCliente(String textoMsg, String origem) {
        RegistrarClienteDecoder msgDecoder = null;

        if ("X".equals(origem)) {
            msgDecoder = new RegistrarClienteXMLDecoder();
        } else if ("Y".equals(origem)) {
            msgDecoder = new RegistrarClienteCSVDecoder();
        } else if ("Z".equals(origem)) {
            msgDecoder = new RegistrarClienteTextFixoDecoder();
        }

        MsgRegistrarCliente msg = msgDecoder.decode(textoMsg);

        //...
        // código para tratamento da mensagem recebida
    }

    public void registrarConta (String textoMsg, String origem){
        RegistrarContaDecoder msgDecoder = null;

        if ("X".equals(origem)) {
            msgDecoder = new RegistrarContaXMLDecoder();
        } else if ("Y".equals(origem)) {
            msgDecoder = new RegistrarContaCSVDecoder();
        } else if ("Z".equals(origem)) {
            msgDecoder = new RegistrarContaTextFixoDecoder();
        }

        MsgRegistrarConta msg = msgDecoder.decode(textoMsg);

        //...
        // código para tratamento da mensagem recebida
    }
    //... operações para recepção e tratamento das demais mensagens
}
