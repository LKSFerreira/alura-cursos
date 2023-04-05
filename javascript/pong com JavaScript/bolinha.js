// Variáveis da Bolinha
let xBolinha = 300;
let yBolinha = 200;
const diametroBolinha = 20;
const raioBolinha = diametroBolinha / 2;

// Velocidade da Bolinha
let xVelocidadeBolinha = 5;
let yVelocidadeBolinha = 5;

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

    // Armazena a posição anterior da bola
    let xBolinhaAnterior = xBolinha;
    let yBolinhaAnterior = yBolinha;

    const correcaoPixel = 1;

    xBolinha >= xOponente ? xBolinha = xOponente - larguraRaquete - correcaoPixel : xBolinha;
    xBolinha <= xJogador ? xBolinha = xJogador + larguraRaquete + correcaoPixel : xBolinha;

    // if (xBolinha > 600 + 2) {
    //     xBolinha = 590;
    // }

    // if (xBolinha < xOponente + larguraRaquete ||
    //     yBolinha > yOponente ||
    //     yBolinha < yOponente + alturaRaquete) {
    //     xBolinha = xOponente - larguraRaquete;
    // }


    // xBolinha < larguraRaquete ? xBolinha = larguraRaquete : xBolinha;

    // xBolinha > 600 - larguraRaquete ? xBolinha = 600 - larguraRaquete : xBolinha;



    // // Move a bola para a nova posição
    // xBolinha += velocidadeX;
    // yBolinha += velocidadeY;

    // // Verifica se a bola está indo em direção à raquete adversária
    // if (xBolinhaAnterior > xOponente && xBolinha <= xOponente + larguraRaquete) {
    //     // Corrige a posição da bola
    //     xBolinha = xOponente + larguraRaquete;
    // }
}