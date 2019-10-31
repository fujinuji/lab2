package ubb.scs.map.ir.lab2.containers;

import ubb.scs.map.ir.lab2.models.Task;

public class StackContainer extends AbstractContainer{

    public StackContainer() {
        super();
    }

    @Override
    public Task remove() {
        if (!isEmpty()) {
            size--;
            return tasks[size];
        }
        return null;
    }

}
