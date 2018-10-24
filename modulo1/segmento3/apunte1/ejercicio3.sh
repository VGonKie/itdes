#!/bin/bash

declare sex=""
read -p "Genero: " sex

if [[ "$sex"=="Femenino" ]]
then
	echo "Mujer"
fi

exit 0
