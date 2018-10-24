#!/bin/bash

declare -i number=0
read -p "Ingrese un número: " number

if ((number == 10))
then
	echo "El número ingresado es 10"
fi

exit 0
