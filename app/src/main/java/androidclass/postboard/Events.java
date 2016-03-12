package androidclass.postboard;

/**
 * Created by Vivek on 12-03-2016.
 */
public class Events {

    String imagePath;
    String name;
    //Date Format - (dd-MMM-yyyy) Example - 7-Jun-2013
    String date;
    //Time Format - (HH:mm) - Example - 10:30
    String time;
    String place;
    //groupName is the name of the group that is organizing the event
    String groupName;
    int upvotes = 0;
    int downvotes = 0;
    //Save the XML in the String
    String xml;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }
}
