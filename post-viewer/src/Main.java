import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.*;

public class Main {

    static List<Post> posts = new ArrayList<>();
    static int op;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        screenPrincipal(sc);
        sc.close();
    }

    static void screenPrincipal(Scanner sc) {
        do {
            System.out.println("\n\n#1 View posts");
            System.out.println("#2 Create posts");
            System.out.println("#3 Like post");
            System.out.println("#4 Comment post");
            System.out.println("\n#0 Exit");
            System.out.print("\n\nWhats want yoy do? ");

            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                viewPostsWithComment(sc);
            } else if (op == 2) {
                createPost(sc);
            } else if (op == 3) {
                likePost(sc);
            } else if (op == 4) {
                commentPost(sc);
            } else if (op == 0) {
                System.out.println("\nExiting...");
            } else {

            }
        } while (op != 0);
    }

    static void likePost(Scanner sc){
        System.out.println("\n\n##Like Posts####");
        viewPostsWithoutComment(sc);
        System.out.println("\n\n#Key index post for like:");
        int index = sc.nextInt();
        if (index <= 0 || index > posts.size()) {
            System.out.println("\nIndex out range");
        } else {
            posts.get(index - 1).addLike();
        }
    }

    static void commentPost(Scanner sc) {
        System.out.println("\n\n##Comment Posts####");
        viewPostsWithoutComment(sc);
        System.out.println("\n\n#Key index post for comment:");
        int index = sc.nextInt();

        if (index <= 0 || index > posts.size()) {
            System.out.println("\nIndex out range");
        } else {
            sc.nextLine();

            System.out.println("\n#Comment:");
            String description = sc.nextLine();
            Comment comment = new Comment(description);
            System.out.println(comment.getDescription());
            posts.get(index - 1).addComment(comment);
        }
    }

    static void viewPostsWithoutComment(Scanner sc) {
        if (posts.size() == 0) {
            System.out.println("Posts not found.");
        } else {
            for (int i = 0; i < posts.size(); i++) {
                System.out.printf("#%d %s - %s - %d like%n",
                        (i + 1),
                        posts.get(i).getTitle(),
                        posts.get(i).getContent(),
                        posts.get(i).getLikes());
            }
        }
    }

    static void viewPostsWithComment(Scanner sc) {
        System.out.println("\n\n##View Posts####");
        if (posts.size() == 0) {
            System.out.println("Posts not found.");
        } else {
            for (int i = 0; i < posts.size(); i++) {
                System.out.printf("#%d %s - %s - %d like%n",
                        (i + 1),
                        posts.get(i).getTitle(),
                        posts.get(i).getContent(),
                        posts.get(i).getLikes());
                for (Comment comment : posts.get(i).getComments()) {
                    System.out.printf("#%s%n", comment.getDescription());
                }
            }
        }
    }

    static void createPost(Scanner sc) {
        System.out.println("\n\n##Create post####\n");
        System.out.print("#Title:");
        String title = sc.nextLine();
        System.out.print("#Content:");
        String content = sc.nextLine();

        posts.add(new Post(title, content));
    }
}