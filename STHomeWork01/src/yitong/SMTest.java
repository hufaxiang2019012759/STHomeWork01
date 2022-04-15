package yitong;

import java.util.Scanner;

public class SMTest {
    public static void main(String[] args) {
        System.out.println("STHomeWork01---学生管理系统");
        StudentManager studentManager = new StudentManager();
        while (true){
            System.out.println("----------- 数据分隔线 -----------\n" +
                    "请选择操作：\n" +
                    "***********************************\n" +
                    "*            1  插入               *\n" +
                    "*            2  查找               *\n" +
                    "*            3  删除               *\n" +
                    "*            4  修改               *\n" +
                    "*            5  输出               *\n" +
                    "*            6  退出               *\n" +
                    "***********************************\n");
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()){
                //选择操作
                int opera = in.nextInt();
                if (opera == 6){
                    System.out.println("退出系统中...");
                    break;
                }
                switch (opera){
                    case 1:
                        System.out.println("请输入要插入的学生信息(逐个输入):\n学号:");
                        int id = in.nextInt();
                        System.out.println("姓名:");
                        String name = in.next();
                        System.out.println("出生日期:");
                        String birDate = in.next();
                        System.out.println("性别(男/女):");
                        String genderStr = in.next();
                        Boolean gender = true;//默认
                        if (genderStr.equals("男")){
                            gender = true;
                        }
                        String out1 = studentManager.insertStudent(new Student(id, name, birDate, gender));
                        System.out.println(out1);
                        break;
                    case 2:
                        System.out.println("请输入要查询学生的学号");
                        int qid = in.nextInt();
                        String out2 = studentManager.queryStudent(qid);
                        System.out.println(out2);
                        break;
                    case 3:
                        System.out.println("请输入要删除学生的学号");
                        int did = in.nextInt();
                        String out3 = studentManager.delStudent(did);
                        System.out.println(out3);
                        break;
                    case 4:
                        System.out.println("请输入要修改学生的学号");
                        int uid = in.nextInt();
                        System.out.println("请选择要修改学生的信息--1.姓名 2.出生日期 3.性别(男/女)");
                        int temp = in.nextInt();
                        System.out.println("请输入修改值:");
                        String upStr = in.next();
                        String out4 = studentManager.upStudent(uid,temp,upStr);
                        System.out.println(out4);
                        break;
                    case 5:
                        String out5 = studentManager.toString();
                        System.out.println(out5);
                        break;
                }
            }
        }
    }
}
