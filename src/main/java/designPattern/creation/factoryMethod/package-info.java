/**
 * Design Pattern : Factory Method
 * 
 * Définition :
 * Définit une interface pour créer un objet, mais laisse les sous-classes décider de la classe à instancier.
 * 
 * Objectif :
 * Permettre à une classe de déléguer l'instanciation à ses sous-classes pour favoriser l'extensibilité.
 * 
 * Exemple fourni :
 * La classe Creator expose la méthode factoryMethod() abstraite. ConcreteCreator instancie ConcreteProduct.
 * La méthode someOperation() utilise le produit créé pour démontrer le principe.
 */
package designPattern.creation.factoryMethod;
