#include <stdio.h>

int main() {
	
	int Dias;			//Declara��o de vari�vel do tipo Inteiro
	float Anos;			//Declara��o de vari�vel do tipo Real ou Ponto Flutuante
	
	printf("Entre com o numero de dias: "); 	//Entrada de Dados
	scanf("%d", &Dias);		
	Anos = Dias/365.25;							//Convers�o Dias -> Anos
	printf("\n\n %d dias equivalem a %f anos. \n",Dias,Anos);
	system("pause");
	return(0);
}
