O padrão de projeto Singleton é um padrão design que garante que uma classe tenha apenas uma instância e fornece um ponto de acesso glbal a ela. Este é
útil quando se precisa de um objeto que coordene ações em todo o sistema. Aqui está um exemplo básico de como implementar o padrão Singleton em Java:
```java
public class Singleton {
    // 1. Crie uma variável estática privada da classe própria
    private static Singleton instance;
    // 2. Faça o construtor privado para que a classe não possa ser instanciada de fora
    private Singleton() {}
    // 3. Forneça um método público estático que retorna a instância da classe
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    // Método de exemplo para demonstrar o uso do Singleton
    public void showMessage() {
        System.out.println("Este é o Singleton!");
    }
}
```
Para usr o Singleton, você chamaria o método getInstance() para obter a instância única da classe:
```java
public class Main {
    public static void main(String[] args) {
        // Obtenha a instância do Singleton
        Singleton sing = Singleton.getInstance();
        // Use o método da instância
        singleton.showMessage();
    }
}
```
Este exemplo demonstra a implementação básica do padrão Singleton. No entanto, é importante notar que existem várias maneiras de implementar o Singleton
em Java, cada uma com suas próprias vantagens e desvantagens. Por exemplo, abordagem acima não é thread-safe, o que significa que se duas threads tent
arem acessar a instância ao mesmo tempo, podem acabar criando duas instâncias. Para garantir a thread-safety, você pode usar o padrão de inicialização "
double-checked locking" ou inicializar a instância estática de forma "lazy" dentro de um bloco synchronized.

# Aplicabilidade

Utilize o padrão Singleton quando uma classe em seu programa deve ter apenas uma instância disponível para todos seus 
clientes; por exemplo, um objeto de base de dados único compartilhado por diferentes partes do programa.

O padrão Singleton desabilita todos os outros meios de criar objetos de uma classe exceto pelo método especial de 
criação. Esse método tanto cria um novo objeto ou retorna um objeto existente se ele já tenha sido criado.

Utilize o padrão Singleton quando você precisa de um controle mais estrito sobre as variáveis globais.

Ao contrário das variáveis globais, o padrão Singleton garante que há apenas uma instância de uma classe. Nada, a não 
ser a própria classe singleton, pode substituir a instância salva em cache.

Observe que você sempre pode ajustar essa limitação e permitir a criação de qualquer número de instâncias singleton. 
O único pedaço de código que requer mudanças é o corpo do método getInstance.

# Prós e contras

# Prós
- Você pode ter certeza que uma classe só terá uma única instância.
- Você ganha um ponto de acesso global para aquela instância.
- O objeto singleton é inicializado somente quando for pedido pela primeira vez.

# Contras
- Viola o princípio de responsabilidade única. O padrão resolve dois problemas de uma só vez.
- O padrão Singleton pode mascarar um design ruim, por exemplo, quando os componentes do programa sabem muito sobre 
- cada um.
- O padrão requer tratamento especial em um ambiente multithreaded para que múltiplas threads não possam criar um objeto
- singleton várias vezes.
- Pode ser difícil realizar testes unitários do código cliente do Singleton porque muitos frameworks de teste dependem
de herança quando produzem objetos simulados. Já que o construtor da classe singleton é privado e sobrescrever métodos estáticos é impossível na maioria das linguagem, você terá que pensar em uma maneira criativa de simular o singleton. Ou apenas não escreva os testes. Ou não use o padrão Singleton.