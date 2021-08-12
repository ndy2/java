package lec_factory_and_event_method;


public class ExamList {

    private Exam[] exams;
    private int current;

    //생성자
    public ExamList()
    {
        this(3);
    }

    public ExamList(int size)
    {
        exams = new Exam[size];
        current = 0;
    }

    public void add(Exam exam)
    {
        Exam[] exams = this.exams;
        int size = current;
        if(this.exams.length == current){
            //1. 크기가 5개 정도 더 큰 새로운 배열 생성
            Exam[] temp = new Exam[this.exams.length+5];

            //2.값을 이주시키기
            for(int i =0 ; i <size; i++)
                temp[i] = exams[i];
            //3. list.exams 가 새로만든 temp 배열을 참조 하도록 한드
            this.exams = temp;
        }

        this.exams[current] = exam;
        current++;
    }
    
    public Exam get(int i) {
        return this.exams[i];
    }

    public int size() {
        return current;
    }
}
