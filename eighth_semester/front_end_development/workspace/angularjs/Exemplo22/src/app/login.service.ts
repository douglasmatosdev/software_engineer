import { inject, Injectable } from '@angular/core';
import { CanActivateFn, Router, UrlTree } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  isAuthenticated: boolean = false

  constructor(private router: Router) { }

  canActivate = (): boolean => this.isAuthenticated

  loginRoute = (): UrlTree => this.router.parseUrl('/login')

  singout = (): void => {
    this.isAuthenticated = false
  }
  singin = (login: string, senha: string): boolean => {
    if ((login == 'admin') && (senha == '1234')) {
      this.isAuthenticated = true;
      return true;
    } else {
      return false;
    }
  }
}

export const authGuard = (): CanActivateFn => () => {
  const loginService = inject(LoginService)
  if (!loginService.canActivate()) {
    return loginService.loginRoute()
  }
  return true
}
