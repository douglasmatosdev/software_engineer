# Notação Grande-O (Big O)

Existem várias formas de análise assintótica, a mais conhecida e 
utilizada é a notação `Grande-O`, `O`. Representa o custo 
(seja de tempo ou de espaço) do algoritmo no pior caso possível para
todas as entradas de tamanho `n`. Ou seja, ea analisa o limite superior de entrada.
Desse modo, podemos dizer que o comportamento do nosso algoritmo
não pode nunca ultrapassar um certo limite.

### Exemplo: `Ordenação usando selection sort`

Dado um array `V` de tamanho `n`, procurar o menor valor (posição `me`) 
e colocar na primeira posição.
Repetir processo para a segunda posição, depois para a terceira etc.
Parar quando o array estiver ordenado.


- Temos dois comandos de laço
- Laço externo: executando "n" vezes
- Laço interno: número de execuções depende
- do valor do índice do laço externo (n-1, n-2, n-3, ..., 2, 1)
```java
void selectionSort(int *V, int n) {
    int i, j, me, troca;
    for (i = 0; i < n - 1; i++) {
        me = i;
        for (j = i + 1; j < n; j++) {
            if (V[j] < V[me]) {
                me = j;
            }
        }
        if (i != me) {
            troca = V[i];
            V[i] = V[me];
            V[me] = troca;
        }
    }
}
```
Para calcularmos o custo do `selection sort` temos que calcular
o resultado da soma `1 + 2 + ... + (n-1) + n`
Essa some representa o número das execuções do laço interno,
algo que não é tão simples de se calcular.

Dependendo do algoritmo, calcular o seu custo exato pode ser uma tarefa muito complicada. 

No nosso caso, a soma `1 + 2 + ... + (n-1) + n` equivale a soma dos `n` termos de uma `progressão aritimética` de razão `1`.

`1 + 2 + ... + (n-1) + n    => (n(1 + n))/2`

Sabemos agora queo número de execuções do laço interno é `(n(1 + n))/2`
Uma alternativa mais simples seria estimar um `limite superior`
Assim, saberemos que o algoritmo original é no máximo tão
ruim, ou talvez melhor que o novo algoritmo.

Podemos diminuir a eficiência so `selection sort` trocando o laço 
interno (que muda de tamanho a cada execução do laço externo) por
um laço que seja executado sempre `n vezes`.

Isso significa a análise do custo do algoritmo e também piora o
seu desempenho já que algumas execuções do laço interno serão inúteis.

Agora temos dosi comandas de laço aninhados sendo executados `n` vezes cada.
A função de custo passa a ser `f(n) = n²`. Utilizando a notação "grande-O",
podemos dizer que o custo do algoritmo no pior caso é O(n2)

A notação O(n²) nos diz que o custo do algoritmo não é, assintóticamente,
pior do que n². Em outras palavras, o custo do algoritmo original é no 
máximo tão ruim quanto n². Pode ser melhor, mas nunca pior.

Assim, com a notação `grande-O` podemos estabelecer o `limite superior`
para a complexidade real de um algoritmo. Isso significa que o nosso programa
nunca vai ser mais lento do que um determinado limite. 




















