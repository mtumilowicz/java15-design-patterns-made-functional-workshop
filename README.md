# java12-functional-design-patterns-workshop

* references
    * [OOP v̶s̶ and FP by Mario Fusco](https://www.youtube.com/watch?v=p6cZO5V2ehw)
    * https://github.com/mariofusco/from-gof-to-lambda
    * [g ∘ f patterns by Mario Fusco](https://www.youtube.com/watch?v=Rmer37g9AZM)
    
# preface
* to refresh knowledge about design patterns please refer: https://github.com/mtumilowicz/designPatterns
* goals of this workshop
    * introduction to basic functional programming structures enabling 
* workshops: `/lambda/<Name>Workshop`
* answers: `/lambda/<Name>`

# mapping

Pattern                 | Lambda
----------------------- | --------------
Chain of Responsibility | Stream of functions
Decorator               | Functions composition
Interpreter             | Map of functions
Iterator                | Stream
Strategy                | SAM
Template                | SAM
Visitor                 | Map of functions

* note that many patterns from GOF could be rewritten in a more functional way by simply using 
Single Abstract Method (SAM) conversion
