O padrão de projeto Abstract Factory é um padrão design criacional que fornece uma interface para criar famílias de objetos relacionados ou dependentes
sem especificar suas classes concretas. Este padrão é útil quando o sistema precisa ser independente de como seus objetos são criados, compostos e
representados. Aqui está um exemplo simples de como implementar o padrão Abstract Factory em Java:
### Passo 1: Definir as Interfaces do Produto
Primeiro, vamos definir as interfaces para os produtos que serão criados pela fábrica. Neste exemplo, vamos criar uma fábrica de interfaces para criar
diferentes tipos de botões e campos de texto.
```java
public interface Button {
    void paint();
}
public interface TextField {
    void paint();
}
```
### Passo 2: Implementar as Interfaces do Produto
Agora, vamos implementar as interfaces do produto para diferentes variantes. Por exemplo, podemos ter botões e campos de texto para Windows e para Mac.
```java
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Pintando botão do Windows");
    }
}
public class WindowsTextField implements TextField {
    @Override
    public void paint() {
        System.out.println("Pintando campo de texto d Windows");
    }
}
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Pintando botão do Mac");
    }
}
public class MacTextField implements TextField {
    @Override
    public void paint() {
        System.out.println("Pintando campo de texto d Mac");
    }
}

```
### Passo 3: Definir a Interface da Fábrica Abstrata
A interface da fábrica abstrata define os métodos para criar os produtos. Neste caso, temos métodos para criar botões e campos de texto.
```java
public interface GUIFactory {
    Button createButton();
    TextField createTextField();
}
```
### Passo 4: Implementar as Fábricas Concretas
Agora, vamos implementar as fábricas concretas que criam os produtos específicos para Windows e Mac.
```java
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
    @Override
    public TextField createTextField() {
        return new MacTextField();
    }
}
```
### Passo 5: Usar a Fábrica Abstrata
Finalmente, podemos usar a fábrica abstrata para criar os produtos sem especificar suas classes concretas.
```java
public class Application {
    private GUIFactory factory;
    public Application(GUIFactory factory) {
        this.factory = factory;
    }
    public void createUI() {
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        button.paint();
        textField.paint();
    }
}
public class Main {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Application app = new Application(windowsFactory);
        app.createUI();
        GUIFactory macFactory = new MacFactory();
        app = new Application(macFactory);
        app.createUI();
    }
}
```
Este exemplo demonstra como o padrão Abstract Factory pode ser usado para criar famílias de objetos relacionados
sem especificar suas classes concretas.
Isso permite que o sistema seja independente de como os objetos são criados, compostos e representados, facilitando a 
manutenção e a extensão do código
.
# Prós e contras

# Prós
- Você pode ter certeza que os produtos que você obtém de uma fábrica são compatíveis entre si.

- Você evita um vínculo forte entre produtos concretos e o código cliente.

- Princípio de responsabilidade única. Você pode extrair o código de criação do produto para um lugar, fazendo o código 
ser de fácil manutenção.

- Princípio aberto/fechado. Você pode introduzir novas variantes de produtos sem quebrar o código cliente existente.

# Contras
- O código pode tornar-se mais complicado do que deveria ser, uma vez que muitas novas interfaces e classes são introduzidas junto com o padrão.


# Aplicabilidade
Use o Abstract Factory quando seu código precisa trabalhar com diversas famílias de produtos relacionados, mas que você 
não quer depender de classes concretas daqueles produtos-eles podem ser desconhecidos de antemão ou você simplesmente 
quer permitir uma futura escalabilidade.

O Abstract Factory fornece a você uma interface para a criação de objetos de cada classe das famílias de produtos. Desde
que seu código crie objetos a partir dessa interface, você não precisará se preocupar em criar uma variante errada de um 
produto que não coincida com produtos já criados por sua aplicação.

Considere implementar o Abstract Factory quando você tem uma classe com um conjunto de métodos fábrica que desfoquem sua 
responsabilidade principal.

Em um programa bem desenvolvido cada classe é responsável por apenas uma coisa. Quando uma classe lida com múltiplos 
tipos de produto, pode valer a pena extrair seus métodos fábrica em uma classe fábrica solitária ou uma implementação 
plena do Abstract Factory.
