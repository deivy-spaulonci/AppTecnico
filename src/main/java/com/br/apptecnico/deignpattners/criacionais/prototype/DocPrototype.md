O padrão de projeto Prtotype é um padrão criacional que permite a criação de objetos sem especificar a classe exata do objeto que será criado. Em vez
disso, um objeto prtótipo é clonado para criar novos objetos. Este padrão é útil quando a criação de um objeto é custosa ou complexa.
Aqui está um exemplo simples de como implementar o padrão Prototype em Java:
### Interface Prototype
Primeiro, definimos uma interface Prototype que declara um método clone para clonar objeto.
```java
public interface Prototype {
    Prototype clone();
}
```
### Classe Concreta
Em seguida, criamos uma classe concreta que implementa  interface Prototype. Esta classe representa objeto que queremos clonar.
```java
public class ConcretePrototype implements Prototype {
    private String field;
    public ConcretePrototype(String field) {
        this.field = field;
    }
    @Override
    public Prototype clone() {
        return new ConcretePrototype(field);
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
}
```
### Cliente
Finalmente, temos a classe Cliente que usa objeto prtótipo para criar novos objetos.
```java
public class Cliente {
    public static void main(String[] args) {
        Prototype pro = new ConcretePrototype("Valor inicial");
        Prototype clone1 = prototype.clone();
        Prototype clone2 = prototype.clone();
        System.out.println("Protótipo: " + prototype.getField());
        System.out.println("Clone 1: " + clone1.getField());
        System.out.println("Clone 2: " + clone2.getField());
    }
}
```
Neste exemplo, a classe ConcretePrototype implementa  interface Prototype e define como clonar um objeto. 
A classe Cliente usa o método clone
para criar novos objetos a partir do protótipo.
Este é um exemplo básico de como o padrão Prototype pode ser implementado em Java. Dependo do seu caso de uso 
específico, você pode precisar ajustar a
implementação para atender às ua necessidades.

# Aplicabilidade

Utilize o padrão Prototype quando seu código não deve depender de classes concretas de objetos que você precisa copiar.

Isso acontece muito quando seu código funciona com objetos passados para você de um código de terceiros através de 
alguma interface. As classes concretas desses objetos são desconhecidas, e você não pode depender delas mesmo que quisesse.

O padrão Prototype fornece o código cliente com uma interface geral para trabalhar com todos os objetos que suportam 
clonagem. Essa interface faz o código do cliente ser independente das classes concretas dos objetos que ele clona.

Utilize o padrão quando você precisa reduzir o número de subclasses que somente diferem na forma que inicializam seus 
respectivos objetos. Alguém pode ter criado essas subclasses para ser capaz de criar objetos com uma configuração específica.

O padrão Prototype permite que você use um conjunto de objetos pré construídos, configurados de diversas formas, como 
protótipos.

Ao invés de instanciar uma subclasse que coincide com alguma configuração, o cliente pode simplesmente procurar por um 
protótipo apropriado e cloná-lo.

# Prós e contras

# Prós
- Você pode clonar objetos sem acoplá-los a suas classes concretas.

- Você pode se livrar de códigos de inicialização repetidos em troca de clonar protótipos pré-construídos.

- Você pode produzir objetos complexos mais convenientemente.

- Você tem uma alternativa para herança quando lidar com configurações pré determinadas para objetos complexos.

# Contras
- Clonar objetos complexos que têm referências circulares pode ser bem complicado.