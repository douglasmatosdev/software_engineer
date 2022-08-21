# VERIFICANDO O APRENDIZADO
### 1. Considere as afirmações a seguir.

- I – Um desvio no fluxo principal de um programa é uma exceção.
- II – Se uma exceção é lançada pela instrução “throw”, então ela é uma exceção explícita.
- III – Uma exceção explícita não precisa ser tratada localmente no método no qual é lançada.

**É (são) verdadeira(s) apenas a:**

- A) [ ] I

- B) [ ] II

- C) [ x ] III

- D) [ ] I e II

- E) [ ] II e III

> ### Comentário

<hr>

> Parabéns! A alternativa "C" está correta.
<br>
> Uma exceção é um desvio não previsto no fluxo do programa. Desvios no fluxo principal > para fluxos alternativos são condições normais e previstas e não são exceções. Além > > disso, uma exceção implícita também pode ser lançada pela instrução “throw”. Mesmo uma > instrução explícita pode ser lançada e propagada, não sendo obrigatório seu tratamento > no método onde ocorre.

<br>
<br>

### 2. Sobre exceções implícitas, é correto afirmar-se apenas que:
- A) [ ] Exceções implícitas não podem ser propagadas.

- B) [ x ] Exceções definidas na classe UnknownError são implícitas.

- C) [ ] Se uma exceção implícita não for capturada, será gerado erro de compilação.

- D) [ ] Uma exceção implícita é sempre consequência direta da programação.

- E) [ ] Exceções implícitas ocorrem sempre em tempo de compilação.

> ### Comentário

<hr>

> Parabéns! A alternativa "B" está correta.
<br>
> Exceções são implícitas quando definidas nas classes Error e RuntimeException e suas > derivadas. A classe UnknownError é uma subclasse de Error.