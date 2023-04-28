const SpeechRecognition = window.SpeechRecognition || webkitSpeechRecognition;
const SpeechGrammarList = window.SpeechGrammarList || webkitSpeechGrammarList;
const SpeechRecognitionEvent = window.SpeechRecognitionEvent || webkitSpeechRecognitionEvent;

const elementoChute = document.getElementById('chute');

const recognition = new SpeechRecognition();
const speechRecognitionList = new SpeechGrammarList();
recognition.lang = 'pt-BR';


recognition.start();

recognition.addEventListener('result', onSpeak);

function onSpeak(eventoDeFala) {

    let transcricao = eventoDeFala.results[0][0].transcript;
    // remove os pontos da frase e substitui a palavra Menos ou menos por - e sem espaços
    transcricao = transcricao.replace(/\./g, '').replace(/Menos /g, '-').replace(/menos /g, '-').replace(/ /g, '');

    const valorFalado = parseInt(transcricao);

    console.log('valorFalado', valorFalado);

    exibeFalaNaTela(valorFalado);

    verificaSeOChutePossuiValorValido(transcricao);
    // verificar(resultado);
}

function exibeFalaNaTela(transcricao) {
    elementoChute.innerHTML = `<span class="box">${transcricao}</span>`;
}