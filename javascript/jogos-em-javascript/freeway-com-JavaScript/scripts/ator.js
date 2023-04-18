//código do ator
let xAtor = 85;
let yAtor = 366;
let colisao = false;
let meusPontos = 0;

function mostraAtor() {
  image(imagemDoAtor, xAtor, yAtor, 30, 30);
}

function movimentaAtor() {

  if (spawn) {
    if (keyIsDown(87)) {
      yAtor -= 3;
    }
    if (keyIsDown(83)) {
      if (podeSeMover()) {
        yAtor += 3;
      }
    }
  }

}

let spawn = true;

function verificaColisao() {
  //collideRectCircle(x1, y1, width1, height1, cx, cy, diameter)
  for (let i = 0; i < imagemCarros.length; i++) {

    if (!colisao) {
      if (spawn) {
        colisao = collideRectCircle(xCarros[i], yCarros[i], comprimentoCarro, alturaCarro, xAtor, yAtor, 15)
        console.log(spawn)
      }
    }

    if (colisao) {
      colisao = false;
      spawn = false;
      somDaColisao.play();

      if (maiorDeIdade) {
        carregaAtor("../images/blod.png");
        voltaAtorParaPosicaoInicial("morte");
      } else {
        voltaAtorParaPosicaoInicial("ponto");
      }

      if (pontosMaiorQueZero()) {
        meusPontos -= 1;
      }
    }
  }
}

function voltaAtorParaPosicaoInicial(morteOuPonto) {

  if (morteOuPonto === "morte") {
    setTimeout(() => {
      carregaAtor("../images/ator-1.png");
      yAtor = 366;
      spawn = true;
    }, 1500);
  } else {
    yAtor = 366;
    spawn = true;
  }
}

function incluiPontos() {
  textAlign(CENTER);
  textSize(25);
  fill(color(255, 240, 60))
  text(meusPontos, width / 5, 27);
}

function marcaPonto() {
  if (yAtor < 15) {
    voltaAtorParaPosicaoInicial("ponto");
    meusPontos += 1;
    somDoPonto.play();
  }
}

function pontosMaiorQueZero() {
  return meusPontos > 0;
}

function podeSeMover() {
  return yAtor < 366;
}