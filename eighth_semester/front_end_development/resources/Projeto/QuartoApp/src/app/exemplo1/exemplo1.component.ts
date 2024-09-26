import { Component, OnInit } from '@angular/core';
import { Pessoa } from '../pessoa';
import { PessoaService } from '../pessoa.service';

@Component({
  selector: 'app-exemplo1',
  templateUrl: './exemplo1.component.html',
  styleUrls: ['./exemplo1.component.css']
})
export class Exemplo1Component implements OnInit {

  novaPessoa: Pessoa = new Pessoa();
  servPessoa: PessoaService;

  constructor(servPessoa: PessoaService){
    this.servPessoa = servPessoa;
  }

  adicionar():void{
    const aux = new Pessoa(this.novaPessoa.nome,
      this.novaPessoa.cpf,this.novaPessoa.idade);
    this.servPessoa.adicionar(aux);
  }

  ngOnInit(): void {
  }

}
