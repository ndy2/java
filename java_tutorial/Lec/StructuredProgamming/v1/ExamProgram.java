package Lec.StructuredProgamming.v1;

import java.util.Scanner;


public class ExamProgram {
    public static void main (String[] args){
        int[] korList = new int[3];
       
        int menu;
        boolean keepLoop = true;
        while(keepLoop)
        {
            menu = inputMenu();
            switch(menu){
                case 1 : 
                    inputKors(korList);
                    break;
                case 2 : 
                    printKors(korList);
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

    static void printKors(int[] kors){
        int total = 0;
        float avg;
        for(int i = 0 ; i < 3;  i++)
            total+=kors[i];
        avg = total/3.0f;

        System.out.println("------------------------");
        System.out.println("--------성적출력---------");
        System.out.println("------------------------");
        System.out.println();
        for(int i = 0 ; i < 3;  i++)
            System.out.printf("국어 %d : %3d\n",3-i,kors[i]);
        
        System.out.printf("총점 : %3d\n",total);
        System.out.printf("평균 : %6.2f\n",avg);
        System.out.println("------------------------");
    }

    static void inputKors(int[] kors)
    {
        Scanner scan = new Scanner(System.in);

        int kor;

        System.out.println("------------------------");
        System.out.println("--------성적입력---------");
        System.out.println("------------------------");
        System.out.println();
        
        for(int i = 0 ; i <3 ; i++){
            do{
                System.out.printf("국어 %d : ", i+1);
                kor = scan.nextInt();
                if(kor<0|| 100<kor) System.out.println("0~100사이의 정수");
            }
            while(kor<0 || 100<kor);
            kors[i] = kor;
        }
        System.out.println("------------------------");
    }
}
