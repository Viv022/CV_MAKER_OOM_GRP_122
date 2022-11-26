package CV_MAKER;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OtherInfo extends JFrame {
    public String Name;
    public String DOB;
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
    public String Projects;
    public String Awards;
    public String ISchoolFrom;
    public String ISchoolTo;
    public String CollegeFrom;
    public String CollegeTo;
    public String UniversityFrom;
    public String UniversityTo;
    public String imagePath;
    public String t1;
    public String t2;
    public String t3;
    public String t4;
    public String t5;
    public String Workfrom;
    public String Workto;
    public String Company;
    public String Designation;
    public String Achievements;
    private JButton GenerateResume;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JTextArea txthobby;
    private JTextArea txtslang;
    private JTextArea txtsoft;
    private JTextArea txttech;
    private JTextArea txttlang;

    public OtherInfo(String Name, String DOB, String FatherName, String MotherName, String Nationality, String PhoneNo, String email, String HSchool, String ISchool, String College, String University, String HSchoolFrom, String HSchoolTo, String ISChoolFrom, String ISchoolTo, String CollegeFrom, String CollegeTo, String UniversityFrom, String UniversityTo, String Project, String Award, String Workfrom, String Workto, String Company, String Designation, String Achievements, String imagePath) {
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
        this.Projects = Project;
        this.Awards = Award;
        this.Workfrom = Workfrom;
        this.Workto = Workto;
        this.Company = Company;
        this.Designation = Designation;
        this.Achievements = Achievements;
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();

        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel10 = new JLabel();

        this.jScrollPane1 = new JScrollPane();
        this.txttech = new JTextArea();
        this.jScrollPane2 = new JScrollPane();
        this.txttlang = new JTextArea();
        this.jScrollPane3 = new JScrollPane();
        this.txtsoft = new JTextArea();
        this.jScrollPane4 = new JScrollPane();
        this.txtslang = new JTextArea();
        this.jLabel9 = new JLabel();
        this.jScrollPane5 = new JScrollPane();
        this.txthobby = new JTextArea();

        this.GenerateResume = new JButton();

        this.setDefaultCloseOperation(3);

        this.jPanel1.setBackground(new Color(0, 19, 232));

        this.jPanel2.setBackground(new Color(0, 0, 0));

        this.jLabel5.setBackground(new Color(0, 0, 0));
        this.jLabel5.setFont(new Font("Tahoma", 0, 14));
        this.jLabel5.setForeground(new Color(204, 255, 255));

        this.jLabel3.setBackground(new Color(0, 0, 0));
        this.jLabel3.setFont(new Font("Tahoma", 0, 24));
        this.jLabel3.setForeground(new Color(204, 255, 255));
        this.jLabel3.setText("Soft skills:");

        this.jLabel4.setBackground(new Color(0, 0, 0));
        this.jLabel4.setFont(new Font("Tahoma", 0, 14));
        this.jLabel4.setForeground(new Color(204, 255, 255));
        this.jLabel4.setText("Languages:");

        this.jLabel6.setBackground(new Color(0, 0, 0));
        this.jLabel6.setFont(new Font("Tahoma", 0, 24));
        this.jLabel6.setForeground(new Color(204, 255, 255));
        this.jLabel6.setText("Technical Skills:");

        this.jLabel7.setBackground(new Color(0, 0, 0));
        this.jLabel7.setFont(new Font("Tahoma", 0, 14));
        this.jLabel7.setForeground(new Color(204, 255, 255));
        this.jLabel7.setText("Languages:");

        this.jLabel8.setBackground(new Color(0, 0, 0));
        this.jLabel8.setFont(new Font("Tahoma", 0, 14));
        this.jLabel8.setForeground(new Color(204, 255, 255));
        this.jLabel8.setText("Technologies:");

        this.txttech.setColumns(20);
        this.txttech.setRows(5);
        this.jScrollPane1.setViewportView(this.txttech);
        this.txttlang.setColumns(20);
        this.txttlang.setRows(5);

        this.jScrollPane2.setViewportView(this.txttlang);
        this.txtsoft.setColumns(20);
        this.txtsoft.setRows(5);

        this.jScrollPane3.setViewportView(this.txtsoft);
        this.txtslang.setColumns(20);
        this.txtslang.setRows(5);

        this.jScrollPane4.setViewportView(this.txtslang);
        this.jLabel9.setBackground(new Color(0, 0, 0));
        this.jLabel9.setFont(new Font("Tahoma", 0, 24));
        this.jLabel9.setForeground(new Color(204, 255, 255));
        this.jLabel9.setText("Hobbys/Interests:");

        this.txthobby.setColumns(20);
        this.txthobby.setRows(5);
        this.jScrollPane5.setViewportView(this.txthobby);

        this.GenerateResume.setText("Generate Resume");
        this.GenerateResume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                OtherInfo.this.GenerateResumeActionPerformed(evt);
            }
        });
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel6)).addGroup(jPanel2Layout.createSequentialGroup().addGap(52, 52, 52).addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jLabel8).addComponent(this.jLabel4)).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(9, 9, 9).addComponent(this.jScrollPane1, -2, 341, -2)).addGroup(jPanel2Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jScrollPane2, -2, 341, -2)))).addGroup(jPanel2Layout.createSequentialGroup().addGap(39, 39, 39).addComponent(this.jLabel3).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jScrollPane3, -2, 341, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel5))).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(48, 48, 48).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane4, -2, 341, -2).addComponent(this.jLabel7)).addGap(0, 79, 32767)).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.GenerateResume, -2, 133, -2).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel9).addComponent(this.jScrollPane5, -2, 328, -2))).addGap(55, 55, 55)))));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(21, 21, 21).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.jLabel9)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel8).addComponent(this.jScrollPane5, -2, 126, -2).addComponent(this.jScrollPane1, -2, 136, -2)).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(this.jLabel4)).addGroup(jPanel2Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jScrollPane2, -2, -1, -2))).addGap(27, 27, 27).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel7).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jScrollPane4, -2, -1, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel3).addGap(36, 36, 36).addComponent(this.jLabel5)).addComponent(this.jScrollPane3, -2, 125, -2)).addGap(22, 22, 22).addComponent(this.GenerateResume).addContainerGap(138, 32767)));
        this.jLabel1.setFont(new Font("Maiandra GD", 1, 36));
        this.jLabel1.setForeground(new Color(0, 255, 255));
        this.jLabel2.setText("jLabel2");
        this.jLabel10.setFont(new Font("Maiandra GD", 3, 48));
        this.jLabel10.setForeground(new Color(0, 204, 204));
        this.jLabel10.setText("Others:");

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(360, 360, 360).addComponent(this.jLabel10, -2, 175, -2).addGap(958, 958, 958).addComponent(this.jLabel2)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -2, -1, -2))).addContainerGap(-1, 32767)).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(272, 272, 272).addComponent(this.jLabel1).addContainerGap(1265, 32767))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jLabel10)).addGap(31, 31, 31).addComponent(this.jPanel2, -2, -1, -2).addGap(74, 74, 74)).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(376, 376, 376).addComponent(this.jLabel1).addContainerGap(432, 32767))));

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, 953, -2).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, 723, -2)));
        this.pack();
    }

    private void GenerateResumeActionPerformed(ActionEvent evt) {
        this.t1 = this.txttech.getText();
        this.t2 = this.txttlang.getText();
        this.t3 = this.txtsoft.getText();
        this.t4 = this.txtslang.getText();
        this.t5 = this.txthobby.getText();
        Resume rgf = new Resume(this.Name, this.DOB, this.FatherName, this.MotherName, this.Nationality, this.email, this.PhoneNo, this.HSchool, this.ISchool, this.College, this.University, this.HSchoolFrom, this.HSchoolTo, this.ISchoolFrom, this.ISchoolTo, this.CollegeFrom, this.CollegeTo, this.UniversityFrom, this.UniversityTo, this.Projects, this.Awards, this.Workfrom, this.Workto, this.Company, this.Designation, this.Achievements, this.t1, this.t2, this.t3, this.t4, this.t5, this.imagePath);
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo((Component)null);
        rgf.setDefaultCloseOperation(3);
    }

    public OtherInfo() {
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
            Logger.getLogger(OtherInfo.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(OtherInfo.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(OtherInfo.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(OtherInfo.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new OtherInfo()).setVisible(true);
            }
        });
    }
}
