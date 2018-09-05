package pl.szymonsmenda.reminder.models.services;

import pl.szymonsmenda.reminder.models.UserModel;

import java.io.IOException;
import java.util.List;

public class LoginService {
    private FileService fileService;

    public LoginService() {
        fileService = new FileService();
    }

    public boolean tryToLogin(String username, String password) throws IOException {
        List<UserModel> userModelList = fileService.readUserModels();
        return userModelList.stream().anyMatch(s -> s.getPassword().equals(password) && s.getUsername().equals(username));
    }
}
