package lesson_10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main() throws IOException {

        UserBackupService service = new UserBackupService();
        List<User> users = new ArrayList<>();
        users.add(new User("Aydin", "aydin@mail.com", 28));
        users.add(new User("Leyla", "leyla@mail.com", 24));
        users.add(new User("Ruslan", "ruslan@mail.com", 30));

        String dataFile = "users.dat";
        String backupDir = "backup";
        String backupFile = backupDir + "/users_backup.dat";

        System.out.println("=== User Data Backup System ===\n");

        service.saveUsers(users, dataFile);

        List<User> loadedUsers = service.loadUser(dataFile);
        System.out.println("\nLoaded Users:");
        loadedUsers.forEach(System.out::println);

        service.backupFile(dataFile, backupDir);

        service.deleteBackup(backupFile);

    }
}
