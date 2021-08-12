package lec_extends;
public class Program {
    public static void main(String[] args) {
        ndyExam exam = new ndyExam(10,20,30,40);
        
        System.out.println(exam.total());
        System.out.println(exam.avg());
        
        ndyFrame frame = new ndyFrame();
        frame.setVisible(true);

    }
}
