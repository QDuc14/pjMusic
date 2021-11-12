package sectionsItem;

public class lyrics {
    public String type;
    String text[];
    public String footer;
    public String tabname;
    public beacondata beacondata;

    public lyrics(){}
    public lyrics(String type, String[] text, String footer, String tabname, sectionsItem.beacondata beacondata) {
        this.type = type;
        this.text = text;
        this.footer = footer;
        this.tabname = tabname;
        this.beacondata = beacondata;
    }

    public String getType() {
        return type;
    }

    public String[] getText() {
        return text;
    }

    public String getFooter() {
        return footer;
    }

    public String getTabname() {
        return tabname;
    }

    public sectionsItem.beacondata getBeacondata() {
        return beacondata;
    }
}
