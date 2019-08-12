package com.stackroute.trackservice.mapper;

import com.stackroute.trackservice.domain.Track;
import com.stackroute.trackservice.domain.TrackDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper
public interface TrackMapper {
TrackDTO toTrackDTO(Track track);
List<TrackDTO> toTrackDTO1(List<Track> tracks);
Track toTrack(TrackDTO trackDTO);
}
