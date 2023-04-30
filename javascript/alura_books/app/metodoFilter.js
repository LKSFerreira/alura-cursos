const botoesFiltrar = document.querySelectorAll('.btn');

botoesFiltrar.forEach(botao => {
    botao.addEventListener('click', (event) => {
        filtrarLivrosDeFront(event.target.value);
    });
});


// const btnFiltrarLivros = document.querySelector('#btnFiltrarLivrosFront');

// btnFiltrarLivros.addEventListener('click', filtrarLivrosDeFront);

function filtrarLivrosDeFront(categoria) {
    const livrosDeFront = livros.filter(livro => livro.categoria == categoria)
    console.table(livrosDeFront);
    renderizarLivros(livrosDeFront);
}
