// Outras variáveis
const larguraTela = 600;
const alturaTela = 400;

function setup() {
  createCanvas(larguraTela, alturaTela);
  trilha.loop();
}

function draw() {
  background(0);

  mostraBolinha();
  mostraRaquetes();

  movimentaBolinha();
  movimentaJogador();
  movimentaOponente();

  verificaColisaoBolinhaComBordas();
  verificarColisaoBolinhaComRaqueteBiblioteca(xJogador, yJogador);
  verificarColisaoBolinhaComRaqueteBiblioteca(xOponente, yOponente)

  marcaPontos();
  mostraPlacar();

  mostraNivel();

  bolinhaNaoFicaPresa();
}

