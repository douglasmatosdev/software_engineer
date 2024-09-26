import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Produto } from '../produto';
import { ProdutoService } from '../produto.service';

@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  styleUrls: ['./produto.component.css']
})
export class ProdutoComponent implements OnInit {

  router: Router;
  servProd: ProdutoService;
  produtos: Array<Produto> = [];

  constructor(router: Router, servProd: ProdutoService) {
      this.router = router;
      this.servProd = servProd;
   }

  incluir():void{
    console.log("Abre Tela de Novo Produto");
    this.router.navigateByUrl("/novoprod");
  }

  excluir(codigo: string):void{
    this.servProd.remover(codigo);
    this.router.navigateByUrl("/produto");
  }

  ngOnInit(): void {
    this.produtos = this.servProd.obterTodos();
    for(let prod of this.produtos)
      console.log(prod.nome);
  }

}
