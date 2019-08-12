package com.stackroute.trackservice;

import com.stackroute.trackservice.domain.Track;
import com.stackroute.trackservice.domain.TrackDTO;
import lombok.Data;
import org.modelmapper.ModelMapper;
public class TrackServiceDTO {

    Track track;
    TrackServiceDTO trackServiceDTO;

    public static void main(String[] args) {
        modelMapDto();
    }
    private static void modelMapDto(){
        Track trackDTO=new Track(1,"Ve Maahi","KESARI MOVIE");

        TrackDTO trackDTO1=new TrackDTO();
        ModelMapper modelMapper=new ModelMapper();


        System.out.println(trackDTO1.getTrackId());
        System.out.println(trackDTO1.getTrackName());


    }


}
