package douglasmatosdev.college.factory;

import douglasmatosdev.college.withoutFactory.cliente.RegistrarClienteCSVDecoder;
import douglasmatosdev.college.withoutFactory.cliente.RegistrarClienteDecoder;
import douglasmatosdev.college.withoutFactory.conta.RegistrarContaCSVDecoder;
import douglasmatosdev.college.withoutFactory.conta.RegistrarContaDecoder;

public class CSVDecoderFactory extends DecoderFactory {
    public RegistrarClienteDecoder createRegistrarClienteDecoder() {
        return new RegistrarClienteCSVDecoder();
    }

    public RegistrarContaDecoder createRegistrarContaDecoder() {
        return new RegistrarContaCSVDecoder();
    }
}
