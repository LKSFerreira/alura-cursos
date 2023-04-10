// Variáveis Raquete
let xJogador = 5;
let yJogador = 150;
let velocidadeRaquete = 10;

// Variáveis Opnenete
let xOponente = 585;
let yOponente = 150;

// Variáveis da Raquete
const larguraRaquete = 10;
const alturaRaquete = 100;

// Variáveis da Tela
const margemSuperiorTela = 10;
const margemInferiorTela = alturaTela - alturaRaquete - margemSuperiorTela;

let chancesDeErrar = [-75, -55, -35, 0, 35, 55, 75,];
let indiceErro = 0;
let tempoSetInterval = 4000;


function mostraRaquetes() {
    rect(xJogador, yJogador, larguraRaquete, alturaRaquete);
    rect(xOponente, yOponente, larguraRaquete, alturaRaquete);
}

function movimentaJogador() {
    if (keyIsDown(87)) {
        yJogador <= margemSuperiorTela ? yJogador = margemSuperiorTela : yJogador -= velocidadeRaquete;
    }

    if (keyIsDown(83)) {
        yJogador >= margemInferiorTela ? yJogador = margemInferiorTela : yJogador += velocidadeRaquete;
    }
}

function movimentaJogador2() {
    if (keyIsDown(UP_ARROW)) {
        yOponente <= margemSuperiorTela ? yOponente = margemSuperiorTela : yOponente -= velocidadeRaquete;
    }

    if (keyIsDown(DOWN_ARROW)) {
        yOponente >= margemInferiorTela ? yOponente = margemInferiorTela : yOponente += velocidadeRaquete;
    }
}

function limitaTetoDaRaquete(coordenadaY) {
    return coordenadaY >= margemSuperiorTela;
}

function limitaChaoDaRaquete(coordenadaY) {
    return coordenadaY <= margemInferiorTela;
}


function movimentaOponente() {
    yOponente = yBolinha - (alturaRaquete / 2) - chancesDeErrar[indiceErro];

    yOponente <= margemSuperiorTela ? yOponente = margemSuperiorTela : yOponente;
    yOponente >= margemInferiorTela ? yOponente = margemInferiorTela : yOponente;
}

let crescente = true;

setInterval(() => {


    if (crescente) {
        indiceErro++;
        if (indiceErro >= chancesDeErrar.length) {
            crescente = false;
        }
    } else {
        indiceErro--;
        if (indiceErro <= 0) {
            crescente = true;
        }
    }
}, tempoSetInterval);