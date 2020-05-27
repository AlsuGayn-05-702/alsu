package mar_18;



import java.util.ArrayList;



public class Album {



    private String albumName;

    private int year;

    private ArrayList<Track> tracks =

            new ArrayList<>();



    public Album(String albumName, int year) {

        this.albumName = albumName;

        this.year = year;

    }



    public String getAlbumName() {

        return albumName;

    }



    public int getYear() {

        return year;

    }



    public ArrayList<Track> getTracks() {

        return tracks;

    }



    public void addTrack(Track track) {

        tracks.add(track);

    }



    @Override

    public String toString() {

        return "Album{" +

                "albumName='" + albumName + '\'' +

                ", year=" + year +

                ", tracks=" + tracks +

                '}';

    }

}
