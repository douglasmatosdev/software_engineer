import { Component, OnInit } from '@angular/core';
import { Pessoa } from '../pessoa';
import { PessoaService } from '../pessoa.service';

@Component({
  selector: 'app-tab-pessoa',
  templateUrl: './tab-pessoa.component.html',
  styleUrls: ['./tab-pessoa.component.css']
})
export class TabPessoaComponent implements OnInit {

  pessoas: Array<Pessoa> = [];
  servPessoa: PessoaService;

  constructor(servPessoa: PessoaService) { this.servPessoa = servPessoa; }

  ngOnInit(): void {
    this.servPessoa.assinarFull((pessoas: Array<Pessoa>)=>{
      console.log("Array da tabela atualizado");
      this.pessoas = pessoas;
    });
  }

}
