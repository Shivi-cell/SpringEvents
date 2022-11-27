package org.listner;

import org.events.NotifyListners;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SatyamListnerByAnnotation {

    public void watchShow(String epNo)
    {
        System.out.println("Satyam is watching Shaktimaan.");
        System.out.println("Satyam :Playing "+epNo);
    }

    @EventListener
    public void listenEvent(NotifyListners event) {
        watchShow(event.getEpNo());
    }
}
