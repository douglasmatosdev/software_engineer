import { Component, OnInit } from '@angular/core';
import { Pessoa } from '../pessoa';
import { PessoaService } from '../pessoa.service';

@Component({
  selector: 'app-list-pessoa',
  templateUrl: './list-pessoa.component.html',
  styleUrls: ['./list-pessoa.component.css']
})
export class ListPessoaComponent implements OnInit {

  pessoas: Array<Pessoa> = [];
  servPessoa: PessoaService;

  constructor(servPessoa: PessoaService) { this.servPessoa = servPessoa; }

  ngOnInit(): void {
    this.servPessoa.assinarFull((pessoas: Array<Pessoa>)=>{
      console.log("Array da lista atualizado");
      this.pessoas = pessoas;
    });
  }

}
