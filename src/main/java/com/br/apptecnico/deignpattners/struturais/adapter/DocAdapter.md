O padrão de projeto Adapter é um padrão estrutural que permite que classes com interfaces incompatíveis trabalhem juntas. Ele faz isso convertendo a
interface de uma classe em outra interface esperada pelos clientes. Vamos criar um exemplo simples para ilustrar como o padrão Adapter pode ser
implementado em Java.
### Exemplo de Uso do Padrão Adapter
Imagine que temos uma interface Turbofan que representa um motor de avião e uma interface JetEngine que representa um motor de jato. A interface T
urbofan tem um método start(), enquanto a interface JetEngine tem um método ignite().
```java
// Interface para o motor de avião
public interface Turbofan {
    void start();
}
// Interface para o motor de jato
public interface JetEngine {
    void ignite();
}
```
Agora, vamos supor que temos uma classe AirbusEngine que implementa  interface Turbofan e uma classe BoeingEngine que implementa  interface Jet
Engine.
```java
// Classe que implementa  interface Turbofan
public class AirbusEngine implements Turbofan {
    @Override
    public void start() {
        System.out.println("AirbusEngine iniciado");
    }
}
// Classe que implementa  interface JetEngine
public class BoeingEngine implements JetEngine {
    @Override
    public void ignite() {
        System.out.println("BoeingEngine acendido");
    }
}
```
Para fzer essas du classes trabalharem juntas, podemos criar um adaptador que converte a interface Turbofan em JetEngine.
```java
// Adaptador que converte Turbofan em JetEngine
public class TurbofanAdapter implements JetEngine {
    private Turbofan turbofan;
    public TurbofanAdapter(Turbofan turbofan) {
        this.turbofan = turbofan;
    }
    @Override
    public void ignite() {
        turbofan.start(); // Converte o método start() para ignite()
    }
}
```
Agora, podemos usar o adaptador para fazer um AirbusEngine funcionar como um BoeingEngine.
```java
public class Main {
    public static void main(String[] args) {
        Turbofan airbusEngine = new AirbusEngine();
        JetEngine boeingEngine = new TurbofanAdapter(airbusEngine);
        boeingEngine.ignite(); // Isso chama o método start() do AirbusEngine
    }
}
```
Neste exemplo, o TurbofanAdapter permite que um AirbusEngine seja usado onde um BoeingEngine é esperado, convertendo a 
chamada ignite() para
start(). Isso é útil quando você tem classes que não podem ser modificadas diretamene para usar interfaces diferentes, 
mas precisam trabalhar juntas.

# Aplicabilidade

Utilize a classe Adaptador quando você quer usar uma classe existente, mas sua interface não for compatível com o resto 
do seu código.

O padrão Adapter permite que você crie uma classe de meio termo que serve como um tradutor entre seu código e a classe 
antiga, uma classe de terceiros, ou qualquer outra classe com uma interface estranha.

Utilize o padrão quando você quer reutilizar diversas subclasses existentes que não possuam alguma funcionalidade comum 
que não pode ser adicionada a superclasse.

Você pode estender cada subclasse e colocar a funcionalidade faltante nas novas classes filhas. Contudo, você terá que 
duplicar o código em todas as novas classes, o que cheira muito mal.

Uma solução muito mais elegante seria colocar a funcionalidade faltante dentro da classe adaptadora. Então você 
encobriria os objetos com as funcionalidades faltantes dentro do adaptador, ganhando tais funcionalidades de forma
dinâmica. Para isso funcionar, as classes alvo devem ter uma interface em comum, e o campo do adaptador deve seguir 
aquela interface. Essa abordagem se parece muito com o padrão Decorator.

# Prós e contras

# Prós
- Princípio de responsabilidade única. Você pode separar a conversão de interface ou de dados da lógica primária do 
negócio do programa.
- Princípio aberto/fechado. Você pode introduzir novos tipos de adaptadores no programa sem quebrar o código cliente 
existente, desde que eles trabalhem com os adaptadores através da interface cliente.

# Contras
- A complexidade geral do código aumenta porque você precisa introduzir um conjunto de novas interfaces e classes.
- Algumas vezes é mais simples mudar a classe serviço para que ela se adeque com o resto do seu código.