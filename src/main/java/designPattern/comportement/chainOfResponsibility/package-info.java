/**
 * Design Pattern : Chain of Responsibility
 * 
 * Définition :
 * Permet à plusieurs objets de traiter une requête sans que l'émetteur ne connaisse le récepteur final, en reliant les objets en chaîne.
 * 
 * Objectif :
 * Découpler l'émetteur et le récepteur d'une requête et permettre le passage dynamique de la requête le long de la chaîne.
 * 
 * Exemple fourni :
 * Deux handlers concrets traitent ou transmettent la requête. Application.java montre le passage de requêtes dans la chaîne.
 */
package designPattern.comportement.chainOfResponsibility;
