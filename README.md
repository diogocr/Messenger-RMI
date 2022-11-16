# Messenger-RMI

## Comando para compilar e mandar para diretório bin

```json

javac MessengerClientImpl.java MessengerServerImpl.java MessengerClient.java MessengerServer.java -d ..\..\..\bin

```

<br>

## Comandos para executar

```json

start rmiregistry

start java -classpath bin/ -Djava.rmi.server.codebase=file:bin/ messenger.rmi.MessengerServerImpl

start java -classpath bin/ -Djava.rmi.server.codebase=file:bin/ messenger.rmi.MessengerClientImpl usuario1

start java -classpath bin/ -Djava.rmi.server.codebase=file:bin/ messenger.rmi.MessengerClientImpl usuario2

```

<br>

![alt text](imgs/como_executar.png)

## Exemplos do servidor com 3 usuários

![alt text](imgs/exemplo_rodando.png)

