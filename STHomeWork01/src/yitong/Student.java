package yitong;

//学生实体类
public class Student {
    //学号
    private int id;

    //姓名
    private String name;

    //出生日期
    private String birDate;

    //性别
    private boolean gender;

    public Student(int id, String name, String birDate, boolean gender) {
        this.id = id;
        this.name = name;
        this.birDate = birDate;
        this.gender = gender;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号:id=" + id +
                ", 姓名:name='" + name + '\'' +
                ", 出生日期:birDate='" + birDate + '\'' +
                ", 是否为男:gender=" + gender +
                '}';
    }
}
