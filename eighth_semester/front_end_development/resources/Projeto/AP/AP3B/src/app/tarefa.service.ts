import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, of, tap } from 'rxjs';
import { Tarefa } from './tarefa';

@Injectable({
  providedIn: 'root'
})
export class TarefaService {
  private tarefasUrl = "api/tarefas";
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
        tap((novo: Tarefa) => 
             console.log(`Adicionado id=${novo.id}`)),
        catchError(this.handleError<Tarefa>('adicionar'))
      );
  }
  remover(id: number): Observable<Tarefa>{
    const url = `${this.tarefasUrl}/${id}`;
    return this.http.delete<Tarefa>(url, this.httpOptions).pipe(
        tap(_ => console.log(`Removido id=${id}`)),
        catchError(this.handleError<Tarefa>('remover'))
      );
  }
  alterar(tarefa: Tarefa): Observable<Tarefa>{
    return this.http.put<Tarefa>(this.tarefasUrl, tarefa, 
                                 this.httpOptions).pipe(
        tap(_ => console.log(`Alterado id=${tarefa.id}`)),
        catchError(this.handleError<Tarefa>('alterar'))
    );
  }
  obter(id: number): Observable<Tarefa>{
    const url = `${this.tarefasUrl}/${id}`;
    return this.http.get<Tarefa>(url).pipe(
        tap(_ => console.log(`Obtido id=${id}`)),
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
