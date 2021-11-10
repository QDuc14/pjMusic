package songInformation;

public class share {
    public String subject;
    public String text;
    public String href;
    public String image;
    public String twitter;
    public String html;
    public String snapchat;

    public share(String subject, String text, String href, String image, String twitter, String html, String snapchat) {
        this.subject = subject;
        this.text = text;
        this.href = href;
        this.image = image;
        this.twitter = twitter;
        this.html = html;
        this.snapchat = snapchat;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public String getHref() {
        return href;
    }

    public String getImage() {
        return image;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getHtml() {
        return html;
    }

    public String getSnapchat() {
        return snapchat;
    }
}
