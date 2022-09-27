# Anotações

# Herança

> Herança são um conjunto de comportamentos que uma classe filha herda de uma classe mãe.

A classe mãe contém todos os atributos e métodos que vão ser herdados pelas classes filhas, sendo assim servindo como uma base para as classes filhas.

As classes filhas herdam todo que está na classe mãe.

Logo, podemos dizer que a herança é 

Deve se seguir as regras:

+ Uma classe mãe pode ter várias classes filhas.
+ Uma classe filha possui apenas uma classe mãe.

A herança é feita na classe filha em sua declaração usando a palavra reservada **extends** seguida pelo nome da classe mãe, logo após no nome da classe filha.

Uma classe filha pode acessar os métodos e atributos da classe mãe através da palavra reservada **super**, que serve para se referir a classe mãe.

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

Como as classes mães só servem de base para classes filhas e não são instanciadas, surgem as **classes abstratas**.

Classes abstratas são classes que não pode ser instanciadas e são usadas unicamente para herança. 

## Métodos Abstratos

Métodos Abstratos são métodos que são herdados pelas classes filhas, mas não são referenciados usando usar, pois cada classe filha 


<br>

~~~
public abstract class NomeDaClasse{

    public abstract void nomeDoMetodo();

}
~~~

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