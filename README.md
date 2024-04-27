<h1> Projeto Fullstack com Spring boot, jpa, banco de dados postgres e React com typescript</h1>
 <p align="center">
        <a href="https://skillicons.dev">
          <img src="https://skillicons.dev/icons?i=git,spring,hibernate,postgres,react,ts" />
        </a>
</p>

<h2>Sobre o projeto</h2>

<p>Projeto e vídeo aula disponibilizados pela youtuber, desenvolvedora e influenncer Fernanda Kipper em duas fases, sendo a primeira delas a construção do backend utilizando Spring bot e aplicação de boas práticas de desenvolvimento.
</p>

<a href="https://www.youtube.com/watch?v=lUVureR5GqI&t"> 👉 link do YouTube  </a>

<h2 id="user-content-pre-requisites" tabindex="-1" class="heading-element" dir="auto">💻 Requisitos</h2>

<h3> Para rodar esse projeto você precisa ter: </h3>
<p> Java rodando em sua maquina para o backend</p>
<p> Node.js para criar o front-end</p>
<p> Banco de dados postgres instalado. <em> Observação: Não é preciso te o banco de dados criado. A dependencia JPA do Spring criara o database e as tabelas automaticamente </em></p>

<h2 id="user-content-how-to-use" tabindex="-1" class="heading-element" dir="auto"> 🚀 Instalando o projeto</h2>

<h3>Back-end</h3>
<p>
  Clone o projeto em sua máquina.
</p>
<p>
  Abra-o de preferência com a IDE inteliJ e atualize as dependências do projeto (caso elas n atualizem automaticamente).
</p>
<p>
  Modifique as variavies "spring.datasource.url=jdbc:postgresql:${FOOD_DB}", spring.datasource.username=${POSTGRES_USER}, spring.datasource.password=${POSTGRES_PASSWORD} do arquivo application.properties localizado  na pasta src/main/resources do projeto.
  
</p>
<p> Java rodando em sua maquina para o backend</p>
<p> Node.js para rodar o front-end</p>
<p> Banco de dados postgres instalado. <em>Observação: Não é preciso te o banco de dados criado. A dependencia JPA do Spring criara o database e as tabelas automaticamente </em></p>
<p> Confira se o postgres esta rodando na porta 5432 </p>
<p> De um start na aplicação. Para conferir se o projeto está funcionando. Usando Postman ou qualquer outro software da sua escolha, faça uma requisição get ao endereço: <strong>http://localhost:8080/food </strong> na qual devera retornar dois objetos </p>


<h3>Front-end</h3>
<p>
  Clone o projeto em sua máquina e atualize as dependências atravez do comando 'npm i' ou 'npm install'
</p>

<p>
   Use o comando 'npm run dev' para rodar o projeto. para acessa-lo vá ao endereço 'http://localhost:5173/' da sua máquina
</p>



