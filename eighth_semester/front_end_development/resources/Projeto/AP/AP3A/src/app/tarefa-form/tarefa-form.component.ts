import { Component, OnInit } from '@angular/core';
import { Tarefa } from '../tarefa';
import { TarefaService } from '../tarefa.service';

@Component({
  selector: 'app-tarefa-form',
  templateUrl: './tarefa-form.component.html',
  styleUrls: ['./tarefa-form.component.css']
})
export class TarefaFormComponent implements OnInit {
  tarefa = new Tarefa();

  constructor(private gestor: TarefaService) { }

  ngOnInit(): void {
  }

  incluir = () => {
    this.gestor.adicionar(this.tarefa);
    this.tarefa = new Tarefa();  
  }

}
