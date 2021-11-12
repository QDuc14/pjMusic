package songLyrics;
import sectionsItem.*;
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
    public lyrics sections[];
    public artists[] artists;
    public String alias;
    public genres genre;
    public String album_adam_id;
    public String track_adam_id;
    public String release_date;

    public lyricsInf() {
    }

    public lyricsInf(String id, String type, int layout, String title, String url, String apple_music_url, String subtitle, images image, songLyrics.share share, songLyrics.hub hub, lyrics[] sections, songLyrics.artists[] artists, String alias, genres genre, String album_adam_id, String track_adam_id, String release_date) {
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

    public String getType() {
        return type;
    }

    public int getLayout() {
        return layout;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getApple_music_url() {
        return apple_music_url;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public images getImage() {
        return image;
    }

    public songLyrics.share getShare() {
        return share;
    }

    public songLyrics.hub getHub() {
        return hub;
    }

    public lyrics[] getSections() {
        return sections;
    }

    public songLyrics.artists[] getArtists() {
        return artists;
    }

    public String getAlias() {
        return alias;
    }

    public genres getGenre() {
        return genre;
    }

    public String getAlbum_adam_id() {
        return album_adam_id;
    }

    public String getTrack_adam_id() {
        return track_adam_id;
    }

    public String getRelease_date() {
        return release_date;
    }
}
