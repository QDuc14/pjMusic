package test;

import java.util.List;

public class trackData {
    public class Heading{
        public String title;
        public String subtitle;
    }

    public class Images{
        public String def;
        public String blurred;
        public String play;
    }

    public class Action{
        public String type;
        public String uri;
        public String name;
        public String id;
    }

    public class Apple{
        public List<Action> actions;
        public boolean explicit;
        public String previewurl;
        public String coverarturl;
        public String trackid;
        public String productid;
    }

    public class Stores{
        public Apple apple;
    }

    public class Streams{
    }

    public class Follow{
        public String followkey;
    }

    public class Artist{
        public Follow follow;
        public String alias;
        public String id;
    }

    public class Share{
        public String subject;
        public String text;
        public String href;
        public String image;
        public String twitter;
        public String html;
        public String snapchat;
    }

    public class Root{
        public String id;
        public Heading heading;
        public Images images;
        public Stores stores;
        public Streams streams;
        public List<Artist> artists;
        public Share share;
        public String alias;
        public String url;
        public List<Action> actions;
    }

}
