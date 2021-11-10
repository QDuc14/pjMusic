package songInformation;

import java.util.Arrays;

public class songInf {
    public String id;
    public heading heading;
    public images images;
    public actions[] actions;

    public songInf(){

    }

    public songInf(String id, songInformation.heading heading, songInformation.images images, songInformation.actions[] actions, String alias, String url) {
        this.id = id;
        this.heading = heading;
        this.images = images;
        this.actions = actions;
        this.alias = alias;
        this.url = url;
    }

    public String alias;
        public String url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    public songInformation.actions[] getActions() {
        return actions;
    }

    public void setActions(songInformation.actions[] actions) {
        this.actions = actions;
    }

    @Override
    public String toString(){
            return Arrays.toString(getActions());
    }
}

