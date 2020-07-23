var numero, fatorial, contador

function acaoBotao(){
    
numero = prompt("Digite um numero para verificar o fatorial.")

fatorial = 1
for (contador = 1; contador <= numero; contador++) {
    fatorial = fatorial * contador
    
}

document.getElementById("MinhaTagP").innerText = "O fatorial de " + numero + " é " + fatorial

}