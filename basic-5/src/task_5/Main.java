package task_5;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Friends friends = new Friends();

        friends.friendsName.add("Nikita");
        friends.friendsName.add("Valery");
        friends.friendsName.add("John");
        friends.friendsName.add("Vitaliy");

        System.out.println(friends.friendsName);

        Collections.sort(friends.friendsName);

        System.out.println(friends.friendsName);
    }
}
