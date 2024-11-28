package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.text.DateFormatter;  
import java.util.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;

import controller.control;
import model.classes.Penduduk;

public class FormKTP extends JFrame{
    JFrame frame;
    File photo;
    File ttd;

    public FormKTP(){
        inputForm();
    }

    private void inputForm(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension sSize = toolkit.getScreenSize();

        int screenWidth = (int) sSize.getWidth();
        int screenHeigth = (int) sSize.getHeight();

        final int frameWidth = 800;
        final int frameHeight = 650;

        int framex = (screenWidth/2) - (frameWidth/2);
        int framey = (screenHeigth/2)-(frameHeight/2);

        frame = new JFrame("FORM KTP");
        frame.setBounds(framex, framey, frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(null);
        inputPanel.setBounds(10,10,frameWidth, frameHeight);

        JLabel NIK = new JLabel("NIK");
        JTextField NIKField = new JTextField();
        NIK.setBounds(50, 75, 400, 25);
        NIKField.setBounds(150, 75, 400, 25);

        inputPanel.add(NIK);
        inputPanel.add(NIKField);

        JLabel nama = new JLabel("NAMA");
        JTextField namaField = new JTextField();
        nama.setBounds(50, 125, 400, 25);
        namaField.setBounds(150, 100, 400, 25);
        inputPanel.add(nama);
        inputPanel.add(namaField);

        JLabel tpLahir = new JLabel("Tempat Lahir");
        JTextField tempatLahirField = new JTextField();
        tpLahir.setBounds(50, 125, 100, 25);
        tempatLahirField.setBounds(150, 125, 400, 25);
        inputPanel.add(tpLahir);
        inputPanel.add(tempatLahirField);

        JLabel tgLahir = new JLabel("Tanggal Lahir");
        tgLahir.setBounds(50, 150, 400, 25);
        inputPanel.add(tgLahir);

        JLabel jenisKelamin = new JLabel("JENIS KELAMIN");
        jenisKelamin.setBounds(50, 125, 100, 25);
        JRadioButton jkPria = new JRadioButton("Pria");
        jkPria.setBounds(150, 175, 50, 25);
        JRadioButton jkWanita = new JRadioButton("Wanita");
        jkWanita.setBounds(200, 175, 75, 25);

        ButtonGroup JKbutton = new ButtonGroup();
        JKbutton.add(jkPria);
        JKbutton.add(jkWanita);
    }
}
