/**
 * Ensemble des Design Patterns GOF
 * 
 * Définition :
 * Ce projet regroupe les 23 design patterns du "Gang of Four" (GOF), organisés en trois catégories : création, structure, comportement.
 * 
 * Objectif :
 * Illustrer les principes de conception orientée objet pour améliorer la flexibilité, la réutilisabilité et la maintenabilité du code.
 * 
 * Description des exemples :
 * Chaque sous-package contient des exemples Java simples pour chaque pattern, avec une classe Application et les classes principales illustrant le principe et l'utilisation concrète.
 *
 * Ordre d'apprentissage conseillé :
 * Il est recommandé d'aborder les patterns dans l'ordre suivant pour une meilleure compréhension progressive :
 * 1. Création :
 *    - Singleton
 *    - Factory Method
 *    - Abstract Factory
 *    - Builder
 *    - Prototype
 * 2. Structure :
 *    - Adapter
 *    - Bridge
 *    - Composite
 *    - Decorator
 *    - Facade
 *    - Flyweight
 *    - Proxy
 * 3. Comportement :
 *    - Observer
 *    - Strategy
 *    - Command
 *    - Chain of Responsibility
 *    - State
 *    - Template Method
 *    - Iterator
 *    - Mediator
 *    - Memento
 *    - Interpreter
 *    - Visitor
 *
 * Ce parcours permet de commencer par les bases de la création d'objets, puis d'aborder la structuration des relations, et enfin les interactions et comportements dynamiques.
 *
 * Liste des patterns et exemples :
 * 
 * --- Création ---
 * Singleton : Garantit une instance unique. Exemple : accès global à l'objet Singleton.
 * Factory Method : Délègue l'instanciation à des sous-classes. Exemple : Creator/ConcreteCreator/ConcreteProduct.
 * Abstract Factory : Crée des familles d'objets liés. Exemple : ConcreteFactory1/2, ProductA/B.
 * Builder : Construit des objets complexes étape par étape. Exemple : Director, Builder, Product.
 * Prototype : Crée des objets par clonage. Exemple : ConcretePrototype, clone().
 *
 * --- Structure ---
 * Adapter : Adapte une interface à une autre. Exemple : Adapter, Adaptee, Target.
 * Bridge : Sépare abstraction et implémentation. Exemple : Abstraction, Implementor, RefinedAbstraction.
 * Composite : Structure arborescente partie-tout. Exemple : Composite, Leaf, Component.
 * Decorator : Ajoute dynamiquement des responsabilités. Exemple : Decorator, ConcreteComponent.
 * Facade : Interface simplifiée à un sous-système. Exemple : Facade, SubsystemA/B.
 * Flyweight : Partage d'instances pour économiser la mémoire. Exemple : FlyweightFactory, ConcreteFlyweight.
 * Proxy : Contrôle d'accès à un objet. Exemple : Proxy, RealSubject, Subject.
 *
 * --- Comportement ---
 * Chain of Responsibility : Passage de requête le long d'une chaîne. Exemple : Handler, ConcreteHandlerA/B.
 * Command : Encapsule une requête. Exemple : Command, LightOnCommand, RemoteControl.
 * Interpreter : Interprète des expressions. Exemple : Expression, NumberExpression, AddExpression.
 * Iterator : Parcours d'une collection. Exemple : Iterator, ConcreteIterator.
 * Mediator : Centralise les interactions. Exemple : Mediator, ConcreteMediator, ColleagueA/B.
 * Memento : Sauvegarde et restauration d'état. Exemple : Originator, Memento, Caretaker.
 * Observer : Notification automatique des changements d'état. Exemple : Sujet, Observateur, ObservateurImpl.
 * State : Changement dynamique de comportement. Exemple : State, ConcreteStateA/B, Context.
 * Strategy : Choix dynamique d'algorithme. Exemple : Strategy, StrategyImpl1/2/3, Context.
 * Template Method : Structure d'algorithme personnalisable. Exemple : AbstractClass, ConcreteClass.
 * Visitor : Ajout d'opérations sans modifier les objets. Exemple : Visitor, ConcreteVisitor, Element.
 *
 * Conseils pour apprendre les design patterns :
 * - Étudiez chaque pattern avec un exemple concret et identifiez le problème qu'il résout.
 * - Comparez les patterns similaires pour comprendre leurs différences (ex : Strategy vs State, Adapter vs Proxy).
 * - Implémentez chaque pattern dans un petit projet ou cas d'usage réel.
 * - Analysez du code existant pour repérer les patterns utilisés.
 * - Privilégiez la compréhension du contexte d'utilisation avant d'appliquer un pattern.
 * - Utilisez les diagrammes UML pour visualiser les relations entre les classes.
 * - Discutez et partagez vos implémentations avec d'autres développeurs pour enrichir votre compréhension.
 * - Gardez à l'esprit que l'utilisation d'un pattern doit répondre à un besoin réel et non être systématique.
 */
package designPattern;
