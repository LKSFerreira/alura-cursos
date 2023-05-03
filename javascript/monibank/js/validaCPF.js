export default function ehCPF(campo) {
    // usando uma Regex para remover os pontos e traços do CPF
    const cpf = campo.value.replace(/\.|-/g, "");
    validaNumerosIguais(cpf);

    console.log(validaNumerosIguais(cpf));
}

function validaNumerosIguais(cpf) {
    const numerosIguais = [
        "00000000000",
        "11111111111",
        "22222222222",
        "33333333333",
        "44444444444",
        "55555555555",
        "66666666666",
        "77777777777",
        "88888888888",
        "99999999999"
    ];

    return numerosIguais.includes(cpf);
}