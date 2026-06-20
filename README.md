# Grafo - Maior Clique

Repositório destinado ao projeto da disciplina de **Programação Orientada a Objetos (POO) Aplicada**. 

A aplicação foi desenvolvida para resolver o problema do "Maior Clique" (Maximum Clique) em Teoria dos Grafos, estruturada como uma aplicação Web/API. 

## 🚀 Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias e ferramentas:

* [cite_start]**Java**: Linguagem principal da aplicação (99.2% do código)[cite: 21].
* [cite_start]**Maven**: Gerenciador de dependências e build (`pom.xml` e `mvnw`)[cite: 16, 17].
* [cite_start]**Docker**: Conteinerização da aplicação (`Dockerfile`)[cite: 15].
* [cite_start]**Spring Boot** (Presumido): Utilizado para a criação da API web, incluindo configurações de CORS (`WebConfig` para aceitar requisições de qualquer endereço)[cite: 11].

## 📂 Estrutura do Projeto

* [cite_start]`/src`: Contém o código-fonte principal da aplicação Java[cite: 13].
* [cite_start]`pom.xml` / `.mvn/`: Configurações de dependências do Maven[cite: 13, 17].
* [cite_start]`Dockerfile`: Arquivo para a construção da imagem Docker do projeto[cite: 15].

## ⚙️ Como Executar

Você pode rodar este projeto localmente utilizando o Maven ou o Docker.

### Opção 1: Usando Maven (Local)

Certifique-se de ter o Java instalado em sua máquina. Para iniciar a aplicação, utilize o wrapper do Maven incluído no projeto:

No Linux/macOS:
```bash
./mvnw spring-boot:run

```

No Windows:

```cmd
mvnw.cmd spring-boot:run

```

### Opção 2: Usando Docker

Se preferir rodar a aplicação via container, certifique-se de ter o Docker instalado e execute os comandos abaixo na raiz do projeto:

1. Construa a imagem Docker:

```bash
docker build -t grafo-maior-clique .

```

2. Execute o container:

```bash
docker run -p 8080:8080 grafo-maior-clique

```

*(Nota: Ajuste a porta `8080` caso sua aplicação utilize uma porta diferente).*

## 👨‍💻 Autor

* 
**Yves de Sá Barbosa** - [@YvesDeSa](https://www.google.com/search?q=https://github.com/YvesDeSa) 
