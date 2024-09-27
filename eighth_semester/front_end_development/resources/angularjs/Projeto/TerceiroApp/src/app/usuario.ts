export class Usuario {
    public login: string;
    public senha: string;
    public nome:  string;
    public email: string;
    constructor(login: string = "", senha: string = "",
                nome: string = "", email: string=""){
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
    }
}
