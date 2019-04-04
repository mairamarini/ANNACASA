package org.academiadecodigo.asciimos.dto;

import javax.validation.constraints.*;

public class UserDto {

    private Integer id;

    @NotNull(message = "Name is mandatory")
    @NotBlank(message = "Name is mandatory")
    @Size(min = 3, max = 255)
    private String name;

    @NotNull(message = "Please, insert your phone number" )
    @NotBlank(message = "Please, insert your phone number")
    @Pattern(regexp = "^\\+?[0-9]*$", message = "phone number contains invalid characters")
    @Size(min = 9, max = 16)
    private String phone;

    @Email
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
