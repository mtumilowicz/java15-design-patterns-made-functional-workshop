package strategy;

@FunctionalInterface
public interface SearchStrategy {
    Index search(String[] in, String element);
}

