let nome = document.querySelector("#nome")
let email = document.querySelector("#email")
let assunto = document.querySelector("#assunto")
let nomeOk = false
let emailOk = false
let assuntoOk = false

nome.style.width = "50%"
email.style.width = "50%"
assunto.style.width = "50%"

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

function validaAssunto() {
    let txtAssunto = document.querySelector("#txtAssunto") 
    assuntoOk = true

    if (assunto.value.length >=100) {
        txtAssunto.innerHTML = "Texto muito grande, digite no máximo 100 caracteres"
        txtAssunto.style.color = "red"
        txtAssunto.style.display = "block"
    } 
    else {
        txtAssunto.style.display = "none"
    }
}

function enviar() {
    if (nomeOk == true && emailOk == true && assuntoOk == true) {
        alert ("Formulário enviado com sucesso!")
    } else {
        alert ("Preencha o formulário corretamente antes de enviar...")
    }
}