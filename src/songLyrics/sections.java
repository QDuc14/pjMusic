package songLyrics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sections {
    public class Song {}

    public class Lyrics {
        public String type;
        public String[] text;
        public String footer;
        public String tabname;
        public beacondata beacondata;

        public Lyrics() {
        }

        public Lyrics(String type, String[] text, String footer, String tabname, songLyrics.beacondata beacondata) {
            this.type = type;
            this.text = text;
            this.footer = footer;
            this.tabname = tabname;
            this.beacondata = beacondata;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String[] getText() {
            return text;
        }

        public void setText(String[] text) {
            this.text = text;
        }

        public String getFooter() {
            return footer;
        }

        public void setFooter(String footer) {
            this.footer = footer;
        }

        public String getTabname() {
            return tabname;
        }

        public void setTabname(String tabname) {
            this.tabname = tabname;
        }

        public songLyrics.beacondata getBeacondata() {
            return beacondata;
        }

        public void setBeacondata(songLyrics.beacondata beacondata) {
            this.beacondata = beacondata;
        }
    }

    public class Video {}

    public class Related {}
}
