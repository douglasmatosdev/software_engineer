package douglasmatosdev.college;

import douglasmatosdev.college.withoutFactory.cliente.MsgRegistrarCliente;
import douglasmatosdev.college.withoutFactory.cliente.RegistrarClienteDecoder;
import douglasmatosdev.college.withoutFactory.conta.MsgRegistrarConta;
import douglasmatosdev.college.withoutFactory.conta.RegistrarContaDecoder;
import douglasmatosdev.college.factory.DecoderFactory;

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
