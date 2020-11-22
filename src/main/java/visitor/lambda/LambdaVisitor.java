package visitor.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

class LambdaVisitor<A> implements Function<Object, A> {
    private final Map<Class<?>, Function<Object, A>> fMap = new HashMap<>();

    @SuppressWarnings(value = "unchecked")
    public <B> LambdaVisitor<A> addHandler(Class<B> clazz, Function<B, A> handler) {
        fMap.put(clazz, (Function<Object, A>) handler);
        return this;
    }

    @Override
    public A apply(Object o) {
        return Optional.ofNullable(fMap.get(o.getClass()))
                .map(x -> x.apply(o))
                .orElseThrow(() -> new RuntimeException("no handler for: " + o.getClass().toString()));
    }

}