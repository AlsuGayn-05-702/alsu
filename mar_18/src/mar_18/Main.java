package mar_18;

import mar_18.Artist.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        createAlbums();
        //задание 2
        int sec = albums.stream() //идут альбомы konveer eto stream
                //.peek(System.out::println) //вывод но только в середине в конце не работает, т к нетерменальный
                .map(x -> x.getTracks()) //идут аррей ллисты треков
                //.map(x -> x.stream())
                .flatMap(x -> x.stream()) //поток треков пошел если бы использовали map вместо флэт, то ошибка так как мэп касается только стримов, а треки уже аррей лист а не стрим, т е в флэте идет распаковка
                .filter(x -> !"Эминем".equals(x.getSinger().getName())) // треки ne эминема
                .map(x -> x.getTime()) // идут числа, а именно время треков эминема
                .reduce(0, (acc, x) -> acc + x);
        //.forEach(System.out::println);
        System.out.println("sec" + sec);
        //задание 1
       /* albums.stream()
                .filter(x -> x.getYear() == 2020)
                .map(album -> album.getTracks())
                .flatMap(arrayListTracks -> arrayListTracks.stream())
                .filter(track -> track.getSinger().getCountry() != Country.SPAIN)
                .forEach(System.out::println);*/

        //задание 3
        Map<Genre, List<Track>> map = albums.stream()
                .map(album -> album.getTracks())
                .flatMap(arrayListTracks -> arrayListTracks.stream())
                .collect(Collectors.groupingBy(x -> x.getGenre()));// собери группируя по жанрам трека
        System.out.println("map" + map);

        Map<Genre, Long> map1 = albums.stream()
                .map(album -> album.getTracks())
                .flatMap(arrayListTracks -> arrayListTracks.stream())
                .collect(Collectors.groupingBy(x -> x.getGenre(),Collectors.counting()));// собери группируя по жанрам трека
        System.out.println("map1 " + map1);
    }

    public static void createAlbums() {
        Singer littleBig =
                new Singer(Type.BAND,
                        "Little Big",
                        4,
                        Country.RUSSIA);
        littleBig.addGenre(Genre.POP);
        littleBig.addGenre(Genre.SKA);

        Track uno =
                new Track(
                        "Uno",
                        littleBig,
                        160,
                        Genre.POP
                );

        Track skibidi = new Track(
                "Skibidi",
                littleBig,
                200,
                Genre.JAZZ
        );


        Singer iglesias =
                new Singer(Type.SOLO,
                        "Энрике Иглесиас",
                        1,
                        Country.SPAIN);

        Track bailando = new Track(
                "Байландо",
                iglesias,
                190,
                Genre.POP
        );
        iglesias.addGenre(Genre.POP);
        iglesias.addGenre(Genre.ROCK);
        Track elRey = new Track(
                "El Rey",
                iglesias,
                130,
                Genre.ROCK
        );


        Singer eninem = new Singer(Type.SOLO, "Эминем",
                1,
                Country.USA);

        Track rapGod = new Track("Реп Год", eninem,
                210,
                Genre.RAP);

        Track stan = new Track(
                "Стэн",
                eninem,
                360,
                Genre.RAP
        );

        Album a2019 = new Album(
                "Очень Странный",
                2019
        );

        a2019.addTrack(skibidi);
        a2019.addTrack(rapGod);
        a2019.addTrack(stan);

        Album a2020 = new Album(
                "Странный",
                2020
        );


        a2020.addTrack(uno);
        a2020.addTrack(bailando);
        a2020.addTrack(skibidi);


        albums.add(a2019);
        albums.add(a2020);
    }

}