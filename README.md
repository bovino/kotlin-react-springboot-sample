# kotlin-react-springboot-sample
Aplicação de exemplo (Perguntas e Respostas) usando Kotlin, Gradle, SpringBoot 2.3.1, JPA, MySQL 8, JUnit 5 e Mockk no backend.

No front-end a aplicação usa ReactJS (e se der tudo certo, irá usar também Redux, Jest e Enzyme).

Para rodar a aplicação você vai precisar ter préviamente instalado e devidamente configurado o JDK 8 ou superior, o Docker e o Docker Compose.
Uma vez feito isso você deve:

- Baixe o código da aplicação
- Navegue via linha de comando (shell ou bash) até a pasta raiz (caso esteja no Windows use o GitBash, Mingw ou Cygwin)
- Na pasta raiz execute o seguinte comando 
<pre><code>
./backend/gradlew build && docker-compose up
</code></pre>

- espere um pouco até a aplicação terminar de buildar front+backend, baixar os containers e gerar as imagens necessárias
- acesse algum navegador na URL localhost:9090
- Pronto agora é só utilizar a aplicação ou fazer requisições na API Rest via postman (tem uma pasta postman na raiz com as coleções postman pré-configuradas para isso)

Para parar a aplicação volte no prompt de comando e interrompa o docker-compose (CTLR+C)

##### Referências e links de apoio
Instalar Docker Compose em Windows. Mac e Linux:
https://docs.docker.com/compose/install/ 