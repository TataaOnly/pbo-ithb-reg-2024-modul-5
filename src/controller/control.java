package controller;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class control {
    public static String cekGolDarah(JRadioButton golA, JRadioButton golB, JRadioButton golO, JRadioButton golAB){
        String golDar = "";
        if (golA.isSelected()) {
            golDar = "A";
        }else if (golB.isSelected()) {
            golDar = "B";
        }else if (golAB.isSelected()) {
            golDar = "AB";
        }else if (golO.isSelected()) {
            golDar = "O";
        }
        return golDar;
    }

    public static String cekPekerjaan(JCheckBox karyawan, JCheckBox pns, JCheckBox wiraswatsa, JCheckBox akademisi, JCheckBox penganguran){
        String pekerjaan="";
        if (penganguran.isSelected()) {
            return "Pengangguran, ";
        }else if(karyawan.isSelected()){
            pekerjaan += "Karyawan, ";
        }else if(pns.isSelected()){
            pekerjaan += "PNS, ";
        }else if(wiraswatsa.isSelected()){
            pekerjaan += "Wiraswasta, ";
        }else if(akademisi.isSelected()){
            pekerjaan += "Akademisi";
        }

        pekerjaan = pekerjaan.substring(0, pekerjaan.length()-2);
        return pekerjaan;
    }
}
