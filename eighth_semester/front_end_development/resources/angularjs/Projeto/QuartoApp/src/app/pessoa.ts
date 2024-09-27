export class Pessoa {
    nome:string;
    cpf:string;
    idade:number;
    constructor(nome:string="", cpf:string="",idade:number=0){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
}
