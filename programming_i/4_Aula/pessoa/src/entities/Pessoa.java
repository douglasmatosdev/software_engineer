package entities;

public class Pessoa {

    String nome, identidade;

    int idade;

    public Pessoa(String nome, String identidade, int idade) {

        setNome(nome);

        setIdentidade(identidade);

        setIdade(idade);

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String no) {

        if (!no.isEmpty()) {

            nome = no;

        }

    }

    public String getIdentidade() {

        return identidade;

    }

    public void setIdentidade(String id) {

        if (!id.isEmpty()) {

            identidade = id;

        }

    }

    public int getIdade() {

        return idade;

    }

    public void setIdade(int id) {

        if (id > 0) {

            idade = id;

        }

    }

    public void imprimir() {

        System.out.println("Pessoa:");

        System.out.println("Nome = " + nome);

        System.out.println("Identidade = " + identidade);

        System.out.println("Idade = " + idade);

    }

}