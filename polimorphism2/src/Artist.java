public class Artist {
    private String name;
    private Album album;

    public Artist(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addAlbum(Album album)
    {
        if(this.album == null)
        {
            this.album = album;
            return;
        }

        Album currentAlbum = this.album;

        while (currentAlbum.getNext() != null)
        {
            currentAlbum = currentAlbum.getNext();
        }

        currentAlbum.setNext(album);
    }

    public void removeAlbum(Album album)
    {
        if(this.album == null)
        {
            return;
        }

        if(this.album == album)
        {
            this.album = this.album.getNext();
            return;
        }

        Album currentAlbum = this.album;

        while (currentAlbum.getNext() != null && currentAlbum.getNext() != album)
        {
            currentAlbum = currentAlbum.getNext();
        }

        if(currentAlbum.getNext() != null)
        {
            currentAlbum.setNext(currentAlbum.getNext().getNext());
        }
    }
    public void displayInfo()
    {
        System.out.println("Artist: " + name);
        Album currentAlbum = album;

        while (currentAlbum != null)
        {
            currentAlbum.displayInfo();
            currentAlbum = currentAlbum.getNext();
        }
    }
    public Artist getNext() {
        return null;
    }
    public void setNext(Artist artist) {
    }
}