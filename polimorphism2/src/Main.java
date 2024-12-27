public class Main {
    public static void main(String[] args) {
        Music music1 = new Music("Bye Bye Bye", 239, "Pop");
        Music music2 = new Music("Nigga`z in Paris", 270, "Rap");
        Music music3 = new Music("Two of us", 300, "Jazz");
        Album album1 = new Album("Tune Up", 2015);
        album1.addMusic(music1);
        album1.addMusic(music2);
        Album album2 = new Album("Couple Songs", 1999);
        album2.addMusic(music3);
        Artist artist1 = new Artist("Lil Boy");
        artist1.addAlbum(album1);
        artist1.addAlbum(album2);
        MusicLibrary library = new MusicLibrary();
        library.addArtist(artist1);
        Music seekMusic = library.searchMusic("Music1");
        if(seekMusic != null)
        {
            System.out.println("Found Music: " + seekMusic.getTitle());
        }
        else
        {
            System.out.println("Music not found.");
        }
        Music randomMusic = library.giveRandomMusic();
        if(randomMusic != null)
        {
            System.out.println("Random : " + randomMusic.getTitle());
            randomMusic.play();
            randomMusic.stop();
        }
        artist1.displayInfo();
        album1.displayInfo();
    }
}