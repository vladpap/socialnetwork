package ru.sbt.socialnetwork.mediaservice;

import ru.sbt.socialnetwork.client.Client;

import java.awt.*;
import java.util.ArrayList;

public class Photo{

    public ArrayList<Image> getMediaFromUserId(int userId) {
        ArrayList<Image> result = Client.getImagesFromUserId(userId);
        return result;
    }
}
