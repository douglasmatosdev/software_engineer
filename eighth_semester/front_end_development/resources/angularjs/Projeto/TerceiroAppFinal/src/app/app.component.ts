import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from './login.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'TerceiroApp';
  router: Router;
  servLogin: LoginService;

  constructor(router: Router, servLogin: LoginService){
    this.router = router;
    this.servLogin = servLogin;
  }

  signout(): void{
    this.servLogin.signout();
    this.router.navigateByUrl("/home");
  }
}
