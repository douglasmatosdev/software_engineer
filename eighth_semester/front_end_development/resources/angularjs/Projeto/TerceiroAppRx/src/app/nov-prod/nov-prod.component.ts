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
  enviando: boolean = false;

  constructor(router: Router, servProd: ProdutoService) {
      this.router = router;
      this.servProd = servProd;
  }

  incluir():void{
    this.enviando = true;
    console.log("Incluir Produto");
    //this.produto.id = 0x62dfdc8ca0cc073daa10e813n;
    this.servProd.adicionar(this.produto)
        .subscribe(_=> {
          this.enviando = false;
          this.router.navigateByUrl("/produto")
        });
  }

  ngOnInit(): void {
  }

}
