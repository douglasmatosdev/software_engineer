import { Injectable } from '@angular/core';
import { Tarefa } from './tarefa';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TarefaService {
  private tarefas: Array<Tarefa> = [];
  private canalTarefas = new Subject<Array<Tarefa>>();
  private canalMensagens  = new Subject<string>();

  constructor() { }

  assinarTarefas(observer: any): void{
    this.canalTarefas.subscribe(observer);
  }
  assinarMsgs(observer: any): void{
    this.canalMensagens.subscribe(observer);
  }
  adicionar(tarefa: Tarefa): void{
    this.tarefas.push(tarefa);
    this.canalMensagens.next("Adicionado: "+tarefa.titulo);
    this.canalTarefas.next(this.tarefas);
  }
  alternar = (posicao: number) => {
    this.tarefas[posicao].completa = !this.tarefas[posicao].completa;
    this.canalMensagens.next("Alterado: "+this.tarefas[posicao].titulo);
    this.canalTarefas.next(this.tarefas);
  }
}
