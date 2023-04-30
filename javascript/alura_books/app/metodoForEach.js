const elementoParaInserirOsLivros = document.querySelector('#livros');
const elementoValorTotalLivrosDisponiveis = document.querySelector('#valor_total_livros_disponiveis');

function renderizaLivros(listaDeLivros) {
  elementoValorTotalLivrosDisponiveis.innerHTML = "";
  elementoParaInserirOsLivros.innerHTML = "";

  listaDeLivros.forEach(livro => {
    const disponibilidade = livro.quantidade < 1 ? 'indisponivel' : 'disponivel';
    elementoParaInserirOsLivros.innerHTML += `
    <div class="livro">
      <img class="livro__imagens ${disponibilidade}" src="${livro.imagem}" alt="${livro.alt}"/>
      <h2 class="livro__titulo">
        ${livro.titulo}
      </h2>
      <p class="livro__descricao">${livro.autor}</p>
      <p class="livro__preco" id="preco">R$${livro.preco.toFixed(2)}</p>
      <div class="tags">
        <span class="tag">${livro.categoria}</span>
      </div>
    </div>
    `
  });
}
