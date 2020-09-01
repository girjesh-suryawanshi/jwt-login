package com.mpwz.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordcontroller {

@RequestMapping(value ="/")
public String helloWord() {

    return "Hello";
}
}
