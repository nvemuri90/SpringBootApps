package com.accolite.bootappsports.players;

public class Sport {
   
   private Integer gameId;
   private String  gameName;
   private Integer playersCount;

    public Sport(Integer gameId, String gameName, Integer playersCount) {
        
        super();
        this.gameId = gameId;
        this.gameName = gameName;
        this.playersCount = playersCount;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Integer getPlayersCount() {
        return playersCount;
    }

    public void setPlayersCount(Integer playersCount) {
        this.playersCount = playersCount;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", playersCount=" + playersCount +
                '}';
    }
}
