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
    this.gestor.assinarTarefas((lst: Array<Tarefa>)=>this.tarefas=lst);
  }

  alternar = (posicao: number) => {
    this.gestor.alternar(posicao);
  }

}
