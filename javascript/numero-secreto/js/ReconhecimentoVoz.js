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

    // remove os pontos da frase e substitui a palavra Menos ou menos por - e sem espaços
    const transcricao = eventoDeFala.results[0][0].transcript
        .replace(/\./g, '')
        .replace(/Menos /g, '-')
        .replace(/ /g, '')
        .replace(/Sem/g, '100')
        .replace(/Um/g, '1')
        .replace(/Zero/g, '0');

    const transcricaoValidada = verificaSeOChutePossuiValorValido(transcricao);
    exibeFalaNaTela(transcricaoValidada);
}

recognition.addEventListener('end', () => recognition.start());


