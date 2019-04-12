#include <stdio.h>

int main() {
	
	int Dias;			//Declaração de variável do tipo Inteiro
	float Anos;			//Declaração de variável do tipo Real ou Ponto Flutuante
	
	printf("Entre com o numero de dias: "); 	//Entrada de Dados
	scanf("%d", &Dias);		
	Anos = Dias/365.25;							//Conversão Dias -> Anos
	printf("\n\n %d dias equivalem a %f anos. \n",Dias,Anos);
	system("pause");
	return(0);
}
