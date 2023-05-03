import { conectaAPI } from "./conectaAPI.js";
const formulario = document.querySelector('[data-formulario]');

async function criaVideo(event) {
    event.preventDefault();

    const imagem = formulario.querySelector('[data-imagem]').value;
    const url = formulario.querySelector('[data-url]').value;
    const titulo = formulario.querySelector('[data-titulo]').value;
    const descricao = Math.floor(Math.random() * 10).toString();

    const video = {
        imagem: imagem,
        url: url,
        titulo: titulo,
        descricao: descricao
    }

    await conectaAPI.criaVideo(video);

    window.location.href = "../pages/envio-concluido.html";
}

formulario.addEventListener('submit', event => criaVideo(event));

