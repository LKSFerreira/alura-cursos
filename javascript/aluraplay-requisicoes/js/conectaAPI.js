async function listaVideos() {

    const response = await fetch("http://localhost:3000/videos/");
    const data = await response.json();
    return data;
}

export const conectaAPI = {
    listaVideos
}