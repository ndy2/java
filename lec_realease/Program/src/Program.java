import Lec.OOP.v4.Exam;
import Lec.OOP.v4.ExamConsole;
import Lec.OOP.v4.ExamList;

public class Program {
    public static void main(String[] args) throws Exception {
        ndyExam exam = new ndyExam(0,0,0);
        exam.setKor(10);
        exam.setEng(20);
        exam.setMath(30);
        exam.setCom(40);
        
        System.out.println(exam.total());
        
    }
}
