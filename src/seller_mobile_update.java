
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author king
 */
public class seller_mobile_update extends javax.swing.JFrame {

    /**
     * Creates new form seller_mobile_update
     */
    public seller_mobile_update() {
        initComponents();
        
        this.getContentPane().setBackground(Color.WHITE);
        String iphone7,surfacephone,motozforce,googlepixel,iphone6splus,lumia950xl,motog4plus,nexus6p;
        iphone7="iphone 7";
        surfacephone="surface phone";
        motozforce="moto z force";
        googlepixel="google pixel";
        iphone6splus="iphone 6s plus";
        lumia950xl="lumia 950 xl";
        motog4plus="moto g4 plus";
        nexus6p="nexus 6p";
       
         try
       {
       Class.forName("java.sql.DriverManager");
       Connection c=(Connection)
               DriverManager.getConnection("jdbc:mysql://localhost:3306/gmail","root","12345");
       Statement s=(Statement) c.createStatement();
       String q="Select * from mobile where item_name='"+iphone7+"';";
       
       
       ResultSet r=s.executeQuery(q);
       
       
       if(r.next())
       {
       int p=r.getInt("price");
       jTextField1.setText(Integer.toString(p));
       s.close();
       }      
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this,e.getMessage());
       }
        try
        {
        Class.forName("java.sql.DriverManager");
       Connection c=(Connection)
               DriverManager.getConnection("jdbc:mysql://localhost:3306/gmail","root","12345");
       Statement s=(Statement) c.createStatement();
       String q="Select * from mobile where item_name='"+surfacephone+"';";
       
       
       ResultSet r=s.executeQuery(q);
       
       
       if(r.next())
       {
       int p=r.getInt("price");
       jTextField2.setText(Integer.toString(p));
       s.close();
       }      
        }catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
        
        try{
        Class.forName("java.sql.DriverManager");
       Connection c=(Connection)
               DriverManager.getConnection("jdbc:mysql://localhost:3306/gmail","root","12345");
       Statement s=(Statement) c.createStatement();
       String q="Select * from mobile where item_name='"+motozforce+"';";
       
       
       ResultSet r=s.executeQuery(q);
       
       
       if(r.next())
       {
       int p=r.getInt("price");
       jTextField3.setText(Integer.toString(p));
       s.close();
       }     
        }catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
        
         try{
        Class.forName("java.sql.DriverManager");
       Connection c=(Connection)
               DriverManager.getConnection("jdbc:mysql://localhost:3306/gmail","root","12345");
       Statement s=(Statement) c.createStatement();
       String q="Select * from mobile where item_name='"+googlepixel+"';";
       
       
       ResultSet r=s.executeQuery(q);
       
       
       if(r.next())
       {
       int p=r.getInt("price");
       jTextField4.setText(Integer.toString(p));
       s.close();
       }     
        }catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
         
         try{
        Class.forName("java.sql.DriverManager");
       Connection c=(Connection)
               DriverManager.getConnection("jdbc:mysql://localhost:3306/gmail","root","12345");
       Statement s=(Statement) c.createStatement();
       String q="Select * from mobile where item_name='"+iphone6splus+"';";
       
       
       ResultSet r=s.executeQuery(q);
       
       
       if(r.next())
       {
       int p=r.getInt("price");
       jTextField5.setText(Integer.toString(p));
       s.close();
       }     
        }catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
        
         try{
        Class.forName("java.sql.DriverManager");
       Connection c=(Connection)
               DriverManager.getConnection("jdbc:mysql://localhost:3306/gmail","root","12345");
       Statement s=(Statement) c.createStatement();
       String q="Select * from mobile where item_name='"+lumia950xl+"';";
       
       
       ResultSet r=s.executeQuery(q);
       
       
       if(r.next())
       {
       int p=r.getInt("price");
       jTextField6.setText(Integer.toString(p));
       s.close();
       }     
        }catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
        
         
          try{
        Class.forName("java.sql.DriverManager");
       Connection c=(Connection)
               DriverManager.getConnection("jdbc:mysql://localhost:3306/gmail","root","12345");
       Statement s=(Statement) c.createStatement();
       String q="Select * from mobile where item_name='"+motog4plus+"';";
       
       
       ResultSet r=s.executeQuery(q);
       
       
       if(r.next())
       {
       int p=r.getInt("price");
       jTextField7.setText(Integer.toString(p));
       s.close();
       }     
        }catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
          
           try{
        Class.forName("java.sql.DriverManager");
       Connection c=(Connection)
               DriverManager.getConnection("jdbc:mysql://localhost:3306/gmail","root","12345");
       Statement s=(Statement) c.createStatement();
       String q="Select * from mobile where item_name='"+nexus6p+"';";
       
       
       ResultSet r=s.executeQuery(q);
       
       
       if(r.next())
       {
       int p=r.getInt("price");
       jTextField8.setText(Integer.toString(p));
       s.close();
       }     
        }catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UPDATE PRICE");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project Pictures/unbox success.PNG"))); // NOI18N

        jLabel2.setText("iPhone 7 (128 GB):- RS.");

        jLabel3.setText("Surface Phone:-  RS.");

        jLabel4.setText("Moto Z Force:- RS.");

        jLabel5.setText("Google Pixel:- RS.");

        jLabel6.setText("iPhone 6s Plus (128 GB):- RS.");

        jLabel7.setText("Lumia 950 XL:- RS.");

        jLabel8.setText("Moto G4 Plus:- RS.");

        jLabel9.setText("Nexus 6P:- RS.");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project Pictures/back button.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1))
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int i7,sp,mz,gp,i6,l9,mg,n6;
i7=Integer.parseInt(jTextField1.getText());// TODO add your handling code here:
sp=Integer.parseInt(jTextField2.getText());
mz=Integer.parseInt(jTextField3.getText());
gp=Integer.parseInt(jTextField4.getText());
i6=Integer.parseInt(jTextField5.getText());
l9=Integer.parseInt(jTextField6.getText());
mg=Integer.parseInt(jTextField7.getText());
n6=Integer.parseInt(jTextField8.getText());

 String iphone7,surfacephone,motozforce,googlepixel,iphone6splus,lumia950xl,motog4plus,nexus6p;
        iphone7="iphone 7";
        surfacephone="surface phone";
        motozforce="moto z force";
        googlepixel="google pixel";
        iphone6splus="iphone 6s plus";
        lumia950xl="lumia 950 xl";
        motog4plus="moto g4 plus";
        nexus6p="nexus 6p";
        
try
{
    Class.forName("java.sql.DriverManager");
     Connection c=(Connection)
               DriverManager.getConnection("jdbc:mysql://localhost:3306/gmail","root","12345");
       Statement s=(Statement) c.createStatement();
       String q="UPDATE mobile set price="+i7+" where item_name='"+iphone7+"';";
       String q1="UPDATE mobile set price="+sp+" where item_name='"+surfacephone+"';";
       String q2="UPDATE mobile set price="+mz+" where item_name='"+motozforce+"';";
       String q3="UPDATE mobile set price="+gp+" where item_name='"+googlepixel+"';";
       String q4="UPDATE mobile set price="+i6+" where item_name='"+iphone6splus+"';";
       String q5="UPDATE mobile set price="+l9+" where item_name='"+lumia950xl+"';";
       String q6="UPDATE mobile set price="+mg+" where item_name='"+motog4plus+"';";
       String q7="UPDATE mobile set price="+n6+" where item_name='"+nexus6p+"';";
      s.executeUpdate(q);
      s.executeUpdate(q1);
      s.executeUpdate(q2);
      s.executeUpdate(q3);
      s.executeUpdate(q4);
      s.executeUpdate(q5);
      s.executeUpdate(q6);
      s.executeUpdate(q7);
      
       
       JOptionPane.showMessageDialog(this,"Prices Updated Successfuly !");
       jTextField1.setText("");
       jTextField2.setText("");
       jTextField3.setText("");
       jTextField4.setText("");
       jTextField5.setText("");
       jTextField6.setText("");
       jTextField7.setText("");
       jTextField8.setText("");
       close();
       seller_mobile sm=new seller_mobile();
       sm.setVisible(true);
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(this,e.getMessage());
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
close();
seller_mobile sm=new seller_mobile();
sm.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(seller_mobile_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seller_mobile_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seller_mobile_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seller_mobile_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seller_mobile_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    private void close() {
        WindowEvent winc=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winc); //To change body of generated methods, choose Tools | Templates.
    }
}
