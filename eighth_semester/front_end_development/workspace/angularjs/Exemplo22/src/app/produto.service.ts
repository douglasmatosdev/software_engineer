import { Injectable } from '@angular/core';
import { Produto } from './produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {
  private produtos: Array<Produto> = [
    { codigo: "1", nome: "Banana", quantidade: 1000 },
    { codigo: "2", nome: "Laranja", quantidade: 500 },
    { codigo: "3", nome: "Manga", quantidade: 800 },
  ]

  obterTodos = (): Array<Produto> => this.produtos
}
