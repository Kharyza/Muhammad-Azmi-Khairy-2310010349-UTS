/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.DefaultListModel;

/**
 *
 * @author azmik
 */
public class model {
    // DefaultListModel untuk JList
    private DefaultListModel<String> listModel;

    // Konstruktor untuk menginisialisasi listModel
    public model() {
        listModel = new DefaultListModel<>();
    }

    // Mendapatkan listModel untuk digunakan di ResepForm
    public DefaultListModel<String> getListModel() {
        return listModel;
    }

    // Menambahkan elemen ke dalam listModel
    public void addElement(String element) {
        listModel.addElement(element);
    }

    // Menghapus elemen dari listModel
    public void removeElement(int index) {
        listModel.remove(index);
    }

    // Mengubah elemen dalam listModel
    public void setElementAt(int index, String element) {
        listModel.set(index, element);
    }
    
}
