let nivel = 0;
const dificuldadeMaxima = 11;
let podeAumentarNivel = true;

setInterval(() => {
    ((pontosOponente % 5 == 0 && pontosOponente != 0) || (meusPontos % 5 == 0 && meusPontos != 0)) && podeAumentarNivel ? aumentaNivel() : podeAumentarNivel = true;
}, 1000);

function aumentaNivel() {
    if (nivel < dificuldadeMaxima) {
        nivel++;
        podeAumentarNivel = false;

        velocidadeRaquete >= 5 ? velocidadeRaquete-- : velocidadeRaquete;

        xVelocidadeBolinha > 0 && nivel < dificuldadeMaxima ? xVelocidadeBolinha++ : xVelocidadeBolinha;
        yVelocidadeBolinha > 0 && nivel < dificuldadeMaxima ? yVelocidadeBolinha++ : yVelocidadeBolinha;
    }
}

function mostraNivel() {
    stroke(255);
    textAlign(CENTER);
    textSize(20);
    fill(color(255, 140, 0));
    fill(255);
    text("Nível: " + nivel, 300, 26);
}