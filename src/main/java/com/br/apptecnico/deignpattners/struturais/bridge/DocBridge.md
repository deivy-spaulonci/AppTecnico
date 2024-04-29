padrão de projeto Bridge é um padrão estrutural que desacopla uma abstração de sua implementação para que ambos possam variar independentemente. Este
padrão é útil quando você tem uma hierarquia de classes que podem ser divididas em duas hierarquias separadas - uma para abstração e outra pa a
implementação. O padrão Bridge permite que você combine essas du hierarquias em uma estrutura de classes.
Aqui está um exemplo simples de como o padrão Bridge pode ser implementado em Java:
### Abstração
Primeiro, vamos definir a interface da abstração. Esta interface define o comportamento que abstração deve ter.
```java
public interface Abstraction {
    void operation();
}
```
### Implementação
Agora, vamos definir a interface da implementação. Esta interface define o comportamento que a implementação deve ter.
```java
public interface Implementation {
    void operationImplementation();
}
```
### Implementação Concreta
Aqui, implementamos a interface da implementação. Esta é a implementação concreta que será usada pelo ponte.
```java
public class ConcreteImplementationA implements Implementation {
    @Override
    public void operationImplementation() {
        System.out.println("ConcreteImplementationA: Here's the result on the platform A.");
    }
}
public class ConcreteImplementationB implements Implementation {
    @Override
    public void operationImplementation() {
        System.out.println("ConcreteImplementationB: Here's the result on the platform B.");
    }
}
```
### Abstração Concreta
Aqui, implementamos a interface da abstração. Esta é abstração concreta que usa  implementação concreta.
```java
public class RefinedAbstraction implements Abstraction {
    private Implementation im;
    public RefinedAbstraction(Implementation im) {
        this.implementation = implementation;
    }
    @Override
    public void operation() {
        System.out.print("RefinedAbstraction: I'm doing work and my implementation: ");
        implementation.operationImplementation();
    }
}
```
### Cliente
Finalmente, o cliente usa bstração concreta para realizar operações sem saber sobre a implementação concreta.
```java
public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementationA());
        abstraction.operation();
        abstraction = new RefinedAbstraction(new ConcreteImplementationB());
        abstraction.operation();
    }
}
```
Quando você executa o Client, ele usa bstração concreta RefinedAbstraction para realizar operações. A implementação concreta (ConcreteIm
plementationA ou ConcreteImplementationB) é passada para abstração concreta, permitindo que abstração opere de maneira independente da implementação.
Isso permite que abstração e a implementação variem independentemente, mantendo o código modular e flexível.

# Aplicabilidade

Utilize o padrão Bridge quando você quer dividir e organizar uma classe monolítica que tem diversas variantes da mesma 
funcionalidade (por exemplo, se a classe pode trabalhar com diversos servidores de base de dados).

Quanto maior a classe se torna, mais difícil é de entender como ela funciona, e mais tempo se leva para fazer mudanças. 
As mudanças feitas para uma das variações de funcionalidade podem precisar de mudanças feitas em toda a classe, o que 
quase sempre resulta em erros ou falha em lidar com efeitos colaterais.

O padrão Bridge permite que você divida uma classe monolítica em diversas hierarquias de classe. Após isso, você pode 
modificar as classes em cada hierarquia independentemente das classes nas outras. Essa abordagem simplifica a manutenção 
do código e minimiza o risco de quebrar o código existente.

Utilize o padrão quando você precisa estender uma classe em diversas dimensões ortogonais (independentes).

O Bridge sugere que você extraia uma hierarquia de classe separada para cada uma das dimensões. A classe original delega 
o trabalho relacionado para os objetos pertencentes àquelas hierarquias ao invés de fazer tudo por conta própria.

Utilize o Bridge se você precisar ser capaz de trocar implementações durante o momento de execução.

Embora seja opcional, o padrão Bridge permite que você substitua o objeto de implementação dentro da abstração. 
É tão fácil quanto designar um novo valor para um campo.

A propósito, este último item é o maior motivo pelo qual muitas pessoas confundem o Bridge com o padrão Strategy. 
Lembre-se que um padrão é mais que apenas uma maneira de estruturar suas classes. Ele também pode comunicar intenções e 
resolver um problema.

# Prós e contras

# Prós
- Você pode criar classes e aplicações independentes de plataforma.
- O código cliente trabalha com abstrações em alto nível. Ele não fica exposto a detalhes de plataforma.
- Princípio aberto/fechado. Você pode introduzir novas abstrações e implementações independentemente uma das outras.
- Princípio de responsabilidade única. Você pode focar na lógica de alto nível na abstração e em detalhes de plataforma na implementação.

# Contras
- Você pode tornar o código mais complicado ao aplicar o padrão em uma classe altamente coesa.



