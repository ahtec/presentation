/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.File;

/**
 *
 * @author gerard
 */
public class myButton  extends  javax.swing.JButton {
    
    /** Creates a new instance of myButton */
    public myButton() {
        super();
    }
    
    public File getLeftFile(){
        return buttonLeftFile;
    }
    
    public void setLeftFile(File f){
        buttonLeftFile = f;
    }
    
    public File getRightFile(){
        return buttonRightFile;
    }
    
    public void setRightFile(File f){
        buttonRightFile = f;
    }
    
    File buttonLeftFile;
    File buttonRightFile;
}
