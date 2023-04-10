// Placar do Jogo
let meusPontos = 0;
let pontosOponente = 0;

function marcaPontos() {
    if (xBolinha >= 590 && naoFicouPresa) {
        meusPontos++;
        pontuacao.play();
        naoFicouPresa = false;
    }
    if (xBolinha <= 10 && naoFicouPresa) {
        pontosOponente++;
        pontuacao.play();
        naoFicouPresa = false;
    }
}

setInterval(() => naoFicouPresa = true, 1500);

function mostraPlacar() {
    stroke(255);
    textAlign(CENTER);
    textSize(20);
    fill(color(255, 140, 0));
    rect(150, 10, 40, 20);
    rect(450, 10, 40, 20);
    fill(255);
    text(meusPontos, 170, 26);
    text(pontosOponente, 470, 26);
}