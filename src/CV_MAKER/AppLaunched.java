package CV_MAKER;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppLaunched extends JFrame implements ActionListener {
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea2;
    private JButton liginbbtn;
    private JButton registerbttn;




    public AppLaunched() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel2 = new JLabel();
        this.jPanel2 = new JPanel();
        this.jScrollPane2 = new JScrollPane();
        this.jTextArea2 = new JTextArea();
        this.jLabel3 = new JLabel();
        this.registerbttn = new JButton();
        this.liginbbtn = new JButton();



        this.jPanel1.setBackground(new Color(0, 0, 50));
        this.jPanel2.setBackground(new Color(239, 30, 23));

        this.jLabel2.setFont(new Font("Tahoma", 1, 36));
        this.jLabel2.setForeground(new Color(0, 255, 255));
        this.jLabel2.setText("CV App");


        this.jTextArea2.setColumns(20);
        this.jTextArea2.setFont(new Font("Montserrat", 2, 24));
        this.jTextArea2.setEditable(false);

        this.jTextArea2.setRows(5);
        this.jTextArea2.setText("Are you looking to apply for a job ?\nMaybe you just want to showcase your attractive CV?\nTry out CV App, an easy to use automated CV maker.\nFill in the details and leave the rest to us ! ");
        this.jScrollPane2.setViewportView(this.jTextArea2);

        this.jLabel3.setFont(new Font("Maiandra GD", 3, 48));
        this.jLabel3.setForeground(new Color(239, 228, 11));
        this.jLabel3.setText("Curriculum vitae maker");

        this.registerbttn.setText("Sign Up/Register");

        this.registerbttn.addActionListener(this);
        this.liginbbtn.setText("Login");
        this.liginbbtn.addActionListener(this);

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane2, -2, 766, -2).addComponent(this.jLabel3, Alignment.TRAILING, -2, 554, -2))).addGroup(jPanel2Layout.createSequentialGroup().addGap(132, 132, 132).addComponent(this.registerbttn, -2, 122, -2).addGap(204, 204, 204).addComponent(this.liginbbtn, -2, 73, -2))).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addGroup(jPanel2Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jLabel3).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jScrollPane2, -2, 191, -2).addGap(81, 81, 81).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.registerbttn).addComponent(this.liginbbtn)).addContainerGap(100, 32767)));

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(317, 317, 317).addComponent(this.jLabel2).addContainerGap(-1, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -1, -1, 32767).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(this.jLabel2, -2, 48, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPanel2, -2, -1, -2).addContainerGap(-1, 32767)));

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));

        this.setResizable(true);
        this.pack();
    }



    public static void main(String[] args) {
        try {
            UIManager.LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                UIManager.LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(AppLaunched.class.getName()).log(Level.SEVERE, (String) null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(AppLaunched.class.getName()).log(Level.SEVERE, (String) null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(AppLaunched.class.getName()).log(Level.SEVERE, (String) null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(AppLaunched.class.getName()).log(Level.SEVERE, (String) null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new AppLaunched()).setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerbttn) {
            Signup rgf = new Signup();
            rgf.setVisible(true);
            rgf.pack();
            rgf.setLocationRelativeTo((Component) null);
        } else if (e.getSource() == liginbbtn) {
            Login lgf = new Login();
            lgf.setVisible(true);
            lgf.pack();
            lgf.setLocationRelativeTo((Component) null);

        }

    }
}

