<?php

//PHP suporta comentários no estilo 'C', 'C++' e Unix shell (estilo Perl).

//Comentário de uma linha "PHP é Case-Sensitive"

/* Comentário de várias linhas

$mensagem = 'Hello World!';

echo $mensagem; 

*/

#Este é um comentário de uma linha no estilo shell

// Echo e Print são comandos de saída

$num = 0;
$x = 3;
$y = 5;
$z = $x + $y;

//echo $z;
//print $z;

/* Estrutura condicional simples em PHP

if($z % 2 == 0){
    echo 'Número PAR';
}
else{
    echo 'Número IMPAR';
}
*/

/* Estruturas de repetição(loop) em PHP (While, Do..While, For, For..Each)

echo "While: ";
while($num < 10){
    echo $num;
    $num++;
}

$num = 0;
echo "<br>Do..While: ";
do{
    echo $num;
    $num++;
}while($num < 10);

echo "<br>For: ";
for($num = 0; $num < 10; $num++){
    echo $num;
}

echo "<br>ForEach: ";
$num = [0,1,2,3,4,5,6,7,8,9];
foreach ($num as $w){
    echo $w;
}
*/

//Array

#$variavel = array(1,2,3,4,5);

// print_r($variavel); Primeira forma de imprimir um Array *Conteúdo + Indice

/* foreach($variavel as $v){
    echo $v; // Segunda forma de imprimir um Array *Somente o conteúdo
}*/

//$variavel = array("A"=>"Brasília","B"=>"Goiás","C"=>"Mato Grosso");
$variavel = array("Brasília","Goiás","Mato Grosso");

//print_r($variavel);

//echo $variavel["B"];
echo $variavel[2];

?>