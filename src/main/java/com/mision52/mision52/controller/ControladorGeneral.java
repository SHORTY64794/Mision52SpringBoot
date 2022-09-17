package com.mision52.mision52.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControladorGeneral {

    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> otroSaludar(){

        return new ResponseEntity<>("Mis Rekathricos, estoy triunfando xq hice otra pagina web con SB", HttpStatus.OK);
    }

}