package session22;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FavoriteFilm {
    public static void main(String[] args) {
        String arr[] = new String[5];
        List<String> films = new ArrayList<>();
        System.out.println("Enter 5 favorite films: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextLine();
        }
        // Adding new elements to the ArrayList
        films.add("Toi yeu em");
        films.add("Thich thi yeu");
        films.add("Forever");

        System.out.println(films);
    }
}
