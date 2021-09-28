/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20zadanie3mikhailkostenkov;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV20Zadanie3MikhailKostenkov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String surname = scanner.nextLine();
        System.out.println("Введите год рождения: ");
        int year = scanner.nextInt();
        System.out.println("Введите день рождения: ");
        int day = scanner.nextInt();
        System.out.println("Введите месяц ");
        int month = scanner.nextInt();
        String monthString = null;
        switch(month){
            case 1: monthString = "Января";
            break;
            case 2: monthString = "Февраля";
            break;
            case 3: monthString = "Марта";
            break;
            case 4: monthString = "Апреля";
            break;
            case 5: monthString = "Мая";
            break;
            case 6: monthString = "Июня";
            break;
            case 7: monthString = "Июля";
            break;
            case 8: monthString = "Августа";
            break;
            case 9: monthString = "Сентября";
            break;
            case 10: monthString = "Октября";
            break;
            case 11: monthString = "Ноября";
            break;
            case 12: monthString = "Декабря";
            break;
        }
        System.out.println(name+ " " + surname+ " родился "+ day+ " " + monthString + " " + year + " года");
        
        
        
        
    
    }
    
}
