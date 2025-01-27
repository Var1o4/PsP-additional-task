package com.example;


import com.example.demo1.entity.User;
import com.example.demo1.service.UserService;
import com.example.demo1.service.serviceImpl.UserServiceImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        // Создаем пользователя
        User user = new User();
        user.setLogin("user");
        user.setPassword("user");
        user.setRole("user");

        User admin = new User();
        admin.setLogin("admin");
        admin.setPassword("admin");
        admin.setRole("admin");

        // Сохраняем пользователя в базе данных или выполняем другие необходимые операции
        UserService userService = new UserServiceImpl();
        userService.addUser(user);
        userService.addUser(admin);

        // Запускаем JavaFX-приложение
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Создаем графический интерфейс JavaFX
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo1/hello-view.fxml"));
        primaryStage.setScene(new Scene(loader.load(), 1000, 700));
        primaryStage.show();
    }
}
