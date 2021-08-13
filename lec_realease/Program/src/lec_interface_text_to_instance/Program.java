package lec_interface_text_to_instance;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Program {
    public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, IOException
    {
        FileInputStream fis = new FileInputStream("C:/Users/1/Desktop/java/lec_realease/Program/src/lec_interface_text_to_instance/setting.txt");
        Scanner scan = new Scanner(fis);
        String className = scan.nextLine();
        scan.close();
        fis.close();
        
        A a = new A();
        Class clazz = Class.forName(className);
        X x = (X) clazz.getDeclaredConstructor().newInstance();
        a.setX(x);
        a.print();
    }
}
