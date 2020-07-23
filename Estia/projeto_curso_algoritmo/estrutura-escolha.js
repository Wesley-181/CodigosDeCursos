var valor01, valor02, resultado, operacao

function acaoBotao() {
    valor01 = prompt("Digite o primeiro valor: ")
    operacao = prompt("| + | - | * | / |: ")
    valor02 = prompt("Digite o segundo valor: ")

    switch (operacao) {
        case "+":
            resultado = parseInt(valor01) + parseInt(valor02)
            break;
        case "-":
            resultado = parseInt(valor01) - parseInt(valor02)
            break;
        case "*":
                resultado = parseInt(valor01) * parseInt(valor02)
            break;
        case "/":
                resultado = parseInt(valor01) / parseInt(valor02)
            break;
    
    }
    document.getElementById("MinhaTagP").innerText = resultado
   }