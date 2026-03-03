
// Use proper data structure and store information about countries and their capitals.
// There are some countries that has only 1 capital.
// There are some countries that has 2 capitals like winter capital and summer capital. When we store 2 capitals winter capital should be stored first.
// There are some countries that has 3 capitals like winter capital, summer capital and rainy season capital.
// Now store information of n different countries and their capitals in data base ( say memory) and then execute following queries based on request ( menu Driven)

// 1. Print all countries and their corresponding capitals 
// 2. Print capitals of a specific country
// 3. Print all the countries have 2 capitals
// 4. Print all the countries have 3 capitals
// 5. Print countries that does not contain summer capital
// 6. Print capitals of countries that starts with vowel ( all the capitals)
// 7. Print summer capitals of countries that starts with vowel if any

package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        // I tried using taking 3 different hashmaps for 3 types 
        // but it should contain a single database so it's not correct 
        // so using Hashmap and a list for storing countries
        // 1 capital countries
        HashMap<String, List<String>> capitals = new HashMap<>();
        capitals.put("TG", Arrays.asList("Hyd"));
        capitals.put("TN", Arrays.asList("Chennai"));
        capitals.put("West bengal", Arrays.asList("Kolkata"));
        // for 2 capital countries
        capitals.put("JK", Arrays.asList("Srinagar", "Jammu"));
        capitals.put("AP", Arrays.asList("Amaravathi", "Vizag"));
        // for 3 capital countries
        capitals.put("Random", Arrays.asList("A", "B", "C"));
        capitals.put("Another", Arrays.asList("D", "E", "F"));

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Print all countries and their corresponding capitals");
            System.out.println("2. Print capitals of a specific country");
            System.out.println("3. Print all the countries have 2 capitals");
            System.out.println("4. Print all the countries have 3 capitals");
            System.out.println("5. Print countries that does not contain summer capital");
            System.out.println("6. Print capitals of countries that starts with vowel ( all the capitals)");
            System.out.println("7. Print summer capitals of countries that starts with vowel if any");
            System.out.println("8. EXIT");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (String country : capitals.keySet()) {
                        List<String> list = capitals.get(country);
                        System.out.println("Country: "+country+", Capital: "+list);
                    }
                    break;
                case 2 : 
                    System.out.println("Enter country name: ");
                    String countryName = sc.next();
                    if (capitals.containsKey(countryName)) 
                        System.out.println("Capitals re: "+capitals.get(countryName));
                    else 
                        System.out.println("Country not there in database");
                    break;
                case 3 : 
                    for (String country : capitals.keySet()) {
                        if (capitals.get(country).size() == 2) 
                            System.out.println(country);
                    }
                    break;
                case 4 : 
                    for (String country : capitals.keySet()) {
                        if (capitals.get(country).size() == 3) 
                            System.out.println(country);
                    }
                    break;
                case 5 : 
                    for (String country : capitals.keySet()) {
                        if (capitals.get(country).size() < 2) 
                            System.out.println(country);
                    }
                    break;
                case 6 : 
                    for (String country : capitals.keySet()) {
                        List<String> list = capitals.get(country);
                        for (String capital : list) {
                            if ("AEIOU".indexOf(capital) != -1) 
                                System.out.println("Country: "+country +", capital: "+capital);
                        }
                    }
                    break;
                case 7 : 
                    for (String country : capitals.keySet()) {
                        List<String> list = capitals.get(country);
                        if (list.size() >= 2) {
                            String capital = list.get(1);
                            if ("AEIOU".indexOf(capital) != -1) 
                                System.out.println("Country: "+country +", capital: "+capital);
                        }
                    }
                    break;
                case 8 : 
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid!");
            }
        } 
    }
}
