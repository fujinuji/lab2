package ubb.scs.map.ir.lab2.runners;

import ubb.scs.map.ir.lab2.utils.Constants;

import java.time.LocalDateTime;

public class PrinterTaskRunner extends AbstractTaskRunner {
    public PrinterTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }

    @Override
    public void executeOneTask() {
        super.executeOneTask();
        System.out.println("Task executat la"+ LocalDateTime.now()
                .format(Constants.DATE_TIME_FORMATTER));

    }
}
