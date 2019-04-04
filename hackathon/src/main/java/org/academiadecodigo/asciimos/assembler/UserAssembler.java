package org.academiadecodigo.asciimos.assembler;

import org.academiadecodigo.asciimos.dto.UserDto;
import org.academiadecodigo.asciimos.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserAssembler {

    public User convertToRealUser(UserDto userDto) {
        User user = new User();

        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPhone(userDto.getPhone());

        return user;
    }
}
