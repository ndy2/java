package lec_factory_and_event_method;

import java.util.Scanner;

public abstract class ExamConsole {

    //Composition Has A
    private ExamList list = new ExamList();

    public void print(int s , int e){
        System.out.println("------------------------");
        System.out.println("--------성적출력---------");
        System.out.println("------------------------");
        System.out.println();
        
        for(int i = s ; i < e ; i++)
        {   
            Exam exam = list.get(i);
            int kor = exam.getKor();
            int eng = exam.getEng();
            int math = exam.getMath();
            int total = exam.total();
            float avg = exam.avg();
            System.out.printf("국어 : %3d\n",kor);
            System.out.printf("영어 : %3d\n",eng);
            System.out.printf("수학 : %3d\n",math);
            onPrint(exam);
            System.out.printf("총점 : %3d\n",total);
            System.out.printf("평균 : %6.2f\n",avg);
            System.out.println("------------------------");
        }
        System.out.println("------------------------");
    
    }


    public void print(int e){
        print(0,e);
    }

    public void print(){
        print(0,list.size());
    }

    public void input()
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
        

        //Factory Method
        // Exam exam = new Exam(kor,eng,math);
        Exam exam = makeExam();
        exam.setKor(kor);
        exam.setEng(eng);
        exam.setMath(math);

        //Event Method
        onInput(exam);

        list.add(exam);
        System.out.println("------------------------");
    }


    protected abstract void onInput(Exam exam);
    protected abstract void onPrint(Exam exam);

    protected abstract Exam makeExam();

}
