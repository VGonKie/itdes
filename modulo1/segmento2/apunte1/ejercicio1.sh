#!/bin/bash

declare barrio=""
read -p "Ingrese el nombre de su barrio: " barrio

declare direccion_postal_comisaria=""
read -p "Ingrese la direccion postal de la comisaria más cercana: " direccion_postal_comisaria

declare entrecalles=""
read -p "Ingrese las entrecalles de la comisaria: " entrecalles

echo "La comisaría de $barrio se encuentra en la calle $direccion_postal_comisaria entre $entrecalles."

exit 0
