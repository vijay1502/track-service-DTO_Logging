package com.stackroute.trackservice.domain;

import lombok.Data;

@Data
public class TrackDTO {
    private int trackId;
    private String trackName;

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }
}
