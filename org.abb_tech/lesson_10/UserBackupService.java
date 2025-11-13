package lesson_10;

import java.io.*;
        import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class UserBackupService {

    public void saveUsers(List<User> users, String filePath){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {

            for (User user : users) {
                oos.writeObject(user);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public List<User> loadUser(String filePath) throws IOException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {

            List<User> users = new ArrayList<>();
            while (true) {
                try {
                    users.add((User) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
            return users;

        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void backupFile(String filePath, String backupDir) throws IOException {
        Path path = Paths.get(filePath);
        Path backupPath = Paths.get(backupDir, "users_backup.dat");

        Files.copy(path, backupPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("\nBackup created at " + backupDir + "/users_backup.dat\n");
    }

    public void deleteBackup(String backupDir) throws IOException {
        Path backupPath = Paths.get(backupDir);
        Files.delete(backupPath);
        System.out.println("Backup deleted successfully: " + backupDir);
    }
}
