## Les methodes `equals()` , `hashCode()` et `toString()`

Les methodes `equals()` , `hashCode()` et `toString()` sont des méthodes fondamentales en Java , souvent redéfinis dans les classes pour personnaliser leur comportement. Elle proviennent toutes de la classe de base `Object`, dont toutes les classes Java héritent implicitement. 

## 1. `equals()`
Cette méthode qui est utilisé pour comparée l'égalité de 2 objets. Par défaut la méthode `equals()` de la classe `Object` compare les références des objets, c'est-à-dire si les 2 sont stockés au même endroit en mémoire.

### Exemple
User a = new User("John"); // l'adresse de a est unique

User b = new User("John"); // l'adresse de b est unique

User c = new User("John"); // l'adresse de c est unique

User d = c; // l'adresse de d est est pareille à celle de c
// donc si on change d, donc c change

## 2. `hashCode()`

## 3. `toString()`

`Un repository` est un concept clé dans le développement logiciel, en particulier les contexte où il y a données (et donc des BDD). Il s'agit un design pattern (fr: patron de conception) qui séparé la logique d'accès aux données (CRUD) de la logique métier de l'application



## Repository

Un repository est un composant de votre appplication qui gère les opérations de persistance (CRUD) sur les entités dans un BDD. En gros c'est la couche qui nous permet de parler à la BDD sans se soucier des détails.

## Annotation @Repository
Elle sert à marquer une classe comme étant un repository , c'est-à-dire un endroit où vous allez interagir avec votre BDD.

## Est ce obligatoire
Non! Quand on implémente déjà une interface comme `JpaRepository`, Spring détecte automatiquement notre repository

## @PathBariable vs @RequestBody vs @RequestParam

## @PathBariable 
On l'utilise pour extraire une partie variable dans votre chemin d'URL

## @RequestBody
On l'utilise quand on reçoit des données via post.

## @RequestParam
On l'utilise quand on a des paramètres dans l'URL sous la forme `?param=valeur`
