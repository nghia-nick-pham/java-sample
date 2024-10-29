package java_io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;

public class FilePermissionTest {

    public static void main(String[] args) {
        // creating a file instance
//        File file = new File("C:\\Users\\sgboy\\Documents\\Log\\201901\\02_test.txt");
        Path path = Paths.get("C:\\Users\\sgboy\\Documents\\Log\\201901\\02_test.txt");
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            Set<PosixFilePermission> perms = Files.readAttributes(path,PosixFileAttributes.class).permissions();

            System.out.format("Permissions before: %s%n",  PosixFilePermissions.toString(perms));

//            Set<PosixFilePermission> perms = Files.readAttributes(path, PosixFileAttributes.class).permissions();
        }catch (Exception e){
            e.printStackTrace();
        }



        //change permission to 777 for all the users
        //no option for group and others
//        file.setExecutable(true, false);
//        file.setReadable(true, false);
//        file.setWritable(true, false);
//
//        try{
//        //using PosixFilePermission to set file permissions 777
//        Set<PosixFilePermission> perms = new HashSet<PosixFilePermission>();
//        //add owners permission
//        perms.add(PosixFilePermission.OWNER_READ);
//        perms.add(PosixFilePermission.OWNER_WRITE);
//        perms.add(PosixFilePermission.OWNER_EXECUTE);
//        //add group permissions
//        perms.add(PosixFilePermission.GROUP_READ);
//        perms.add(PosixFilePermission.GROUP_WRITE);
//        perms.add(PosixFilePermission.GROUP_EXECUTE);
//        //add others permissions
//        perms.add(PosixFilePermission.OTHERS_READ);
//        perms.add(PosixFilePermission.OTHERS_WRITE);
//        perms.add(PosixFilePermission.OTHERS_EXECUTE);
//
//        Files.setPosixFilePermissions(Paths.get("C:\\Users\\sgboy\\Documents\\Log\\201901"), perms);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }



    }
}
