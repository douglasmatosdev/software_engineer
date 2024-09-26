import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Primeiro App';
  dados = [
    {
      nome: 'Ana Clara',
      email: 'ana.clara@gmail.com'
    },
    {
      nome: 'Beto Luiz',
      email: 'beto.luiz@gmail.com'
    }
  ]
}