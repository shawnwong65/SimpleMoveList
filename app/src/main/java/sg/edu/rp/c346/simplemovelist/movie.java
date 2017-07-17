package sg.edu.rp.c346.simplemovelist;



/**
 * Created by 16022774 on 17/7/2017.
 */

public class movie {

    //Define the data items in the row
    private String title;
    private String desc;
    private String name;

    public movie(String title, String desc, String name) {
        this.title = title;
        this.desc = desc;
        this.name = name;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
