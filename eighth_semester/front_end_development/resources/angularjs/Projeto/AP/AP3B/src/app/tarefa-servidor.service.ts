import { Injectable } from '@angular/core';
import { InMemoryDbService } from  'angular-in-memory-web-api';
import { Tarefa } from './tarefa';

@Injectable({
  providedIn: 'root'
})
export class TarefaServidorService implements InMemoryDbService{
  createDb(){
    const tarefas = [
      {id: 1, titulo: "Modelagem",  
       descricao: "Especificar a modelagem UML do sistema",
       completa: false},
      {id: 2, titulo: "Entrevista", 
       descricao: "Entrevista com usuário do setor",
       completa: false},
      {id: 3, titulo: "Testes",     
       descricao: "Efetuar testes do protótipo",
       completa: false},
    ];
    return {tarefas};
  }
  genId(tarefas: Tarefa[]): number {
    console.log("Atual:"+tarefas.length);
    return tarefas.length > 0 ? 
           Math.max(...tarefas.map(t => t.id)) + 1 : 1;
  }
}
