import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  login: string = ''
  senha: string = ''

  constructor(private loginService: LoginService, private router: Router) { }

  signin(): void {
    if (this.loginService.singin(this.login, this.senha)) {
      this.router.navigateByUrl('/produto')
    } else {
      this.login = ''
      this.senha = ''
    }
  }

  ngOnInit(): void {
  }

}
