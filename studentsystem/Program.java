package com.hxf.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author HXF
 * Program: showAllInfo, addStudent, delStudent,
 *          reSetStudent, findStudent, chekStudent,
 */
public class Program {

    //存放学生信息的集合
    public static ArrayList<Student> studentList = new ArrayList<>();

    //显示所有信息
    public static void showAllInfo() {

        System.out.println("学号\t\t姓名\t\t年龄");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    //添加学生
    public static void addStudent() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("学号：");
        String id = scanner.next();

        System.out.print("姓名：");
        String name = scanner.next();

        System.out.print("年龄：");
        int age = scanner.nextInt();

        studentList.add(new Student(id, name, age));

    }

    //删除学生
    public static void delStudent() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("选择要删除的学生学号：");
        String id = scanner.next();
        int index = chekStudent(id);
        if(index == -1){
            System.out.println("该学号不存在！");
            return;
        }

        studentList.remove(index);
        System.out.println("删除成功！");
    }

    //修改学生
    public static void reSetStudent() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("输入你所要修改的学生学号：");
        String id = scanner.next();
        int index = chekStudent(id);
        if(index == -1){
            System.out.println("该学号不存在");
            return;
        }
        System.out.println("学号：" + id + "<不可修改>");
        System.out.println("新的姓名：");
        String newName = scanner.next();
        studentList.get(index).setName(newName);
        System.out.println("新的年龄：");
        int newAge = scanner.nextInt();
        studentList.get(index).setAge(newAge);

    }

    //查找学生
    public static void findStudent() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("选择你要查询的学生的学号：");
        String findId = scanner.next();
        int index = chekStudent(findId);
        if(index == -1){
            System.out.println("该学号不存在！");
            return;
        }
        System.out.println(studentList.get(index));

    }

    //检查学生是否存在
    public static int chekStudent(String id){
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId().equals(id)){
                index = i;
                return index;
            }
        }
        return index;
    }
}
