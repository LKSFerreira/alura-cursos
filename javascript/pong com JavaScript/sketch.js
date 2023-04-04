// Variáveis da Bolinha
let coordenadaXBolinha = 300;
let coordenadaYBolinha = 200;
const diametroBolinha = 20;
const raioBolinha = diametroBolinha / 2;

// Velocidade da Bolinha
let velocidadeXBolinha = 8;
let velocidadeYBolinha = 4;

// Variáveis Raquete
let coordenadaXRaquete = 5;
let coordenadaYRaquete = 150;
const larguraRaquete = 10;
const alturaRaquete = 90;

// Variáveis Opnenete
let coordenadaXOponente = 585;
let coordenadaYOponente = 150;
let velocidadeYOponente = 0;

// Placar do Jogo
let meusPontos = 0;
let pontosOponente = 0;

// Variáveis da Biblioteca
let colidiu = false;

// Variáveis do Sons do Jogo
let raquetada;
let pontuacao;
let trilha;

function preload(){
  raquetada = loadSound("raquetada.mp3");
  pontuacao = loadSound("pontuacao.mp3");
  trilha = loadSound("trilhaSonora.mp3");
}



function setup() {
  createCanvas(600, 400);
  trilha.loop();
}

function draw() {
  background(0);
  
  mostraBolinha();
  mostraRaquetes();
  
  movimentaBolinha();
  movimentaRaquete();
  movimentaOponente();
  
  verificaColisaoBolinhaComBordas();
  verificarColisaoBolinhaComRaqueteBiblioteca(coordenadaXRaquete, coordenadaYRaquete);
  verificarColisaoBolinhaComRaqueteBiblioteca(coordenadaXOponente, coordenadaYOponente)
  
  incluirPlacar();
  marcaPontos();
  
  bolinhaNaoFicaPresa();
  
}

function mostraBolinha(){
  circle(coordenadaXBolinha,coordenadaYBolinha,diametroBolinha);
}

function mostraRaquetes(){
  rect(coordenadaXRaquete, coordenadaYRaquete, larguraRaquete, alturaRaquete);
  rect(coordenadaXOponente, coordenadaYOponente, larguraRaquete, alturaRaquete);
}

function movimentaBolinha(){
  coordenadaXBolinha += velocidadeXBolinha;
  coordenadaYBolinha += velocidadeYBolinha;
}

function movimentaRaquete(){
  if(keyIsDown(87)){
    coordenadaYRaquete -= 10;
  }
  if (keyIsDown(83)){
    coordenadaYRaquete += 10;
  }
}

function movimentaOponente(){
  if(keyIsDown(UP_ARROW)){
    coordenadaYOponente -= 10;
  }
  if (keyIsDown(DOWN_ARROW)){
    coordenadaYOponente += 10;
  }
  // velocidadeYOponente = coordenadaYBolinha - coordenadaYOponente - larguraRaquete-50;
  // coordenadaYOponente += velocidadeYOponente;
}


function verificaColisaoBolinhaComBordas(){
  if (coordenadaXBolinha + raioBolinha > width ||
      coordenadaXBolinha - raioBolinha < 0) {
    inverteSentidoXDaBolinha();
  }
  
  if (coordenadaYBolinha + raioBolinha > height || 
      coordenadaYBolinha - raioBolinha< 0) {
    inverteSentidoYDaBolinha();
  }
}

// function verificaColisaoBolinhaComRaquete(){
//   if (coordenadaXBolinha - raioBolinha < coordenadaXRaquete + larguraRaquete &&
//       coordenadaYBolinha - raioBolinha < coordenadaYRaquete + alturaRaquete &&
//       coordenadaYBolinha + raioBolinha > coordenadaYRaquete) {
//     inverteSentidoXDaBolinha();
//       }
// }

function inverteSentidoXDaBolinha(){
  velocidadeXBolinha *= -1;
}

function inverteSentidoYDaBolinha(){
  velocidadeYBolinha *= -1;
}

// Colisão Biblioteca
function verificarColisaoBolinhaComRaqueteBiblioteca(coordenadaX, coordenadaY){
  colidiu = collideRectCircle(coordenadaX, coordenadaY, larguraRaquete, alturaRaquete, coordenadaXBolinha, coordenadaYBolinha, raioBolinha);
      
    if (colidiu) {
    inverteSentidoXDaBolinha();
      raquetada.play();
    }
}

function incluirPlacar(){
  stroke(255);
  textAlign(CENTER);
  textSize(20);
  fill(color(255,140,0));
  rect(150, 10, 40, 20);
  rect(450, 10, 40, 20);
  fill(255);
  text(meusPontos, 170, 26);
  text(pontosOponente, 470, 26);
}

function marcaPontos(){
  if (coordenadaXBolinha > 590){
    meusPontos++;
    pontuacao.play();
  }
  if (coordenadaXBolinha < 10 ) {
    pontosOponente++;
    pontuacao.play();
  }
}

function bolinhaNaoFicaPresa(){
    if (coordenadaXBolinha - raioBolinha < 0){
    coordenadaXBolinha = 23
    }
}