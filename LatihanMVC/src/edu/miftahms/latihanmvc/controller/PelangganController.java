/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miftahms.latihanmvc.controller;

import edu.miftahms.latihanmvc.model.PelangganModel;
import edu.miftahms.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 * NIM      : 10117096
 * NAMA     : Miftah Muhammad Sidqi
 * Kelas    : IF-3
 */
public class PelangganController {
private PelangganModel model;  

    public void setModel(PelangganModel model) {
        this.model = model;
    }
  
  

  public void resetForm(PelangganView View) {
  
      String nama  = View.getTxtNama().getText();
      String email = View.getTxtEmail().getText();
      String noTlp = View.getTxtNoTelepon().getText();
      
      if (nama.equals("") && email.equals("") && noTlp.equals("")) {
          
      }
      else {
         model.resetForm();
         
      }
  }   
  
  public void simpanForm(PelangganView View) {
      
      String nama  = View.getTxtNama().getText();
      String email = View.getTxtEmail().getText();
      String noTlp = View.getTxtNoTelepon().getText();
      
      if (nama.trim().equals("")) {
          JOptionPane.showMessageDialog(View, "Nama Masih Kosong");
      }
      else if (email.trim().equals("")) {
          JOptionPane.showMessageDialog(View, "Email Masih Kosong");
      }
      else if (noTlp.trim().equals("")) {
          JOptionPane.showMessageDialog(View, "No Telp Email Masih Kosong");
      } 
      else {
          model.simpanForm();
      }
   }
}
    

