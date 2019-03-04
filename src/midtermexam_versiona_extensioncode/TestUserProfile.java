package midtermexam_versiona_extensioncode;

import java.util.*;

public class TestUserProfile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter name: ");
        String name = input.next();
        System.out.println("Please choose your favourite genre from this " +
                "list:");
        System.out.println("Comedy");
        System.out.println("Drama");
        System.out.println("Action");
        System.out.println("Mystery");
        String genre = input.next();

        UserProfile user = new UserProfile(name, genre);

        System.out.println("Thank you for creating a profile");



    }




}
