function marcaPontos() {
    if (xBolinha > 590) {
        meusPontos++;
        pontuacao.play();
    }
    if (xBolinha < 10) {
        pontosOponente++;
        pontuacao.play();
    }
}

function incluirPlacar() {
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