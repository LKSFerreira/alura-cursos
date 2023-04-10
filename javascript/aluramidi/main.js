const teclas = document.querySelectorAll('.tecla');
const sons = document.querySelectorAll('audio');
const teclado = document.querySelector('.teclado');

function tocaSom(seletorAudio) {
    const elemento = document.querySelector(seletorAudio);

    if (elemento || elemento.localName != "audio") {
        elemento.play();
    } else {
        console.log("Elemento não encontrado ou seletor inválido");
    }
}

// Meu código
teclado.addEventListener('click', (event) => {
    const tecla = event.target;
    const instrumento = tecla.classList[1];
    const idAudio = `#som_${instrumento}`;

    tocaSom(idAudio);
});

teclado.addEventListener('keydown', (event) => {

    if (event.key === "Enter" || event.key === "Space") {
        event.target.classList.add("ativa");
    }
});

teclado.addEventListener('keyup', (event) => {

    if (event.key === "Enter" || event.key === "Space") {
        event.target.classList.remove("ativa");
    }
});



// const listaDeTeclas = document.querySelectorAll('.tecla');

// let contador = 0;

// while (contador < listaDeTeclas.length) {
//     const tecla = listaDeTeclas[contador];
//     const instrumento = tecla.classList[1];
//     const idAudio = `#som_${instrumento}`

//     tecla.onclick = function () {
//         tocaSom(idAudio);
//     };
//     contador++;
// }