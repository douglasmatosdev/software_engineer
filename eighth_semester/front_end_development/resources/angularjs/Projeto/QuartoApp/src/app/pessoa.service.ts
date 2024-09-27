import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { Pessoa } from './pessoa';

@Injectable({
  providedIn: 'root'
})
export class PessoaService {
 
  private pessoas: Array<Pessoa> = [];
  private canalPessoaAdd  = new Subject<Pessoa>();
  private canalPessoaFull = new Subject<Array<Pessoa>>();

  constructor() { }

  assinarAdd(observer: any): void{
    this.canalPessoaAdd.subscribe(observer);
  }

  assinarFull(observer: any): void{
    this.canalPessoaFull.subscribe(observer);
  }

  adicionar(pessoa: Pessoa): void{
    this.pessoas.push(pessoa);
    this.canalPessoaAdd.next(pessoa);
    this.canalPessoaFull.next(this.pessoas);
  }

  atualizar(): void{
    this.canalPessoaFull.next(this.pessoas);
  }

}
