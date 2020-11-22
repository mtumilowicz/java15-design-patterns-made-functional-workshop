package visitor.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

class LambdaVisitor<E, A> implements Function<E, A> {
    private final Map<Class<?>, Function<? super E, A>> fMap = new HashMap<>();

    @SuppressWarnings(value = "unchecked")
    public <B extends E> LambdaVisitor<E, A> addHandler(Class<B> clazz, Function<B, A> handler) {
        fMap.put(clazz, (Function<? super E, A>) handler);
        return this;
    }

    @Override
    public A apply(E o) {
        return Optional.ofNullable(fMap.get(o.getClass()))
                .map(x -> x.apply(o))
                .orElseThrow(() -> new RuntimeException("no handler for: " + o.getClass().toString()));
    }

}