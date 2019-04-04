package org.academiadecodigo.asciimos.controller;

import org.academiadecodigo.asciimos.model.House;
import org.academiadecodigo.asciimos.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@RequestMapping("/house")
@Controller
public class HouseController {

    private HouseService houseService;

    @Autowired
    public void setHouseService(HouseService houseService) {
        this.houseService = houseService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/list"})
    public String listHouses(Model model) {
        //model.addAttribute("", houseService.list());

        return "house/list";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public String addCustomer(@Valid @ModelAttribute("house") HouseDto houseDto, BindingResult result) {

        if (result.hasErrors()) {
            return "";
        }

        //House house = houseAssembler.convertToRealHouse(houseDto, new House());
        //houseService.saveOrUpdate(house);

        return "redirect:/customer/";
    }
}
