import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, of, tap } from 'rxjs';
import { Tarefa } from './tarefa';

@Injectable({
  providedIn: 'root'
})
export class TarefaService {
  private tarefasUrl = "http://localhost:3000/tarefa";
  private http: HttpClient; 
  httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  };
  constructor(http: HttpClient) { this.http = http; }
  private handleError<T>(operation:string = 'operation', result?: T){
    return (error: any): Observable<T> => {
      console.error(operation+" :: "+error); 
      return of(result as T);
    };
  }
  adicionar(tarefa: Tarefa): Observable<Tarefa>{
    return this.http.post<Tarefa>(this.tarefasUrl, tarefa, 
                                   this.httpOptions).pipe(
        tap((novo: any) => 
             console.log(`Adicionado id=${novo.insertedId}`)),
        catchError(this.handleError<Tarefa>('adicionar'))
      );
  }
  remover(_id: string): Observable<Tarefa>{
    const url = `${this.tarefasUrl}/${_id}`;
    return this.http.delete<Tarefa>(url, this.httpOptions).pipe(
        tap(_ => console.log(`Removido id=${_id}`)),
        catchError(this.handleError<Tarefa>('remover'))
      );
  }
  alterar(tarefa: Tarefa): Observable<Tarefa>{
    return this.http.put<Tarefa>(this.tarefasUrl, tarefa, 
                                 this.httpOptions).pipe(
        tap(_ => console.log(`Alterado id=${tarefa._id}`)),
        catchError(this.handleError<Tarefa>('alterar'))
    );
  }
  obter(_id: string): Observable<Tarefa>{
    const url = `${this.tarefasUrl}/${_id}`;
    return this.http.get<Tarefa>(url).pipe(
        tap(_ => console.log(`Obtido id=${_id}`)),
        catchError(this.handleError<Tarefa>('obter'))
      );
  }
  obterTodos():Observable<Tarefa[]> {
    return this.http.get<Tarefa[]>(this.tarefasUrl).pipe(
        tap(_ => console.log('Produtos recuperados')),
        catchError(this.handleError<Tarefa[]>('obterTodos', []))
      );
  }

}
