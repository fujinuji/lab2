package ubb.scs.map.ir.lab2.containers;

import ubb.scs.map.ir.lab2.models.Task;

public abstract class AbstractContainer implements Container{
    protected int size = 0;
    protected Task[] tasks;

    AbstractContainer() {
        tasks = new Task[10];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(Task task) {
        if (tasks.length==size)
        {
            Task t[]=new Task[tasks.length*2];
            System.arraycopy( tasks, 0, t, 0, tasks.length );
            tasks=t;
        }
        tasks[size]=task;
        size++;
    }
}
