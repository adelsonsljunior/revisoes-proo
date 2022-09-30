# Anotações

# Herança

> Herança são um conjunto de comportamentos que uma classe filha herda de uma classe mãe, visando o **reaproveitamento de código** .

A classe mãe contém todos os atributos e métodos que vão ser herdados pelas classes filhas, sendo assim usada como uma base para as classes filhas.

As classes filhas herdam todo que está na classe mãe.

Seguindo as regras:

+ Uma classe mãe pode ter várias classes filhas.
+ Uma classe filha possui apenas uma classe mãe.

A herança é feita na declração da classe filha, logo após seu nome usando a palavra reservada **extends** seguida pelo nome da classe mãe.

Uma classe filha pode acessar os métodos e atributos da classe mãe através da palavra reservada **super**, que serve para *referenciar a classe mãe*.

<br>

~~~
public class ClasseFilha extends ClasseMae{

}
~~~

<br>

EXEMPLOS:

<br>

~~~
// Classe Mãe
public class ObjetoGeometrico {
    
    private String cor;

    public ObjetoGeometrico(String cor){
        this.cor = cor;
    }
    
    public void exibir(){
        System.out.println("\nCor: " + cor);
    }
}    
~~~

<br>

~~~
// Classe Filha
public class Quadrado extends ObjetoGeometrico {

    private int lado;

    Quadrado(String cor, int lado){
        super(cor);
        this.lado = lado;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Lado: " + lado);
    }
}
~~~

<br>

~~~
// Classe Filha
public class Triangulo extends ObjetoGeometrico {

    private int base;
    private int altura;

    public Triangulo(String cor, int base, int altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        area();
    }
    
}
~~~

<br>

# Classes Abstratas

Partindo do ideia de que as classes mães só servem de base para as classes filhas e não são instanciadas, surgem as **classes abstratas**.

Classes abstratas são classes que *não pode ser instanciadas e são usadas unicamente para herança*.

A declaração é feita colocando a palavra reservada **abstract** após o modificador de acesso (public).

~~~
public abstract class ObjetoGeometrico {
    
}
~~~

## Métodos Abstratos

Métodos Abstratos são métodos que são herdados obrigatoriamente pelas classes filhas.

A declaração é feita colocando a palavra reservada **abstract** após o modificador de acesso e incerrando com ponto e vírgula, sem usar chaves.

~~~
public abstract class ObjetoGeometrico {

    public abstract void area();

}
~~~

<br>

> "Se uma classe filha não implementar um método da classe mãe, então ela teve ser uma classe abstrata"

> "Alguém no final tem que implementar o método!"

>  Cledja, a dona do IFAL 🛐🛐🛐

<br>

EXEMPLOS:

<br>

~~~
// Classe Mãe
public abstract class ObjetoGeometrico {
    
    private String cor;
    ObjetoGeometrico(String cor){
        this.cor = cor;
    }
    
    public void exibir(){
        System.out.println("\nCor: " + cor);
    }

    public abstract void area();
}
~~~

~~~
// Classe Filha
public class Quadrado extends ObjetoGeometrico {

    private int lado;

    Quadrado(String cor, int lado){
        super(cor);
        this.lado = lado;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Lado: " + lado);
        area();
    }

    public void area(){
        float area = lado * lado;
        System.out.println("Area: " + area);
    }
}
~~~

~~~
// Classe Filha
public class Triangulo extends ObjetoGeometrico {

    private int base;
    private int altura;

    Triangulo(String cor, int base, int altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        area();
    }

    public void area(){
        float area = (base*altura)/2;
        System.out.println("Area: " + area);
    }
}
~~~
