import { Component, OnInit } from '@angular/core';
import { Produto } from '../produto';
import { ProdutoService } from '../produto.service';

@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  styleUrls: ['./produto.component.css']
})
export class ProdutoComponent implements OnInit {
  produtos: Array<Produto> = []

  constructor(private servProd: ProdutoService) { }

  ngOnInit(): void {
    this.produtos = this.servProd.obterTodos()
  }

}
