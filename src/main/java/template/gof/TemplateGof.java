package template.gof;

import template.Resource;

public abstract class TemplateGof<E> {
    protected Resource resource;

    protected abstract E go();

    public E execute() {
        openResource();
        try {
            return go();
        } finally {
            closeResource();
        }
    }

    private void openResource() {
        resource = new Resource();
    }

    private void closeResource() {
        resource.close();
    }
}
