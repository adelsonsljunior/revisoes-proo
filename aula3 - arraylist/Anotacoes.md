# Anotações

# ArrayList

+ ArrayList também podem ser chamados de **"Arrays Dinâmicos"**, pois diferente dos Arrays convencionais não possuem número de posições fixo, na verdade, um ArrayList se inicia com 0 posições. 
+ Seu número de posições varia conforme são adicionados ou removidos elementos.

<br>

> "só lembrando que não dá pra fazer arraylist de tipo primitivo e esse é um dos poucos motivos pelo que se deve aprender o array normal quando se trata de classes" - Grande Mestre Guilherme 🛐😎✨

> OBS. **Tipos primitivos**: boolean, char, int, float e double

<br>

### Declarando um ArrayList

<br>

~~~
import java.util.ArrayList;

...

ArrayList<tipoDoArrayList> nomeDoArrayList = new ArrayList<tipoDoArrayList>();

ou

ArrayList<tipoDoArrayList> nomeDoArrayList = new ArrayList<>();
~~~

<br>

### Alguns métodos usados em ArrayList

<br>

Método| Descrição|
-------|-----------------|
.add(elemento) | Adiciona um elemento a lista|
.remove(indice) | Remove da lista o elemento indicado pelo indice|
.get(indice)| Retorna o elemento indicado pelo indice|
.size() | Retorna o tamanho da lista|
.isEmpty() | Retorna **true**, se a lista está **vazia**. Caso contrário, retorna **false**|

<br>

+ [Mais métodos em ArrayList](./ArrayList.md) - clica ai para ser redirecionado pra mais métodos.

<br>

### ArrayList na prática

<br>

~~~
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<String>();

        System.out.println(nomes.size()); // 0

        System.out.println(nomes.isEmpty()); // true

        nomes.add("Adelson");

        System.out.println(nomes.size()); // 1

        System.out.println(nomes.isEmpty()); //false

        nomes.add("Jorge");

        System.out.println(nomes.size()); // 2

        System.out.println(nomes.get(0)); // Adelson

        System.out.println(nomes.get(1)); // Jorge

        nomes.remove(1);

        System.out.println(nomes.size()); // 1
        
    }
}
~~~

<br>

### ArrayList x Array na prática

<br>

~~~
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Declaração

        // ArrayList
        ArrayList<String> nomes = new ArrayList<>();

        // ArrayList
        String[] nomes2 = new String[10];

        // Obtendo o tamando

        // ArrayList
        System.out.println(nomes.size());

        // Array
        System.out.println(nomes2.length);

        // Adicionando elementos

        // ArrayList
        String nome = "Batman";
        nomes.add(nome);

        // Array
        for (int i = 0; i < nomes2.length; i++) {
            if (nomes2[i] == null) {
                String nome2 = "Batman";
                nomes2[i] = nome2;
                break;
            }
        }

        // Exibindo elementos

        // ArrayList
        for (int i = 0; i < nomes.size(); i++) { // Array
            System.out.println(nomes.get(i));
        }

        // Array
        for (int i = 0; i < nomes2.length; i++) {
            if (nomes2[i] != null) {
                System.out.println(nomes2[i]);
            }
        }

        // Removendo elementos

        // ArrayList
        String pesquisa = "Batman";
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(pesquisa)) {
                nomes.remove(i);
            }
        }

        // Array
        String pesquisa2 = "Batman";
        for (int i = 0; i < nomes2.length; i++) {
            if (nomes2[i] != null) {
                if (nomes2[i].equalsIgnoreCase(pesquisa2)) {
                    nomes2[i] = null;
                }
            }
        }


        // ArrayList Avançado
        // nomes = (ArrayList<String>) nomes.stream().filter(pesquisa3 -> !pesquisa3.equalsIgnoreCase("Batman")).collect(Collectors.toList());
        // Super dica do Manuel. Confia

    }
}
~~~
