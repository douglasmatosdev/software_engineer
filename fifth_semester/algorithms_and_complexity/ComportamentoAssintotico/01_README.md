
# Análise de Algoritmos

### Análise empírica e análise matemática

[VIDEO AULA](https://www.youtube.com/watch?v=iZK5WwJFIPE&list=PL8iN9FQ7_jt6buW7SBD3yzjIp8NnJYrZl&index=1)

Em ciência da computação, é área de pesquisa cujo foco são os algoritmos.
Busca responder a seguinte pergunta: "podemos fazer um algoritmo mais eficiente?"
Podemos resolver um problema de várias maneiras diferentes, insto é, podemos
utilizar algoritmos diferentes para um mesmo problema.

Algoritmos diferentes, mas capazes de resolcer o mesmo problema, não
necessariamente o fazem com a mesma eficiência.

#### Essas diferenças de eficiência podem ser:
- "Irrelevantes" para um pequeno número de elementos processados
- "Crescer proporcionalmente" com o número de elementos processados

Para comparar a eficiência dos algoritmos foi criada uma medida chamada de "complexidade computacional". Basicamente,
ela inidica o "custo" ao se aplicar um algoritmo, sendo "custo = memória + tempo" em que o item.

- "memória": quanto de espaço o algoritmo vai consumir
- "tempo": a diração de sua execução

Para determinar se um algoritmo é omais eficiente, podemos utilizar duas abordagens
- "Análise empírica":comparação entre os programas
- "Análise matemática": estudo das propriedades do algoritmo

### Análise empírica
Avalia o custo (ou complexidade) de um algoritimo a partir da avaliação da execução do mesmo quando implementado.
Ou seja, um algoritmo é analisado pela execução de seu programa correspondente.

> #### Vantagens
> - Avaliar o desempenho de uma determinada configuração de computador/linguagem
> - Considerar custos não aparentes (ex.: o custo da alocação de memória)
> - Comparar computadores
> - Comparar linguagens

> #### Dificuldades
> - Necessidade de implementar o algoritmo. Isso depende da habilidade do programador;
> - Resultado pode ser mascarado pelo hardware (computador utilizado) ou software (eventos ocorridos no momento de avaliação);
> - Qual a natureza dos dados:
    >    - dados reais
>    - aleatórios (avaliam o desempenho médio)
>    - perversos (pior caso)


### Análise matemática
- Permite um estudo formal de um algoritmo ao nível idéia por trás do algoritmo;
- Faz uso de um computador idealizado e simplificações que buscam considerar somente os custos dominantes do algoritimo;
- A medição do tempo gasto é feita de maneira independente do "hardware" ou da "linguagem" usada na sua implementação.

> #### Vantagens
> - Detalhes de baixo nível, como a linguagem de programação utilizada, o hardware no qual o algoritmo é executado,
    ou o conjunto de instruções da CPU, são ignorados;
> - Permite entender como um algoritmo se comporta à medida que o conjunto de dados de entrada cresce. Assim, podemos
    expressar a relação entre o conjunto de dados de entrada ea quantidade de tempo necessária para processar esses dados.