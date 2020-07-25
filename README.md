# Inheritance

- BusinessAccount is an specialization of the Account class (General class)
- The class Account is a super class over the class BusinessAccount perspective
- BussinessAccount extends - inherits - the class Account
- inheritance is a association between classes, not between objects as composition.
- An object instantiate as a BusinessAccount type shares the attributes and methods from the class Account. 
- Inheritance is a relation of the type "it is a". Ex. A car (sub class) is a vehicle (super class). 


# Upcast & Downcast

- Upcast: casting from the subclass to the super class. Ex. An object of type 'sublcass' can acess methods from 
the super/parent class. It is used with polymorphism.

- Downcast: casting from superclass to subclass. Ex. An object accessing a variable from a subclass. 
Usable with methods using generic parameters (Ex. Equals).


# Superposition, super, @Override

- superposition: implementation of a super class on a subclass. It is recommendable the use of @Override
to override the method.

- @Override: facilitates code reading. It is a good practice (shows to the IDE).
- super (super classe): Used to invoke a method from a super class inside the sub class. Ex. super.withdraw()

# final method, final class

- 'final' before a class: A class can be inherited.

- 'final' before a method: A method cannot be over raided.

- It is useful for safety. 

- Usually it is better to use final within methods that already override a first method. Multiple overrides 
can generate inconsistencies.

- attributes form 'final' classes are faster to read. Ex. String 

# Polymorphism

- It is a resource that allows variables of same general type point 
to different and specific object types and show different behaviour
according to the respective relation.