import { Component, OnInit } from '@angular/core';

import { Observable, from, interval, Subject, map, observeOn, asyncScheduler } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  observable = interval(1000)
               .pipe(map((x:number)=>x*x))
               .pipe(observeOn(asyncScheduler));
  subject = new Subject<number>();

  constructor() { }

  ngOnInit(): void {
    /*const observer = {
      next: (x:any) => console.log(`Recebido o valor ${x}`),
      error: (err:any) => console.log(`Erro: ${err}`),
      complete: () => console.log("Terminou")
    }
    this.observable.subscribe(observer)
    */
    const subscription = this.observable.subscribe(
      (x)=>console.log(`Valor direto: ${x}`));
    setTimeout(()=>{subscription.unsubscribe()},10000);
    /*
    this.subject.subscribe((x)=>console.log(`Observador A: ${x}`));
    this.subject.subscribe((x)=>console.log(`Observador B: ${x}`));

    this.subject.next(15);
    this.subject.next(25);
    */
  }

}
