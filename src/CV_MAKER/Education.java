package CV_MAKER;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Education extends JFrame {
    public String Name;
    public String DOB;
    public String FatherName;
    public String MotherName;
    public String Nationality;
    public String email;
    public String PhoneNo;
    public String imagePath;
    public String j1;
    public String j2;
    public String j3;
    public String j4;
    public String j5;
    public String j6;
    public String j7;
    public String j8;
    private JComboBox<String> jComboBox10f;
    private JComboBox<String> jComboBox10t;
    private JComboBox<String> jComboBox12f;
    private JComboBox<String> jComboBox12t;
    private JComboBox<String> jComboBoxbf;
    private JComboBox<String> jComboBoxbt;
    private JComboBox<String> jComboBoxmf;
    private JComboBox<String> jComboBoxmt;
    private JLabel jLabel1;
    private JLabel jLabel12;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JButton nextbttn;
    private JTextField txt10th;
    private JTextField txt12th;
    private JTextField txtbach;
    private JTextField txtmast;

    public Education(String Name, String DOB, String email, String FatherName, String MotherName, String PhoneNo, String Nationality, String imagePath) {
        this.initComponents();
        this.Name = Name;
        this.DOB = DOB;
        this.FatherName = FatherName;
        this.Nationality = Nationality;
        this.PhoneNo = PhoneNo;
        this.email = email;
        this.imagePath = imagePath;
        this.MotherName = MotherName;
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel3 = new JPanel();

        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel12 = new JLabel();

        this.txt12th = new JTextField();
        this.txtbach = new JTextField();
        this.txtmast = new JTextField();
        this.txt10th = new JTextField();

        this.jComboBox12f = new JComboBox();
        this.jComboBox12t = new JComboBox();
        this.jComboBox10f = new JComboBox();
        this.jComboBox10t = new JComboBox();
        this.jComboBoxmf = new JComboBox();
        this.jComboBoxmt = new JComboBox();
        this.jComboBoxbf = new JComboBox();
        this.jComboBoxbt = new JComboBox();

        this.nextbttn = new JButton();

        this.setDefaultCloseOperation(3);

        this.jPanel1.setBackground(new Color(0, 19, 232));

        this.jLabel1.setFont(new Font("Maiandra GD", 1, 36));
        this.jLabel1.setForeground(new Color(0, 255, 255));
        this.jLabel1.setText("Educational Information");

        this.jPanel3.setBackground(new Color(0, 0, 0));

        this.jLabel3.setBackground(new Color(0, 0, 0));
        this.jLabel3.setFont(new Font("Tahoma", 0, 14));
        this.jLabel3.setForeground(new Color(204, 255, 255));
        this.jLabel3.setText("High School(10th Board):");

        this.jLabel4.setBackground(new Color(0, 0, 0));
        this.jLabel4.setFont(new Font("Tahoma", 0, 14));
        this.jLabel4.setForeground(new Color(204, 255, 255));
        this.jLabel4.setText("College/University (Bachelors):");

        this.jLabel5.setBackground(new Color(0, 0, 0));
        this.jLabel5.setFont(new Font("Tahoma", 0, 14));
        this.jLabel5.setForeground(new Color(204, 255, 255));
        this.jLabel5.setText("College/University(Masters):");

        this.txt10th.setFont(new Font("Tahoma", 0, 14));
        this.txt12th.setFont(new Font("Tahoma", 0, 14));
        this.txtbach.setFont(new Font("Tahoma", 0, 14));
        this.txtmast.setFont(new Font("Tahoma", 0, 14));

        this.jLabel12.setBackground(new Color(0, 0, 0));
        this.jLabel12.setFont(new Font("Tahoma", 0, 14));
        this.jLabel12.setForeground(new Color(204, 255, 255));
        this.jLabel12.setText("Intermediate school((12th Boards):");

        this.jComboBox12f.setModel(new DefaultComboBoxModel(new String[]{"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        this.jComboBox12f.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Education.this.jComboBox12fActionPerformed(evt);
            }
        });

        this.jComboBox12t.setModel(new DefaultComboBoxModel(new String[]{"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        this.jComboBox12t.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Education.this.jComboBox12tActionPerformed(evt);
            }
        });

        this.jLabel6.setBackground(new Color(0, 0, 0));
        this.jLabel6.setFont(new Font("Tahoma", 0, 14));
        this.jLabel6.setForeground(new Color(204, 255, 255));
        this.jLabel6.setText("Duration:");

        this.jComboBox10f.setModel(new DefaultComboBoxModel(new String[]{"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        this.jComboBox10f.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Education.this.jComboBox10fActionPerformed(evt);
            }
        });

        this.jComboBox10t.setModel(new DefaultComboBoxModel(new String[]{"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        this.jComboBox10t.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Education.this.jComboBox10tActionPerformed(evt);
            }
        });

        this.jComboBoxmf.setModel(new DefaultComboBoxModel(new String[]{"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        this.jComboBoxmf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Education.this.jComboBoxmfActionPerformed(evt);
            }
        });

        this.jComboBoxmt.setModel(new DefaultComboBoxModel(new String[]{"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        this.jComboBoxmt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Education.this.jComboBoxmtActionPerformed(evt);
            }
        });

        this.jComboBoxbf.setModel(new DefaultComboBoxModel(new String[]{"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        this.jComboBoxbf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Education.this.jComboBoxbfActionPerformed(evt);
            }
        });

        this.jComboBoxbt.setModel(new DefaultComboBoxModel(new String[]{"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        this.jComboBoxbt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Education.this.jComboBoxbtActionPerformed(evt);
            }
        });

        this.nextbttn.setText("Next");
        this.nextbttn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Education.this.nextbttnActionPerformed(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addGap(0, 0, 32767).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.nextbttn, -2, 73, -2).addComponent(this.jLabel6)).addGap(140, 140, 140)).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(39, 39, 39).addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jLabel5).addComponent(this.jLabel4)).addGap(26, 26, 26)).addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel3).addGap(34, 34, 34))).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.txtbach, -2, 315, -2).addComponent(this.txtmast, -2, 315, -2).addComponent(this.txt12th, -2, 315, -2).addComponent(this.txt10th, -2, 315, -2))).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel12))).addGap(55, 55, 55).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jComboBoxbf, -2, 75, -2).addComponent(this.jComboBoxmf, -2, 75, -2).addComponent(this.jComboBox12f, -2, 75, -2).addComponent(this.jComboBox10f, -2, 75, -2)).addPreferredGap(ComponentPlacement.RELATED, 99, 32767).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jComboBoxbt, -2, 72, -2).addComponent(this.jComboBoxmt, -2, 72, -2).addComponent(this.jComboBox12t, -2, 72, -2).addComponent(this.jComboBox10t, -2, 72, -2)).addContainerGap(55, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(22, 22, 22).addComponent(this.jLabel6, -2, 17, -2).addGap(42, 42, 42).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.txt10th, -2, 26, -2).addComponent(this.jComboBox10f, -2, -1, -2).addComponent(this.jComboBox10t, -2, -1, -2).addComponent(this.jLabel3)).addGap(36, 36, 36).addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jLabel12).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.txt12th, -2, 26, -2).addComponent(this.jComboBox12f, -2, -1, -2).addComponent(this.jComboBox12t, -2, -1, -2))).addGap(30, 30, 30).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jComboBoxbf, -2, -1, -2).addComponent(this.jComboBoxbt, -2, -1, -2)).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.txtbach, -2, -1, -2).addComponent(this.jLabel4))).addGap(36, 36, 36).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.txtmast, -2, -1, -2).addComponent(this.jLabel5).addComponent(this.jComboBoxmf, -2, -1, -2).addComponent(this.jComboBoxmt, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED, 162, 32767).addComponent(this.nextbttn).addGap(69, 69, 69)));

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(203, 203, 203).addComponent(this.jLabel1)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel3, -2, -1, -2))).addContainerGap(18, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addGap(20, 20, 20).addComponent(this.jPanel3, -1, -1, 32767)));

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 25, 32767)));

        this.pack();
    }

    private void jComboBox12fActionPerformed(ActionEvent evt) {
        this.j3 = this.jComboBox12f.getSelectedItem().toString();
    }

    private void jComboBox10fActionPerformed(ActionEvent evt) {
        this.j1 = this.jComboBox10f.getSelectedItem().toString();
    }

    private void jComboBoxmfActionPerformed(ActionEvent evt) {
        this.j7 = this.jComboBoxmf.getSelectedItem().toString();
    }

    private void jComboBoxbfActionPerformed(ActionEvent evt) {
        this.j5 = this.jComboBoxbf.getSelectedItem().toString();
    }

    private void jComboBox12tActionPerformed(ActionEvent evt) {
        this.j4 = this.jComboBox12t.getSelectedItem().toString();
    }

    private void jComboBox10tActionPerformed(ActionEvent evt) {
        this.j2 = this.jComboBox10t.getSelectedItem().toString();
    }

    private void jComboBoxbtActionPerformed(ActionEvent evt) {
        this.j6 = this.jComboBox10f.getSelectedItem().toString();
    }

    private void jComboBoxmtActionPerformed(ActionEvent evt) {
        this.j8 = this.jComboBox10f.getSelectedItem().toString();
    }

    private void nextbttnActionPerformed(ActionEvent evt) {
        ProjectContribution rgf = new ProjectContribution(this.Name, this.DOB, this.FatherName, this.MotherName, this.Nationality, this.email, this.PhoneNo, this.txt10th.getText(), this.txt12th.getText(), this.txtbach.getText(), this.txtmast.getText(), this.j1, this.j2, this.j3, this.j4, this.j5, this.j6, this.j7, this.j8, this.imagePath);
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo((Component)null);
        rgf.setDefaultCloseOperation(3);
    }

    public Education() {
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
            Logger.getLogger(Education.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Education.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Education.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Education.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Education()).setVisible(true);
            }
        });
    }
}
