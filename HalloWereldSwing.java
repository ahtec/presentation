import javax.swing.*;        

public class HalloWereldSwing {
    /**
     * Maak de GUI en laat het zien.
     */
    private static void createAndShowGUI() {
        //Hier zorgt Java dat het er goed uit komt te zien.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Maak het venster.
        JFrame frame = new JFrame("HalloWereldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Laat de tekst zien.
        JLabel label = new JLabel("Hallo Wereld!");
        frame.getContentPane().add(label);

        //Laat het venster zien.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
