/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TourController {
    
    @RequestMapping("/tour_information")
    public String tourInformation(){
        return "tour_information";
    }
    
    @RequestMapping("/tour_information_add")
    public String tourInformationAdd(){
        return "tour_information_add";
    }
}
