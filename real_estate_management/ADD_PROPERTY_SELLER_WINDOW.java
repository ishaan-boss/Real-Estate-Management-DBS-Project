/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author ishaa
 */
public class ADD_PROPERTY_SELLER_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form PROPERTY_TYPE_WINDOW
     */
    public ADD_PROPERTY_SELLER_WINDOW() {
        initComponents();
        
        //set border to the jpanel title
        Border panel_title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(125,125,125));
        jPanel_Title.setBorder(panel_title_border);
        
        //set border to jbuttons
        Border button_border = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(255,255,255));
        jButton_Add_Property.setBorder(button_border);
        
        //invisibility of duration button
        jLabel_Duration.setVisible(false);
        jTextField_Duration.setVisible(false);
        
        
        
    }
    //funciton to populate jcombobox
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jTextField_Price1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_House_Name = new javax.swing.JTextField();
        jButton_Add_Property = new javax.swing.JButton();
        jTextField_Size = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_HouseNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_StreetName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Locality = new javax.swing.JTextField();
        jTextField_City = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_State = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_PostalCode = new javax.swing.JTextField();
        jComboBox_Status = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jSpinner_Bedrooms = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox_isRERAApproved = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jComboBox_Category = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jSpinner_Floor = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField_Latitude = new javax.swing.JTextField();
        jTextField_Duration = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel_Duration = new javax.swing.JLabel();
        jTextField_Longitude = new javax.swing.JTextField();

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel16.setText("Price:");

        jTextField_Price1.setMinimumSize(new java.awt.Dimension(64, 31));
        jTextField_Price1.setPreferredSize(new java.awt.Dimension(64, 31));
        jTextField_Price1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Price1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(724, 768));

        jPanel_Title.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(240, 240, 240));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROPERTY");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Description / Comment:");

        jTextField_House_Name.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jButton_Add_Property.setBackground(new java.awt.Color(240, 240, 240));
        jButton_Add_Property.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton_Add_Property.setText("Add");
        jButton_Add_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_PropertyActionPerformed(evt);
            }
        });

        jTextField_Size.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_Size.setActionCommand("<Not Set>");
        jTextField_Size.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_Size.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_SizeKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Size (sq. ft.):");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Status:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("House No.:");

        jTextField_HouseNo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Street Name:");

        jTextField_StreetName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Locality:");

        jTextField_Locality.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextField_City.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("City:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("State:");

        jTextField_State.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Postal Code:");

        jTextField_PostalCode.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_PostalCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PostalCodeKeyTyped(evt);
            }
        });

        jComboBox_Status.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Under Construction", "Ready to Move" }));

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea_Description.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Description);

        jSpinner_Bedrooms.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jSpinner_Bedrooms.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Bedroom(s):");

        jCheckBox_isRERAApproved.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jCheckBox_isRERAApproved.setText("RERA Approved");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel13.setText("Category:");

        jComboBox_Category.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sell", "Rent" }));
        jComboBox_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_CategoryActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel14.setText("Floor(s):");

        jSpinner_Floor.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jSpinner_Floor.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel15.setText("Price(INR):");

        jTextField_Price.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PriceKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel17.setText("Latitude:");

        jTextField_Latitude.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextField_Duration.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel18.setText("Longitude:");

        jLabel_Duration.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_Duration.setText("Duration(months):");

        jTextField_Longitude.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_House_Name)
                            .addComponent(jTextField_Size)
                            .addComponent(jTextField_HouseNo)
                            .addComponent(jTextField_StreetName)
                            .addComponent(jTextField_Locality)
                            .addComponent(jTextField_City)
                            .addComponent(jTextField_State)
                            .addComponent(jTextField_PostalCode)
                            .addComponent(jComboBox_Status, 0, 233, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jScrollPane2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel_Duration)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_Longitude, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Latitude, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Price, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_Category, javax.swing.GroupLayout.Alignment.LEADING, 0, 133, Short.MAX_VALUE)
                                    .addComponent(jSpinner_Floor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner_Bedrooms, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Duration))
                                .addGap(108, 108, 108))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jCheckBox_isRERAApproved)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton_Add_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_House_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_Bedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinner_Floor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel14))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addComponent(jTextField_HouseNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_Price))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_StreetName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Latitude, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_Locality, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18))
                    .addComponent(jTextField_Longitude))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_City, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Duration)
                    .addComponent(jTextField_Duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_State, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_isRERAApproved))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_PostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Add_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(207, 207, 207))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SizeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_SizeKeyTyped

    private void jButton_Add_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_PropertyActionPerformed
        // TODO add your handling code here:
        
        try 
        {
            String name = jTextField_House_Name.getText();
            
            int size = Integer.valueOf(jTextField_Size.getText());
            String status = jComboBox_Status.getSelectedItem().toString();
            String HouseNo = jTextField_HouseNo.getText();
            
            String StreetName = jTextField_StreetName.getText();
            String Locality = jTextField_Locality.getText();
            String City = jTextField_City.getText();
            String State = jTextField_State.getText();
            
            int PostalCode = Integer.valueOf(jTextField_PostalCode.getText());
            int Bedrooms = Integer.valueOf(jSpinner_Bedrooms.getValue().toString()); 
            int Floor = Integer.valueOf(jSpinner_Floor.getValue().toString());
            String Category = jComboBox_Category.getSelectedItem().toString();
            
            Integer priceInteger = Integer.valueOf(jTextField_Price.getText());
            Float LatitudeFloat = Float.valueOf(jTextField_Latitude.getText());
            Float LongitudeFloat = Float.valueOf(jTextField_Longitude.getText());
            Integer DurationInteger=0 ;
            boolean isRERAApproved = false; 
            String Description = jTextArea_Description.getText();
            
            if (jCheckBox_isRERAApproved.isSelected()) isRERAApproved = true;
            
            P_PROPERTY property = new P_PROPERTY( name, size, status, HouseNo, Floor, StreetName, Locality,City, State, PostalCode, Bedrooms,isRERAApproved ,  Category, Description);
            
            //if ("Sell".equals(Category)) DurationInteger=0;
            if(Category.equals("Rent")){
                System.out.println("Rent");
                DurationInteger= Integer.valueOf(jTextField_Duration.getText());
            }
            
            property = property.properties_feature(property, priceInteger, LatitudeFloat, LongitudeFloat, DurationInteger);
            
            if (new P_PROPERTY().addNewProperty(property)) {
                 
                 JOptionPane.showMessageDialog(null, "New Property Added to The System", "Add Property", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"New Property NOT Added to the system","Add Property",2 );
            }
             
            
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ "ERROR", "ERROR", 0);
        }
    }//GEN-LAST:event_jButton_Add_PropertyActionPerformed

    private void jTextField_PostalCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PostalCodeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PostalCodeKeyTyped

    private void jTextField_Price1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Price1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Price1ActionPerformed

    private void jComboBox_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_CategoryActionPerformed
        // TODO add your handling code here:
        if ("Rent".equalsIgnoreCase(jComboBox_Category.getSelectedItem().toString())) {
           jLabel_Duration.setVisible(true);
           jTextField_Duration.setVisible(true);
        }
        if ("Sell".equalsIgnoreCase(jComboBox_Category.getSelectedItem().toString())) {
            jLabel_Duration.setVisible(false);
           jTextField_Duration.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox_CategoryActionPerformed

    private void jTextField_PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PriceKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PriceKeyTyped

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
            java.util.logging.Logger.getLogger(ADD_PROPERTY_SELLER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADD_PROPERTY_SELLER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADD_PROPERTY_SELLER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADD_PROPERTY_SELLER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new ADD_PROPERTY_SELLER_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Property;
    private javax.swing.JCheckBox jCheckBox_isRERAApproved;
    private javax.swing.JComboBox<String> jComboBox_Category;
    private javax.swing.JComboBox<String> jComboBox_Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Duration;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_Bedrooms;
    private javax.swing.JSpinner jSpinner_Floor;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_City;
    private javax.swing.JTextField jTextField_Duration;
    private javax.swing.JTextField jTextField_HouseNo;
    private javax.swing.JTextField jTextField_House_Name;
    private javax.swing.JTextField jTextField_Latitude;
    private javax.swing.JTextField jTextField_Locality;
    private javax.swing.JTextField jTextField_Longitude;
    private javax.swing.JTextField jTextField_PostalCode;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Price1;
    private javax.swing.JTextField jTextField_Size;
    private javax.swing.JTextField jTextField_State;
    private javax.swing.JTextField jTextField_StreetName;
    // End of variables declaration//GEN-END:variables
}
