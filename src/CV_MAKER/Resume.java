package CV_MAKER;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Resume extends JFrame {
    public String Name;
    public String DOB;
    public String FatherName;
    public String MotherName;
    public String Technology;
    public String Techlang;
    public String Soft;
    public String Softlang;
    public String Hobbys;
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
    public String Workfrom;
    public String Workto;
    public String Company;
    public String Designation;
    public String Achievements;
    ImageIcon icon;
    Image scaleImage;
    private JLabel Achievementstxt;
    private JLabel Bachtxt;
    private JLabel Companytxt;
    private JLabel Designationltxt;
    private JLabel Durationwork;
    private JLabel Intertxt;
    private JLabel Nametxt;
    private JLabel Projectstxt;
    private JLabel Schooltxt;
    private JLabel Softlangtxt;
    private JLabel Softskill;
    private JLabel awardtxt;
    private JLabel contacttxt;
    private JLabel emailtxt;
    private JLabel hobbytxt;
    private JLabel intro;
    private JLabel jLabel10;
    private JLabel jLabel14;
    private JLabel jLabel17;
    private JLabel jLabel21;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JLabel masttxt;
    private JLabel nationtxt;
    private JLabel photo;
    private JLabel professiontxt;
    private JLabel techlangtxt;
    private JLabel techtxt;

    public Resume(String Name, String DOB, String FatherName, String MotherName, String Nationality, String PhoneNo, String email, String HSchool, String ISchool, String College, String University, String HSchoolFrom, String HSchoolTo, String ISChoolFrom, String ISchoolTo, String CollegeFrom, String CollegeTo, String UniversityFrom, String UniversityTo, String Project, String Award, String Workfrom, String Workto, String Company, String Designation, String Achievements, String Technology, String Techlang, String Softskill, String Softlang, String Hobbys, String imagePath) {
        this.icon = new ImageIcon(this.imagePath);
        this.scaleImage = this.icon.getImage();
        this.Name = Name;
        this.DOB = DOB;
        this.FatherName = FatherName;
        this.MotherName = MotherName;
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
        this.Techlang = Techlang;
        this.Technology = Technology;
        this.Soft = Softskill;
        this.Softlang = Softlang;
        this.Hobbys = Hobbys;
        this.imagePath = imagePath;
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel4 = new JPanel();
        this.jPanel6 = new JPanel();
        this.jPanel5 = new JPanel();
        this.jPanel7 = new JPanel();
        this.jPanel8 = new JPanel();
        this.jPanel9 = new JPanel();
        this.jPanel2 = new JPanel();

        this.Nametxt = new JLabel();
        this.professiontxt = new JLabel();
        this.Schooltxt = new JLabel();
        this.jLabel14 = new JLabel();
        this.Intertxt = new JLabel();
        this.jLabel21 = new JLabel();
        this.jLabel24 = new JLabel();
        this.jLabel25 = new JLabel();
        this.Bachtxt = new JLabel();
        this.jLabel17 = new JLabel();
        this.masttxt = new JLabel();
        this.techtxt = new JLabel();
        this.techlangtxt = new JLabel();
        this.Designationltxt = new JLabel();
        this.Companytxt = new JLabel();
        this.Durationwork = new JLabel();
        this.Achievementstxt = new JLabel();

        this.awardtxt = new JLabel();
        this.Projectstxt = new JLabel();

        this.Softlangtxt = new JLabel();
        this.Softskill = new JLabel();

        this.hobbytxt = new JLabel();
        this.intro = new JLabel();

        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.contacttxt = new JLabel();
        this.emailtxt = new JLabel();
        this.jLabel10 = new JLabel();
        this.nationtxt = new JLabel();
        this.photo = new JLabel();

        this.setDefaultCloseOperation(3);

        this.Nametxt.setFont(new Font("Tahoma", 0, 36));
        this.Nametxt.setText(this.Name);

        this.professiontxt.setText(this.FatherName);

        this.jPanel4.setBorder(BorderFactory.createTitledBorder("Educational Information\n"));

        this.Schooltxt.setText(this.HSchool);
        this.jLabel14.setText(this.HSchoolFrom + " - " + this.HSchoolTo);
        this.Intertxt.setText(this.ISchool);
        this.jLabel21.setText(this.ISchoolFrom + " - " + this.ISchoolTo);
        this.jLabel24.setText(this.UniversityFrom + " - " + this.UniversityTo);
        this.jLabel25.setText(this.CollegeFrom + " - " + this.CollegeTo);
        this.Bachtxt.setText(this.College);
        this.masttxt.setText(this.University);

        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGap(111, 111, 111).addComponent(this.jLabel17)).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.masttxt))).addContainerGap(170, 32767)).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.Bachtxt, -1, -1, 32767).addContainerGap()).addComponent(this.jLabel25, -1, -1, 32767).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.Schooltxt, -1, 266, 32767).addComponent(this.jLabel14, -1, -1, 32767).addComponent(this.Intertxt, -1, -1, 32767).addComponent(this.jLabel21, -1, -1, 32767)).addComponent(this.jLabel24)).addGap(0, 0, 32767)))));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.Schooltxt, -1, -1, 32767).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel14).addGap(18, 18, 18).addComponent(this.Intertxt).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jLabel21).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.Bachtxt).addGap(18, 18, 18).addComponent(this.jLabel25, -2, 14, -2).addGap(14, 14, 14).addComponent(this.masttxt).addGap(18, 18, 18).addComponent(this.jLabel24).addGap(82, 82, 82).addComponent(this.jLabel17)));

        this.jPanel6.setBorder(BorderFactory.createTitledBorder("Technical Skills\n"));
        this.techtxt.setText(this.Technology);
        this.techlangtxt.setText(this.Techlang);
        GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGap(28, 28, 28).addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addComponent(this.techtxt, -2, 276, -2).addComponent(this.techlangtxt, -2, 276, -2)).addContainerGap(57, 32767)));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(this.techtxt, -1, 122, 32767).addGap(20, 20, 20).addComponent(this.techlangtxt, -2, 83, -2).addContainerGap()));

        this.jPanel5.setBorder(BorderFactory.createTitledBorder("Work Experience\n\n"));

        this.Designationltxt.setText(this.Designation);
        this.Companytxt.setText(this.Company);
        this.Durationwork.setText(this.Workfrom + " - " + this.Workto);
        this.Achievementstxt.setText(this.Achievements);

        GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(24, 24, 24).addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addComponent(this.Achievementstxt, -2, 355, -2).addComponent(this.Durationwork, -2, 86, -2).addComponent(this.Companytxt, -2, 102, -2).addComponent(this.Designationltxt, -2, 162, -2)).addContainerGap(-1, 32767)));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.Designationltxt).addGap(18, 18, 18).addComponent(this.Companytxt).addGap(18, 18, 18).addComponent(this.Durationwork).addGap(18, 18, 18).addComponent(this.Achievementstxt, -1, 94, 32767).addContainerGap()));

        this.jPanel7.setBorder(BorderFactory.createTitledBorder("Projects And contributions\n"));
        this.awardtxt.setText(this.Awards);
        this.Projectstxt.setText(this.Projects);

        GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
        this.jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING).addComponent(this.awardtxt, -1, 261, 32767).addComponent(this.Projectstxt, -1, -1, 32767)).addContainerGap()));
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel7Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.Projectstxt, -2, 83, -2).addGap(18, 18, 18).addComponent(this.awardtxt, -2, 102, -2).addGap(53, 53, 53)));

        this.jPanel8.setBorder(BorderFactory.createTitledBorder("Soft Skills\n"));
        this.Softlangtxt.setText(this.Softlang);
        this.Softskill.setText(this.Soft);

        GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
        this.jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING).addComponent(this.Softlangtxt, -2, 298, -2).addComponent(this.Softskill, -2, 155, -2)).addContainerGap(-1, 32767)));
        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(this.Softskill, -2, 83, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.Softlangtxt, -2, 73, -2).addContainerGap(119, 32767)));

        this.jPanel9.setBorder(BorderFactory.createTitledBorder("Hobbys/Interests\n\n"));
        this.hobbytxt.setText(this.Hobbys);

        GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
        this.jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addComponent(this.hobbytxt, -1, 331, 32767).addContainerGap()));
        jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addComponent(this.hobbytxt, -2, 107, -2).addContainerGap(42, 32767)));

        this.intro.setText(this.MotherName);
        this.jPanel2.setBorder(BorderFactory.createTitledBorder("Personal Information\n"));
        this.jLabel4.setText("Contact No:");
        this.jLabel5.setText("Email Id:");
        this.contacttxt.setText(this.PhoneNo);
        this.emailtxt.setText(this.email);
        this.jLabel10.setText("Nationality:");
        this.nationtxt.setText(this.Nationality);

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel4).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.contacttxt, -1, 142, 32767)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel5).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.emailtxt, -1, -1, 32767)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel10).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.nationtxt, -1, -1, 32767))).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.contacttxt)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.emailtxt)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel10).addComponent(this.nationtxt)).addContainerGap(111, 32767)));
        this.photo.setIcon(new ImageIcon(this.scaleImage));

        try{BufferedImage img = ImageIO.read(new File(this.imagePath));
        photo = new JLabel(new ImageIcon(img));}catch (IOException e) {}

        //this.photo.setText("jLabel1");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.photo, -2, 209, -2).addGap(40, 40, 40).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.Nametxt, -2, 478, -2).addComponent(this.professiontxt, -2, 210, -2).addComponent(this.intro, -2, 468, -2)).addGap(28, 28, 28).addComponent(this.jPanel2, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel4, -2, -1, -2).addComponent(this.jPanel7, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel5, -2, 299, -2).addComponent(this.jPanel8, -2, 299, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel6, -2, -1, -2).addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jPanel9, -2, -1, -2)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(11, 11, 11).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.Nametxt, -2, 49, -2).addGap(6, 6, 6).addComponent(this.professiontxt, -2, 24, -2).addGap(18, 18, 18).addComponent(this.intro, -2, 122, -2)).addComponent(this.jPanel2, -2, -1, -2).addGroup(jPanel1Layout.createSequentialGroup().addGap(9, 9, 9).addComponent(this.photo, -2, 198, -2))).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel4, -2, 250, -2).addGap(11, 11, 11).addComponent(this.jPanel7, -2, 278, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel5, -2, -1, -2).addGap(6, 6, 6).addComponent(this.jPanel8, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel6, -2, -1, -2).addGap(6, 6, 6).addComponent(this.jPanel9, -2, -1, -2)))));

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));

        this.pack();
    }

    public Resume() {
        this.icon = new ImageIcon(this.imagePath);
        this.scaleImage = this.icon.getImage();
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
            Logger.getLogger(Resume.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Resume.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Resume.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Resume.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Resume()).setVisible(true);
            }
        });
    }
}