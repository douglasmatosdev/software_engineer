export class Produto {
  _id: string;
  codigo: string;
  nome: string;
  quantidade: number;
  constructor(_id: string="", codigo: string="",
              nome: string="", quantidade: number=0) {
    this._id = _id;
    this.codigo = codigo;
    this.nome = nome;
    this.quantidade = quantidade;
  }
}
