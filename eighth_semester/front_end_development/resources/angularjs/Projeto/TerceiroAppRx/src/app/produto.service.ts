import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, of, tap } from 'rxjs';
import { Produto } from './produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  private produtosUrl = "api/produtos";
  private http: HttpClient; 
  
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(http: HttpClient) {
     this.http = http;
  }

  // Retorno, mesmo que vazio, impede que o app trave
  private handleError<T>(operation:string = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(operation+" :: "+error); 
      return of(result as T);
    };
  }

  adicionar(produto: Produto): Observable<Produto>{
      return this.http.post<Produto>(this.produtosUrl, produto, this.httpOptions)
             .pipe(
                  tap((novo: Produto) => console.log(`Adicionado id=${novo.id}`)),
                  catchError(this.handleError<Produto>('adicionar'))
       );
   }

   remover(id: number): Observable<Produto>{
      const url = `${this.produtosUrl}/${id}`;
      return this.http.delete<Produto>(url, this.httpOptions).pipe(
        tap(_ => console.log(`Removido id=${id}`)),
        catchError(this.handleError<Produto>('remover'))
      );
   }

   obterTodos():Observable<Produto[]> {
      return this.http.get<Produto[]>(this.produtosUrl)
        .pipe(
          tap(_ => console.log('Produtos recuperados')),
          catchError(this.handleError<Produto[]>('getHeroes', []))
        );
    }

}
