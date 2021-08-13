package lec_interface_text_to_instance;

public class A {
    private X x;

    public void setX(X x){
        this.x =x;
    }

    public A(){
    }

    public void print()
    {
        int total = x.total();
        System.out.printf("total is %d\n",total);
    }
}
