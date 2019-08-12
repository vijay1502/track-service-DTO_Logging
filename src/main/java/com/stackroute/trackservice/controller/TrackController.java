package com.stackroute.trackservice.controller;

import com.stackroute.trackservice.domain.Track;
import com.stackroute.trackservice.domain.TrackDTO;
import com.stackroute.trackservice.repository.TrackRepository;
import com.stackroute.trackservice.service.TrackService;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j

@RestController
@RequestMapping(value = "api/v1")
public class TrackController {

    private TrackService trackService;
    private TrackDTO trackDTO;

    public TrackController() {
    }

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }
    @PostMapping("track")
    public ResponseEntity<TrackDTO> saveTrack(@RequestBody Track track){
        Track saveTracks=trackService.saveTrack(track);
        return ResponseEntity.status(HttpStatus.OK).body(trackDTO);

    }
    @GetMapping("track/{trackId}")
    public ResponseEntity<TrackDTO> getTrack(@PathVariable int trackId){
        Track getTracks=trackService.getTrackById(trackId);
        return ResponseEntity.status(HttpStatus.CREATED).body(trackDTO);
    }

  @GetMapping("tracks/")
    public ResponseEntity<TrackDTO> getAllTracks(){
      List<Track> getAllTrackList=trackService.getAllTracks();
      return ResponseEntity.status(HttpStatus.CREATED).body(trackDTO);
  }

  @DeleteMapping("trackde/{trackId}")
    public ResponseEntity<?> trackDelete(@PathVariable int trackId){
      Optional<Track> trackDelete=trackService.trackDeleteById(trackId);
      return new ResponseEntity<>(trackDelete,HttpStatus.CREATED);
  }


    @PutMapping("tracker/{trackId}")
    public ResponseEntity<?> updateById(@PathVariable int trackId,@RequestBody Track track) {
        Track tracker = trackService.updateTrack(trackId,track);
        return new ResponseEntity<>(tracker, HttpStatus.OK);
    }
    @GetMapping("tracke/{trackName}")
    public ResponseEntity<?> trackByName(@PathVariable("trackName") String trackName){
      List<Track> trackByNames=trackService.getTrackByName(trackName);
      return new ResponseEntity<>(trackByNames,HttpStatus.CREATED);
    }

}




