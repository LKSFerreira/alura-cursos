async function buscaCEP(cep) {
    try {
        const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
        const data = await response.json();
        if (response.erro) {
            throw new Error(404);
        } else {
            console.log(data);
        }
    } catch (erro) {
        erro = erro.toString().replace('Error: ', '');
        switch (erro) {
            case "404":
                console.log('CEP não encontrado');
                break;
            case "500":
                console.log('Erro no servidor');
                break;
            default:
                console.log('CEP invalido');
                break;
        }
    }
}

const $cep = document.querySelector('#cep');

$cep.addEventListener('focusout', buscaCEP($cep.value));








// var viaCep = fetch('https://viacep.com.br/ws/01001a00/json/')
//     .then(response => {
//         if (!response.ok) {
//             throw new Error(500)
//         } else
//             return response.json();
//     })
//     .then(data => {
//         if (data.erro) {
//             throw new Error(404);
//         } else
//             console.log(data);
//     })
//     .catch(erro => {
//         erro = erro.toString().replace('Error: ', '');
//         switch (erro) {
//             case "404":
//                 console.log('CEP não encontrado');
//                 break;
//             case "500":
//                 console.log('Erro no servidor');
//                 break;
//             default:
//                 console.log('CEP invalido');
//                 break;
//         }
//     });