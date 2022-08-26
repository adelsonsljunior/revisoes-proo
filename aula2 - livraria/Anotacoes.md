# ANOTAÇÕES DA AULA

<br>

# Classes e Objetos 

+ ***Classe*** é um modelo abstrato que representa algo na vida real, possuindo atributos e métodos.

    + ***Atributos*** são as caracteristicas da classe, "podemos associar com variáveis".

    + ***Métodos*** são as ações realizadas pela classe, "podemos associar com funções". 

~~~
// Classe Pessoa
public class Pessoa{

    private String nome;
    private int idade;
    private float altura;

    public void falar(){
        System.out.println("\nBATMANNNNNN");;
    }
}
~~~

<br>

+ ***Objeto*** é a materialização de uma classe, podemos associar como uma variável do tipo da classe.

~~~
public class Main{
    public static void main(String[] args) {
        // Objeto de Pessoa
        Pessoa pessoa = new Pessoa();
    }
}
~~~


<br>

# Construtores

+ ***Construtores*** são métodos que possuem o mesmo nome da classe, são responsáveis pela instanciação da classe,inicialização dos atributos e podem ou não possuir parâmetros.

    + "A **instanciação** é um processo por meio do qual se realiza a cópia de um objeto (classe) existente. Uma classe, a qual tem a função de determinar um tipo de dado, deve ser instanciada para que possamos utilizá-la"

<br>

~~~
public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
} 
~~~

<br>

# Boas Práticas em POO

+ As boas práticas são padrões que devem ser seguidos em POO, com Java ou outras linguagens, para melhor compreeensão de código.

    + Toda classe começa com letra maiúscula.

        |Pessoa.java|✔️|
        |-----------|--|
        |pessoa.java|❌|
    

    + Todos os atributos e métodos começam com letra minúscula.

  ~~~
    // Atributos
    private String nome; 
    private int idade; 
    private double altura;

    // Métodos
    public void crescer()
    public void envelhecer()
  ~~~

    + Para criar um atributo, método ou classe com nome composto, basta seguir as regras anteriores e após o primeiro nome, todo nome é colocado junto, sem espaço e com letra maiúscula.
  
  <br>

  ~~~
    // Classes
    PessoaSeiLa.java

    // Atributos
    private String nomeDaMae; 

    // Métodos
    public void exibirPessoa()
  ~~~

    + **Não se deve usar caracteres especiais para criar um atributo, método ou classe com nome composto, sempre use a regra anterior.**

<br>

# Sobrecarga

+ ***Sobrecarga*** é a criação de mais de um método com o mesmo nome, mas com a passagem de parâmetros diferente.

<br>

~~~
// Construtor com parâmetros
public Pessoa(String nome){
   this.nome = nome;
}

// Construtor sem parâmetros
public Pessoa(){
   nome = leitor.nextLine();
}
~~~

<br>

# Encapsulamento

+ Classes devem ser independentes, logo o **encapsulamento** serve para outras classes não interferirem entre si.

+ O **encapsulamento** é feito colocando as seguintes palavras reservadas antes do tipo dos atributo e método na sua declaração (como visto nos códigos de exemplo acima). 

    + **public**  - pode ser visto e usado por todas as classes.
    + **private** - só pode ser visto e usado pela classse.

+ Deve se seguir as regras:

    + Todo atributo é privato.
    + Todo método pode ser público.


## Métodos gets e sets

+ O métodos **gets e sets** são usados para acessar ou modificar os atributos de uma classe em um objeto instanciado em outra classe.

    + **get** - Acessar: retorna o valor do atributo.

    + **set** - Modificar: recebe como parâmetro o valor que substituirá o valor presente no atributo.

+ Declaração dos métodos gets e sets:

~~~
// get

public tipoDoAtributo getNomeDoAtributo(){
    return nomeDoAtributo;
}

// set

public void setNomeDoAtributo(tipoDoAtributo nomeDoAtribiuto){
    this.nomeDoAtribiuto = nomeDoAtribiuto;
}
~~~

<br>

+ **this.** - é usado para referenciar o atributo da classe, já que o parâmetro possui o mesmo nome do atributo, isso os defencia.

<br>

~~~
// Classe Pessoa

public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome
}
 
//Classe Main

pessoa.getnome();

pessoa.setNome("Batman");
~~~

<br>

# Arrays

+ Arrays são conjuntos de dados do mesmo tipo, sendo divido em um número de posições determinado e cada posição é acessada por meio de um índice. O valor presente em cada posições é chamado de elemento.

+ Também é chamado de **Vetor**

### Declaração de um Array em Java:

~~~
tipoDoArray[] nomeDoArray = new tipoDoArray[numeroDePosicoesDoArray];
~~~

<br>

~~~
int[] a = new int[10];

float[] b = new float[10];

String[] c = new String[10];
~~~

<br>

~~~
public class Main{
    public static void main(String[] args) {
        // Criando array de objetos: 
        Pessoa[] pessoas = new Pessoa[10];

        // Instanciando os elementos de cada posição:
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
        }
    }
}
~~~

<br>

+ **.length** - retorna o valor do tamanho do Array.

<br>

### Usando For Each

+ For Each (para cada), é um laço de repetição que percorre todas as posições do Array.

~~~
for (tipoDoArray nomeDoArrayNoSingular : nomeDoArray){
    //Ação que deseja relizar
}
~~~

<br>

~~~
Pessoa[] pessoas = new Pessoa[10];

for (Pessoa pessoa : pessoas){
    System.out.println(pessoa.getNome());
}
~~~

<br>

# Verificação do null

+ Todo Array de objetos, quando é declarado dando seu tamanho (como é mostrado acima), começa com todas as suas posições nulas (com null).

+ **null** - significa que está vazio/nulo.

+ Então precisamos fazer a veficação do null em cada posição posição do Array para que não aja erros no decorrer do código.

    + Primeiro, é necessário vefificar se a posição é igual a null, para poder fazer sua instanciação. 

    + Após isso, sempre que for realizar uma ação usando o array é necessário verificar se a posição é diferente de null.

~~~
public class Main{
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[10];

        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i] == null){
                pessoas[i] = new Pessoa();
            }
        }

        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i] != null){
                System.out.println(pessoas[i].getNome());
            }
        }
    }
}
~~~ 

<br>

# CRUD

+  CRUD é a sigla para Create (criação), Read (leitura), Update (atualização) e Delete (exclusão). Sendo um modelo de sistema de gerenciamento.
