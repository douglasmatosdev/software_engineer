package douglasmatosdev.college.factory;

import douglasmatosdev.college.withoutFactory.cliente.RegistrarClienteDecoder;
import douglasmatosdev.college.withoutFactory.cliente.RegistrarClienteTextFixoDecoder;
import douglasmatosdev.college.withoutFactory.conta.RegistrarContaDecoder;
import douglasmatosdev.college.withoutFactory.conta.RegistrarContaTextFixoDecoder;

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
