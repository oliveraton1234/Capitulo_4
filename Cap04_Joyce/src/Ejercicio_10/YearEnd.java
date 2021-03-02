/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10;
import java.util.Calendar;
import java.util.GregorianCalendar;.

/**
 *
 * @author Admin
 */
public class YearEnd {
     public static void main(String[] args) {
        GregorianCalendar gcal = new GregorianCalendar();

        System.out.println((gcal.getMaximum(Calendar.DAY_OF_YEAR) - (gcal.get(Calendar.DAY_OF_YEAR) + 1)));
    }
}
