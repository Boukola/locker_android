package Charl12_gb.locker;

public class Album_class {
    String name;
    String title;
    String img;

    public Album_class(String name, String title, String img) {
        this.name = name;
        this.title = title;
        this.img = img;
    }

    public Album_class() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
