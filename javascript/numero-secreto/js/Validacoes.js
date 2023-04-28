function verificaSeOChutePossuiValorValido(transcricao) {
    const numero = parseInt(transcricao) + 0;
    console.log('numero', numero);

    if (chuteInvalido(numero) || chuteForaDosValores(numero)) {
        return false;
    }
}

function chuteInvalido(numero) {
    if (Number.isNaN(numero)) {
        exibeFalaNaTela('Você não disse um número');
        return true;
    }
    return false;
}

function chuteForaDosValores(numero) {
    if (numero < menorValor || numero > 100) {
        exibeFalaNaTela(`O número deve ser entre ${menorValor} e ${maiorValor}`);
        return true;
    }
    return false
}