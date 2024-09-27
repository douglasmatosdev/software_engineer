import { Component, OnInit } from '@angular/core';
import { TarefaService } from '../tarefa.service';

@Component({
  selector: 'app-tarefa-panel',
  templateUrl: './tarefa-panel.component.html',
  styleUrls: ['./tarefa-panel.component.css']
})
export class TarefaPanelComponent implements OnInit {
  mensagem: string = "Nenhum movimento efetuado...";

  constructor(private gestor: TarefaService) { }

  ngOnInit(): void {
    this.gestor.assinarMsgs((msg: string)=>{this.mensagem=msg});
  }

}
