
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class fullscreenFrame extends javax.swing.JFrame {

    static private int frameHoogte = 800,  frameBreedte = 1000;
//    static GraphicsDevice myDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
//    static GraphicsDevice myDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[1];
//   ava.awt.Windo myWindow.getGraphicsConfiguration().getDevice() 
//    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    static boolean skipnumaardez = Boolean.FALSE;

    /** Creates new form fullscreenFrame */
    public fullscreenFrame() {
        initComponents();
    }

    public void setfullscreenFrame(File teDisplayenPlaatje) {
        int widthImageToBeDisplayed;
        int heightImageToBeDisplayed;
        Image imageVooricon = null;
        try {
            GraphicsDevice myCurrentDevice = null;
            GraphicsDevice theOtherDevice = null;

//            new fullscreenFrame();
//            this.setBounds(100, 100, (int) dim.getWidth(), (int) dim.getHeight());
            if (!skipnumaardez) {
                skipnumaardez = Boolean.TRUE;

                this.setLocation(0, 0);
                this.setBackground(Color.BLACK);
//                setLocationRelativeTo(null);
                this.setVisible(true);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                myCurrentDevice = this.getGraphicsConfiguration().getDevice();
                GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
                GraphicsDevice[] allScreens = env.getScreenDevices();
                int myScreenIndex = -1;
                for (int i = 0; i < allScreens.length; i++) {
                    if (allScreens[i].equals(myCurrentDevice)) {

                        myScreenIndex = i;
                        frameHoogte = myCurrentDevice.getDisplayMode().getHeight();
//                        frameHoogte = frameHoogte - frameHoogte / 30;
//                        frameHoogte = frameHoogte - frameHoogte / 30;
                        frameBreedte = myCurrentDevice.getDisplayMode().getWidth();
//                        frameBreedte = frameBreedte - frameBreedte / 30;
                        System.out.println("window is on screen" + myScreenIndex);
                        System.out.println("window framehoogte is " + frameHoogte);
                        System.out.println("window frameBreedte is " + frameBreedte);

//                        this.setUndecorated(true);
//                        this.setBounds(20, 0, frameBreedte - 20, frameHoogte);

                    } else {
                        System.out.println("the other screen is on " + i);

                        theOtherDevice = allScreens[i];
                        if (theOtherDevice.isFullScreenSupported()) {
                            theOtherDevice.setFullScreenWindow(this);

                        } else {
//                            this.setUndecorated(true);
                        }
//                        Window extraWindow = new Window(theOtherDevice,this.getGraphicsConfiguration());
                        frameHoogte = theOtherDevice.getDisplayMode().getHeight();
                        frameBreedte = theOtherDevice.getDisplayMode().getWidth();
                        System.out.println("2e scherm  is on screen" + theOtherDevice);
                        System.out.println(" framehoogte is " + frameHoogte);
                        System.out.println(" frameBreedte is " + frameBreedte);

                        this.setSize(frameBreedte, frameHoogte);
//                        this.setBounds(0, 0, frameBreedte, frameHoogte);

                        break;
                    }
                }
            }
//            System.out.println("window is on screen " + myScreenIndex);

//            myDevice.setFullScreenWindow(this);

            Image imageToBeDisplayed = ImageIO.read(teDisplayenPlaatje);

            this.addMouseListener(new ClickListener());
            widthImageToBeDisplayed = imageToBeDisplayed.getWidth(this);
            heightImageToBeDisplayed = imageToBeDisplayed.getHeight(this);
            if (Math.abs(frameHoogte - heightImageToBeDisplayed) < Math.abs(frameBreedte - widthImageToBeDisplayed)) {
                imageVooricon = imageToBeDisplayed.getScaledInstance(-1, frameHoogte, Image.SCALE_DEFAULT);

            }
            if (Math.abs(frameHoogte - heightImageToBeDisplayed) > Math.abs(frameBreedte - widthImageToBeDisplayed)) {
                imageVooricon = imageToBeDisplayed.getScaledInstance(frameBreedte, -1, Image.SCALE_DEFAULT);
                this.setLocation(0, frameHoogte - imageVooricon.getHeight(this));

            }





//            JLabel label = new JLabel(new ImageIcon(imageToBeDisplayed.getScaledInstance(frameBreedte, frameHoogte, Image.SCALE_DEFAULT)));
            JLabel label = new JLabel(new ImageIcon(imageVooricon));
            this.setContentPane(label);

            this.pack();
//            this.setAlwaysOnTop(true);
        } catch (IOException ex) {
            Logger.getLogger(fullscreenFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fullscreenFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

 public class ClickListener extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {

//        setVisible(false); //you can't see me!
        skipnumaardez = Boolean.FALSE;
        dispose(); //Destroy the JFrame object
        }
    }

}

