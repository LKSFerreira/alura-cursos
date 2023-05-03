import { conectaAPI } from "./conectaAPI.js";
import constroiCards from "./mostraVideos.js";

const lista = document.querySelector('[data-lista]');

async function buscaVideo(event) {
    event.preventDefault();
    const termoDeBusca = document.querySelector('[data-pesquisa]').value;
    const lista = document.querySelector('[data-lista]');

    const busca = await conectaAPI.buscaVideo(termoDeBusca);

    // remove varios elementos filhos de um elemento pai
    /**
     * while (lista.firstChild) {
     *  lista.removeChild(lista.lastChild);
     * }
     */

    lista.innerHTML = "";

    busca.forEach(video => {
        lista.appendChild(constroiCards(video.titulo, video.descricao, video.url, video.imagem));
    });

    if (busca.length == 0) {
        lista.innerHTML = `<h2 class="mensagem__titulo">Não existem vídeos com esse termo.</h2>`;
    }

}

const botaoPequisa = document.querySelector('[data-botao-pesquisa]');
botaoPequisa.addEventListener('click', event => buscaVideo(event));