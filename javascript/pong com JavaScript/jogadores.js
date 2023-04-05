// Variáveis Raquete
let xJogador = 5;
let yJogador = 150;

// Variáveis Opnenete
let xOponente = 585;
let yOponente = 150;

// Variáveis da Raquete
const larguraRaquete = 10;
const alturaRaquete = 100;


const margemSuperiorTela = 10;
const margemInferiorTela = alturaTela - alturaRaquete - margemSuperiorTela;

// Placar do Jogo
let meusPontos = 0;
let pontosOponente = 0;

function mostraRaquetes() {
    rect(xJogador, yJogador, larguraRaquete, alturaRaquete);
    rect(xOponente, yOponente, larguraRaquete, alturaRaquete);
}

function movimentaJogador() {
    if (keyIsDown(87)) {
        yJogador <= margemSuperiorTela ? yJogador = margemSuperiorTela : yJogador -= 10;
    }

    if (keyIsDown(83)) {

        yJogador >= margemInferiorTela ? yJogador = margemInferiorTela : yJogador += 10;
        console.log(yJogador)
    }
}

function movimentaJogador2() {
    if (keyIsDown(UP_ARROW)) {
        yOponente <= margemSuperiorTela ? yOponente = margemSuperiorTela : yOponente -= 10;
    }

    if (keyIsDown(DOWN_ARROW)) {
        yOponente >= margemInferiorTela ? yOponente = margemInferiorTela : yOponente += 10;
    }
}

function limitaTetoDaRaquete(coordenadaY) {
    return coordenadaY >= margemSuperiorTela;
}



function limitaChaoDaRaquete(coordenadaY) {
    return coordenadaY <= margemInferiorTela;
}

function movimentaOponente() {
    yOponente = yBolinha - alturaRaquete / 2;

    yOponente <= margemSuperiorTela ? yOponente = margemSuperiorTela : yOponente;
    yOponente >= margemInferiorTela ? yOponente = margemInferiorTela : yOponente;

}



