package template;

import java.util.List;

public class Resource implements AutoCloseable {

    public Resource() {
        System.out.println("Resource created");
    }

    public List<String> getAllLines() {
        return List.of("1", "2", "3");
    }

    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}
