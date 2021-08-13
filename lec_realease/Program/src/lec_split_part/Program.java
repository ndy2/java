package lec_split_part;
import java.awt.event.WindowListener;

public class Program {
    public static void main(String[] args) {
        
        ndyFrame frame = new ndyFrame();
        frame.setVisible(true);

        WindowListener Listner = new ndyWindowListner();
        frame.addWindowListener(Listner);
    }
}
