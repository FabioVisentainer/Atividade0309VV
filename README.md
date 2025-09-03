# Atividade Prática: Code Review e Colaboração com Git & GitHub

Esta atividade simula um fluxo de trabalho de desenvolvimento de software em equipe, focando na colaboração através do **Git**, na prática de **revisão de código (Code Review)** e na responsabilidade compartilhada pela qualidade do código.

---

## 🎯 Objetivo Principal

Desenvolver habilidades técnicas e interpessoais essenciais para o trabalho em equipe, como:

- **Fluxo de Trabalho com Git**: Utilizar branches, commits e Pull Requests (PRs) de forma eficaz.
- **Revisão de Código**: Aprender a fornecer e receber feedback construtivo.
- **Qualidade de Código**: Escrever código claro, eficiente e legível.
- **Comunicação Técnica**: Descrever mudanças e argumentar decisões técnicas.

---

## 👥 Formato da Equipe

- Até **4 integrantes**
- **1 Mantenedor(a) da main**: Cria o repositório, revisa os PRs e garante a qualidade do código na branch principal.
- **Até 3 Desenvolvedores(as)**: Cada um resolve um problema lógico em uma branch separada.

---

## 📖 Explicação da Atividade

O ciclo de vida da atividade espelha o que acontece em empresas de tecnologia:

1. Cada desenvolvedor trabalha em uma branch isolada.
2. Quando termina, cria um **Pull Request (PR)** para propor a inclusão na `main`.
3. O PR é revisado por outros membros antes do merge.
4. Durante o review são observados:
    - **Bugs**: O código funciona corretamente?
    - **Clareza**: É fácil de entender?
    - **Boas práticas**: Segue convenções e padrões do projeto?

Esse processo é chamado de **Code Review** e é fundamental para qualidade e aprendizado.

---

## 🧩 Problemas Lógicos a Serem Resolvidos

### Desenvolvedor 1 – Verificador de Anagramas
- **Função**: `sao_anagramas(string1, string2)`
- **Definição**: Retorna `True` se duas strings forem anagramas uma da outra, caso contrário `False`.
- **Regras**:
    - Ignorar espaços.
    - Ignorar diferenças entre maiúsculas e minúsculas.

### Desenvolvedor 2 – Cifra de César
- **Função**: `cifra_de_cesar(texto, deslocamento)`
- **Definição**: Aplica a técnica de criptografia onde cada letra é substituída por outra deslocada no alfabeto.
- **Regras**:
    - Preservar maiúsculas/minúsculas.
    - Não alterar caracteres que não sejam letras.
    - O alfabeto deve ser considerado circular.

### Desenvolvedor 3 – Maior Palavra em uma Frase
- **Função**: `encontrar_maior_palavra(frase)`
- **Definição**: Retorna a maior palavra da frase.
- **Regras**:
    - As palavras são separadas por espaços.
    - Pontuações anexadas às palavras devem ser ignoradas.
    - Em caso de empate, retorna a primeira palavra encontrada.

---

## 📝 Roteiro da Atividade

### 🔹 Fase 1: Preparação (Mantenedor)
1. Criar o repositório no GitHub.
2. Adicionar colaboradores.
3. Criar arquivo inicial (`solucoes.py`) com assinaturas das funções.
4. Proteger a branch `main`.
5. Fazer commit e push inicial.

### 🔹 Fase 2: Desenvolvimento (Desenvolvedores)
1. Clonar o repositório.
2. Distribuir tarefas.
3. Criar branch para cada problema.
4. Implementar a solução no arquivo `solucoes.py`.
5. Fazer commits claros e concisos.
6. Enviar branch para o GitHub.

### 🔹 Fase 3: Code Review (Todos)
1. Criar Pull Request com título e descrição claros.
2. Revisar código em "Files changed".
3. Comentar melhorias e sugerir ajustes.
4. Discutir até aprovação.

### 🔹 Fase 4: Integração (Mantenedor)
- Aprovar e realizar o merge dos PRs.

### 🔹 Fase 5: Sincronização e Finalização
1. Atualizar `main` local após cada merge.
2. Repetir processo até concluir todas as funções.
3. Reunião final para discutir aprendizados:
    - O que funcionou bem?
    - Qual foi a maior dificuldade?
    - O que pode ser melhorado?

---

## ✅ Critérios de Avaliação

- Correção e eficiência das soluções.
- Clareza e legibilidade do código.
- Qualidade dos commits e Pull Requests.
- Participação ativa no processo de revisão.
- Colaboração e comunicação na equipe.  
