const menorValor = 1;
const maiorValor = 100;

const elementoMenorValor = document.getElementById('menor-valor');
elementoMenorValor.textContent = menorValor;

const elementoMaiorValor = document.getElementById('maior-valor');
elementoMaiorValor.textContent = maiorValor;

const numeroSecreto = gerarNumeroAleatorio(maiorValor);



function gerarNumeroAleatorio(maiorValor) {
    return parseInt(Math.random() * (maiorValor + 1));
}
console.log('numeroSecreto', numeroSecreto);
