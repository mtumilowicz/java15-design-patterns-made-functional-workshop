package template.gof;

import java.util.List;

public class ResourceGetAllLines extends TemplateGof<List<String>> {
    @Override
    protected List<String> go() {
        return resource.getAllLines();
    }
}