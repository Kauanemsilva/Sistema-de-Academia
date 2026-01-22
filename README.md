# 🏋️ Sistema de Gestão de Academia

> Sistema completo de gerenciamento de academia desenvolvido em Java puro, aplicando conceitos de Programação Orientada a Objetos (POO).

---

## 📋 Sobre o Projeto

Este projeto implementa um **sistema de controle e gestão de academia** utilizando Java puro, sem frameworks externos. O sistema permite o cadastro de clientes, funcionários, criação de planos personalizados, gerenciamento de treinos e controle de status dos alunos.

O foco principal é demonstrar **boas práticas de POO**, incluindo encapsulamento, separação de responsabilidades e modelagem de domínio, sendo ideal para estudos ou portfólio de projetos Java.

### 🎯 Funcionalidades

- ✅ **Cadastro de Clientes**: Registre alunos com informações completas
- ✅ **Gestão de Funcionários**: Controle de equipe da academia
- ✅ **Planos e Pacotes**: Diferentes tipos de planos (básico, intermediário, premium)
- ✅ **Treinos Personalizados**: Associe treinos específicos para cada cliente
- ✅ **Controle de Status**: Gerencie clientes ativos/inativos
- ✅ **Listagem Completa**: Visualize todos os clientes cadastrados

---

## 🗂️ Estrutura do Projeto

```
Sistema-de-Academia/
│
├── Cliente.java              # Modelo de dados do cliente/aluno
├── Funcionario.java          # Modelo de funcionário
├── Funcionarioprinc.java     # Lógica principal dos funcionários
├── Pacotes.java              # Tipos de planos da academia
├── Treino.java               # Modelo de treinos personalizados
├── Status.java               # Enum para status (Ativo/Inativo)
├── ListarClientes.java       # Listagem e visualização de clientes
├── Principal.java            # Classe principal de execução
└── Sistema.java              # Gerenciamento geral do sistema
```

### 📦 Descrição das Classes

| Classe | Responsabilidade |
|--------|-----------------|
| `Cliente` | Armazena dados pessoais e informações do aluno |
| `Funcionario` | Representa funcionários da academia |
| `Pacotes` | Define tipos de planos (mensal, trimestral, anual) |
| `Treino` | Modela treinos com exercícios e séries |
| `Status` | Enum que controla situação do cliente (ativo/inativo) |
| `ListarClientes` | Responsável pela listagem e exibição |
| `Sistema` | Gerencia operações do sistema |
| `Principal` | Ponto de entrada da aplicação |

---

## 🚀 Como Executar

### Pré-requisitos

- **Java JDK 8+** instalado
- Terminal ou IDE Java (Eclipse, IntelliJ IDEA, VS Code)

### Passos para Execução

1. **Clone o repositório**
```bash
git clone https://github.com/Kauanemsilva/Sistema-de-Academia.git
cd Sistema-de-Academia
```

2. **Compile os arquivos Java**
```bash
javac *.java
```

3. **Execute o sistema**
```bash
java Principal
```

### Usando uma IDE

1. Importe o projeto na sua IDE preferida
2. Localize a classe `Principal.java`
3. Execute como Java Application

---

## 💻 Exemplo de Uso

```java
// Exemplo de fluxo do sistema

// 1. Criar um novo cliente
Cliente cliente = new Cliente("João Silva", "123.456.789-00", "joao@email.com");

// 2. Definir um pacote/plano
Pacotes plano = new Pacotes("Premium", 150.00, 12);

// 3. Criar treino personalizado
Treino treino = new Treino("Treino A - Superiores");
treino.adicionarExercicio("Supino Reto", 4, 12);
treino.adicionarExercicio("Desenvolvimento", 3, 10);

// 4. Associar treino ao cliente
cliente.setTreino(treino);
cliente.setStatus(Status.ATIVO);


## 🎓 Conceitos de POO Aplicados

Este projeto demonstra diversos conceitos fundamentais da Programação Orientada a Objetos:

- **Encapsulamento**: Atributos privados com getters e setters
- **Abstração**: Modelagem de entidades do mundo real
- **Composição**: Relacionamento entre Cliente e Treino
- **Enumeração**: Uso de enum para Status
- **Separação de Responsabilidades**: Cada classe com função específica

---

## 🛠️ Tecnologias Utilizadas

- **Java SE** - Linguagem principal
- **POO** - Paradigma de programação
- **Git** - Controle de versão

---

## 👥 Autores

Este projeto foi desenvolvido em grupo como parte de estudos em Java e POO.

- **[Kauane M. Silva](https://github.com/Kauanemsilva)** - Desenvolvedora

---

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 🤝 Como Contribuir

Contribuições são bem-vindas! Siga os passos:

1. Faça um Fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/NovaFuncionalidade`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`)
4. Push para a branch (`git push origin feature/NovaFuncionalidade`)
5. Abra um Pull Request

---

## 📞 Contato

Para dúvidas ou sugestões, entre em contato através do GitHub.

---

<div align="center">

**⭐ Se este projeto foi útil, deixe uma estrela!**

</div>

// 5. Listar todos os clientes
ListarClientes.exibirTodos();
```
