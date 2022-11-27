package org.events;

public class ComedyShowEvent {
    private String episodeNo;

    public ComedyShowEvent(String episodeNo) {
        this.episodeNo = episodeNo;
    }

    public String getEpisodeNo() {
        return episodeNo;
    }

    public void setEpisodeNo(String episodeNo) {
        this.episodeNo = episodeNo;
    }
}
