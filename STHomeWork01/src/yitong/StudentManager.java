package yitong;

import java.util.ArrayList;
import java.util.List;

//学生信息管理类
public class StudentManager {
    private static List<Student> studentList = new ArrayList<>();

    //插入学生信息
    public String insertStudent(Student student){
        try {
            if (!studentList.isEmpty()){
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getId()==student.getId()){
                    return "该学生已存在!";
                }
            }
            }
            studentList.add(student);
            return "插入成功";
        }catch (Exception e){
            return "插入失败";
        }
    }

    //通过学号查询学生
    public String queryStudent(int id){
        if (studentList.isEmpty()){
            return "当前学生列表为空,请先插入学生信息!!";
        }
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId()==id){
                return studentList.get(i).toString();
            }
        }
        return "未查询到该学生!";
    }

    //通过学号删除学生
    public String delStudent(int id){
        if (studentList.isEmpty()){
            return "当前学生列表为空,请先插入学生信息!!";
        }
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId()==id){
                studentList.remove(i);
                return "删除成功";
            }
        }
        return "删除失败,未查询到该学生!";
    }

    //通过学号修改学生
    public String upStudent(int id,int temp,String upStr){
        if (studentList.isEmpty()){
            return "当前学生列表为空,请先插入学生信息!!";
        }
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId()==id){
                if (temp == 1 ){
                    studentList.get(i).setName(upStr);}
                else if (temp == 2 ){
                    studentList.get(i).setBirDate(upStr);}
                else if (temp == 3 ){
                    Boolean gender  = upStr.equals("男");
                    studentList.get(i).setGender(gender);
                }
                return "修改成功";
            }
        }
        return "修改失败";
    }

    //输出所有学生信息
    public String toString(){
        if (studentList.isEmpty()){
            return "当前学生列表为空,请先插入学生信息!!";
        }
        StringBuffer out = new StringBuffer();
        for (int i = 0; i < studentList.size(); i++) {
            //换行符处理
            if (i!=studentList.size()-1){
            out.append(studentList.get(i).toString()+"\r\n");
            }else {
                out.append(studentList.get(i).toString());
            }
        }
        //输出所有学生信息
        return out.toString();
    }


}
