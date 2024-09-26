export class Tarefa {
   id: any;
   titulo: string;
   descricao: string;
   completa: boolean;
   constructor(id: any = null, titulo: string = "", 
               descricao: string = "", completa: boolean = false) {
      this.id = id;
      this.titulo = titulo;
      this.descricao = descricao;
      this.completa = completa;
   }
}

