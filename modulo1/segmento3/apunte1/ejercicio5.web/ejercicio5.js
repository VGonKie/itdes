function testGeneroEdad(){
	const sex = prompt('Ingrese su genero: ');
	const age = parseInt(prompt('Ingrese su edad: '));

	if(sex == 'Masculino')
		alert('Usted es hombre');
	
	if(age >= 18)
		alert('Usted es mayor de edad');
}
