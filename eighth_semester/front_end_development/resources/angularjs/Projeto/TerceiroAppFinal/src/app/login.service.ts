import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { catchError, concat, from, map, Observable, of, tap } from 'rxjs';
import { Usuario } from './usuario';

@Injectable({
  providedIn: 'root'
})
export class LoginService implements CanActivate{

  private usersUrl = "http://localhost:3000/users";
  private http: HttpClient; 
  
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  router: Router;
  isAuthenticated: boolean = false;
  usuarioLogado: Usuario = new Usuario();

  constructor(router: Router, http: HttpClient) {
     this.router = router;
     this.http = http;
  }

  // Retorno, mesmo que vazio, impede que o app trave
  private handleError<T>(operation:string = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(operation+" :: "+error); 
      return of(result as T);
    };
  }
  
  private findUser(login: string, senha: string): Observable<Usuario>{
    return this.http.post<Usuario>(`${this.usersUrl}/login`, {login,senha}, this.httpOptions)
           .pipe(
                tap((doc: any) => {
                    console.log("Retorno do servidor:"+ JSON.stringify(doc));
                }),
                catchError(this.handleError<Usuario>('login'))
    );
  }

  canActivate(route: ActivatedRouteSnapshot, 
              state: RouterStateSnapshot): 
        boolean | UrlTree | Observable<boolean | UrlTree> | 
        Promise<boolean | UrlTree> {
    if(!this.isAuthenticated)
       return this.router.parseUrl("/login");
    else
       return true;
  }

  signin(login: string, senha:string): Observable<boolean> {
    return this.findUser(login,senha).pipe(
      map((usuario)=>{
        if(usuario.login!=undefined){
          this.usuarioLogado = usuario;
          this.isAuthenticated = true;
          return true;
        }
        else
          return false;
      }),
      catchError(this.handleError<boolean>('login',false))
    );
  }

  signout(){
    this.usuarioLogado = new Usuario();
    this.isAuthenticated = false;
  }

  addUser(usuario: Usuario): Observable<any>{
    return this.http.post<Usuario>(this.usersUrl,
                          JSON.stringify(usuario), this.httpOptions)
    .pipe(
         tap((doc: any) => {
             console.log("Identificador gerado:"+ doc.insertedId);
         }),
         catchError(this.handleError<Usuario>('login'))
    );    
  }

}
