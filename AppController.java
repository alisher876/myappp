package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/square/{num}")
    public String square(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num) + ".";
    }


    @GetMapping("/double/{num}")
    public String doubleNumber(@PathVariable int num) {
        return "Double of " + num + " is " + (num * 2) + ".";
    }


    @GetMapping("/length/{text}")
    public String length(@PathVariable String text) {
        return "The length of \"" + text + "\" is " + text.length() + ".";
    }


    @GetMapping("/reverse/{text}")
    public String reverse(@PathVariable String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return "The reverse of \"" + text + "\" is \"" + reversed + "\".";
    }


    @GetMapping("/concat/{str1}/{str2}")
    public String concat(@PathVariable String str1, @PathVariable String str2) {
        return "\"" + str1 + "\" concatenated with \"" + str2 + "\" is \"" + str1 + str2 + "\".";
    }


    @GetMapping("/home")
    public String home() {
        return "Welcome to Home Page!";
    }

    @GetMapping("/services")
    public String services() {
        return "Our services include web development, mobile app development, and IT consulting.";
    }

    @GetMapping("/about")
    public String about() {
        return "This application is a platform to showcase our services and provide useful information.";
    }

    @GetMapping("/faq")
    public String faq() {
        return "Frequently Asked Questions: \n1. What services do you offer? \n2. How can I contact you? \n3. Where are you located?";
    }

    @GetMapping("/contact-us")
    public String contactUs() {
        return "You can contact us via email at contact@ourcompany.com or call us at 123-456-7890.";
    }

    @GetMapping("/team")
    public String team() {
        return "Our team consists of passionate developers, designers, and business experts who are committed to delivering high-quality solutions.";
    }



    @GetMapping("/add/{x}/{y}")
    public String add(@PathVariable int x, @PathVariable int y) {
        return "The sum of " + x + " and " + y + " is " + (x + y) + ".";
    }

    @GetMapping("/multiply/{x}/{y}")
    public String multiply(@PathVariable int x, @PathVariable int y) {
        return "The product of " + x + " and " + y + " is " + (x * y) + ".";
    }


    @GetMapping("/subtract/{x}/{y}")
    public String subtract(@PathVariable int x, @PathVariable int y) {
        return "The difference of " + x + " and " + y + " is " + (x - y) + ".";
    }

    @GetMapping("/divide/{x}/{y}")
    public String divide(@PathVariable int x, @PathVariable int y) {
        if (y == 0) {
            return "Error: Division by zero is not allowed.";
        }
        return "The division of " + x + " by " + y + " is " + ((double) x / y) + ".";
    }

    @GetMapping("/modulus/{x}/{y}")
    public String modulus(@PathVariable int x, @PathVariable int y) {
        if (y == 0) {
            return "Error: Modulus by zero is not allowed.";
        }
        return "The remainder of " + x + " divided by " + y + " is " + (x % y) + ".";
    }

    @GetMapping("/power/{base}/{exp}")
    public String power(@PathVariable int base, @PathVariable int exp) {
        if (exp < 0) {
            return "Error: Negative exponents are not supported in this implementation.";
        }
        return base + " raised to the power of " + exp + " is " + (int) Math.pow(base, exp) + ".";
    }
}

