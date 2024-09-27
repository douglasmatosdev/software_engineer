import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { CadastroUsuComponent } from '../cadastro-usu/cadastro-usu.component';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  router: Router;
  servLogin: LoginService;
  dialogo: MatDialog;
  login: string = "";
  senha: string = "";
  mensagem: string = "";
  enviando: boolean = false;

  signin(): void{
    this.enviando = true;
    this.servLogin.signin(this.login,this.senha)
        .subscribe(resultado=>{
          this.enviando = false;
          if(resultado){
            this.router.navigateByUrl("/produto");     
          }
          else {
            this.mensagem = "Login ou senha inválido(s).";
            this.login = "";
            this.senha = "";
            this.router.navigateByUrl("/login");
          }
        });
  }

  showCadUsu(): void{
    const dialogRef = this.dialogo.open(CadastroUsuComponent);

    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
    });
  }

  constructor(router: Router, servLogin: LoginService,
              dialogo: MatDialog) {
    this.router = router;
    this.servLogin = servLogin;
    this.dialogo = dialogo;
  }

  ngOnInit(): void {
  }

}
