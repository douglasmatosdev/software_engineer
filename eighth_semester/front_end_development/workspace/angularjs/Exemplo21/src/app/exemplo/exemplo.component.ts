import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-exemplo',
  templateUrl: './exemplo.component.html',
  styleUrls: ['./exemplo.component.css']
})
export class ExemploComponent implements OnInit {
  @Input() empresa: string = '';
  ano: number = 0;

  ngOnInit(): void {
    let d: Date = new Date();
    this.ano = d.getFullYear();
  }

}
