# AppClima

Linguagem: `Java`

Framework: `Spring Boot`

## Descrição
Trata-se de um programa para ver a temperatura atual de qualquer cidade do Brasil.


## Pré-requisitos

Antes de iniciar, se assegure que possui os requisitos abaixo:

- Java JDK versão 17 ou mais recente;
- 7-Zip (Opcional);
- Pasta com o projeto;


## Compilação/Configuração

Para compilar/configurar este projeto, siga as seguintes etapas:

1. Instale o [Java JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) e defina as variáveis de ambiente no seu sistema, clique para [assistir o tutorial](https://www.youtube.com/watch?v=cRgLuNWCq6c&ab_channel=AmitThinks);
2. Baixe e instale o [7-Zip](https://www.7-zip.org/download.html) (Opcional);
3. Baixe a [pasta do projeto](https://github.com/Felipepereiralima/AppClima/archive/refs/heads/main.zip) e descompacte em um lugar de sua preferência.


## Instalação/Execução

Para instalar/executar este projeto, siga as seguintes etapas:

1. Vá até a pasta descompactada e copie o link do diretório;
2. Abra o prompt/terminal do Windows/Linux/MacOS e digite `cd nomedodiretorio` e aperte Enter;
3. Copie e cole no terminal/prompt de acordo com seu sistema abaixo:

**Windows:**
~~~
mvnw spring-boot:run
~~~
**Linux/MacOS:**
~~~
./mvnw spring-boot:run
~~~
4. Aperte Enter;

Aparecerá a seguinte tela, no qual o programa já será executado.
<img src=https://cdn.discordapp.com/attachments/866390243572449280/1014870197984841838/mvnw.png></img>


## Fazendo as Requisições HTTP

Com o programa rodando através do Prompt/Terminal é só abrir o seu navegador e digitar o seguinte caminho `localhost:8080/temperatura/{nome da cidade}/{UF}`.

<img src=https://cdn.discordapp.com/attachments/866390243572449280/1014867285841805404/unknown.png></img>

- Aparecerá a temperatura atual da cidade em questão.

<img src=https://cdn.discordapp.com/attachments/866390243572449280/1014868005634719785/Temperatura.png></img>
