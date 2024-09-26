import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  router: Router;
  servLogin: LoginService;
  login: string = "";
  senha: string = "";
  mensagem: string = "";

  signin(): void{
    if(this.servLogin.signin(this.login,this.senha))
       this.router.navigateByUrl("/produto");
    else{
       this.mensagem = "Login ou senha inválido(s).";
       this.login = "";
       this.senha = "";
       this.router.navigateByUrl("/login");
    }
  }

  constructor(router: Router, servLogin: LoginService) {
    this.router = router;
    this.servLogin = servLogin;
  }

  ngOnInit(): void {
  }

}
