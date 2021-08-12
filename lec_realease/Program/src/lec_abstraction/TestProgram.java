package lec_abstraction;

public class TestProgram {
    public static void main(String[] args){
        //Cannot initiate Abstract Type
        // Exam exam = new Exam(1,1,1);
        // System.out.println(exam.total());
    
        ndyExam ndyexam = new ndyExam(1,1,1,1);
        System.out.println(ndyexam.total());
    }
}
