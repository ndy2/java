package Lec.StructuredProgamming.v2;

import java.util.Scanner;


public class ExamProgram {
    public static void main (String[] args){
        Exam exam = new Exam();
        int menu;
        boolean keepLoop = true;
        while(keepLoop)
        {
            menu = inputMenu();
            switch(menu){
                case 1 : 
                    input(exam);
                    break;
                case 2 : 
                    print(exam);
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

    static void print(Exam exam){
        int kor = exam.kor;
        int eng = exam.eng;
        int math = exam.math;
        
        int total = kor+eng+math;
        float avg;
        avg = total/3.0f;

        System.out.println("------------------------");
        System.out.println("--------성적출력---------");
        System.out.println("------------------------");
        System.out.println();

        System.out.printf("국어 : %3d\n",kor);
        System.out.printf("영어 : %3d\n",eng);
        System.out.printf("수학 : %3d\n",math);
        
        System.out.printf("총점 : %3d\n",total);
        System.out.printf("평균 : %6.2f\n",avg);
        System.out.println("------------------------");
    }

    static void input(Exam exam)
    {
        Scanner scan = new Scanner(System.in);

        int kor,eng,math;

        System.out.println("------------------------");
        System.out.println("--------성적입력---------");
        System.out.println("------------------------");
        System.out.println();
        
        do{
            System.out.printf("국어  : ");
            kor = scan.nextInt();
            if(kor<0|| 100<kor) System.out.println("0~100사이의 정수");
        }
        while(kor<0 || 100<kor);
        
        do{
            System.out.printf("영어  : ");
            eng = scan.nextInt();
            if(eng<0|| 100<eng) System.out.println("0~100사이의 정수");
        }
        while(eng<0 || 100<eng);
        
        do{
            System.out.printf("수학  : ");
            math = scan.nextInt();
            if(math<0|| 100<math) System.out.println("0~100사이의 정수");
        }
        while(math<0 || 100<math);
        
        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;

        System.out.println("------------------------");
    }
}
