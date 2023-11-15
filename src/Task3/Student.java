package Task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private String spec;
    private int course;
    private int group;
    private int GPA;
    private Date birth;
    public Student(String name,String surname,String spec,int course,int group, int GPA, Date birth){
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.spec = spec;
        this.group = group;
        this.GPA = GPA;
        this.birth = birth;
    }

    public int getGPA() {
        return GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGPA(int GPAr) {
        this.GPA = GPA;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getBirth() {
        return birth;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public String getSpec() {
        return spec;
    }

    public String getSurname() {
        return surname;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString(int i) {
        SimpleDateFormat form;
        if(i == 1){
           form = new SimpleDateFormat("dd MMMM yyyy");
        }
        else if (i == 2) {
            form = new SimpleDateFormat("dd:MM:yyyy");
        }
        else{
            form = new SimpleDateFormat("d-M-yy");
        }
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", spec='" + spec + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", GPA=" + GPA +
                ", birth=" + form.format(birth) +
                '}';
        }
}
