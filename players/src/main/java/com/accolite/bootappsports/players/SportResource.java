package com.accolite.bootappsports.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SportResource {

    @Autowired
    private  SportsDomainService service;
    
    
    //get all Sports
    @GetMapping("/sports")
    public List<Sport>  retrieveAllSports(){
        return service.FindAll();
    }
    //get players count by sport

    @GetMapping("/sports/{gameId}")
    public Sport getAllPlayersCountByGameId(@PathVariable Integer gameId){
        return service.findSportDetails(gameId);
    }
}
