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

        dirPath = "C:\\Users\\client\\gestion";
        String dirName = "test";
        state = fileManagementSystem.isDirectoryExist(dirPath, dirName);
        if (state) {
            System.out.println("==== The directory : " + dirName + " ====");
            System.out.println("==== exist in path : " + dirPath + " ====");
        }
        else {
            System.out.println("==== The directory : " + dirName + " ====");
            System.out.println("==== does not exist in path : " + dirPath + " ====");
        }

        dirPath = "C:\\Users\\client";
        dirName = "gestion";
        state = fileManagementSystem.createDirectoryIfNotExist(dirPath, dirName);
        String separator = System.getProperty("file.separator");
        String path;
        if (state) {
            System.out.println("==== The directory : " + dirName + " ====");
            System.out.println("==== create in path : " + dirPath + " ====");
            path = dirPath + separator + dirName;
            System.out.println("==== The full path is : " + path + " ====");
        }
        else {
            System.out.println("==== The directory : " + dirName + " ====");
            System.out.println("==== does not create in path : " + dirPath + " ====");
        }
    }
}
