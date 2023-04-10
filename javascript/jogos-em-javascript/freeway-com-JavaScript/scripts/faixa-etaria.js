const idade = prompt("Qual a sua idade?");

function verificarIdade(idade) {
    if (idade >= 18) {
        return true;
    } else {
        return false;
    }
}

const maiorDeIdade = verificarIdade(idade);