#!/bin/bash

declare DNI=""
read -p "Ingrese su DNI: " DNI

declare nombre=""
read -p "Ingrese su nombre: " nombre

declare apellido=""
read -p "Ingrese su apellido: " apellido

declare direccion=""
read -p "Ingrese su dirección: " direccion

declare telefono=""
read -p "Ingrese su teléfono: " telefono

echo "Nombre y apellido:$nombre $apellido, Dirección:$direccion, Teléfono:$telefono, DNI:$DNI"

exit 0
