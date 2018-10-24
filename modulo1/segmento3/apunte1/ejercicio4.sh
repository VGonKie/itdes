#!/bin/bash

read -p "Ingrese un número: " number1
read -p "ingrese otro número: " number2
read -p "ingrese otro número: " number3
read -p "ingrese otro número: " number4

if ((number1==number2))
then
	echo "$number1 y $number2 son iguales"
fi

if ((number3==number4))
then
	echo "$number3 y $number4 son iguales"
fi

exit 0
