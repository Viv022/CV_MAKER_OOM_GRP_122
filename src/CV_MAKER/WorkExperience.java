package CV_MAKER;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WorkExperience extends JFrame {
    public String Name;
    public String DOB;
    public String FatherName;
    public String j1;
    public String j2;
    public String j3;
    public String j4;
    public String j5;
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
    public String Projects;
    public String Awards;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JButton nextbttn;
    private JTextArea txtachievements;
    private JTextField txtcompany;
    private JTextField txtpost;
    private JComboBox<String> workfrombox;
    private JComboBox<String> worktobox;

    public WorkExperience(String Name, String DOB, String FatherName, String MotherName, String Nationality, String PhoneNo, String email, String HSchool, String ISchool, String College, String University, String HSchoolFrom, String HSchoolTo, String ISChoolFrom, String ISchoolTo, String CollegeFrom, String CollegeTo, String UniversityFrom, String UniversityTo, String Project, String Award, String imagePath) {
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
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();

        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();

        this.txtcompany = new JTextField();
        this.txtpost = new JTextField();
        this.txtachievements = new JTextArea();

        this.workfrombox = new JComboBox();
        this.worktobox = new JComboBox();

        this.jScrollPane1 = new JScrollPane();

        this.nextbttn = new JButton();

        this.setDefaultCloseOperation(3);

        this.jPanel1.setBackground(new Color(0, 19, 232));

        this.jLabel1.setFont(new Font("Maiandra GD", 1, 36));
        this.jLabel1.setForeground(new Color(0, 255, 255));
        this.jLabel1.setText("Work Experience");

        this.jPanel2.setBackground(new Color(0, 0, 0));

        this.jLabel3.setBackground(new Color(0, 0, 0));
        this.jLabel3.setFont(new Font("Tahoma", 0, 14));
        this.jLabel3.setForeground(new Color(204, 255, 255));
        this.jLabel3.setText("Achievements:");

        this.txtcompany.setFont(new Font("Tahoma", 0, 14));

        this.workfrombox.setModel(new DefaultComboBoxModel(new String[]{"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        this.workfrombox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                WorkExperience.this.workfromboxActionPerformed(evt);
            }
        });

        this.worktobox.setModel(new DefaultComboBoxModel(new String[]{"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        this.worktobox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                WorkExperience.this.worktoboxActionPerformed(evt);
            }
        });

        this.jLabel4.setBackground(new Color(0, 0, 0));
        this.jLabel4.setFont(new Font("Tahoma", 0, 14));
        this.jLabel4.setForeground(new Color(204, 255, 255));
        this.jLabel4.setText("Designation:");

        this.txtpost.setFont(new Font("Tahoma", 0, 14));

        this.jLabel5.setBackground(new Color(0, 0, 0));
        this.jLabel5.setFont(new Font("Tahoma", 0, 14));
        this.jLabel5.setForeground(new Color(204, 255, 255));
        this.jLabel5.setText("Company Name:");

        this.txtachievements.setColumns(20);
        this.txtachievements.setRows(5);

        this.jScrollPane1.setViewportView(this.txtachievements);

        this.jLabel6.setBackground(new Color(0, 0, 0));
        this.jLabel6.setFont(new Font("Tahoma", 0, 14));
        this.jLabel6.setForeground(new Color(204, 255, 255));
        this.jLabel6.setText("Duration:");

        this.nextbttn.setText("Next");
        this.nextbttn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                WorkExperience.this.nextbttnActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(45, 45, 45).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel5, Alignment.TRAILING).addComponent(this.jLabel4, Alignment.TRAILING).addComponent(this.jLabel3, Alignment.TRAILING)).addGap(34, 34, 34).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.txtpost, Alignment.TRAILING, -2, 315, -2).addComponent(this.txtcompany, Alignment.TRAILING, -2, 315, -2))).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGap(184, 184, 184).addComponent(this.jScrollPane1, -2, 315, -2))).addGap(55, 55, 55).addComponent(this.workfrombox, -2, 75, -2).addPreferredGap(ComponentPlacement.RELATED, 92, 32767).addComponent(this.worktobox, -2, 72, -2).addGap(29, 29, 29)).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGap(0, 0, 32767).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.jLabel6).addGap(113, 113, 113)).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.nextbttn, -2, 73, -2).addGap(62, 62, 62)))));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(27, 27, 27).addComponent(this.jLabel6).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.txtcompany, -2, 26, -2).addComponent(this.workfrombox, -2, -1, -2).addComponent(this.worktobox, -2, -1, -2).addComponent(this.jLabel5)).addGap(54, 54, 54).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.txtpost, -2, 26, -2).addComponent(this.jLabel4)).addGap(53, 53, 53).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel3).addComponent(this.jScrollPane1, -2, 160, -2)).addPreferredGap(ComponentPlacement.RELATED, 72, 32767).addComponent(this.nextbttn).addGap(41, 41, 41)));

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1).addGap(290, 290, 290)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(0, 0, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel2, -1, -1, 32767)));

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));

        this.pack();
    }

    private void workfromboxActionPerformed(ActionEvent evt) {
        this.j1 = this.workfrombox.getSelectedItem().toString();
    }

    private void worktoboxActionPerformed(ActionEvent evt) {
        this.j2 = this.worktobox.getSelectedItem().toString();
    }

    private void nextbttnActionPerformed(ActionEvent evt) {
        this.j3 = this.txtcompany.getText();
        this.j4 = this.txtpost.getText();
        this.j5 = this.txtachievements.getText();
        OtherInfo rgf = new OtherInfo(this.Name, this.DOB, this.FatherName, this.MotherName, this.Nationality, this.email, this.PhoneNo, this.HSchool, this.ISchool, this.College, this.University, this.HSchoolFrom, this.HSchoolTo, this.ISchoolFrom, this.ISchoolTo, this.CollegeFrom, this.CollegeTo, this.UniversityFrom, this.UniversityTo, this.Projects, this.Awards, this.j1, this.j2, this.j3, this.j4, this.j5, this.imagePath);
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo((Component)null);
        rgf.setDefaultCloseOperation(3);
    }

    public WorkExperience() {
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
                (new WorkExperience()).setVisible(true);
            }
        });
    }
}
