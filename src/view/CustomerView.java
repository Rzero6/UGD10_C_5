/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Exception.InputKosongException;
import control.CustomerControl;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Customer;
import table.TableCustomer;

/**
 *
 * @author VICTUS
 */
public class CustomerView extends javax.swing.JFrame {

    /**
     * Creates new form CustomerView
     */
    private CustomerControl customerControl;
    String action = null;
    List<Customer> listCustomer;
    int selectedId = 0;
    public CustomerView() {
        initComponents();
        customerTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,14));
        setComponent(false);
        setEditDeleteBtn(false);
        customerControl = new CustomerControl();
        showCustomer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        kendaraanViewBtn = new javax.swing.JButton();
        penyewaanViewBtn = new javax.swing.JButton();
        customerViewBtn = new javax.swing.JButton();
        kelompokPanel = new javax.swing.JPanel();
        kelompokLabel = new javax.swing.JLabel();
        npm1Label = new javax.swing.JLabel();
        npm2Label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        inputPanel = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        namaInput = new javax.swing.JTextField();
        ktpLabel = new javax.swing.JLabel();
        ktpInput = new javax.swing.JTextField();
        handphoneLabel = new javax.swing.JLabel();
        handphoneInput = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        dataPanel = new javax.swing.JPanel();
        tampilLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        header.setBackground(new java.awt.Color(255, 204, 204));
        header.setPreferredSize(new java.awt.Dimension(1200, 100));

        kendaraanViewBtn.setBackground(new java.awt.Color(255, 204, 204));
        kendaraanViewBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kendaraanViewBtn.setForeground(new java.awt.Color(51, 51, 51));
        kendaraanViewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/carIcon.png"))); // NOI18N
        kendaraanViewBtn.setText("Kendaraan");
        kendaraanViewBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kendaraanViewBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kendaraanViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kendaraanViewBtnActionPerformed(evt);
            }
        });

        penyewaanViewBtn.setBackground(new java.awt.Color(255, 204, 204));
        penyewaanViewBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        penyewaanViewBtn.setForeground(new java.awt.Color(51, 51, 51));
        penyewaanViewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sewaIcon.png"))); // NOI18N
        penyewaanViewBtn.setText("Penyewaan");
        penyewaanViewBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        penyewaanViewBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        penyewaanViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penyewaanViewBtnActionPerformed(evt);
            }
        });

        customerViewBtn.setBackground(new java.awt.Color(255, 153, 153));
        customerViewBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerViewBtn.setForeground(new java.awt.Color(51, 51, 51));
        customerViewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/customerIcon.png"))); // NOI18N
        customerViewBtn.setText("Customer");
        customerViewBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        customerViewBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        kelompokPanel.setBackground(new java.awt.Color(255, 204, 204));
        kelompokPanel.setForeground(new java.awt.Color(51, 51, 51));

        kelompokLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        kelompokLabel.setForeground(new java.awt.Color(51, 51, 51));
        kelompokLabel.setText("Kelompok 5");

        npm1Label.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        npm1Label.setForeground(new java.awt.Color(51, 51, 51));
        npm1Label.setText("210711015");

        npm2Label.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        npm2Label.setForeground(new java.awt.Color(51, 51, 51));
        npm2Label.setText("210711023");

        javax.swing.GroupLayout kelompokPanelLayout = new javax.swing.GroupLayout(kelompokPanel);
        kelompokPanel.setLayout(kelompokPanelLayout);
        kelompokPanelLayout.setHorizontalGroup(
            kelompokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kelompokPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(npm1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(npm2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(kelompokPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(kelompokLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kelompokPanelLayout.setVerticalGroup(
            kelompokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kelompokPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kelompokLabel)
                .addGap(12, 12, 12)
                .addGroup(kelompokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npm1Label)
                    .addComponent(npm2Label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 3, 66)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cow.png"))); // NOI18N
        jLabel2.setText("LALABABU ");
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(kendaraanViewBtn)
                .addGap(35, 35, 35)
                .addComponent(penyewaanViewBtn)
                .addGap(35, 35, 35)
                .addComponent(customerViewBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(kelompokPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        headerLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {customerViewBtn, kendaraanViewBtn, penyewaanViewBtn});

        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(kelompokPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kendaraanViewBtn)
                            .addComponent(penyewaanViewBtn)
                            .addComponent(customerViewBtn))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        headerLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {customerViewBtn, kendaraanViewBtn, penyewaanViewBtn});

        actionPanel.setBackground(new java.awt.Color(255, 153, 153));
        actionPanel.setPreferredSize(new java.awt.Dimension(1200, 100));

        addBtn.setBackground(new java.awt.Color(255, 204, 204));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(51, 51, 51));
        addBtn.setText("Tambah");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(255, 204, 204));
        editBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(51, 51, 51));
        editBtn.setText("Ubah");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 204, 204));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(51, 51, 51));
        deleteBtn.setText("Hapus");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(255, 204, 204));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(51, 51, 51));
        searchBtn.setText("Cari");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        searchInput.setBackground(new java.awt.Color(255, 255, 255));
        searchInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchInput.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(addBtn)
                .addGap(18, 18, 18)
                .addComponent(editBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBtn)
                .addGap(25, 25, 25))
        );

        actionPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addBtn, deleteBtn, editBtn});

        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn)
                    .addComponent(searchBtn)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        inputPanel.setBackground(new java.awt.Color(255, 255, 255));
        inputPanel.setPreferredSize(new java.awt.Dimension(600, 100));

        namaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(51, 51, 51));
        namaLabel.setText("Nama");

        namaInput.setBackground(new java.awt.Color(255, 255, 255));

        ktpLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ktpLabel.setForeground(new java.awt.Color(51, 51, 51));
        ktpLabel.setText("No. KTP");

        ktpInput.setBackground(new java.awt.Color(255, 255, 255));

        handphoneLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        handphoneLabel.setForeground(new java.awt.Color(51, 51, 51));
        handphoneLabel.setText("No. Handphone");

        handphoneInput.setBackground(new java.awt.Color(255, 255, 255));

        saveBtn.setBackground(new java.awt.Color(255, 153, 153));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(51, 51, 51));
        saveBtn.setText("Simpan");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 153, 153));
        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(51, 51, 51));
        cancelBtn.setText("Batal");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                        .addComponent(cancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn))
                    .addComponent(handphoneLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(handphoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ktpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ktpInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namaInput))
                .addContainerGap(278, Short.MAX_VALUE))
        );

        inputPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelBtn, saveBtn});

        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(namaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ktpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ktpInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(handphoneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(handphoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dataPanel.setBackground(new java.awt.Color(255, 255, 255));

        tampilLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tampilLabel.setForeground(new java.awt.Color(51, 51, 51));
        tampilLabel.setText("Tampil Data Customer");

        customerTable.setBackground(new java.awt.Color(255, 153, 153));
        customerTable.setForeground(new java.awt.Color(51, 51, 51));
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
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
        customerTable.setRowHeight(25);
        customerTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        customerTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        customerTable.setShowGrid(true);
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addComponent(tampilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dataPanelLayout.setVerticalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tampilLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .addComponent(dataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        setComponent(true);
        clearText();
        searchInput.setText("");
        setEditDeleteBtn(false);
        action = "Tambah";
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        setComponent(true);
        action = "Ubah";
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Apakah yakin ingin menghapus data? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        switch(getAnswer){
            case 0:
                try{
                    customerControl.deleteCustomer(selectedId);
                    clearText();
                    showCustomer();
                    setComponent(false);
                    setEditDeleteBtn(false);
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
                break;
            case 1:
                break;
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        setComponent(false);
        setEditDeleteBtn(false);
        clearText();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        try{
            inputKosongException();
            
            if(action.equals("Tambah")){
                Customer c = new Customer(namaInput.getText(),ktpInput.getText(), handphoneInput.getText());
                customerControl.insertDataCustomer(c);
            }else{
                Customer c = new Customer(selectedId, namaInput.getText(), ktpInput.getText(), handphoneInput.getText());
                customerControl.updateDataCustome(c);
            }
            clearText();
            showCustomer();
            setComponent(false);
            setEditDeleteBtn(false);
            
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        setEditDeleteBtn(false);
        setComponent(false);
        try{
            TableCustomer customer = customerControl.showDataCustomer(searchInput.getText());
            if(customer.getRowCount() == 0){
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan","Konfirmasi",JOptionPane.DEFAULT_OPTION);
            }else{
                customerTable.setModel(customer);
            }
            clearText();
        }catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        // TODO add your handling code here:
        setEditDeleteBtn(true);
        setComponent(false);
        
        int clickedRow = customerTable.getSelectedRow();
        TableModel tableModel = customerTable.getModel();
        
        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        namaInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        ktpInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
        handphoneInput.setText(tableModel.getValueAt(clickedRow, 3).toString());
        
    }//GEN-LAST:event_customerTableMouseClicked

    private void kendaraanViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kendaraanViewBtnActionPerformed
        // TODO add your handling code here:
        KendaraanView kv = new KendaraanView();
        this.dispose();
        kv.setVisible(true);
    }//GEN-LAST:event_kendaraanViewBtnActionPerformed

    private void penyewaanViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penyewaanViewBtnActionPerformed
        // TODO add your handling code here:
        PenyewaanView pv = new PenyewaanView();
        this.dispose();
        pv.setVisible(true);
    }//GEN-LAST:event_penyewaanViewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton customerViewBtn;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField handphoneInput;
    private javax.swing.JLabel handphoneLabel;
    private javax.swing.JPanel header;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kelompokLabel;
    private javax.swing.JPanel kelompokPanel;
    private javax.swing.JButton kendaraanViewBtn;
    private javax.swing.JTextField ktpInput;
    private javax.swing.JLabel ktpLabel;
    private javax.swing.JTextField namaInput;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel npm1Label;
    private javax.swing.JLabel npm2Label;
    private javax.swing.JButton penyewaanViewBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel tampilLabel;
    // End of variables declaration//GEN-END:variables

    private void setComponent(boolean b) {
        namaInput.setEnabled(b);
        ktpInput.setEnabled(b);
        handphoneInput.setEnabled(b);
        saveBtn.setEnabled(b);
        cancelBtn.setEnabled(b);
    }

    private void setEditDeleteBtn(boolean b) {
        editBtn.setEnabled(b);
        deleteBtn.setEnabled(b);
    }

    private void clearText(){
        namaInput.setText("");
        ktpInput.setText("");
        handphoneInput.setText("");
        searchInput.setText("");
    }
    private void showCustomer() {
        customerTable.setModel(customerControl.showDataCustomer(""));
    }

    private void inputKosongException() throws InputKosongException{
        if(namaInput.getText().isEmpty() 
                || ktpInput.getText().isEmpty()
                || handphoneInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
}
