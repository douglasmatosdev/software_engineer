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
  enviando: boolean = false;

  constructor(private gestor: TarefaService) { }

  ngOnInit(): void {
  }

  incluir = () => {
    this.enviando = true;
    this.gestor.adicionar(this.tarefa).subscribe(
      _ => {
        this.tarefa = new Tarefa();
        this.enviando = false;
      } 
    );
  }

}
