package mar_18;

import mar_18.Artist.Singer;
import mar_18.Genre;

public class Track {

    private  String trackName;
    private Singer singer;
    private int time;
    private Genre genre;

    public Track(String trackName, Singer singer, int time, Genre genre) {
        this.trackName = trackName;
        this.singer = singer;
        this.time = time;
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getTrackName() {
        return trackName;
    }

    public Singer getSinger() {
        return singer;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackName='" + trackName + '\'' +
                ", singer=" + singer +
                ", time=" + time +
                ", genre = " + genre +
                '}';
    }
}
