package CV_MAKER;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends JFrame {
    public JLabel l3;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JPasswordField txtpassword;
    private JTextField txtusername;

    public Login() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jPanel3 = new JPanel();

        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();

        this.jScrollPane1 = new JScrollPane();
        this.jTextArea1 = new JTextArea();

        this.txtusername = new JTextField();
        this.txtpassword = new JPasswordField();

        this.jButton1 = new JButton();
        this.jButton2 = new JButton();

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 100, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 100, 32767));

        this.jTextArea1.setColumns(20);
        this.jTextArea1.setRows(5);

        this.jScrollPane1.setViewportView(this.jTextArea1);
        this.setDefaultCloseOperation(3);

        this.jPanel2.setBackground(new Color(239, 30, 23));

        this.jLabel1.setFont(new Font("Maiandra GD", 1, 36));
        this.jLabel1.setForeground(new Color(239, 228, 11));
        this.jLabel1.setText("LOGIN ");

        this.jPanel3.setBackground(new Color(0, 255, 196));

        this.jLabel2.setBackground(new Color(255, 255, 255));
        this.jLabel2.setFont(new Font("Tahoma", 0, 14));
        this.jLabel2.setForeground(new Color(0,0,0));
        this.jLabel2.setText("Username:");
        this.jLabel3.setBackground(new Color(255, 255, 255));
        this.jLabel3.setFont(new Font("Tahoma", 0, 14));
        this.jLabel3.setForeground(new Color(0,0,0));
        this.jLabel3.setText("Password:");

        this.txtusername.setFont(new Font("Tahoma", 0, 14));
        this.txtpassword.setFont(new Font("Tahoma", 0, 14));

        this.jButton1.setText("Reset");
        this.jButton1.setBackground(Color.RED);
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Login.this.jButton1ActionPerformed(evt);
            }
        });

        this.jButton2.setText("Login");
        this.jButton2.setBackground(Color.GREEN);
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Login.this.jButton2ActionPerformed(evt);
            }
        });
        this.jLabel4.setBackground(new Color(255,255,255));
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));

        this.jLabel4.setForeground(new Color(0, 0, 0));
        this.jLabel4.setText("Click here to Register");
        this.jLabel4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Login.this.jLabel4MouseClicked(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(66, 66, 66).addComponent(this.jButton1, -2, 73, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton2, -2, 73, -2).addGap(73, 73, 73)).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(99, 99, 99).addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jLabel3).addComponent(this.jLabel2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.txtpassword, -2, 112, -2).addComponent(this.txtusername, -2, 112, -2))).addGroup(jPanel3Layout.createSequentialGroup().addGap(124, 124, 124).addComponent(this.jLabel4))).addContainerGap(102, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(65, 65, 65).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.txtusername, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.txtpassword, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED, 51, 32767).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2)).addGap(37, 37, 37).addComponent(this.jLabel4).addGap(40, 40, 40)));

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(137, 137, 137).addComponent(this.jLabel1).addContainerGap(-1, 32767)).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel3, -1, -1, 32767).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel3, -1, -1, 32767).addContainerGap()));

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, Alignment.TRAILING, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));

        this.pack();
    }

    private void jLabel4MouseClicked(MouseEvent evt) {
        Signup rgf = new Signup();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo((Component)null);
        rgf.setDefaultCloseOperation(3);
        this.dispose();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.txtusername.setText("");
        this.txtpassword.setText("");
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        try {
            String fileName = "C:\\Users\\sarka\\Desktop" + this.txtusername.getText().trim() + ".txt";
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            String pass = s.next();
            s.close();
            if (f.exists()) {
                String password = new String(this.txtpassword.getPassword());
                if (password.equals(pass)) {
                    Personal rgf = new Personal();
                    rgf.setVisible(true);
                } else {
                    JOptionPane optionPane = new JOptionPane(this.l3, 2);
                    JOptionPane.showMessageDialog(this.l3, "Please provide a valid username and password.");
                }
            }
        } catch (Exception var8) {
            System.out.println(var8);
            JOptionPane optionPane = new JOptionPane(this.l3, 2);
            JOptionPane.showMessageDialog(this.l3, "Please provide a valid username and password.");
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
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Login()).setVisible(true);
            }
        });
    }
}

