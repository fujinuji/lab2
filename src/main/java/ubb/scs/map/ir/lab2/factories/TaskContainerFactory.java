package ubb.scs.map.ir.lab2.factories;

import ubb.scs.map.ir.lab2.containers.Container;
import ubb.scs.map.ir.lab2.containers.QueueContainer;
import ubb.scs.map.ir.lab2.containers.StackContainer;
import ubb.scs.map.ir.lab2.utils.Strategy;

public class TaskContainerFactory implements Factory{

    private static TaskContainerFactory instance;

    public static TaskContainerFactory getInstance(){
        if(instance==null){
            instance = new TaskContainerFactory();
        }
        return instance;
    }

    @Override
    public Container createContainer(Strategy strategy) {
        switch(strategy){
            case LIFO:
                return new StackContainer();
            case FIFO:
                return new QueueContainer();
            default:
                return null;
        }
    }
}

