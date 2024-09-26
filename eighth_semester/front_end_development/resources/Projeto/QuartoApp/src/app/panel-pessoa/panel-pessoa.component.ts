import { Component, OnInit } from '@angular/core';
import { Pessoa } from '../pessoa';
import { PessoaService } from '../pessoa.service';

@Component({
  selector: 'app-panel-pessoa',
  templateUrl: './panel-pessoa.component.html',
  styleUrls: ['./panel-pessoa.component.css']
})
export class PanelPessoaComponent implements OnInit {

  pessoa: Pessoa = new Pessoa();
  servPessoa: PessoaService;

  constructor(servPessoa: PessoaService) {
    this.servPessoa = servPessoa;
   }

  ngOnInit(): void {
    this.servPessoa.assinarAdd((pessoa:Pessoa)=>this.pessoa=pessoa);
  }

}
