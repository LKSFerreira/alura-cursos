const formulario = document.getElementById("novoItem");
const lista = document.getElementById("lista");
const itens = JSON.parse(localStorage.getItem("itens")) || [];

itens.forEach((item) => {
    criaElemento(item);
});

formulario.addEventListener("submit", (event) => {
    event.preventDefault();

    const nome = event.target.elements["nome"];
    const quantidade = event.target.elements["quantidade"];

    const item = {
        "nome": nome.value,
        "quantidade": quantidade.value
    }

    const existeItem = itens.find(itemDaLista => itemDaLista.nome === item.nome);

    if (existeItem) {
        item.id = existeItem.id;
        document.querySelector(`[data-id="${item.id}"]`).innerHTML = item.quantidade;

        // atualizaItem(item);
    } else {
        item.id = itens.length;
        criaElemento(item);
        itens.push(item);
    }

    localStorage.setItem("itens", JSON.stringify(itens));
    limpaFormulario(event);
});

function limpaFormulario(evento) {
    evento.target.elements["nome"].value = "";
    evento.target.elements["quantidade"].value = "";
};

function criaElemento(novoElemento) {

    const novoItem = document.createElement("li");
    novoItem.classList.add("item");

    const quantidadeItem = document.createElement("strong");
    quantidadeItem.innerHTML = novoElemento.quantidade;
    quantidadeItem.dataset.id = novoElemento.id;


    novoItem.appendChild(quantidadeItem);
    novoItem.innerHTML += " " + novoElemento.nome;

    lista.appendChild(novoItem);
}