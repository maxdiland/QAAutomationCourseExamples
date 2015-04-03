package entities;

/**
 * author Maksim Diland
 */
public class Music {

    private String author;
    private String songName;

    public Music() {}

    public Music(String author, String songName) {
        this.author = author;
        this.songName = songName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Override
    public String toString() {
        return "Music{" +
                "author='" + author + '\'' +
                ", songName='" + songName + '\'' +
                '}';
    }
}
