let nivel = 0;

setInterval(aumentaNivel, 1000);

function aumentaNivel() {
    nivel++;

    xVelocidadeBolinha < yVelocidadeBolinha ? xVelocidadeBolinha++ : yVelocidadeBolinha++;

    console.log(xVelocidadeBolinha);
    console.log(yVelocidadeBolinha);
}

function mostraNivel() {
    stroke(255);
    textAlign(CENTER);
    textSize(20);
    fill(color(255, 140, 0));
    fill(255);
    text("Nível: " + nivel, 300, 26);
    // text(meusPontos, 170, 26);
    // text(pontosOponente, 470, 26);
}