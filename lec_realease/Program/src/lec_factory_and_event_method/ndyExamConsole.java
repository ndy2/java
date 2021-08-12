package lec_factory_and_event_method;
import java.util.Scanner;

public class ndyExamConsole extends ExamConsole {

    @Override
    protected Exam makeExam() {
        return new ndyExam();
    }

    @Override
    protected void onInput(Exam exam) {
        ndyExam ndyexam = (ndyExam)exam;
        Scanner scan = new Scanner(System.in);
        int com;
        do{
            System.out.printf("컴퓨터  : ");
            com = scan.nextInt();
            if(com<0|| 100<com) System.out.println("0~100사이의 정수");
        }
        while(com<0 || 100<com);

        ndyexam.setCom(com);
    }

    @Override
    protected void onPrint(Exam exam) {
        ndyExam ndyexam = (ndyExam)exam;
        int com = ndyexam.getCom();
        System.out.printf("컴퓨터 : %3d\n",com);
    }
}
