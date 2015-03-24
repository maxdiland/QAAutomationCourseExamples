package entities;

/**
 * author Maksim Diland
 */
public class BoxWithMusic extends Box implements Cloneable {

    private Music music;

    public BoxWithMusic() {

    }

    public BoxWithMusic(float width, float height, float depth, float weight, Music music) {
        super(width, height, depth, weight);
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        BoxWithMusic result = (BoxWithMusic) super.clone();
        result.setMusic( new Music( music.getAuthor(), music.getSongName() ) );
        return result;
    }
}
