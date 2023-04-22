const formulario = document.getElementById("novoItem");
const lista = document.getElementById("lista");
const itens = [];

formulario.addEventListener("submit", (event) => {
    event.preventDefault();

    const nome = event.target.elements["nome"].value;
    const quantidade = event.target.elements["quantidade"].value;

    criaElemento(nome, quantidade);

    limpaFormulario(event);
});

function limpaFormulario(evento) {
    evento.target.elements["nome"].value = "";
    evento.target.elements["quantidade"].value = "";
};

function criaElemento(nome, quantidade) {
    const novoItem = document.createElement("li");
    novoItem.classList.add("item");

    const quantidadeItem = document.createElement("strong");
    quantidadeItem.innerHTML = quantidade;

    novoItem.appendChild(quantidadeItem);
    novoItem.innerHTML += " " + nome;

    lista.appendChild(novoItem);

    const novoObjeto = {
        "nome": nome,
        "quantidade": quantidade
    }

    itens.push(novoObjeto);

    localStorage.setItem("itens", JSON.stringify(itens));      
}

