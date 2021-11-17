package BLL;

public class songInfomation {
    public String id;
    public String title;
    public String subtitle;
    public String artist;
    public String[] lyrics;

    public songInfomation (){}
    public songInfomation(String id, String title, String subtitle, String artist) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.artist = artist;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
