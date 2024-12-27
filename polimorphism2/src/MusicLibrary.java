public class MusicLibrary {
    private Artist artists;
    private Album albums;
    private Music songs;

    public void addArtist(Artist artist)
    {
        if(artists == null)
        {
            artists = artist;
        }
        else
        {
            Artist current = artists;
            while (current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(artist);
        }
    }

    public void removeArtist(Artist artist)
    {
        if(artists == null)
        {
            return;
        }
        if(artists == artist)
        {
            artists = artists.getNext();
            return;
        }
        Artist current = artists;
        while (current.getNext() != null && current.getNext() != artist)
        {
            current = current.getNext();
        }
        if(current.getNext() != null)
        {
            current.setNext(current.getNext().getNext());
        }
    }

    public Music searchMusic(String title)
    {
        Music current = songs;
        while (current != null)
        {
            if(current.getTitle().equals(title))
            {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public Music giveRandomMusic()
    {
        if(songs == null)
        {
            return null;
        }
        int count = 0;
        Music current = songs;
        while (current != null)
        {
            count++;
            current = current.getNext();
        }
        int randomIndex = (int) (Math.random() * count);
        current = songs;
        for (int i = 0; i < randomIndex; i++)
        {
            current = current.getNext();
        }
        return current;
    }
}