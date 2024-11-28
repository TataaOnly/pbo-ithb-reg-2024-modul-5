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

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

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
    }
}
