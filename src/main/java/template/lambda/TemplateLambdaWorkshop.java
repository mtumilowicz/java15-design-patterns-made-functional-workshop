package template.lambda;

import template.Resource;

import java.util.function.Function;

public class TemplateLambdaWorkshop {
    public static <E> E withResource(Function<Resource, E> f) {
        return null; // use try with resources
    }
}
