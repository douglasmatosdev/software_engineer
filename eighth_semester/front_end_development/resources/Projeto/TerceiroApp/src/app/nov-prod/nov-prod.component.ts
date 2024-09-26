import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Produto } from '../produto';
import { ProdutoService } from '../produto.service';

@Component({
  selector: 'app-nov-prod',
  templateUrl: './nov-prod.component.html',
  styleUrls: ['./nov-prod.component.css']
})
export class NovProdComponent implements OnInit {

  router: Router;
  servProd: ProdutoService;
  produto: Produto = new Produto();

  constructor(router: Router, servProd: ProdutoService) {
      this.router = router;
      this.servProd = servProd;
  }

  incluir():void{
    console.log("Incluir Produto");
    this.servProd.adicionar(this.produto);
    this.router.navigateByUrl("/produto")
  }

  ngOnInit(): void {
  }

}
