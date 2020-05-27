package model;

public class Player {
    //figure = enum, name = string
    private Figure figure;
    private String name;

    public Player(Figure figure, String name) {
        this.figure = figure;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "figure=" + figure +
                ", name='" + name + '\'' +
                '}';
    }
}
