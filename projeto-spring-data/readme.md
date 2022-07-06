# Marketplace Admin

Este projeto foi gerado com [Angular CLI](https://github.com/angular/angular-cli) version 13.1.1.  
Também foi utilizado o Nodejs na versão 16.10.0 (https://nodejs.org/download/release/v16.10.0/).

## Inicializando o Sistema.

Depois de ter instalado o nodejs na versão 16.10.0 e clonado o repositorio na sua máquina, você precisará criar um arquivo com o nome .npmrc na raiz do projeto, esse .npmrc deverá conter sua **{'\_auth', 'email', 'always-auth' , 'registry'}**.

Essas informações você irá conseguir no site (https://artifactory.dimed.com.br/ui/packages) .
Faça seu login no artifactory.dimed , depois clique em artifacts e escolha npm-dimed .
No canto superior direito terá o seguinte botão "set me up", clique nele e em seguida coloque sua senha.
Após inserir sua senha, você rolarar a barra para baixo e verá o seguinte título "Using basic authentication" .
Copie as 3 linhas de código que será algo parecido com(\_auth = exemplo | email = exemplo@grupopanvel.com.br | always-auth = true)
Cole no .npmrc que você criou na raiz do seu código.
Depois copie e cole 'registry=https://artifactory.dimed.com.br/artifactory/api/npm/npm-dimed'.
Seu arquivo .npmrc deverá ficar da seguinte maneira :

1. **\_auth = exemplo**
2. **email = exemplo@grupopanvel.com.br**
3. **always-auth = true**
4. **registry=https://artifactory.dimed.com.br/artifactory/api/npm/npm-dimed**

Depois do .npmrc configurado, abra um terminal e execute o seguinte código :  
**_Linux/Mac:_** "rm -rf node*modules package-lock.json"
\*\*\_Windows:*\*\* "npm i --legacy-peer-deps"

O script acima irá instalar as dependências do projeto.
Ao terminar de atualizar o projeto , para inicia-lo execute o comando :

**npm run dev**

Agora seu projeto já estará rodando normalmente.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.
