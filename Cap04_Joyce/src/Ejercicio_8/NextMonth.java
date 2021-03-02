/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class NextMonth {
    public static void main(String[] args) {
        GregorianCalendar gcal = new GregorianCalendar();

        int dia = gcal.get(Calendar.DAY_OF_MONTH);
        System.out.println((gcal.get(Calendar.DAY_OF_MONTH) + 1)-(gcal.getActualMaximum(Calendar.MONTH)));
    }
}
