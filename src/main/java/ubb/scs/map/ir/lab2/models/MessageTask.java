package ubb.scs.map.ir.lab2.models;

import ubb.scs.map.ir.lab2.utils.Constants;

import java.time.LocalDateTime;

public class MessageTask extends Task {

    private String mesaj;
    private String from;
    private String to;
    private LocalDateTime date;

    public MessageTask(String taskId, String descriere, String mesaj, String from, String to, LocalDateTime date) {
        super(taskId, descriere);
        this.mesaj = mesaj;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() + ' ' +
                "mesaj=" + mesaj + ' ' +
                " date= " + date.format(Constants.DATE_TIME_FORMATTER);
    }

    @Override
    public void execute() {
        System.out.println(this);
    }
}
