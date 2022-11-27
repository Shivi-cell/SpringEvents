package org.listner;

import org.events.NotifyListners;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ShivamListner implements ApplicationListener<NotifyListners> {
    public void watchShow(String epNo)
    {
        System.out.println("Shivam is watching Shaktimaan.");
        System.out.println("Shivam :Playing "+epNo);
    }

    @Override
    public void onApplicationEvent(NotifyListners event) {
        watchShow(event.getEpNo());
    }
}
