import ehCPF from "./validaCPF.js";

const camposDoFormulario = document.querySelectorAll("[required]");

camposDoFormulario.forEach(function (campo) {
    campo.addEventListener("blur", () => verificaCampo(campo));
});

function verificaCampo(campo) {
    if (campo.name == "cpf" && campo.value.length >= 11) {
        ehCPF(campo);
    }

}

