package org.events;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class NotifyListners extends ApplicationEvent {

    private String epNo;

    public NotifyListners(Object source) {
        super(source);
    }

    public NotifyListners(Object source, String epNo) {
        super(source);
        this.epNo = epNo;
    }

    public String getEpNo() {
        return epNo;
    }

    public void setEpNo(String epNo) {
        this.epNo = epNo;
    }
}
