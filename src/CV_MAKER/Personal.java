package CV_MAKER;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Personal extends JFrame {
    public String ImagePath;
    private JButton browsebttn;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private ButtonGroup buttonGroup3;
    private ButtonGroup buttonGroup4;
    private ButtonGroup buttonGroup5;
    private JLabel imagelabel;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel12;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JButton nextbttn;
    private JTextField txtdob;
    private JTextField txtemail;
    private JTextField txtfname;
    private JTextArea txtmname;
    private JTextField txtname;
    private JTextField txtnation;
    private JTextField txtphone;

    public Personal() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();

        this.buttonGroup1 = new ButtonGroup();
        this.buttonGroup2 = new ButtonGroup();
        this.buttonGroup3 = new ButtonGroup();
        this.buttonGroup4 = new ButtonGroup();
        this.buttonGroup5 = new ButtonGroup();

        this.jPanel2 = new JPanel();
        this.jPanel3 = new JPanel();

        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel12 = new JLabel();
        this.imagelabel = new JLabel();

        this.txtdob = new JTextField();
        this.txtphone = new JTextField();
        this.txtnation = new JTextField();
        this.txtemail = new JTextField();
        this.txtfname = new JTextField();
        this.txtname = new JTextField();
        this.txtmname = new JTextArea();

        this.nextbttn = new JButton();
        this.browsebttn = new JButton();

        this.jScrollPane1 = new JScrollPane();

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 100, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 100, 32767));

        this.setDefaultCloseOperation(3);

        this.jPanel2.setBackground(new Color(0, 19, 232));

        this.jLabel1.setFont(new Font("Maiandra GD", 1, 36));
        this.jLabel1.setForeground(new Color(0, 255, 255));
        this.jLabel1.setText("Personal Information");

        this.jPanel3.setBackground(new Color(0, 0, 0));

        this.jLabel2.setBackground(new Color(0, 0, 0));
        this.jLabel2.setFont(new Font("Tahoma", 0, 14));
        this.jLabel2.setForeground(new Color(204, 255, 255));
        this.jLabel2.setText("Name:");

        this.jLabel3.setBackground(new Color(0, 0, 0));
        this.jLabel3.setFont(new Font("Tahoma", 0, 14));
        this.jLabel3.setForeground(new Color(204, 255, 255));
        this.jLabel3.setText("Email Id:");

        this.jLabel4.setBackground(new Color(0, 0, 0));
        this.jLabel4.setFont(new Font("Tahoma", 0, 14));
        this.jLabel4.setForeground(new Color(204, 255, 255));
        this.jLabel4.setText("Profession:");

        this.jLabel5.setBackground(new Color(0, 0, 0));
        this.jLabel5.setFont(new Font("Tahoma", 0, 14));
        this.jLabel5.setForeground(new Color(204, 255, 255));
        this.jLabel5.setText("Nationality:");

        this.jLabel6.setBackground(new Color(0, 0, 0));
        this.jLabel6.setFont(new Font("Tahoma", 0, 14));
        this.jLabel6.setForeground(new Color(204, 255, 255));
        this.jLabel6.setText("Introduction:");

        this.jLabel8.setBackground(new Color(0, 0, 0));
        this.jLabel8.setFont(new Font("Tahoma", 0, 14));
        this.jLabel8.setForeground(new Color(204, 255, 255));
        this.jLabel8.setText("Contact No:");

        this.txtdob.setFont(new Font("Tahoma", 0, 14));
        this.txtphone.setFont(new Font("Tahoma", 0, 14));
        this.txtnation.setFont(new Font("Tahoma", 0, 14));
        this.txtemail.setFont(new Font("Tahoma", 0, 14));
        this.txtfname.setFont(new Font("Tahoma", 0, 14));
        this.nextbttn.setText("Next");

        this.nextbttn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Personal.this.nextbttnActionPerformed(evt);
            }
        });
        this.browsebttn.setText("Browse");
        this.browsebttn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Personal.this.browsebttnActionPerformed(evt);
            }
        });
        this.jLabel9.setBackground(new Color(0, 0, 0));
        this.jLabel9.setFont(new Font("Tahoma", 0, 14));
        this.jLabel9.setForeground(new Color(204, 255, 255));
        this.jLabel9.setText("Upload your photo:");

        this.jLabel10.setText("jLabel10");

        this.imagelabel.setBackground(new Color(0, 0, 0));
        this.imagelabel.setFont(new Font("Tahoma", 0, 14));
        this.imagelabel.setForeground(new Color(204, 255, 255));
        this.imagelabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        this.jLabel12.setBackground(new Color(0, 0, 0));
        this.jLabel12.setFont(new Font("Tahoma", 0, 14));
        this.jLabel12.setForeground(new Color(204, 255, 255));
        this.jLabel12.setText("Date of Birth:");

        this.txtname.setFont(new Font("Tahoma", 0, 14));
        this.txtmname.setColumns(20);
        this.txtmname.setRows(5);
        this.jScrollPane1.setViewportView(this.txtmname);

        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(80, 80, 80).addComponent(this.jLabel2).addGap(18, 18, 18).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.txtname, -2, 315, -2).addGroup(jPanel3Layout.createSequentialGroup().addGap(325, 325, 325).addComponent(this.jLabel10, -2, 40, -2))).addGap(18, 18, 18).addComponent(this.imagelabel, -2, 256, -2)).addGroup(jPanel3Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jLabel9).addGap(18, 18, 18).addComponent(this.browsebttn, -2, 73, -2).addGap(528, 528, 528).addComponent(this.nextbttn, -2, 73, -2)).addGroup(jPanel3Layout.createSequentialGroup().addGap(32, 32, 32).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jLabel3).addComponent(this.jLabel4).addComponent(this.jLabel6).addComponent(this.jLabel12).addComponent(this.jLabel5)).addGap(18, 18, 18).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.jScrollPane1, Alignment.LEADING).addComponent(this.txtfname, Alignment.LEADING).addComponent(this.txtemail, Alignment.LEADING).addComponent(this.txtdob, Alignment.LEADING, -2, 315, -2)).addComponent(this.txtnation, -2, 313, -2))).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jLabel8).addGap(18, 18, 18).addComponent(this.txtphone, -2, 315, -2))))).addContainerGap(81, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(36, 36, 36).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.imagelabel, -2, 256, -2).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.txtname, -2, 26, -2)).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel10).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel12).addComponent(this.txtdob, -2, 26, -2)).addGap(18, 18, 18).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.txtemail, -2, -1, -2).addComponent(this.jLabel3)).addGap(15, 15, 15).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.txtfname, -2, -1, -2)).addGap(26, 26, 26).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel6).addComponent(this.jScrollPane1, -2, -1, -2)).addGap(40, 40, 40).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel8).addComponent(this.txtphone, -2, -1, -2)).addGap(23, 23, 23).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.txtnation, -2, -1, -2)))).addPreferredGap(ComponentPlacement.RELATED, 130, 32767).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.nextbttn).addComponent(this.browsebttn).addComponent(this.jLabel9)).addGap(29, 29, 29)));

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(223, 223, 223).addComponent(this.jLabel1).addContainerGap(342, 32767)).addComponent(this.jPanel3, -1, -1, 32767));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addGap(18, 18, 18).addComponent(this.jPanel3, -1, -1, 32767).addContainerGap()));

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -2, -1, -2));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));

        this.pack();
    }

    private void nextbttnActionPerformed(ActionEvent evt) {
        Education rgf = new Education(this.txtname.getText(), this.txtdob.getText(), this.txtemail.getText(), this.txtfname.getText(), this.txtmname.getText(), this.txtphone.getText(), this.txtnation.getText(), this.ImagePath);
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo((Component)null);
        rgf.setDefaultCloseOperation(3);
    }

    private void browsebttnActionPerformed(ActionEvent evt) {
        FileBrowser f = new FileBrowser();
        if (f.getAbsolutePath() != null) {
            this.ImagePath = f.getAbsolutePath();
            ImageIcon icon = new ImageIcon(f.getAbsolutePath());
            Image scaleImage = icon.getImage();
            this.imagelabel.setIcon(new ImageIcon(scaleImage));
        }

    }

    public static void main(String[] args) {
        try {
            UIManager.LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                UIManager.LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(WorkExperience.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(WorkExperience.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(WorkExperience.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(WorkExperience.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Personal()).setVisible(true);
            }
        });
    }
}

