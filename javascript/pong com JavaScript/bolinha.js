// Variáveis da Bolinha
let xBolinha = 300;
let yBolinha = 200;
const diametroBolinha = 20;
const raioBolinha = diametroBolinha / 2;

// Velocidade da Bolinha

let xVelocidadeBolinha = 7;
let yVelocidadeBolinha = 7;

// Variáveis da Biblioteca
let colidiu = false;

function mostraBolinha() {
    circle(xBolinha, yBolinha, diametroBolinha);
}

function verificaColisaoBolinhaComBordas() {
    if (xBolinha + raioBolinha > larguraTela ||
        xBolinha - raioBolinha < 0) {
        inverteSentidoXDaBolinha();
    }

    if (yBolinha + raioBolinha > alturaTela ||
        yBolinha - raioBolinha < 0) {
        inverteSentidoYDaBolinha();
    }
}

// Colisão Biblioteca
function verificarColisaoBolinhaComRaqueteBiblioteca(coordenadaX, coordenadaY) {
    colidiu = collideRectCircle(coordenadaX, coordenadaY, larguraRaquete, alturaRaquete, xBolinha, yBolinha, raioBolinha);

    if (colidiu) {
        inverteSentidoXDaBolinha();
        raquetada.play();
    }
}

function movimentaBolinha() {
    xBolinha += xVelocidadeBolinha;
    yBolinha += yVelocidadeBolinha;
}

function inverteSentidoXDaBolinha() {
    xVelocidadeBolinha *= -1;
}

function inverteSentidoYDaBolinha() {
    yVelocidadeBolinha *= -1;
}

function bolinhaNaoFicaPresa() {
    const correcaoPixel = 2;

    xBolinha >= xOponente ? xBolinha = xOponente - larguraRaquete - correcaoPixel : xBolinha;
    xBolinha <= xJogador ? xBolinha = xJogador + larguraRaquete + correcaoPixel : xBolinha;
}