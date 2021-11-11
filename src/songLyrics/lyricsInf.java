package songLyrics;

public class lyricsInf {
    public String id;
    public String type;
    public int layout;
    public String title;
    public String url;
    public String apple_music_url;
    public String subtitle;
    public images image;
    public share share;
    public hub hub;
    public sections[] sections;
    public artists[] artists;
    public String alias;
    public genres genre;
    public String album_adam_id;
    public String track_adam_id;
    public String release_date;

    public lyricsInf() {
    }

    public lyricsInf(String id, String type, int layout, String tittle, String url, String apple_music_url, String subtitle, images image, songLyrics.share share, songLyrics.hub hub, sections[] sections, artists[] artists, String alias, genres genre, String album_adam_id, String track_adam_id, String release_date) {
        this.id = id;
        this.type = type;
        this.layout = layout;
        this.title = title;
        this.url = url;
        this.apple_music_url = apple_music_url;
        this.subtitle = subtitle;
        this.image = image;
        this.share = share;
        this.hub = hub;
        this.sections = sections;
        this.artists = artists;
        this.alias = alias;
        this.genre = genre;
        this.album_adam_id = album_adam_id;
        this.track_adam_id = track_adam_id;
        this.release_date = release_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tittle) {
        this.title = tittle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApple_music_url() {
        return apple_music_url;
    }

    public void setApple_music_url(String apple_music_url) {
        this.apple_music_url = apple_music_url;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public images getImage() {
        return image;
    }

    public void setImage(images image) {
        this.image = image;
    }

    public songLyrics.share getShare() {
        return share;
    }

    public void setShare(songLyrics.share share) {
        this.share = share;
    }

    public songLyrics.hub getHub() {
        return hub;
    }

    public void setHub(songLyrics.hub hub) {
        this.hub = hub;
    }

    public songLyrics.sections[] getSections() {
        return sections;
    }

    public void setSections(sections[] sections) {
        this.sections = sections;
    }

    public artists[] getArtists() {
        return artists;
    }

    public void setArtists(artists[] artists) {
        this.artists = artists;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public genres getGenre() {
        return genre;
    }

    public void setGenre(genres genre) {
        this.genre = genre;
    }

    public String getAlbum_adam_id() {
        return album_adam_id;
    }

    public void setAlbum_adam_id(String album_adam_id) {
        this.album_adam_id = album_adam_id;
    }

    public String getTrack_adam_id() {
        return track_adam_id;
    }

    public void setTrack_adam_id(String track_adam_id) {
        this.track_adam_id = track_adam_id;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
}