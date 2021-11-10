package songInformation;
public class actions {
    public String name;
    public String type;
    public String id;
    public actions(String name, String type, String id) {
        this.name = name;
        this.type = type;
        this.id = id;
    }

    public String getName() {
        return name;
    }



    public String getType() {
        return type;
    }


    public String getId() {
        return id;
    }
}
