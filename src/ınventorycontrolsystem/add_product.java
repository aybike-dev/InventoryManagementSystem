
package ınventorycontrolsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aybike
 */
public class add_product extends javax.swing.JFrame {
    
    private void UpdateProductList(){
    
     try {
            String title[] = new String[]{"Category", "Product Name", "Size", "Color", "Price", "Quantity", "Explanation" };  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Inventory;user=sa;password=12345";
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            
                
            ResultSet rs = st.executeQuery("select * from Users");

            st = con.createStatement();                
            rs = st.executeQuery("select * from products");
            rs.last();
           
            int entry_num = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[entry_num][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("category"),  
                    rs.getString("product_name"),
                    rs.getString("size"),
                    rs.getString("color"),  
                    rs.getString("price"),
                    rs.getString("quantity"),
                    rs.getString("explanation"), 
                };
                i++;
            }
           
            con.close();
            table_products.setModel(new DefaultTableModel(data, title));
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Error: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Could not connect the database! " + ex.toString());
        }
    }
    private static JFrame comingform;
    
    
    

    public add_product() {
        
        super("Add Product");  
        
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_size = new javax.swing.JTextField();
        txt_category = new javax.swing.JTextField();
        txt_productName = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_color = new javax.swing.JTextField();
        txt_quantity = new javax.swing.JTextField();
        txt_exp = new javax.swing.JTextField();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_exit4 = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        txt_delete = new javax.swing.JButton();
        lbl_category = new javax.swing.JLabel();
        lbl_productName = new javax.swing.JLabel();
        lbl_size = new javax.swing.JLabel();
        lbl_color = new javax.swing.JLabel();
        lbl_price = new javax.swing.JLabel();
        lbl_quantity = new javax.swing.JLabel();
        lbl_exp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_products = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_colorActionPerformed(evt);
            }
        });

        txt_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantityActionPerformed(evt);
            }
        });

        txt_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_expActionPerformed(evt);
            }
        });

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_exit4.setText("EXIT");
        btn_exit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exit4ActionPerformed(evt);
            }
        });

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        txt_delete.setText("Delete");
        txt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_deleteActionPerformed(evt);
            }
        });

        lbl_category.setText("Category");

        lbl_productName.setText("Product Name");

        lbl_size.setText("Size");

        lbl_color.setText("Color");

        lbl_price.setText("Price");

        lbl_quantity.setText("Quantity");

        lbl_exp.setText("Explanation");

        table_products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_productsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_products);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_category, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_category, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_color, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_size, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_size, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_productName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_productName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_price, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_search)
                        .addGap(114, 114, 114))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_exit4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_exit4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_category))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_productName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_productName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_size, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_size))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_color))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_price))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_quantity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_exp))
                        .addGap(18, 18, 18)
                        .addComponent(btn_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_delete))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_search))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_colorActionPerformed

    private void txt_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantityActionPerformed

    private void txt_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_expActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_expActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed

        String search =txt_search.getText();
        String title[] = new String[]{"Category", "Product Name", "Size", "Color", "Price", "Quantity", "Explanation" };

        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Inventory;user=sa;password=12345";
            Connection con = DriverManager.getConnection(url);
            
            String sorgu ="select * from products where product_name like '%"+txt_search.getText()+"%' or"
            +" category like '%"+txt_search.getText()+"%' or"
            +" size like '%"+txt_search.getText()+"%' or"
            +" color like '%"+txt_search.getText()+"%' ";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sorgu);

            rs.last();

            int say = rs.getRow();
            rs.beforeFirst();

            String sayi = null;
            sayi = String.valueOf(rs.getRow());

            if(say < 1){
                JOptionPane.showMessageDialog(null, "Could not the Product!");
            }
            else{

                Object data[][] = new Object[say][];
                int i = 0;

                while (rs.next()) {

                    data[i] = new Object[]{

                        rs.getString("category"),
                        rs.getString("product_name"),
                        rs.getString("size"),
                        rs.getString("color"),
                        rs.getString("price"),
                        rs.getString("quantity"),
                        rs.getString("explanation"),
                    };
                    i++;
                }
                table_products.setModel(new DefaultTableModel(data, title));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Could not correct the database! " + ex.toString());
        }

    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_exit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exit4ActionPerformed

        add_product a = new add_product();
        a.setVisible(false);
        dispose();

    }//GEN-LAST:event_btn_exit4ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        String category=txt_size.getText();
        String product_name=txt_productName.getText();
        String size=txt_size.getText();
        String color=txt_color.getText();
        String price=txt_price.getText();
        String quantity=txt_quantity.getText();
        String explanation=txt_exp.getText();

        try {
            
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
                String url = "jdbc:sqlserver://localhost:1433;databaseName=Inventory;user=sa;password=12345";
                Connection con = DriverManager.getConnection(url);
                Statement st = null;
                ResultSet rs = null;
                st = con.createStatement();

                String sql = "INSERT INTO products (category,product_name,size,color,price,quantity,explanation)"
                + " VALUES ('"+category+"', '"+product_name+"', '"+size+"', '"+color+"', '"+price+"', '"+quantity+"', '"+explanation+"')";

                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, product_name + " was added.");
                UpdateProductList();

            

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Could not correct the database! " + ex.toString());
        }

    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        String category=txt_size.getText();
        String product_name=txt_productName.getText();
        String size=txt_size.getText();
        String color=txt_color.getText();
        String price=txt_price.getText();
        String quantity=txt_quantity.getText();
        String explanation=txt_exp.getText();

        try {

            if (category.equals("") || product_name.equals("") || color.equals("") || price.equals("")) {

                JOptionPane.showMessageDialog(this, "Fill in the blaks!");

            } else {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
                String url = "jdbc:sqlserver://localhost:1433;databaseName=Inventory;user=sa;password=12345";
                Connection con = DriverManager.getConnection(url);
            
                ResultSet rs = null;

                Statement st = con.createStatement();

                String sql = "INSERT INTO products (category,product_name,size,color,price,quantity,explanation)"
                + " VALUES ('"+category+"', '"+product_name+"', '"+size+"', '"+color+"', '"+price+"', '"+quantity+"', '"+explanation+"')";

                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, product_name + "  was added.");
                UpdateProductList();

            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Could not connect the database! " + ex.toString());
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void txt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_deleteActionPerformed

        String category=txt_size.getText();
        String product_name =txt_productName.getText();
        String size=txt_size.getText();
        String color=txt_color.getText();
        String price=txt_price.getText();
        String quantity=txt_quantity.getText();
        String explanation=txt_exp.getText();

        try {

                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
                String url = "jdbc:sqlserver://localhost:1433;databaseName=Inventory;user=sa;password=12345";
                Connection con = DriverManager.getConnection(url);
            
                Statement st = null;
                ResultSet rs = null;

                st = con.createStatement();

                String sql = "INSERT INTO products (category,product_name,size,color,price,quantity,explanation)"
                + " VALUES ('"+category+"', '"+product_name+"', '"+size+"', '"+color+"', '"+price+"', '"+quantity+"', '"+explanation+"')";

                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, product_name + " was added.");
                UpdateProductList();

            

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Could not correct the database! " + ex.toString());
        }

    }//GEN-LAST:event_txt_deleteActionPerformed

    private void table_productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_productsMouseClicked

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement st1 =null;

        try {

            int row = table_products.getSelectedRow();
            int satir=row+1;
            String choose=(table_products.getValueAt(row, 1).toString());

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Inventory;user=sa;password=12345";
            con = DriverManager.getConnection(url);
            
            String sorgu = "select * from products where id='"+satir+"'";
            //st = con.createStatement();
            st = con.createStatement();
            rs = st.executeQuery(sorgu);

            if(rs.last()){

                txt_size.setText(rs.getString("category"));
                txt_productName.setText(rs.getString("product_name"));
                txt_size.setText(rs.getString("size"));
                txt_color.setText(rs.getString("color"));
                txt_price.setText(rs.getString("price"));
                txt_quantity.setText(rs.getString("quantity"));
                txt_exp.setText(rs.getString("explanation"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Could not correct the database! " + ex.toString());
        }
    }//GEN-LAST:event_table_productsMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(add_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_exit4;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_category;
    private javax.swing.JLabel lbl_color;
    private javax.swing.JLabel lbl_exp;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_productName;
    private javax.swing.JLabel lbl_quantity;
    private javax.swing.JLabel lbl_size;
    private javax.swing.JTable table_products;
    private javax.swing.JTextField txt_category;
    private javax.swing.JTextField txt_color;
    private javax.swing.JButton txt_delete;
    private javax.swing.JTextField txt_exp;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_productName;
    private javax.swing.JTextField txt_quantity;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_size;
    // End of variables declaration//GEN-END:variables
}
