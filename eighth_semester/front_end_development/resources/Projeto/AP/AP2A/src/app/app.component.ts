import { Component } from '@angular/core';
import { Tarefa } from './tarefa';
import { TarefaService } from './tarefa.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AP2A';
  tarefa = new Tarefa();
  tarefas = new Array<Tarefa>();

  constructor(private gestor: TarefaService) { }

  incluir = () => {
    this.gestor.inserir(this.tarefa.titulo, this.tarefa.descricao);
    this.tarefa = new Tarefa();
    this.tarefas = this.gestor.obter();
  }

  alternar = (posicao: number) => {
    console.log(posicao);
    this.gestor.alternar(posicao);
    this.tarefas = this.gestor.obter();
  }

}
