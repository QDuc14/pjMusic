package songInformation;

public class images {
    public String blurred;
    public String play;
    public String defauls;

    public images(String defauls, String blurred, String play) {
        this.defauls = defauls;
        this.blurred = blurred;
        this.play = play;
    }

    public String getDefauls() {
        return defauls;
    }

    public String getBlurred() {
        return blurred;
    }

    public String getPlay() {
        return play;
    }
}
