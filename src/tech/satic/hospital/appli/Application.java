// Package
package tech.satic.hospital.appli;

// Librairie

import tech.satic.hospital.service.FileManagementSystem;

/**
 * @author Lorince TAWAMBA
 * @since 27/11/2021
 * @version 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        FileManagementSystem fileManagementSystem = new FileManagementSystem();
        System.out.println("==== Welcome ====");

        String dirPath = "C:\\Users\\client\\gestion";
        String fileName = "medecin.txt";
        boolean state = fileManagementSystem.isFileExist(dirPath, fileName);
        if (state) {
            System.out.println("==== The file : " + fileName + " ====");
            System.out.println("==== exist in path : " + dirPath + " ====");
        }
        else {
            System.out.println("==== The file : " + fileName + " ====");
            System.out.println("==== does not exist in path : " + dirPath + " ====");
        }
    }
}
