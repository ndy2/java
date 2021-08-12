package lec_extends;

import java.awt.Frame;
import java.awt.Graphics;

public class ndyFrame extends Frame {
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(100,100,200,100);
    }
}
