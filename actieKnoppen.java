import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class actieKnoppen extends JFrame
  implements ActionListener{
  private JTextField tekstveld;
  private JLabel tekst, melding;
  private JButton knop;
  
  public actieKnoppen() {     // constructor
    setSize(500, 250);
    setTitle("Titeltekst");
    //setResizable(false);    // voorkomt herschalen
  }
  public static void main(String[] args) {
    actieKnoppen venster = new actieKnoppen();
    venster.createGUI();
    venster.setVisible(true);
  }
  private void createGUI(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container venster = this.getContentPane();
    venster.setLayout(new FlowLayout() );
    JPanel bladhoofd = new JPanel();   // hulpconstructie
    {
      tekst = new JLabel("Geef uw keuze: ");
      tekstveld = new JTextField(20);
      knop = new JButton("Kies");
      melding = new JLabel();
      bladhoofd.add(tekst);
      bladhoofd.add(tekstveld);
      bladhoofd.add(knop);
    }
    venster.add(bladhoofd);
    venster.add(melding);
    knop.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e){
    String tkt = "U koos: " +
      tekstveld.getText();
    melding.setText(tkt);
  }
}
