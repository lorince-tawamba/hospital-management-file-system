// Package
package tech.satic.hospital.service;

// Librairie

import java.io.File;
import java.util.Arrays;
import java.util.Properties;

/**
 * @author Lorince TAWAMBA
 * @since 27/11/2021
 * @version 1.0.0
 */

public class FileManagementSystem {
    private File file;
    private String userPath;
    private String dir;

    public FileManagementSystem() {
        this.userPath = System.getProperty("user.home");
        this.file = new File(userPath);
        this.dir = "gestion";
    }

    public boolean isDirectoryExist(String dirPath, String dirName) {
        String separator = System.getProperty("file.separator");
        String path = dirPath + separator + dirName;
        this.file = new File(path);
        return file.isDirectory();
    }

    public boolean isFileExist(String dirPath, String fileName) {
        String separator = System.getProperty("file.separator");
        String path = dirPath + separator + fileName;
        this.file = new File(path);
        return file.exists();
    }

    public boolean createDirectoryIfNotExist(String dirPath, String dirName) {
        String separator = System.getProperty("file.separator");
        String path = dirPath + separator + dirName;
        this.file = new File(path);
        if (!file.exists()) {
            return file.mkdir();
        }
        return false;
    }


}
