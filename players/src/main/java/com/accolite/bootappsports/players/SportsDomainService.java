package com.accolite.bootappsports.players;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SportsDomainService {
    
    private static List<Sport> sports=new ArrayList<>();
    static{
        sports.add(new Sport(1,"Cricket",11));
        sports.add(new Sport(2,"Hockey",10));
        sports.add(new Sport(3,"Rugby",21));
        sports.add(new Sport(4,"Football",20));
        sports.add(new Sport(5,"Tennis",4));
    }

    public List<Sport> FindAll() {
        return sports;
    }
    
    public Sport findSportDetails(Integer gameId){
        for (Sport sport:sports) {
            if (sport.getGameId()== gameId) {
                return sport;
            }
        }
        return null;
        }
        
}
