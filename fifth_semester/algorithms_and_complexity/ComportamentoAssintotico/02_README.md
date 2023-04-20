# Análise matemática

### Contando instruções de um algoritmo

[VIDEO AULA](https://www.youtube.com/watch?v=wflNJurvTTQ&list=PL8iN9FQ7_jt6buW7SBD3yzjIp8NnJYrZl&index=2)

Este algoritmo procura o maior valor presente em um array "A"
contendo "n" elementos e o armazena na variável "M".

```
/*1*/ int M = A[0];
/*2*/ for(i = 0; i < n; i++) {
/*3*/     if (A[i] >= M) {
/*4*/         M = A[i];
/*5*/     }
/*6*/ }
```
[Código de exemplo](./src/main/java/com/douglasmatosdev/Example1.java)

