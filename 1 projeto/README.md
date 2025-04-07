# Refatoração com DRY - Gerenciador de Vendas

## Melhorias Implementadas

1. **Nomenclatura Descritiva**:
   - Classes e métodos renomeados para refletir melhor seu propósito (ex: `Produto` → `ItemEletronico`, `exibirPrecoFinal` → `mostrarValorComDesconto`).

2. **Encapsulamento**:
   - Atributos privados garantem que os dados do item não sejam modificados diretamente.
   - Métodos públicos (`calcularValorFinal`, `mostrarValorComDesconto`) controlam o acesso à lógica.

3. **Princípio DRY**:
   - O cálculo do desconto está centralizado no método `calcularValorFinal()`, evitando repetição de código.
   - A formatação de exibição é unificada em `mostrarValorComDesconto()`.

4. **Legibilidade**:
   - Comentários explicam a intenção (não o óbvio).
   - Nomes de variáveis claros (ex: `descontoAplicavel` em vez de `desconto`).

## Como Executar
1. Compile o arquivo Java:
   ```bash
   javac GerenciadorDeVendas.java
