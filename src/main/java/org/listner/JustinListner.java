package org.listner;

import org.events.ComedyShowEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class JustinListner {
    public void watchComedy(String epNo)
    {
        System.out.println("Justin is watching comedy show.");
        System.out.println("Justin : Playing "+epNo);
    }

    @EventListener
    public void listenEvent(ComedyShowEvent comedyShowEvent)
    {
        watchComedy(comedyShowEvent.getEpisodeNo());
    }
}
