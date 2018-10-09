function determinarComisaria() {
	const barrio = prompt('En qué barrio vivís?', 'Igresa tu barrio');
	const direccion = prompt('Cuál es la dirección de la comisaria más cercana?', 'Igresa la dirección');
	const entre1 = prompt('Cuál es la primera entrecalle?', 'Igresa el nombre');
	const entre2 = prompt('Cuál es la segunda entrecalle?', 'Igresa el nombre');

	alert(`La comisaría de ${barrio} se encuentra en ${direccion} entre ${entre1} y ${entre2}`);
}
