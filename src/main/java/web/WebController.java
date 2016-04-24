/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import javax.servlet.http.*;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@Controller
public class WebController {
    
@RequestMapping("/")
        public String login(){
            return "login";
        }
        
        @RequestMapping("/index")
        public String index(){
            return "index";
        }
        
        @RequestMapping("/logout")
        public String logout(){
        return "logout";
        }    
}
