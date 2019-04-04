package org.academiadecodigo.asciimos.dto;

import javax.validation.constraints.*;

public class CompanyDto {

    private Integer id;

    @NotNull(message = "Name is mandatory")
    @NotBlank(message = "Name is mandatory")
    @Size(min = 3, max = 255)
    private String name;

    @Email
    private String email;

    @NotNull(message = "Please, insert your phone number" )
    @NotBlank(message = "Please, insert your phone number")
    @Pattern(regexp = "^\\+?[0-9]*$", message = "phone number contains invalid characters")
    @Size(min = 9, max = 16)
    private String phone;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


