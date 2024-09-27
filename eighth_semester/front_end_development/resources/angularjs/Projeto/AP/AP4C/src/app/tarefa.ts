export class Tarefa {
   _id: string;
   titulo: string;
   descricao: string;
   completa: boolean;
   constructor(_id: string = "", titulo: string = "", 
               descricao: string = "", completa: boolean = false) {
      this._id = _id;
      this.titulo = titulo;
      this.descricao = descricao;
      this.completa = completa;
   }
}

