/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gdpresentation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.lang.IllegalAccessException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Window;
import java.io.File;
import java.util.Vector;
//import sameFile.
import javax.swing.JPanel;
public class Frame extends JFrame {

    private JLabel slidesLabel = new JLabel();
//    private Icon[] icons;
    private int currentSlide = -1;
    static private int frameHoogte = 900,  frameBreedte = 1200;
    static Vector filesVector;
    static Vector labels;
    static GraphicsDevice myDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
    static String pad;
    static GridLayout gl ;
    private javax.swing.JPanel jPanel1;

    public Frame() {


//        filesVector = getFiles(new File("/Users/gerard1/Pictures/oudeMotorToertocht2012/test"), "jpg");
//        filesVector = getFiles(new File(pad), "jpg");




//        allePlaatjes.    b = new resultsBrowser(filesVector, filesVector);
//        slidesLabel.setVerticalAlignment(JLabel.CENTER);
//        slidesLabel.setHorizontalAlignment(JLabel.CENTER);
//        setLayout(new BorderLayout());
//          getContentPane().setLayout(new GridLayout(10, 10));
          gl = new GridLayout(4,4);
          jPanel1 = new JPanel(gl);

//        add(slidesLabel, BorderLayout.CENTER);
//        slidesLabel.addMouseListener(new ClickListener());
        addAllSlides();

//        nextSlide();
    }

    public void addAllSlides() {
        labels = new Vector();

        for (int i = 0; i < filesVector.size(); i++) {
            try {
//        slidesLabel.setIcon(new ImageIcon(imageToBeDisplayed.getScaledInstance(-1, 20, Image.SCALE_DEFAULT)));
                Image imageToBeDisplayed = ImageIO.read((File) filesVector.elementAt(i));
                File x = (File)filesVector.elementAt(i);
                
                
                System.out.println(x.getName());
                System.out.println(i);
                slidesLabel.setIcon(new ImageIcon(imageToBeDisplayed.getScaledInstance(-1, 50, Image.SCALE_DEFAULT)));
                slidesLabel.setIcon(new ImageIcon(imageToBeDisplayed.getScaledInstance(-1, 50, Image.SCALE_DEFAULT)));

             labels.add(slidesLabel);

//                jPanel1.add((JLabel)labels.get(i));
                
                
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

       this.add(jPanel1); 
        
    }

//    public void nextSlide() {
//        int hoogte;
//        if (currentSlide < filesVector.size() - 1) {
//            try {
//                currentSlide++;
//
//                Image imageToBeDisplayed = ImageIO.read((File) filesVector.get(currentSlide));
//                hoogte = imageToBeDisplayed.getHeight(this);
////                breedte = imageToBeDisplayed.getWidth(this);
//                if (hoogte > frameHoogte) {
//                    slidesLabel.setIcon(new ImageIcon(imageToBeDisplayed.getScaledInstance(-1, frameHoogte, Image.SCALE_DEFAULT)));
//                } else {
//                    slidesLabel.setIcon(new ImageIcon(imageToBeDisplayed.getScaledInstance(frameBreedte, -1, Image.SCALE_DEFAULT)));
//                }
//            //                slidesLabel.setIcon(new ImageIcon(ImageIO.read((File) filesVector.get(currentSlide)).getScaledInstance(frameBreedte, -1, Image.SCALE_DEFAULT)));
//            } catch (IOException ex) {
//                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            myDevice.setFullScreenWindow(null);
//        }
//    }
//    public void nextSlide() {
//        if (currentSlide < icons.length - 1) {
//            currentSlide++;
//            
////            slidesLabel.s
////            slidesLabel.setPreferredSize(new Dimension(500, 800));
//            slidesLabel.setIcon(icons[currentSlide]);
//        }
//    }
//    
//    static Vector getFiles(File f, String ex) {
//        Vector outFiles = new Vector();
//        File[] files = f.listFiles();
//
////		for(File file:files) {
//        for (int k = 0; k < files.length; k++) {
//            File file = files[k];
//            if (file.isFile()) {
//                if (file.getName().toLowerCase().endsWith(ex)) {
////                if (file.getName().toLowerCase().endsWith(extension)) {
//                    outFiles.add(file);
//                }
//            } else {
//                if (file.isDirectory() & !file.isHidden()) {
////					System.out.println(file.getAbsolutePath());
//                    Vector dirFiles = getFiles(file, ex);
//                    for (int i = 0; i < dirFiles.size(); i++) {
//                        outFiles.add(dirFiles.elementAt(i));
//                    }
//                }
//            }
//        }
//        return outFiles;
//    }

    public static void main(String args[]) {
        
        
        frameHoogte = 800;
        frameBreedte = 1200;
//        pad = args[0];


        EventQueue.invokeLater(new Runnable() {

//              device.getDefaultConfiguration();
//        this.device = device;
//          java.awt.GraphicsDevice     grafischObject = new java.awt.GraphicsDevice();
//            
//            getDefaultScreenDevice
//        isFullScreen = device.isFullScreenSupported();
//        setUndecorated(isFullScreen);
//        setResizable(!isFullScreen);
//        if (isFullScreen) {
//            // Full-screen mode
//            device.setFullScreenWindow(this);
//            validate();
//        } else {
//            // Windowed mode
//            pack();
//            setVisible(true);
//        }
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                Frame frame = new Frame();
                frame.setUndecorated(true);

//frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                myDevice.setFullScreenWindow(frame);


                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frameHoogte = frame.getHeight();
                frameBreedte = frame.getWidth();
                frame.setVisible(true);
            }
        });




    }

    public class ClickListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
//            nextSlide();
        }
    }
}
