package ubb.scs.map.ir.lab2;

import ubb.scs.map.ir.lab2.models.MessageTask;
import ubb.scs.map.ir.lab2.models.SortingTask;
import ubb.scs.map.ir.lab2.models.Task;
import ubb.scs.map.ir.lab2.runners.DelayTaskRunner;
import ubb.scs.map.ir.lab2.runners.PrinterTaskRunner;
import ubb.scs.map.ir.lab2.runners.StrategyTaskRunner;
import ubb.scs.map.ir.lab2.runners.TaskRunner;
import ubb.scs.map.ir.lab2.utils.SortingMethod;
import ubb.scs.map.ir.lab2.utils.Strategy;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        MessageTask mesg1 = new MessageTask("1", "Descriere", "Buna ziua!", "Gheorge", "Ion", LocalDateTime.now());
        MessageTask mesg2 = new MessageTask("2", "Descriere", "Buna!", "Ioana", "Mom", LocalDateTime.now());
        MessageTask mesg3 = new MessageTask("3", "Descriere", "Seara buna!", "Lola", "Ionaa", LocalDateTime.now());
        MessageTask mesg4 = new MessageTask("4", "Descriere", "Love ya!", "Dad", "Mom", LocalDateTime.now());

        Task[] tasks = new Task[]{mesg1, mesg2, mesg3, mesg4};
        for (Task task : tasks) {
            task.execute();
        }

        int elements[] = new int[]{1, 10, 2, 55, 10, -0};
        SortingTask sortingTask = new SortingTask(SortingMethod.MERGE_SORT, elements);
        sortingTask.execute();

        TaskRunner taskRunner = new StrategyTaskRunner(Strategy.FIFO);

        for (Task task : tasks) {
            taskRunner.addTask(task);
        }
        taskRunner.executeAll();

        for (Task task : tasks) {
            taskRunner.addTask(task);
        }

        TaskRunner decorativeTaskRunner = new PrinterTaskRunner(taskRunner);
        decorativeTaskRunner.executeAll();

        for (Task task : tasks) {
            taskRunner.addTask(task);
        }

        TaskRunner delayTaskRunner = new DelayTaskRunner(taskRunner);
        delayTaskRunner.executeAll();
    }
}
