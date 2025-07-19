# 💈 Barber Shop API - Back-end - DIO

API REST desenvolvida com **Java 21** e **Spring Boot 3.4** para gerenciamento de agendamentos e clientes de uma barbearia. Este projeto faz parte de uma aplicação fullstack e segue boas práticas de arquitetura, validação e documentação com OpenAPI.

---

## ✅ Funcionalidades

- ✅ Cadastro de clientes  
- ✅ Atualização de dados de clientes  
- ✅ Agendamento de horários por data/mês  
- ✅ Remoção de registros  
- ✅ Integração com PostgreSQL e Flyway  
- ✅ Mapeamento com MapStruct  
- ✅ Validações com Hibernate Validator  
- ✅ Documentação automática com SpringDoc OpenAPI

---

## 🧱 Tecnologias utilizadas

| Categoria      | Tecnologia                |
|----------------|---------------------------|
| Linguagem      | Java 21                   |
| Framework      | Spring Boot 3.4.3         |
| ORM            | Spring Data JPA           |
| Validação      | Hibernate Validator       |
| Banco de Dados | PostgreSQL                |
| Versionamento  | Flyway                    |
| Build Tool     | Maven                     |
| Mapeamento     | MapStruct                 |
| Documentação   | SpringDoc OpenAPI         |
| Containerização| Docker + Docker Compose   |
| Dev Tools      | Spring Boot DevTools      |

---


###  Endpoints principais ###
## Clientes (/clients) ##
- Método	Rota	Descrição
- POST	/clients	Cadastrar novo cliente
- PUT	/clients/{id}	Atualizar dados do cliente
- GET	/clients/{id}	Buscar cliente por ID
- DELETE	/clients/{id}	Remover cliente

## Agendamentos (/schedules) ##
- Método	Rota	Descrição
- POST	/schedules	Criar novo agendamento
- DELETE	/schedules/{id}	Remover agendamento
- GET	/schedules/{year}/{month}	Listar agendamentos por ano e mês


