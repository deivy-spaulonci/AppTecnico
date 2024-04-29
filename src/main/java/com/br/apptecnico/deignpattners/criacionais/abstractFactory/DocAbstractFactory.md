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
Este exemplo demonstra como o padrão Abstract Factory pode ser usado para criar famílias de objetos relacionados sem especificar suas classes concretas.
Isso permite que o sistema seja independente de como os objetos são criados, compostos e representados, facilitando a manutenção e a extensão do código
.
