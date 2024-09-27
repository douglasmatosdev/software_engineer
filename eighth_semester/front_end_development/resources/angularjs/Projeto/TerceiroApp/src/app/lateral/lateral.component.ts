import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-lateral',
  templateUrl: './lateral.component.html',
  styleUrls: ['./lateral.component.css']
})
export class LateralComponent implements OnInit {

  @Input() pagina: string = "Indefinida"
  acesso: string = ""

  constructor() { }

  addZero = (x: number) => (x>9) ? `${x}`:`0${x}`; 

  formataData(d: Date): string {
    var dataStr = "";
    dataStr += this.addZero(d.getDate())+"/"+
               this.addZero(d.getMonth()+1)+"/"+
               d.getFullYear()+" "+
               this.addZero(d.getHours())+":"+
               this.addZero(d.getMinutes())+":"+
               this.addZero(d.getSeconds());
    return dataStr;
  }

  ngOnInit(): void {
    let d: Date = new Date();
    this.acesso = this.formataData(d);
  }

}
