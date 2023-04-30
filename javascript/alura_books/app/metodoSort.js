const botaoOrdenarLivrosPorPreco = document.querySelector('#btnOrdenarPorPreco');

botaoOrdenarLivrosPorPreco.addEventListener('click', ordenarLivrosPorPreco);

function ordenarLivrosPorPreco() {
    const livrosOrdenadosPorPreco = livros.sort((livro1, livro2) => livro1.preco - livro2.preco);
    renderizaLivros(livrosOrdenadosPorPreco);
}