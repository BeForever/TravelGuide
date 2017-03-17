package me.BeForever.user.service;

import me.BeForever.user.model.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;

public interface UserService {

    User getUserByUsername(String username);

    User addUser(String username,String password,String nickName) throws Exception;

    User modifyUser(String id,String username,String realName, String nickName,
                    int sex, String phone, String email, String birthDate, MultipartFile photo) throws IOException, ParseException;

    void modifyPassword(String id,String password);
}
