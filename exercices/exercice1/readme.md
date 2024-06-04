Vous avez un programme depuis lequel un CLIENT pourra remplir son PANIER depuis un MAGASIN. Un MAGASIN possède des références de PRODUITS en quantités variables. Ce dernier peut commander chez son FOURNISSEUR une quantité pour une référence donnée.

Pour faciliter l'implémentation, on ne possède pas réellement des produits mais des références auxquelles on a associé une quantité. De plus, le fournisseur possède un stock illimité contrairement au magasin. Le client peut vider son panier en payant sa course (dans l'application, il n'y a pas besoin d'argent).

Pour aller plus loin :

- Vous pouvez proposer un système de menu interactif avec la classe Scanner.
- Un fournisseur pourrait lui aussi avoir des stocks. Vous pouvez trouver un moyen pour remplir périodiquement ses stocks dans le temps.
- Vous pouvez largement compléter le système de paiement.
- Vous pouvez chercher à individualiser les produits (exploiter la famille AtomicXXXX comme AtomicInteger).
- ...

N'hésitez pas à partager votre solution sur le forum de la formation.

L'idée générale est d'utiliser : la composition, les listes et de l'abstraction.
