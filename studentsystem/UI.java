package com.hxf.studentsystem;

import java.util.Scanner;

/**
 * @author HXF
 * UI: mainUI
 */
public class UI {

    public static void mainUI(){
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        String choice;

        while (loop){
            //主界面
            System.out.println("======学生管理系统======");
            System.out.println("1.所有信息");
            System.out.println("2.添加学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("5.查询学生");
            System.out.println("6.退出系统");
            System.out.print("请输入你的选择：");
            //用户选项
            choice = scanner.next();
            switch (choice){
                case "1" :
                    Program.showAllInfo();
                    break;
                case "2" :
                    Program.addStudent();
                    break;
                case "3" :
                    Program.delStudent();
                    break;
                case "4" :
                    Program.reSetStudent();
                    break;
                case "5" :
                    Program.findStudent();
                    break;
                case "6" :
                    System.out.println("正在退出系统！");
                    loop = false;
                    break;
                default :
                    System.out.println("没有该选项！");
                    break;
            }
        }
    }
}
