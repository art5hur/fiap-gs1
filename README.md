# Global Solution

Aplicação Java com container Global Solution - 1° Semestre

## Pré-requisitos

- Java 17+
- Docker 
- Acesso a internet
- Acesso ao Docker Hub

## Instalação

#### Clone

```
git clone https://github.com/art5hur/fiap-gs1.git
```

## Execução


#### Docker

* Criar imagem

```
docker build -t globalsolution .
```

* Executar container

##### Comando "docker" para executar a aplicação a partir do docker hub do respectivo membro com profile "dev"
```
docker run -d -p 8080:8080 -e PROFILE=dev globalsolution
```

##### Comando "docker" para executar a aplicação a partir do docker hub do respectivo membro com profile "stg"
```
docker run -d -p 8080:8080 -e PROFILE=stg globalsolution
```

##### Comando "docker" para executar a aplicação a partir do docker hub do respectivo membro com profile "prd"
```
docker run -d -p 8080:8080 -e PROFILE=prd globalsolution
```

## Navegação

- Base em 'dev'

Menu:
http://localhost:8080


## Features (Funcionalidades)

### Banco de dados

- H2 = dev

- H2 = prd

- H2 = stg

## Integrantes

- Arthur Miranda Santos - RM:93023  -  https://hub.docker.com/repository/docker/art5hur/fiap-gs1/general
- Thomas D'ávila Meyer Pflug - RM:92915  -  https://hub.docker.com/repository/docker/thouser12/fiap-gs1/general
- Renan Bandeira Leite - RM:96168 - https://hub.docker.com/repository/docker/renanleite7/fiap-gs1/general

