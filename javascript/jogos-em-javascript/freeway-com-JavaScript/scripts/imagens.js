// imagens e sons do jogo

let imagemDaEstrada;
let imagemDoAtor;
let imagemCarro;
let imagemCarro2;
let imagemCarro3;

//sons do jogo

let somDaTrilha;
let somDaColisao;
let somDoPonto;

function preload() {
  imagemDaEstrada = loadImage("../images/estrada.png");
  imagemDoAtor = loadImage("../images/ator-1.png");
  imagemCarro = loadImage("../images/carro-1.png");
  imagemCarro2 = loadImage("../images/carro-2.png");
  imagemCarro3 = loadImage("../images/carro-3.png");
  imagemCarros = [imagemCarro, imagemCarro2, imagemCarro3, imagemCarro, imagemCarro2, imagemCarro3]

  somDaTrilha = loadSound("../sounds/trilha.mp3");
  somDaColisao = loadSound("../sounds/colidiu.mp3");
  somDoPonto = loadSound("../sounds/pontos.wav");
}

function carregaAtor(path) {
  imagemDoAtor = loadImage(path);
}