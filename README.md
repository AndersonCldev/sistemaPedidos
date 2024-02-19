**Descrição para README do Repositório:**

# Sistema de Pedidos

Este é um simples sistema de pedidos desenvolvido em Java. O programa permite que usuários registrem informações sobre clientes, escolham entre três opções de produtos e revisem as informações antes de finalizar o pedido.

## Funcionalidades Principais:

1. **Cadastro de Cliente:**
   - O usuário é solicitado a inserir o nome completo do cliente, onde espaços adicionais são removidos após o primeiro nome.
   - Caso um sobrenome seja fornecido, ele é verificado e armazenado. Se não, é definido como vazio.

2. **Inclusão de CPF na Nota:**
   - O programa pergunta ao usuário se deseja incluir o CPF na nota (1 para sim, 2 para não).
   - Se a opção for sim, o CPF é solicitado e armazenado.

3. **Seleção de Produtos:**
   - O usuário escolhe entre três opções de produtos (hamburguer, misto, sanduíche).
   - A escolha é validada, e o produto selecionado é armazenado no pedido.

4. **Confirmação do Pedido:**
   - O programa exibe as informações do cliente e do pedido para confirmação.
   - O usuário pode validar o pedido (1 para sim) ou identificar erros nas informações (2 para não) e corrigir CPF, nome ou produto.

## Observações:
   - O sistema utiliza a classe Scanner para interação com o usuário.
   - A lógica de validação é implementada para garantir escolhas válidas do usuário.
   - O desconto aplicado ao pedido é calculado, mas pode precisar de revisão na fórmula.

### Execução:
```bash
javac SistemaPedido.java
java SistemaPedido
```

**Autor:**
[Anderson Cleiton]

**Aprimoramentos Futuros:**
- Melhoria na manipulação de erros.
- Refinamento na validação de entradas do usuário.
- Revisão na lógica de cálculo de desconto.

Sinta-se à vontade para contribuir, fornecer feedback ou reportar problemas!
