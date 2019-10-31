package ubb.scs.map.ir.lab2.runners;

import ubb.scs.map.ir.lab2.containers.Container;
import ubb.scs.map.ir.lab2.factories.TaskContainerFactory;
import ubb.scs.map.ir.lab2.models.Task;
import ubb.scs.map.ir.lab2.utils.Strategy;

public class StrategyTaskRunner implements TaskRunner {
    private Container container;

    public StrategyTaskRunner(Strategy strategy){
        container= TaskContainerFactory.getInstance().createContainer(strategy);
    }


    @Override
    public void executeOneTask() {
        container.remove().execute();
    }

    @Override
    public void executeAll() {
        while(!container.isEmpty()){
            executeOneTask();
        }
    }

    @Override
    public void addTask(Task t) {
        container.add(t);
    }

    @Override
    public boolean hasTask() {
        return  !container.isEmpty();
    }
}
