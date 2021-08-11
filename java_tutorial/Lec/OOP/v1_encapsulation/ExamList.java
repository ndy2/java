package Lec.OOP.v1_encapsulation;

import java.util.Scanner;

public class ExamList {

    public Exam[] exams;
    public int current;

    public static void init(ExamList list)
    {
        list.exams = new Exam[3];
        list.current = 0;
    }

    public static class Exam {
        public int kor;
        public int eng;
        public int math;    
    }

    static void printList(ExamList list, int s , int e){
        System.out.println("------------------------");
        System.out.println("--------성적출력---------");
        System.out.println("------------------------");
        System.out.println();

        Exam[] exams = list.exams;
        int total = 0;
        float avg;
        for(int i = s ; i < e ; i++)
        {    
            Exam exam = exams[i];
            int kor = exam.kor;
            int eng = exam.eng;
            int math = exam.math;
            total += kor+eng+math;
            System.out.printf("국어 : %3d\n",kor);
            System.out.printf("영어 : %3d\n",eng);
            System.out.printf("수학 : %3d\n",math);
            System.out.println("------------------------");

        }
        avg = total/3.0f;

        System.out.printf("총점 : %3d\n",total);
        System.out.printf("평균 : %6.2f\n",avg);
        System.out.println("------------------------");
    
    }

    static void printList(ExamList list, int e){
        printList(list,0,e);
    }

    static void printList(ExamList list){
        printList(list,0,list.current);
    }

    static void inputList(ExamList list)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("--------성적입력---------");
        System.out.println("------------------------");
        System.out.println();
        
        int kor,eng,math;

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
        
        Exam exam = new Exam();
        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;

        Exam[] exams = list.exams;
        int size = list.current;
        if(list.exams.length == list.current){
            //1. 크기가 5개 정도 더 큰 새로운 배열 생성
            Exam[] temp = new Exam[list.exams.length+5];

            //2.값을 이주시키기
            for(int i =0 ; i <size; i++)
                temp[i] = exams[i];
            //3. list.exams 가 새로만든 temp 배열을 참조 하도록 한드
            list.exams = temp;
        }

        list.exams[list.current] = exam;
        list.current++;
        System.out.println("------------------------");
    }
}
