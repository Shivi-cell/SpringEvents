package org.listner;

import org.events.NotifyListners;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AlokListnerByAnnotation {

    public void watchShow(String epNo)
    {
        System.out.println("Alok is watching Shaktimaan.");
        System.out.println("Alok :Playing "+epNo);
    }


    @EventListener
    public void listenEvent(NotifyListners notifyListners)
    {
       /* try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        watchShow(notifyListners.getEpNo());
    }
}
