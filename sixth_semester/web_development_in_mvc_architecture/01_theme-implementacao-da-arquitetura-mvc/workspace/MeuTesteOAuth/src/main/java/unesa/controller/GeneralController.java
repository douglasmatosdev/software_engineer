/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author denis
 */
@Controller
public class GeneralController {
    @RequestMapping("/")
    public String raiz() { return "index"; }

    @RequestMapping("/index")
    public String index() { return "index"; }

    @GetMapping("protegido")
    public String protegido() { return "protegido"; }
}
