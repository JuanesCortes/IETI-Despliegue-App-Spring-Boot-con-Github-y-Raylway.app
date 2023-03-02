/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.ieti.Hello.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juane
 */
@RestController
@RequestMapping(value = "/")
public class HelloController {
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> GetResource() {
        return new ResponseEntity<>("Hello Juan Esteban!", HttpStatus.ACCEPTED);
    }
    
}
