# Lista 04: Herança e Classe Abstrata

## Questão 1

### a) Os construtores de superclasse não são herdados por subclasses.

Verdadeira. A subclasse herda os atributos e métodos, mas não herda os construtores. Ela só pode chamar o construtor da superclasse usando `super()`.

### b) Um relacionamento tem um é implementado via herança.

Falsa. A herança representa o relacionamento "é um", por exemplo, um `Aluno` é uma `Pessoa`. O relacionamento "tem um" é feito colocando um objeto como atributo de outra classe, por exemplo, um `Carro` tem um `Motor`.

### c) Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse.

Falsa. Quando a subclasse redefine o método com a mesma assinatura, isso se chama sobrescrita (`@Override`). Sobrecarga é quando existem métodos com o mesmo nome, mas com parâmetros diferentes.

## Questão 2

Usar `protected` deixa as subclasses acessarem os atributos da superclasse diretamente, o que facilita e deixa o código mais curto. O problema é que isso quebra o encapsulamento, porque a subclasse pode mudar o valor do atributo sem passar pelas validações do setter, por exemplo, colocando um saldo negativo. Além disso, se a superclasse mudar algum atributo, todas as subclasses que usam ele também precisam ser alteradas. Usar `private` é mais seguro, porque só a própria classe mexe nos seus atributos, e as subclasses acessam por meio dos getters e setters. Por isso, o mais recomendado é deixar os atributos `private` e usar os métodos para acessar.

## Questão 3

Quando um objeto da subclasse é criado, o construtor da subclasse chama primeiro o construtor da superclasse, e só depois executa o seu próprio código. Essa chamada pode ser explícita, escrevendo `super()` na primeira linha do construtor, ou implícita, quando não escrevemos nada e o Java coloca o `super()` sozinho. Isso é obrigatório porque o objeto da subclasse também tem os atributos da superclasse, e quem sabe inicializar esses atributos é o construtor da superclasse. Se a superclasse não tiver um construtor sem parâmetros, a subclasse é obrigada a chamar o `super()` passando os valores.
