export class Produto {
    id: number;
    codigo: string;
    nome: string;
    quantidade: number;
    constructor(id: number = 0, codigo: string = "",
         nome: string = "", quantidade: number = 0){
      this.id = id;
      this.codigo = codigo;
      this.nome = nome;
      this.quantidade = quantidade;
    }
}
