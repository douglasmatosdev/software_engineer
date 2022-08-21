package entities;

import exceptions.ErroValidacaoCNPJ;

public class Pessoa {
    private String razao_social;
    private String data_inscricao;
    private String CNPJ;
    private String endereco;
    private String nacionalidade;
    private String sede;

    public Pessoa(String razao_social, String data_inscricao, String CNPJ, String endereco, String nacionalidade, String sede) {
        this.razao_social = razao_social;
        this.data_inscricao = data_inscricao;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.sede = sede;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getData_inscricao() {
        return data_inscricao;
    }

    public void setData_inscricao(String data_inscricao) {
        this.data_inscricao = data_inscricao;
    }

    public String getCNPJ() {
        return data_inscricao;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public boolean atualizarID(String CNPJ) throws ErroValidacaoCNPJ {
        if (CNPJ != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return getRazao_social() + ", " + getCNPJ() + ", " + getEndereco() + ", " + getData_inscricao() + ", " + getSede() + ", " + getNacionalidade();
    }
}
