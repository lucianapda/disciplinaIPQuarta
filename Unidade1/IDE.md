# Disciplina de Introdução à Programação

## Ambiente de Desenvolvimento Prático

Para o desenvolvimento da parte prática precisamos de uma **Linguagem de Programação** e uma **IDE** (Integrated Development Environment ou Ambiente de Desenvolvimento Integrado). Também podemos usar outras ferramentas para ajudar neste processo de aprender a programar. Separei algumas abaixo que gradativamente iremos usar. Bom, vamos começar pela Linguagem de Programação (_let's go_).

### Instalando a Linguagem de Programação - Java

Para instalar o Java acesse o link

[<https://adoptopenjdk.net/>](<https://adoptopenjdk.net/> "Para instalar o Java").

Selecionar OpenJDK 11 (LTS) e HotSpot. Clique no Último Lançamento, e assim irá baixar um arquivo .msi. Depois dê dois clicks no arquivo, … e alguns next … mas ATENÇÃO … se aparecer uma janela deste tipo

![Path do Java](../imgs/OpenJDKpath.png "Path do Java")

selecione a opção em vermelho. Assim a variável do sistema JAVA_HOME fica definida para está instalação do Java … e depois, next, ..., finish.

### Instalando a IDE - VSCode

A IDE a ser utilizada será o Microsoft Visual Studio Code (VSCode). Além do VSCode também será necessário instalar algumas **Extensions** (extensões) para trabalhar com a linguagem de programação definida (no caso o Java).

#### Instalando o VSCode

Para instalar o VSCode acesse o link

[<https://code.visualstudio.com/>](<https://code.visualstudio.com/> "Para instalar o VSCode").

Selecione Versão para Windows – Stable Build. Dois clicks no arquivo, e next, ..., next, finish.

#### Instalando as Extensions

A instalação das extensões é feita direto dentro do VSCode. Para isto, abra o VSCode, é vá para barra lateral “Extensions”. No campo de texto que aparecer digite: java, e na primeira ocorrência de “Java Extension Pack” clicar em install.

<!-- Caso queira listar quais extensões está usando pode usar os comando em:  
Unix:  
> code --list-extensions | xargs -L 1 echo code --install-extension

Windows (PowerShell, e. g. using Visual Studio Code's integrated Terminal):  
> code --list-extensions | % { "code --install-extension $_" }
-->
Ao instalar a extensão “Java Extension Pack” outras extensões devem ser instaladas outras extensões junto, e no final deve ter estas extensões:

![Extensões Java no VSCode](./imgs/IDEjavaExtensoes.png "Extensões Java no VSCode")  

**Importante**: feche e abra o VSCode para efetivar as instalações das extensões.

### Testando o Ambiente de Desenvolvimento

Uma maneira prática de testar o ambiente que iremos usar é criando um "Hello World" em Java. Para fazer este teste existe várias formas, uma delas é:

- No VSCode no menu "View / Command Palette …" digite/selecione "Java:  Create Java Project …".
  
  ![View / Command Palette](../imgs/VSCodeViewProjetoJava.png "View / Command
  Palette")

- Selecione "No build tools" … espere um pouco … e quando aparecer a janela escolha um "local" para salvar o seu projeto. Após selecionar o "local" entre com um nome para seu projeto, e pressione "enter" para confirmar. O seu projeto deve ter sido criado, e aparecer algo deste tipo:  
![Exemplo de projeto](../imgs/VSCodeExemploProjeto.png "Exemplo de projeto")  

- Agora selecione na janela esquerda do VSCode a pasta "src", e depois o arquivo "App.java". As vezes além de abrir a janela para mostrar o arquivo "App.java" também abre a janela "Java Overview" .. por enquanto podes fechar a janela "Java Overview".
  
![Executando um código em Java](../imgs/VSCodeJavaRun.png "Executando um código em Java")

- Agora clique em "Run" que aparece no texto da janela "App.java" entre as linhas 1 e 2. Assim deve aparecer uma nova janela abaixo da janela do texto do "App.java" com algumas linhas de texto .. é a janela do "TERMINAL". Nesta janela (do TERMINAL) deve aparecer o texto "Hello, World!".

![Execução no Terminal](../imgs/VSCodeJavaTerminal.png "Execução no Terminal")

- este texto é a mensagem que foi definida no programa "App.java" para ser escrito para o usuário … e … meus parabéns, já tens o PRIMEIRO programa em Java 😉.