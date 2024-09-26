import { Injectable } from '@angular/core';
import { Tarefa } from './tarefa';

@Injectable({
  providedIn: 'root'
})
export class TarefaService {
  private tarefas = new Array<Tarefa>();

  constructor() { }

  inserir = (titulo: string, descricao: string) => {
    let t = new Tarefa();
    t.titulo = titulo;
    t.descricao = descricao;
    this.tarefas.push(t);
  }

  alternar = (posicao: number) => {
    this.tarefas[posicao].completa = !this.tarefas[posicao].completa;
  }
  
  obter = (): Array<Tarefa> => this.tarefas;
}
