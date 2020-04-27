package service.impl;

import api.User;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements User {

    @Override
    public String getUserName(String name) {
        return name;
    }
}
