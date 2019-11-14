# SpringBootApp

4 MicroServices :
  1- Gestion d'entrpot
  2- Gestion de livraison
  3- Gestion de paiement
  4- Gestion de produit

Communication entre les microservices :
 Gestion d'entrepot + Gestion de livraison ==> node
 Gestion de paiement <==> Gestion de produit

Zuul: Service gateway
Eureka: Discovery server

Eureka discovers all microservices while they run on the Zuul gateway which runs all of them.     
All microservices run as a docker image.
