package org.publisher;

import org.events.ComedyShowEvent;
import org.events.NotifyListners;
import org.listner.ShivamListner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component("colors")
public class Colors {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;
    public void streamShaktiman(String episodeNo)
    {
        System.out.println("Colors streaming Shaktimaan "+episodeNo);
        applicationEventPublisher.publishEvent(new NotifyListners(this, episodeNo));
    }

    public void comedyShow(String epNo)
    {
        System.out.println("Colors streaming comedy show "+epNo);
        applicationEventPublisher.publishEvent(new ComedyShowEvent(epNo));
    }
}
