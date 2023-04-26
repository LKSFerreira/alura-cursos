const controle = document.querySelectorAll("[data-controle]");
const estatisticas = document.querySelectorAll("[data-estatistica]");

controle.forEach((elemento) => {
    elemento.addEventListener('click', (event) => {
        manipulaDados(event.target.dataset.controle, event.target.parentNode);
        atualizaEstatisticas(event.target.dataset.peca);
    });
});

function atualizaEstatisticas(peca){
    estatisticas.forEach((elemento) => {
        elemento.textContent = parseInt(elemento.textContent) + pecas[peca][elemento.dataset.estatistica];
    });
}

function manipulaDados(operacao, controle) {
    const peca = controle.querySelector("[data-contador]");
    switch (operacao) {
        case "-":
            peca.value = parseInt(peca.value) - 1;
            break;
        case "+":
            peca.value = parseInt(peca.value) + 1;
            break;
    }
}

const pecas = {
    "bracos": {
        "forca": 29,
        "poder": 35,
        "energia": -21,
        "velocidade": -5
    },

    "blindagem": {
        "forca": 41,
        "poder": 20,
        "energia": 0,
        "velocidade": -20
    },
    "nucleos": {
        "forca": 0,
        "poder": 7,
        "energia": 48,
        "velocidade": -24
    },
    "pernas": {
        "forca": 27,
        "poder": 21,
        "energia": -32,
        "velocidade": 42
    },
    "foguetes": {
        "forca": 0,
        "poder": 28,
        "energia": 0,
        "velocidade": -2
    }
}