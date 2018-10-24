#!/bin/bash

declare sex=""
declare age=""

read -p "Genero: " sex
read -p "Edad: " age

if [[ "$sex" == "Masculino" ]]
then
		echo"Usted es Hombre"
fi

if ((age >= 18))
then
		echo"Usted es Mayor de edad"
fi

exit 0
