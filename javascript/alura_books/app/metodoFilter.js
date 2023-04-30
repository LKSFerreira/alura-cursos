const botoesFiltrar = document.querySelectorAll('.btn');

botoesFiltrar.forEach(botao => {
    botao.addEventListener('click', (event) => {
        filtraLivros(event.target.value);
    });
});

function filtraLivros(categoria) {
    console.log('categoria', categoria);

    const livrosFiltrados = categoria === "disponivel" ? filtraPorDisponibilidade() : filtraPorCategoria(categoria)
    console.log('livrosFiltrados', livrosFiltrados);

    renderizaLivros(livrosFiltrados);

    if (categoria === "disponivel") {
        console.log('categoria', categoria);
        const valorTotal = livrosFiltrados.reduce((total, livro) => total + livro.preco, 0);
        renderizaValorTotalLivrosDisponiveis(valorTotal);
    }
}

function filtraPorCategoria(categoria) {
    return livros.filter(livro => livro.categoria == categoria);
}

function filtraPorDisponibilidade() {
    return livros.filter(livro => livro.quantidade > 0);
}

function renderizaValorTotalLivrosDisponiveis(valorTotal) {
    elementoValorTotalLivrosDisponiveis.innerHTML = `
    <div class="livros__disponiveis">
        <p>Todos os livros disponíveis por R$ <span id="valor">${valorTotal.toFixed(2)}</span></p>
    </div>
    `;

    console.log('elementoValorTotalLivrosDisponiveis', elementoValorTotalLivrosDisponiveis);
}

