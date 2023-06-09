package com.example.Backend_TwentyOne_API.models;

public class LoserBoardPlayer {

//    PARAMETERS
    private String name;

    private Long playerId;

    private int gamesLost;

//    CONSTRUCTOR
    public LoserBoardPlayer(String name, Long playerId, int gamesLost){
        this.name = name;
        this.playerId = playerId;
        this.gamesLost = gamesLost;
    }

//    DEFAULT CONSTRUCTOR
    public LoserBoardPlayer(){
    }

//    GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }
}
