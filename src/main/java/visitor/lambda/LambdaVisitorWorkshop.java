package visitor.lambda;

import java.util.function.Function;

// should be function
class LambdaVisitorWorkshop<E, A>  {

    // contains strategy for each potentially visited class

    @SuppressWarnings(value = "unchecked")
    public <B extends E> LambdaVisitorWorkshop<E, A> addHandler(Class<B> clazz, Function<B, A> handler) {
        // add strategy for given class, hint: cast to (Function<? super E, A>)
        return this;
    }

    // apply implementation
    // run strategy for given class

}