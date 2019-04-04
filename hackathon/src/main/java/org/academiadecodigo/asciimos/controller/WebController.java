package org.academiadecodigo.asciimos.controller;

import org.academiadecodigo.asciimos.dto.HouseDto;
import org.academiadecodigo.asciimos.model.House;
import org.academiadecodigo.asciimos.service.HouseService;
import org.academiadecodigo.asciimos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@RequestMapping("/house")
@Controller
public class WebController {

    private HouseService houseService;
    private UserService userService;

    @Autowired
    public void setHouseService(HouseService houseService) {
        this.houseService = houseService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public String listHouses(Model model) {
        //model.addAttribute("", houseService.list());
        return "redirect:/view/index.html";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/remove/{id}")
    public String deleteHouse(@PathVariable Integer id) {
        //houseService.deleteHouse(id);

        return "redirect:/view/index.html";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public String addHouse(@Valid @ModelAttribute("house") HouseDto houseDto, BindingResult result) {

        //House house = houseAssembler.convertToRealHouse(houseDto, new House());
        //houseService.saveOrUpdate(house);

        return "index.html";
    }

}
