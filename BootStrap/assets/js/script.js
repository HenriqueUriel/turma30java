let nome = document.querySelector("#Nome")
let email = document.querySelector("#email")
let assunto = document.querySelector("#mensagem")
let nomeOk = false
let emailOk = false
let assuntoOk = false

nome.style.width = "100%"
email.style.width = "100%%"
mensagem.style.width = "100%%"

function validaNome() {
    let txtNome = document.querySelector('#txtNome')
    nomeOk = true

    if (nome.value.length < 3) {
        txtNome.innerHTML = "Nome inválido"
        txtNome.style.color = "red"
    } else {
        txtNome.innerHTML = "Nome válido"
        txtNome.style.color = "green"
    }
}

function validaEmail() {
    let txtEmail = document.querySelector("#txtEmail")
    emailOk = true

    if (email.value.indexOf("@") == -1 || email.value.indexOf(".") == -1) {
        txtEmail.innerHTML = "E-mail inválido"
        txtEmail.style.color = "red"
    } else {
        txtEmail.innerHTML = "E-mail válido"
        txtEmail.style.color = "green"
    }
}

function validaMensagem() {
    let txtMensagem = document.querySelector("#txtMensagem") 
    assuntoOk = true

    if (mensagem.value.length >=200) {
        txtMensagem.innerHTML = "Texto muito grande, digite no máximo 200 caracteres"
        txtMensagem.style.color = "red"
        txtMensagem.style.display = "block"
    } 
    else {
        txtMensagem.style.display = "none"
    }
}

function enviar() {
    if (nomeOk == true && emailOk == true && assuntoOk == true) {
        alert ("Formulário enviado com sucesso!")
    } else {
        alert ("Preencha o formulário corretamente antes de enviar...")
    }
}