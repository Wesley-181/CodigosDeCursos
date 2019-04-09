// Sintaxe Padrão JQuery: $(seletor).ação();
/* Forma Padrão
$(document).ready(function(){		//Quando o documento estiver carregado
	$('button').click(function(){	//Selecione(de SELETOR) button, quando clicado
		$('h1').hide();				//Esconda o h1
	});
}); */


/* Forma Reduzida
$(function(){						//Quando o documento estiver carregado
	$('button').click(function(){	//Selecione(de SELETOR) button, quando clicado
		$('h1').hide();				//Esconda o h1
	});
}); */


$(document).ready(function(){		
	/*$('button').click(function(){	
		$('#unico').css("color", "red");
			
			//*** Trecho de Código feito por mim
				$('button').dblclick(function(){
					$('h1').css("color", "blue");
				});
			
	}); */

	/*$('#azul').click(function(){
		$('p').css("color", "blue");

	});

	$('#verde').click(function(){
		 		$('p').css("background-color", "green");
	}); */

/* Efeitos
	$('#azul').click(function(){
		 		$('p').css("background-color", "blue");
		 		$('p').fadeOut();
		 		$('p').delay(3000); //para a execução do Script por determinado tempo
		 		$('p').fadeIn();
		 		$('p').hide('slow');

	});

	$('#verde').click(function(){
		 		$('p').css("background-color", "green");
		 		$('p').fadeOut('slow');
		 		$('p').delay(3000); //para a execução do Script por determinado tempo
		 		$('p').fadeIn('slow');
		 		$('p').hide(5000);
		 		$('p').fadeIn('fast');

	}); */

/*Gravando Mensagens com JQuery
	$('#vermelho').click(function(){
		$('p').css("background-color", "red");
		$('#mensagem').text("Cor alterada com sucesso");
		$('#mensagem').css("color", "red");
		$('#mensagem').css("border", "1px solid red");
		$('#mensagem').delay(2000);
		$('#mensagem').fadeOut('fast');

	}); */ 

/* Encadeamento em Linha e em Bloco
	$('#vermelho').click(function(){
		$('p').css("background-color", "red");
			//$('#mensagem').text("Cor alterada com sucesso").css("color", "red").css("border", "1px solid red").delay(2000).fadeOut('fast');
		$('#mensagem')
			.text("Cor alterada com sucesso")
			.css("color", "red")
			.css("border", "1px solid red")
			.delay(2000)
			.fadeOut('fast');
	}); */

/* Declaração múltipla do CSS
	$('#vermelho').click(function(){
		$('p').css("background-color", "red");
			//$('#mensagem').text("Cor alterada com sucesso").css("color", "red").css("border", "1px solid red").delay(2000).fadeOut('fast');
		$('#mensagem')
			.text("Cor alterada com sucesso")
			.css({color:'red', border: '1px solid red', backgroundColor:'#F08080'})
			.delay(2000)
			.fadeOut('fast');
	}); */

/* Adicionando e Removendo Classes
	$('#vermelho').click(function(){
		$('p').css("background-color", "red");
			//$('#mensagem').text("Cor alterada com sucesso").css("color", "red").css("border", "1px solid red").delay(2000).fadeOut('fast');
		$('#mensagem')
			.text("Cor alterada com sucesso")
			.css({color:'red', border: '1px solid red'})
			.delay(2000)
			.fadeOut('fast')
			.addClass('green');

		$('button').removeClass('red');
	}); */

//Slide feito à mão
	$(function(){
		$('#l1').click(function(){
			$('#i1').show();
			$('#i2').hide();
			$('#i3').hide();
			$('#i4').hide();
		});

		$('#l2').click(function(){
			$('#i1').hide();
			$('#i2').show();
			$('#i3').hide();
			$('#i4').hide();
		});

		$('#l3').click(function(){
			$('#i1').hide();
			$('#i2').hide();
			$('#i3').show();
			$('#i4').hide();
		});

		$('#l4').click(function(){
			$('#i1').hide();
			$('#i2').hide();
			$('#i3').hide();
			$('#i4').show();
		});
	});

});	