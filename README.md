# java12-functional-design-patterns-workshop

* references
    * [OOP v̶s̶ and FP by Mario Fusco](https://www.youtube.com/watch?v=p6cZO5V2ehw)
    * https://github.com/mariofusco/from-gof-to-lambda
    * [g ∘ f patterns by Mario Fusco](https://www.youtube.com/watch?v=Rmer37g9AZM)
    * https://en.wikipedia.org/wiki/First-class_citizen
    * https://en.wikipedia.org/wiki/First-class_function
    * https://www.quora.com/What-is-a-Single-Abstract-Method-SAM-interface-in-Java-8
    
## preface
* to refresh knowledge about design patterns please refer: https://github.com/mtumilowicz/designPatterns
* goals of this workshop
    * show some design patterns in a more functional way
    * introduction to basic functional programming structures enabling neat design
        * functions as a first-class citizen
        * streams
* workshops: `/lambda/<Name>Workshop`
* answers: `/lambda/<Name>`

## introduction
* Single Abstract Method (SAM) type
    * another name for `@FunctionalInterfaces`
        * functional interface is also known as Single Abstract Method Interface
    * example: `Runnable`, `Callable`, etc
    * provide target types for lambda expressions and method references
* first-class citizen
    * is an entity which supports all the operations generally available to other entities
    * operations typically include being passed as an argument, returned from a function, modified, and 
    assigned to a variable
* programming language is said to have first-class functions if it treats functions as first-class citizens

## mapping
Pattern                 | Lambda
----------------------- | --------------
Chain of Responsibility | Stream of functions
Decorator               | Functions composition
Interpreter             | Map of functions
Iterator                | Stream
Strategy                | SAM
Template                | SAM
Visitor                 | Map of functions

* note that many more patterns from GOF could be rewritten in a more functional way by simply using 
SAM conversion
    * example: Observer
