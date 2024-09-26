import { Injectable } from '@angular/core';
import { Produto } from './produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  private produtos: Array<Produto>

  constructor() {
      this.produtos = new Array<Produto>();
   }


   private getPos(codigo: string): number{
      for(let i=0; i<this.produtos.length; i++)
        if(codigo==this.produtos[i].codigo)
          return i;
      return -1;
   }

   adicionar(produto: Produto): void{
      this.produtos.push(produto);
   }

   remover(codigo: string): void{
     let pos = this.getPos(codigo);
     if(pos>-1)
        this.produtos.splice(pos,1);
   }

   obterTodos = ():Array<Produto> => this.produtos;


}
