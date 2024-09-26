import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-tela-cidade',
  templateUrl: './tela-cidade.component.html',
  styleUrls: ['./tela-cidade.component.css']
})
export class TelaCidadeComponent implements OnInit {

  cidade = "";
  imagem = "";

  private nomes = ["Rio de Janeiro","New York","Paris"];
  private figuras = ["rio.png","newyork.png","paris.png"]; 

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      let id = params.get("id");
      const i = (id==null)?0:eval(id);
      this.cidade = this.nomes[i];
      this.imagem = this.figuras[i];
    });
  }

}
