const teclas = document.querySelectorAll('.tecla');
const sons = document.querySelectorAll('audio');
const teclado = document.querySelector('.teclado');

teclado.addEventListener('click', function (event) {
    const tecla = event.target;
    for (let index = 0; index < teclas.length; index++) {
        if (tecla === teclas[index]) {
            sons[index].play();
            return;
        }
    }
}); 