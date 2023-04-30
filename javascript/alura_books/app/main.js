let livros = [];
const endpointDaApi = 'https://guilhermeonrails.github.io/casadocodigo/livros.json';

getBuscarLivros();

async function getBuscarLivros() {
    const response = await fetch(endpointDaApi);
    const data = await response.json();
    livros = data;
    const livrosComDesconto = aplicaDesconto(livros);    
    renderizaLivros(livrosComDesconto);
}

