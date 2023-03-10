package douglasmatosdev.college.factory;

import douglasmatosdev.college.withoutFactory.cliente.RegistrarClienteDecoder;
import douglasmatosdev.college.withoutFactory.cliente.RegistrarClienteXMLDecoder;
import douglasmatosdev.college.withoutFactory.conta.RegistrarContaDecoder;
import douglasmatosdev.college.withoutFactory.conta.RegistrarContaXMLDecoder;

public class XMLDecoderFactory extends DecoderFactory {
    public RegistrarClienteDecoder createRegistrarClienteDecoder() {
        return new RegistrarClienteXMLDecoder();
    }

    public RegistrarContaDecoder createRegistrarContaDecoder() {
        return new RegistrarContaXMLDecoder();
    }
}
