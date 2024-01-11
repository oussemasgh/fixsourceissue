package com.example.fixsourceissue;

import com.example.fixsourceissue.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class testpath {


    public testpath() throws IOException {
        // Path to the directory containing "back.png"
        Image image = new Image(getClass().getResource("/images/back.png").toExternalForm());
        ImageView imageView = new ImageView(image);
        System.out.println(imageView.getImage().getUrl());
    }
    }

