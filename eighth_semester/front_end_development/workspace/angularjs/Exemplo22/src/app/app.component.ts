import { Component } from '@angular/core';
import { LoginService } from './login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private loginSerivce: LoginService, private router: Router) { }
  isLogado = (): boolean => this.loginSerivce.isAuthenticated
  logout = (): void => {
    this.loginSerivce.singout()
    this.router.navigateByUrl('/home')
  }

}
