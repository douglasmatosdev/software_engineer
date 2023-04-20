# Análise matemática

### Contando instruções de um algoritmo

[VIDEO AULA](https://www.youtube.com/watch?v=wflNJurvTTQ&list=PL8iN9FQ7_jt6buW7SBD3yzjIp8NnJYrZl&index=2)

Este algoritmo procura o maior valor presente em um array "A"
contendo "n" elementos e o armazena na variável "M".

```java
/*1*/ int M = A[0];
/*2*/ for(i = 0; i < n; i++) {
/*3*/     if (A[i] >= M) {
/*4*/         M = A[i];
/*5*/     }
/*6*/ }
```
[Código de exemplo](./src/main/java/com/douglasmatosdev/Example1.java)


- Vamos contar quantas "instruções simples" ele executa.
- Uma "instrução simples" é uma instrução que pode ser executada diretamente pelo CPU, 
ou algo muito proximos disso.

Tipos de instruções:
 - atribuição de um valor a uma variável
 - acesso ao valor de um determinado elemento do array
 - comparação de dois valores
 - incremento de um valor
 - operações aritméticas básicas, como adição e multiplicação

Vamos assumir que
 - as instruções possuem o mesmo "custo" 
 - "comandos de seleção" possuem  custo zero


### Contando instruções

- O custo da inicialização do laça **for**(linha 2) é de: **2 instruções**
- O comando **for** precisa ser inicializado: **1 instrução(i = 0)**
- Mesmo que o array tenha tamanho zero, ao menos uma comparação será executada (i < n),
que custa mais **1 instrução**

```java
/*1*/ int M = A[0];
/*2*/ for(i = 0; i < n; i++) {
/*3*/     if (A[i] >= M) {
/*4*/         M = A[i];
/*5*/     }
/*6*/ }
```

### Custo dominante ou pior caso do algoritmo
Ignorando os comandos contidos no corpo do laço **for**, teremos que o algoritmo precisa
executar **3 + 2n** instruções:
 - 3 instruções antes de iniciar o laço  **for**;
 - 2 instruções ao final de cada laço **for**, o qual é executado **n** vezes.

Assim considerando um **laço vazio**, podemos definir uma função matemática que representa
o custo do algoritmo em relação ao tamanho do array de entrada: **f(n) = 2n + 3**

### Contando as instruções restantes do **for**
 - Comando **if**. **1 instrução**: acesso ao valor do array e a sua comparação (**A[i] >= M**)
 - Dentro do **if**. **1 instrução**: acessa o valor do array e  o atribui a outra variável
   (**M = A[i]**). Porém, sua execução depende do resultado da comparação feita pelo **if**

### Problema
- As instruções vistas anteriormente eram sempre executadas
- As instruções dentro do **for** podem ou não ser executadas

```java
/*1*/ int M = A[0];
/*2*/ for(i = 0; i < n; i++) {
/*3*/     if (A[i] >= M) {
/*4*/         M = A[i];
/*5*/     }
/*6*/ }
```

### Custo dominante ou pior caso do algoritmo
Antes, bastava saber o tamanho do array, **n**, para definir a função de custo **f(n)**.
Agora temos que considerar também o conteúdo do array.

Exemplo: dois arrays de mesmo tamanho

```
A1 = {1, 2, 3, 4}
A2 = {4, 3, 2, 1}
```

- Array **A1**: mais instruções -> o comando **if** é sempre "verdadeiro"
- Array **A2**: atribuição nunca é executada pois o comando **if** é sempre **falso**

Ao analisarmos um algoritmo, é muito comum consideramos o **pior caso** possível
- **Pior caso**: maior número de instruções executadas

No nosso algoritmo o **pior caso** ocorre quando o array possui valores em ordem crescente.
- O valor de **M** é sempre substituído: maior número de instruções
- O laço **for** sempre executa as 2 instruções

Assim, a função custo do algoritmo será **f(n) = 3 + 2n + 2n** ou **f(n) = 4n + 3**.
Essa função representa o custo do algoritmo em relação ao tamnaho do array (n) de entrada no **pior caso**"