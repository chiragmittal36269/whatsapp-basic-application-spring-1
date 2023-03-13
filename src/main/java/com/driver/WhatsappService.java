package com.driver;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WhatsappService {

    WhatsappRepository whatsappRepository = new WhatsappRepository();

    public String createUser(String name, String mobile) throws Exception {
        try {
            return whatsappRepository.createUser(name, mobile);
        } catch (Exception e) {
            throw new Exception();
        }
    }

//    public Group createGroup(List<User> users) {
//        return whatsappRepository.createGroup(users);
//    }
}
