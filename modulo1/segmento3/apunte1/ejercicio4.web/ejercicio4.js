function sameNumbers(){
	const number1 = parseInt(prompt('Ingrese un numero: '));
	const number2 = parseInt(prompt('Ingrese otro numero: '));
	const number3 = parseInt(prompt('Ingrese otro numero: '));
	const number4 = parseInt(prompt('Ingrese otro numero: '));

	if(number1 == number2)
		alert(number1 + ' y ' + number2 + ' son iguales');

	if(number3 == number4)
		alert(number3 + ' y ' + number4 + 'son iguales');
}
