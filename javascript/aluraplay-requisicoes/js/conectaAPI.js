async function listaVideos() {

    const response = await fetch("http://localhost:3000/videos/");
    const data = await response.json();
    return data;
}

async function criaVideo(video) {
    const response = await fetch("http://localhost:3000/videos/", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            titulo: video.titulo,
            descricao: `${video.descricao} mil visualizações`,
            url: video.url,
            imagem: video.imagem
        })
    });
    const data = await response.json();
    return data;
}
async function buscaVideo(termoDeBusca){
    const response = await fetch(`http://localhost:3000/videos?q=${termoDeBusca}`);
    const data = await response.json();
    return data;
}

export const conectaAPI = {
    listaVideos,
    criaVideo,
    buscaVideo
}