# TodoList

Este é um projeto Java simples para gerenciar uma lista de tarefas (To-Do List), implementando funcionalidades básicas como adicionar, remover, marcar como completa/incompleta e priorizar tarefas.

## Estrutura do Projeto

- `Main.java`: Classe principal para execução do programa.
- `TodoList.java`: Implementação da lista de tarefas e suas operações.
- `Priority.java`: Enumeração para definir prioridades das tarefas.
- `CompleteState.java`: Enumeração para o estado de conclusão das tarefas.
- `AlreadyCompleteException.java`, `AlreadyIncompleteException.java`, `EmptyListException.java`: Exceções customizadas para controle de erros.

## Como Executar

1. Certifique-se de ter o Java instalado (Java 8+).
2. Compile os arquivos:
   ```sh
   javac src/*.java
   ```
3. Execute o programa principal:
   ```sh
   java -cp src Main
   ```

## Funcionalidades
- Adicionar tarefas com prioridade.
- Marcar tarefas como completas ou incompletas.
- Remover tarefas.
- Listar tarefas e seus estados.
- Tratamento de exceções para operações inválidas.

## Contribuição
Pull requests são bem-vindos. Para mudanças maiores, abra uma issue primeiro para discutir o que você gostaria de modificar.

## Licença
Este projeto é apenas para fins educacionais.

