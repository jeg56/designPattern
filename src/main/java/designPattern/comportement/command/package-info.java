/**
 * Design Pattern : Command
 * 
 * Définition :
 * Encapsule une requête sous forme d'objet, permettant de paramétrer les clients avec différentes requêtes, files d'attente ou opérations à annuler.
 * 
 * Objectif :
 * Découpler l'émetteur et le récepteur d'une action et permettre la gestion flexible des commandes.
 * 
 * Exemple fourni :
 * LightOnCommand et LightOffCommand encapsulent les actions sur Light. RemoteControl exécute les commandes. Application.java montre l'utilisation.
 */
package designPattern.comportement.command;
