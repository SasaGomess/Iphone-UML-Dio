<h1> Projeto iPhone UML - DIO 🍎</h1>

O projeto sobre orientação a objetos realizado durante o bootcamp Dio para reforçar meu conhecimento em abstração, análise de negócios e resolução de problemas.

**Projeto realizado durante bootcamp Dio - Java Cloud Native.**

<h2>Funcionamento 🔵</h2> 

Criei interfaces ````ReprodutorMusical````,  ````AparelhoTelefonico```` e ````NavegadordaIntenet```` para representar os papéis do iPhone, fiz a escolha de utilizar as interfaces para poder implementar na minha classe Iphone mantendo assim as regras de negócio coesas. No programa principal criei métodos para executar cada um dos serviços.

<h2>Classes e métodos 📌 </h2> 

### Interface - *ReprodutorMusical*
Foi utilizada para representar um reprodutor musical de um iPhone (Ipad) com os métodos: ```` + tocar() ````: para começar a tocar a musica. ````+ pausar()````: para pausar a música. ````+ selecionarMusica(String musica)````: para selecionar musica inserida pelo usuário.
### Interface - *NavegadorInternet*
Utilizada para representar o navegador da internet Safari com os métodos: ````+ exibirPagina(String url)````: para exibir uma url no programa com www.(siteescolhido).com. ````+ adcionarNovaAba() ````: para adcionar nova aba de site escolhido pelo usuário. ````+ atualizarAba()````: utilizada para atualizar a aba de um navegador quando é criada.
### Interface - *AparelhoTelefonico*
Utilizado para representar a parte de ligações e chamadas de um iPhone com os métodos: ````+ ligar(String numero)````: selecionando contato para ligar. ````+ atender()````: utilizado para atender uma chamada.
````+ iniciarCorreioDeVoz()````: utilizado para iniciar um correio de voz se o usuário quiser.

### Diagrama iPhone 📱
![IphoneDiagrama - Classe UML](https://github.com/user-attachments/assets/038b9a2e-91ee-4305-95b8-29a7db043686)

<h2>Como visualizar o Diagrama de Classes</h2>

* Pelo site [LucidChart](https://www.lucidchart.com/)
* Crie uma conta e cole esse link: (https://lucid.app/lucidchart/0a6d7d21-aced-459c-be91-ba998243c61a/edit?viewport_loc=-752%2C-234%2C2992%2C1405%2CHWEp-vi-RSFO&invitationId=inv_aa82f9b0-bebb-41f0-9345-879069a3b038)
* E visualize o diagrama e suas funcionalidades.
  
<h2>Como executar?🟢</h2>


* Tenha a JDK instalada em sua máquina
* Clone meu repositório ````git clone https://github.com/SasaGomess/Iphone-UML-Dio.git````
* Escolha uma IDE Eclipse ou IntelliJ
* Execute no console e insira os dados pedidos
