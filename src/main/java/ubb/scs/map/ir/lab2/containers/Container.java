package ubb.scs.map.ir.lab2.containers;

import ubb.scs.map.ir.lab2.models.Task;

public interface Container {
    Task remove();

    void add(Task task);

    int size();

    boolean isEmpty();
}
