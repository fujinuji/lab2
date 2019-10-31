package ubb.scs.map.ir.lab2.containers;

import ubb.scs.map.ir.lab2.models.Task;

public class QueueContainer extends AbstractContainer {

    public QueueContainer() {
        super();
    }

    @Override
    public Task remove() {
        if (!isEmpty()) {
            Task first = tasks[0];
            for (int i = 0; i < tasks.length - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            size--;
            return first;
        }
        return null;
    }
}
