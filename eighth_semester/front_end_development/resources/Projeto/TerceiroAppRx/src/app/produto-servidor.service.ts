import { Injectable } from '@angular/core';
import { InMemoryDbService } from 'angular-in-memory-web-api';
import { Produto } from './produto';


@Injectable({
  providedIn: 'root'
})
export class ProdutoServidorService implements InMemoryDbService{
  createDb(){
    const produtos = [
      {id: 1, codigo: "A001", nome:"Banana", quantidade: 1000},
      {id: 2, codigo: "A002", nome:"Manga",  quantidade: 500 },
      {id: 3, codigo: "B001", nome:"Caneta", quantidade: 100 },
      {id: 4, codigo: "B002", nome:"Papel",  quantidade: 1200},
    ];
    return {produtos};
  }
  genId(produtos: Produto[]): number {
    return produtos.length > 0 ? Math.max(...produtos.map(p => p.id)) + 1 : 1;
  }
}
