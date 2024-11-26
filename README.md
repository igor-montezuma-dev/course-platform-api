# Plataforma de Cursos - API

Este é um projeto de API para gerenciar uma plataforma de cursos. A API permite o cadastro de usuários (aluno e instrutor), cursos, matricular alunos nos cursos, e possui funcionalidades de listagem e filtro. Há também separação de permissões por papéis (roles).

## Tecnologias Utilizadas

- **Linguagem:** Java 21
- **Framework:** Spring Boot
- **Banco de Dados:** MySQL
- **Containerização:** Docker

## Funcionalidades

- **Gerenciamento de Usuários:**
    - Cadastro de usuários do tipo aluno e instrutor.
    - Listagem de todos os usuários cadastrados.
    - Filtro por nome e e-mail.

- **Gerenciamento de Cursos:**
    - Cadastro de cursos.
    - Listagem de cursos disponíveis.
    - Listar todas as pessoas matriculadas em um curso.

- **Matrícula:**
    - Matricular alunos em cursos.

- **Segurança:**
    - Controle de acesso baseado em roles:
        - `ROLE_STUDENT` para alunos.
        - `ROLE_INSTRUCTOR` para instrutores.
        - `ROLE_ADMIN` para administradores (caso necessário).

## Pré-requisitos

Certifique-se de ter os seguintes itens instalados em sua máquina:

- [Java 21](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
- [Docker](https://www.docker.com/)
- [Maven](https://maven.apache.org/)
- [MySQL](https://www.mysql.com/)

## Configuração do Ambiente

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/plataforma-cursos.git
   cd plataforma-cursos
