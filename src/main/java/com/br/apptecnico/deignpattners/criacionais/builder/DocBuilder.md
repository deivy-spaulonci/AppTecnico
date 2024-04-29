# Problema

Imagine um objeto complexo que necessite de uma inicialização passo a passo trabalhosa de muitos campos e objetos 
agrupados. Tal código de inicialização fica geralmente enterrado dentro de um construtor monstruoso com 
vários parâmetros. Ou pior: espalhado por todo o código cliente.

#  Solução

O padrão Builder sugere que você extraia o código de construção do objeto para fora de sua própria classe e mova 
ele para objetos separados chamados builders. “Builder” significa “construtor”, mas não usaremos essa palavra para 
evitar confusão com os construtores de classe.

# Prós e contras

# Prós
Você pode construir objetos passo a passo, adiar as etapas de construção ou rodar etapas recursivamente.
    
Você pode reutilizar o mesmo código de construção quando construindo várias representações de produtos.
    
Princípio de responsabilidade única. Você pode isolar um código de construção complexo da lógica de negócio do produto.

# Contras
A complexidade geral do código aumenta uma vez que o padrão exige criar múltiplas classes novas.