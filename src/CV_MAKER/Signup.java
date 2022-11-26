package CV_MAKER;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Signup extends JFrame implements ActionListener, MouseListener {
    public JLabel l6;
    private JPasswordField confirmpassword;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JLabel loginlink;
    private JPasswordField password;
    private JTextField phone;
    private JButton registerbttn;
    private JButton resetbttn;
    private JTextField username;

    public Signup() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();

        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();

        this.resetbttn = new JButton();
        this.registerbttn = new JButton();

        this.username = new JTextField();
        this.phone = new JTextField();

        this.jLabel6 = new JLabel();
        this.loginlink = new JLabel();

        this.password = new JPasswordField();
        this.confirmpassword = new JPasswordField();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.jPanel1.setBackground(new Color(102, 57, 12, 145));

        this.jLabel2.setBackground(new Color(255, 255, 255));
        this.jLabel2.setText("Username:");

        this.jLabel3.setBackground(new Color(255, 255, 255));
        this.jLabel3.setText("Password:");

        this.jLabel4.setBackground(new Color(255, 255, 255));
        this.jLabel4.setText("Confirm Password:");

        this.jLabel5.setBackground(new Color(255, 255, 255));
        this.jLabel5.setText("Phone:");

        this.resetbttn.setText("Reset");
        this.resetbttn.setBackground(Color.RED);
        this.resetbttn.addActionListener(this);
        this.registerbttn.setText("Register");
        this.registerbttn.setBackground(Color.GREEN);
        this.registerbttn.addActionListener(this);

        this.jLabel6.setFont(new Font("Tahoma", 2, 36));
        this.jLabel6.setForeground(new Color(0, 255, 255));
        this.jLabel6.setText("Sign up or Register");

        this.loginlink.setText("Click here to login!");
        this.loginlink.setFont(new Font("Tahoma", 1, 14));
        this.loginlink.addMouseListener(this);

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(103, 103, 103).addComponent(this.jLabel6)).addGroup(jPanel1Layout.createSequentialGroup().addGap(516, 516, 516).addComponent(this.jLabel1)).addGroup(jPanel1Layout.createSequentialGroup().addGap(104, 104, 104).addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jLabel3).addComponent(this.jLabel2).addComponent(this.jLabel4).addComponent(this.jLabel5)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.password, -2, 112, -2).addComponent(this.username, -2, 112, -2).addComponent(this.confirmpassword, -2, 112, -2).addComponent(this.phone, -2, 112, -2))).addGroup(jPanel1Layout.createSequentialGroup().addGap(107, 107, 107).addComponent(this.resetbttn, -2, 73, -2).addGap(109, 109, 109).addComponent(this.registerbttn, -2, 73, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(184, 184, 184).addComponent(this.loginlink))).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(16, 16, 16).addComponent(this.jLabel6, -2, 48, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jLabel1).addGap(64, 64, 64).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.username, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.password, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.confirmpassword, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel5).addComponent(this.phone, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED, 38, 32767).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.resetbttn).addComponent(this.registerbttn)).addGap(28, 28, 28).addComponent(this.loginlink).addGap(29, 29, 29)));

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, 462, -2));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.pack();

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
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Signup()).setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetbttn){
            this.username.setText("");
            this.password.setText("");
            this.confirmpassword.setText("");
            this.phone.setText("");

        }else if(e.getSource()==registerbttn){
            String s1 = new String(this.password.getPassword());
            String s2 = new String(this.confirmpassword.getPassword());
            if (s1.equals(s2) && !this.username.getText().isEmpty() && !this.phone.getText().isEmpty()) {
                String fileName = "C:\\Users\\sarka\\Desktop" + this.username.getText().trim() + ".txt";

                try {
                    File f = new File(fileName);
                    FileWriter writer = new FileWriter(f);
                    writer.write(s1);
                    writer.close();
                } catch (Exception var7) {
                    System.out.println(var7);
                }

                new Login();
            } else {
                JOptionPane optionPane;
                if (!this.username.getText().isEmpty() && !this.phone.getText().isEmpty()) {
                    optionPane = new JOptionPane(this.l6, 2);
                    JOptionPane.showMessageDialog(this.l6, "Passwords don't match!");
                } else {
                    optionPane = new JOptionPane(this.l6, 2);
                    JOptionPane.showMessageDialog(this.l6, "Fill the above details");
                }
            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==loginlink){
            Login lgf = new Login();
            lgf.setVisible(true);
            lgf.pack();
            lgf.setLocationRelativeTo((Component)null);
            lgf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.dispose();

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
