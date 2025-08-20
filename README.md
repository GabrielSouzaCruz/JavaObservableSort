# Implementação de Métodos de Ordenação em Java

Este projeto demonstra a implementação de algoritmos de ordenação em Java, com foco no algoritmo Bubble Sort.

## Descrição do Projeto

O projeto contém implementações de métodos de ordenação utilizando conceitos de programação orientada a objetos e generics em Java. O objetivo é demonstrar como diferentes algoritmos de ordenação podem ser implementados e comparados em termos de eficiência e complexidade.

## Algoritmos Implementados

### Bubble Sort
- **Arquivo**: `src/BubbleSort.java`
- **Descrição**: Implementação do algoritmo Bubble Sort utilizando generics para permitir ordenação de diferentes tipos de dados
- **Complexidade**: O(n²) no pior caso
- **Características**: Algoritmo simples de comparação que percorre repetidamente a lista, comparando elementos adjacentes e trocando-os se estiverem na ordem errada

## Estrutura do Projeto

- `src/`: Contém os arquivos fonte Java
  - `BubbleSort.java`: Classe genérica que implementa o algoritmo Bubble Sort
  - `App.java`: Classe principal para execução e testes dos algoritmos
- `bin/`: Arquivos compilados (.class)
- `lib/`: Dependências externas (se houver)

## Funcionalidades

### Método de Troca
A classe `BubbleSort` implementa um método privado `troca()` que:
- Recebe um array genérico e dois índices
- Realiza a troca de elementos entre as posições especificadas
- Utiliza uma variável temporária para preservar os dados durante a troca

## Como Executar

1. Compile o projeto:
   ```bash
   javac -d bin src/*.java
   ```

2. Execute a aplicação:
   ```bash
   java -cp bin App
   ```

## Conceitos Demonstrados

- **Generics**: Uso de tipos genéricos (`<T>`) para criar algoritmos reutilizáveis
- **Encapsulamento**: Métodos privados para operações internas
- **Algoritmos de Ordenação**: Implementação prática de algoritmos fundamentais
- **Complexidade Algorítmica**: Análise de eficiência dos algoritmos

## Próximos Passos

Este projeto pode ser expandido com:
- Implementação de outros algoritmos (Quick Sort, Merge Sort, Selection Sort)
- Comparação de performance entre algoritmos
- Interface gráfica para visualização da ordenação
- Testes unitários para validação dos algoritmos

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
