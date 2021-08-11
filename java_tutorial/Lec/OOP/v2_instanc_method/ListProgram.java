package Lec.OOP.v2_instanc_method;

import java.util.Scanner;

public class ListProgram {
    public static void main(String[] args){
        ExamList list = new ExamList();
        list.init();

        int menu;
        boolean keepLoop = true;
        while(keepLoop)
        {
            menu = inputMenu();
            switch(menu){
                case 1 : 
                    list.inputList();
                    break;
                case 2 : 
                    list.printList();
                    break;
                case 3 : 
                    System.out.println("Bye~~");
                    keepLoop = false;
                    break;
            }
        }
    }

    static int inputMenu(){
        Scanner scan = new Scanner(System.in);
        int menu=3;
        System.out.println("------------------------");
        System.out.println("--------메인메뉴---------");
        System.out.println("------------------------");
        System.out.println("\t1. 성적 입력");
        System.out.println("\t2. 성적 출력");
        System.out.println("\t3. 종료");
        if(scan.hasNextInt()) menu = scan.nextInt();

        System.out.println("------------------------");
        return menu;
    }
}
