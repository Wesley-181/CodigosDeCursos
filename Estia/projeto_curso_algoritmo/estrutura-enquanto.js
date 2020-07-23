var nome, idade, contador, limite

function acaoBotao(){
    

    limite = prompt("Digite quantas vezes repetir: ")
    contador = 0

        while (contador < limite){

            nome = prompt("Digite o nome: ")
            idade = prompt("Digite a idade d@, " + nome)

            if (idade > 18)
                document.getElementById("MinhaTagP").innerText = "A pessoinha de nome " + nome + " é maior de idade"
            else
                document.getElementById("MinhaTagP").innerText = "A pessoinha de nome " + nome + " é menor de idade"    

         contador++
        }
}        