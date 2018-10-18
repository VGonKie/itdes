#!/bin/bash

declare -i number1=0
read -p "Ingrese un número: " number1

declare -i number2=0
read -p "Ingrese otro número: " number2

declare -i result=$((number1 * number2))

echo "El resultado de la multiplicación es: $result"

exit 0
