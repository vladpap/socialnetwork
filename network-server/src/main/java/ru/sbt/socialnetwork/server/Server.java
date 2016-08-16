package ru.sbt.socialnetwork.server;


import ru.sbt.socialnetwork.dom.Award;
import ru.sbt.socialnetwork.dom.Post;
import ru.sbt.socialnetwork.dom.Present;
import ru.sbt.socialnetwork.dom.User;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Server {

    public static User getUserFromId(int userId) {

        if (userId < 10) {
            throw new IllegalArgumentException("Error dom id.");
        }
        Image image;
        String imageName = "user.jpg";
        try {
            image = ImageIO.read(new File(imageName));
        } catch (IOException e) {
            throw new RuntimeException("Error file \'"+ imageName + "\'", e);
        }
        List<User> userFrends = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            userFrends.add(Server.getUserShortFormatFromId(15+i));
        }
        List<Award> awards = new ArrayList<>();
        awards.add(new Award(1, "Activity", new Date()));
        List<Present> presents = new ArrayList<>();
        presents.add(new Present(3, "Flowers", Server.getUserFromId(9), new Date()));

        return new User(userId, "Ivanov", "Petr", image, userFrends, awards, presents);
    }

    public static User getUserShortFormatFromId(int userId) {

        if (userId < 10) {
            throw new IllegalArgumentException("Error dom id.");
        }
        return new User(userId, "Sidorov", "Ivan");
    }

    public static List<Post> getPosts(int userId) {
        List<Post> result = new ArrayList<>();
        for (int i = 12; i < 35; i++) {
            Post post = new Post(Server.getUserShortFormatFromId(i), new Date(), "Не следует, однако забывать, что" +
                    " постоянное информационно-пропагандистское обеспечение нашей деятельности требуют определения и " +
                    "уточнения новых предложений. Разнообразный и богатый опыт дальнейшее развитие различных форм " +
                    "деятельности играет важную роль в формировании позиций, занимаемых участниками в отношении поставленных" +
                    " задач. С другой стороны рамки и место обучения кадров требуют от нас анализа соответствующий " +
                    "условий активизации. Не следует, однако забывать, что начало повседневной работы по формированию " +
                    "позиции представляет собой интересный эксперимент проверки дальнейших направлений развития",
                    new ArrayList<>(), null);
            result.add(post);
        }
        return result;
    }

    public static List<User> searchUsers(String firstName, String lastName) {
        List<User> userList = Server.generateUsers();
        List<User> result = new ArrayList<>();
        for (User user : userList) {
            if ((user.getFirstName().equals( firstName.equals("*") ? user.getFirstName() : firstName )) &&
                    (user.getLastName().equals( lastName.equals("*") ? user.getLastName() : lastName ))) {
                result.add(user);
            }
        }
        return result;
    }

    private static List<User> generateUsers() {
        String[] names = {"Oleg", "Ivan", "Sergey", "Petr", "Vasya", "Alex", "Dima", "Vlad", "Maxim", "Boris"};
        String[] lastNames = {"Ivanov", "Petrov", "Sidorov", "Popov", "Volkov", "Bykov", "Panov", "Noskov", "Pushkin", "Krylov"};
        List<User> result = new ArrayList<>();
        Random rn = new Random();

        for (int i = 11; i < 57; i++) {
            int k = rn.nextInt(10);
            int j = rn.nextInt(10);
            result.add(new User(i, lastNames[k], names[j]));
        }
        return result;
    }
}
