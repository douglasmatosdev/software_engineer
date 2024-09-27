import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-exemplo2',
  templateUrl: './exemplo2.component.html',
  styleUrls: ['./exemplo2.component.css']
})
export class Exemplo2Component implements OnInit {
  cores: Array<Array<number>> = [];
  ngOnInit(): void {
    for (let i = 0; i < 20; i++) {
      this.cores.push([])
      for (let j = 0; j < 20; j++) {
        this.cores[i].push(Math.round(Math.random() * 0xFFFFFF));
      }
    }
  }

}
