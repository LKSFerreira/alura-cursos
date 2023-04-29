const dica = document.querySelector('.dica');
const iconeSetaUP = document.querySelector('.fa-arrow-up-9-1');
const iconeSetaDown = document.querySelector('.fa-arrow-down-1-9');

let chute = 0;

function verificaSeOChutePossuiValorValido(transcricao) {
    const numero = +transcricao;

    const tagFalada = `<span class="box">${transcricao}</span>`;

    const naoEhNumero = chuteInvalido(numero);
    if (naoEhNumero) {
        return `${tagFalada}<div>${naoEhNumero}</div>`;
    }

    const valorForaDoRange = chuteForaDosValores(numero);
    if (valorForaDoRange) {
        return `${tagFalada}<div>${valorForaDoRange}</div>`;
    }

    chute++;
    if (numero < numeroSecreto) {
        dica.innerHTML = 'O número secreto é maior';
        iconeSetaDown.classList.add('esconder');
        iconeSetaUP.classList.toggle('esconder');
        return `${tagFalada}`
    } else if (numero > numeroSecreto) {
        dica.innerHTML = 'O número secreto é menor';
        iconeSetaUP.classList.add('esconder');
        iconeSetaDown.classList.toggle('esconder');
        return `${tagFalada}`;
    } else {
        document.body.innerHTML = `
        <h3 class="acertou">Parabéns, você acertou!</h3>
        <div>
           <p>O número secreto era</p>
           <span class="box">${numeroSecreto}</span>
           <p>Você usou ${chute} chutes</p>
           <div class="frame">
            <button class="custom-btn btn-2" onclick="window.location.reload()">Jogar novamente</button>
          </div>
        `;
    }
}

function chuteInvalido(chute) {
    if (Number.isNaN(chute)) {
        return `Você não disse um número`;
    }
    return false;
}

function chuteForaDosValores(valorForaDoRange) {
    if (valorForaDoRange < menorValor || valorForaDoRange > 100) {
        return `O número deve ser entre ${menorValor} e ${maiorValor} `;
    }
    return false
}

function exibeFalaNaTela(transcricao) {
    elementoChute.innerHTML = transcricao;
}