# 🧪 Projeto de Validações com Anotações Personalizadas em Java


Este é um projeto simples em Java criado para treinar os conceitos de:

- 🏷️ Criação e uso de **anotações personalizadas** (`@interface`)
- 🔍 Utilização da **Reflection API** para leitura dinâmica dos campos anotados
- ⚠️ **Tratamento de exceções** para validação de regras de negócio
- 🎨 Feedback visual no terminal com **cores ANSI**
- 📏 Validações organizadas e **desacopladas** em classes específicas
---

## 👨‍🎓 Objetivo

- Este projeto foi desenvolvido com fins didáticos por um estudante de Java, visando compreender melhor o funcionamento interno da linguagem, boas práticas de arquitetura, reutilização de código e técnicas de validação customizada.
---


## 📁 Estrutura

- `@NaoNulo`  
  ➤ Garante que o campo não seja `null`.

- `@IdadeMinima(valor = 18)`  
  ➤ Valida se o valor do campo inteiro é maior ou igual ao valor mínimo informado.

- `@EmailValido`  
  ➤ Valida se o e-mail está em um formato correto usando expressão regular.

---


## 📚 Conceitos aplicados

✅ Criação de anotações com e sem parâmetros

🔍 Reflexão para acessar campos privados e verificar anotações em tempo de execução

💡 Validações genéricas e reutilizáveis desacopladas do modelo de dados

🎨 Uso de cores ANSI para melhorar a legibilidade no terminal

🧵 Uso de Thread.sleep() para simular tempo de processamento e tornar a execução mais dinamica e bonita

---


