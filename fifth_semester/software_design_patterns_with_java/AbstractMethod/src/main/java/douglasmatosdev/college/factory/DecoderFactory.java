package douglasmatosdev.college.factory;

import douglasmatosdev.college.withoutFactory.cliente.RegistrarClienteDecoder;
import douglasmatosdev.college.withoutFactory.conta.RegistrarContaDecoder;

public abstract class DecoderFactory {
    public abstract RegistrarClienteDecoder createRegistrarClienteDecoder();

    public abstract RegistrarContaDecoder createRegistrarContaDecoder();

    public static DecoderFactory fabricaParaOrigem(String origem) {
        DecoderFactory decoderFactory = null;
        if ("X".equals(origem)) {
            decoderFactory = new XMLDecoderFactory();
        } else if ("Y".equals(origem)) {
            decoderFactory = new CSVDecoderFactory();
        } else if ("Z".equals(origem)) {
            decoderFactory = new TextoFixoDecoderFactory();
        }

        return decoderFactory;
    }
}

