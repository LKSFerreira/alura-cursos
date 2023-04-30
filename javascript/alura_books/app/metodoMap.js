function aplicaDesconto(listaDeLivros){
    const desconto = .3;
    const livrosComDesconto = listaDeLivros.map(livro => {
        return {...livro, preco: livro.preco - (livro.preco * desconto)}
    });
    return livrosComDesconto;
}