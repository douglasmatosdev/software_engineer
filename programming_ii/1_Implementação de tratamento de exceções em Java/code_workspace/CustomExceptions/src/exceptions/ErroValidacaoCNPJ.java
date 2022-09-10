package exceptions;

public class ErroValidacaoCNPJ extends Throwable {
    private String msg_erro;

    public ErroValidacaoCNPJ(String msg_erro) {
        this.msg_erro = msg_erro;
    }

    @Override
    public String toString() {
        return "ErroValidacaoCNPJ: " + msg_erro;
    }
}
