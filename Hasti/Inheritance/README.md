# Inheritance Summary
## a subclass can always be used in a context that expects the superclass, but not vice-versa (the latter requires a cast)
## all non-static methods use dynamic dispatch
## a subclass method can use "super" to call the superclass's version of an overridden method (i.e., to avoid dynamic dispatch)
## a class can provide just the header for a method without providing the body; such methods are abstract, and a class that contains an abstract method must also be declared abstract (and cannot be instantiated)
