import java.util.*;

class Student {
    private String _name;
    private String _id;
    private String _group;
    private String _email;

    public Student() {
        _name = "Student";
        _id = "000";
        _group = "K59CB";
        _email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email, String group) {
        this._name = name;
        this._id = id;
        this._email = email;
        this._group = group;
    }

    public Student(Student student) {
        this._name = student._name;
        this._id = student._id;
        this._group = student._group;
        this._email = student._email;
    }

    //Setter
    public void setStudent(String name, String id, String email, String group) {
        this._name = name;
        this._id = id;
        this._email = email;
        this._group = group;
    }
    public void setName(Student s) {this._name = s._name;}
    public void setId(Student s) {this._id = s._id;}
    public void setGroup(Student s) {this._group = s._group;}
    public void setEmail(Student s) {this._email = s._email;}

    //Getter
    public String getName() {
        return this._name;
    }
    public String getId() {return this._id;}
    public String getGroup() {return this._group;}
    public String getEmail() {return this._email;}

    public void getInfo() {
        System.out.println(this._name);
        System.out.println(this._id);
        System.out.println(this._group);
        System.out.println(this._email);
    }
}
