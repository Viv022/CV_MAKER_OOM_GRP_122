package CV_MAKER;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjectContribution extends JFrame {
    public String Name;
    public String DOB;
    public String t1;
    public String t2;
    public String FatherName;
    public String MotherName;
    public String Nationality;
    public String email;
    public String PhoneNo;
    public String HSchool;
    public String ISchool;
    public String College;
    public String University;
    public String HSchoolFrom;
    public String HSchoolTo;
    public String ISchoolFrom;
    public String ISchoolTo;
    public String CollegeFrom;
    public String CollegeTo;
    public String UniversityFrom;
    public String UniversityTo;
    public String imagePath;
    private JButton addaward;
    private JButton addproject;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JButton nextbttn;
    private JTextArea txtAward;
    private JTextArea txtproject;

    public ProjectContribution(String Name, String DOB, String FatherName, String MotherName, String Nationality, String PhoneNo, String email, String HSchool, String ISchool, String College, String University, String HSchoolFrom, String HSchoolTo, String ISChoolFrom, String ISchoolTo, String CollegeFrom, String CollegeTo, String UniversityFrom, String UniversityTo, String imagePath) {
        this.initComponents();
        this.Name = Name;
        this.DOB = DOB;
        this.FatherName = FatherName;
        this.Nationality = Nationality;
        this.PhoneNo = PhoneNo;
        this.email = email;
        this.College = College;
        this.HSchool = HSchool;
        this.ISchool = ISchool;
        this.University = University;
        this.HSchoolFrom = HSchoolFrom;
        this.ISchoolTo = ISchoolTo;
        this.UniversityFrom = UniversityFrom;
        this.UniversityTo = UniversityTo;
        this.CollegeFrom = CollegeFrom;
        this.CollegeTo = CollegeTo;
        this.imagePath = imagePath;
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jPanel3 = new JPanel();
        this.jPanel4 = new JPanel();
        this.jPanel5 = new JPanel();

        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel5 = new JLabel();

        this.txtAward = new JTextArea();
        this.txtproject = new JTextArea();

        this.jScrollPane1 = new JScrollPane();
        this.jScrollPane2 = new JScrollPane();

        this.nextbttn = new JButton();
        this.addproject = new JButton();
        this.addaward = new JButton();

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 100, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 100, 32767));

        this.setDefaultCloseOperation(3);

        this.jPanel4.setBackground(new Color(0, 19, 232));

        this.jLabel1.setFont(new Font("Maiandra GD", 1, 36));
        this.jLabel1.setForeground(new Color(0, 255, 255));
        this.jLabel1.setText("Projects & Contribution");

        this.jPanel5.setBackground(new Color(0, 0, 0));

        this.jLabel3.setBackground(new Color(0, 0, 0));
        this.jLabel3.setFont(new Font("Tahoma", 0, 14));
        this.jLabel3.setForeground(new Color(204, 255, 255));
        this.jLabel3.setText("Projects:");

        this.jLabel5.setBackground(new Color(0, 0, 0));
        this.jLabel5.setFont(new Font("Tahoma", 0, 14));
        this.jLabel5.setForeground(new Color(204, 255, 255));
        this.jLabel5.setText("AWARDS:");

        this.txtAward.setColumns(20);
        this.txtAward.setRows(5);

        this.jScrollPane1.setViewportView(this.txtAward);
        this.jScrollPane2.setViewportView(this.txtproject);

        this.txtproject.setColumns(20);
        this.txtproject.setRows(5);

        this.nextbttn.setText("Next");
        this.nextbttn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ProjectContribution.this.nextbttnActionPerformed(evt);
            }
        });
        this.addproject.setText("Add another project");
        this.addaward.setText("Add another award");

        GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(96, 96, 96).addGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jLabel3).addComponent(this.jLabel5)).addGap(26, 26, 26).addGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jScrollPane1, -2, 315, -2).addComponent(this.jScrollPane2, -2, 315, -2)).addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.addaward, -2, 131, -2).addGap(0, 0, 32767)).addGroup(jPanel5Layout.createSequentialGroup().addGap(116, 116, 116).addComponent(this.addproject).addGap(0, 121, 32767)))).addGroup(Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.nextbttn, -2, 73, -2).addGap(33, 33, 33)));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addContainerGap().addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel3).addComponent(this.jScrollPane2, -2, 150, -2).addComponent(this.addproject)).addGap(206, 206, 206).addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel5).addComponent(this.jScrollPane1, -2, 165, -2).addComponent(this.addaward)).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.nextbttn).addContainerGap()));

        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGap(175, 175, 175).addComponent(this.jLabel1).addContainerGap(-1, 32767)).addComponent(this.jPanel5, -1, -1, 32767));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addPreferredGap(ComponentPlacement.RELATED, 46, 32767).addComponent(this.jPanel5, -2, -1, -2).addContainerGap()));

        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jPanel4, -2, -1, -2).addGap(0, 0, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jPanel4, -2, -1, -2).addGap(0, 0, 32767)));

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jPanel3, -2, -1, -2).addGap(0, 0, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jPanel3, -2, -1, -2).addGap(0, 0, 32767)));

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(0, 0, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(0, 0, 32767)));

        this.pack();
    }

    private void nextbttnActionPerformed(ActionEvent evt) {
        this.t1 = this.txtproject.getText();
        this.t2 = this.txtAward.getText();
        WorkExperience rgf = new WorkExperience(this.Name, this.DOB, this.FatherName, this.MotherName, this.Nationality, this.email, this.PhoneNo, this.HSchool, this.ISchool, this.College, this.University, this.HSchoolFrom, this.HSchoolTo, this.ISchoolFrom, this.ISchoolTo, this.CollegeFrom, this.CollegeTo, this.UniversityFrom, this.UniversityTo, this.t1, this.t2, this.imagePath);
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo((Component)null);
        rgf.setDefaultCloseOperation(3);
    }

    public ProjectContribution() {
        this.initComponents();
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
            Logger.getLogger(ProjectContribution.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(ProjectContribution.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(ProjectContribution.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(ProjectContribution.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectContribution();
            }
        });
    }
}
