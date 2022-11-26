package CV_MAKER;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileBrowser extends JFrame {
    public JPanel p = new JPanel();
    public String s;

    public FileBrowser() {
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fileChooser.setFileSelectionMode(0);
        int r = fileChooser.showOpenDialog((Component)null);
        if (r == 0) {
            this.s = fileChooser.getSelectedFile().getAbsolutePath();
        } else {
            fileChooser.setVisible(false);
        }

        fileChooser.setBounds(12, 0, 548, 326);
        this.p.add(fileChooser);
        this.p.setLayout((LayoutManager)null);
    }

    public String getAbsolutePath() {
        return this.s;
    }

    private void initComponents() {
        this.setDefaultCloseOperation(3);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGap(0, 400, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGap(0, 300, 32767));
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
            Logger.getLogger(FileBrowser.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(FileBrowser.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(FileBrowser.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(FileBrowser.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new FileBrowser()).setVisible(true);
            }
        });
    }
}
