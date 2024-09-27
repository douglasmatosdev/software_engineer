import { Component, OnInit } from '@angular/core';
import { Tarefa } from '../tarefa';
import { TarefaService } from '../tarefa.service';

@Component({
  selector: 'app-tarefa-table',
  templateUrl: './tarefa-table.component.html',
  styleUrls: ['./tarefa-table.component.css']
})
export class TarefaTableComponent implements OnInit {

  tarefas = new Array<Tarefa>();

  constructor(private gestor: TarefaService) { }

  ngOnInit(): void {
    this.gestor.obterTodos().subscribe((tarefas) => this.tarefas = tarefas); 
  }

  alternar = (id: number) => {
    this.gestor.obter(id).subscribe(
      (tarefa) => {
        tarefa.completa = !tarefa.completa;
        this.gestor.alterar(tarefa).subscribe(
          _ => this.gestor.obterTodos().subscribe(
            (tarefas) => this.tarefas = tarefas
          )
        )
      }
    );
  }

  remover = (id: number) => {
    this.gestor.remover(id).subscribe(
      _ => this.gestor.obterTodos().subscribe(
        (tarefas) => this.tarefas = tarefas
      )
    )
  }

}
