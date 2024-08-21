# JRE vs JDK

## JRE (Java Runtime Environment) --> Usuário

### Inclui a JVM e as bibliotecas de classes necessárias para executar aplicações Java. É usado para rodar programas Java.

## JDK (Java development Kit) --> Dev

### Além de ter o JRE também traz o Javac (Compilador java), javadocs, código fonte da API do java e outras ferramentas.

## JVM (Java virtual Machine)

### Quando escrevemos o código java ele é compilado de um arquivo .java para um arquivo .class, esse código compilado (byte code) .class pode ser estendido por qualquer JVM e traduzido para os códigos de máquina do SO.
### Isso torna o Java uma linguagem universal, já que basta ter um jvm para entender e rodar o código. Cada SO tem uma VM específica.

## Arquivo .jar

### Um arquivo .jar (Java ARchive) é um formato de arquivo que combina múltiplos arquivos de classe Java e recursos associados (como imagens, arquivos de configuração, etc.) em um único arquivo compactado. Ele é usado para distribuir e executar aplicações Java.

### Estrutura de um Arquivo .jar

- Arquivos .class: Contêm o bytecode Java compilado.
- Manifests (MANIFEST.MF): Um arquivo de metadados que pode incluir informações sobre o conteúdo do arquivo .jar e especificar a classe principal (classe que contém o método main que deve ser executado).
- Recursos: Arquivos não Java, como imagens, sons, e outras dependências necessárias para a aplicação.