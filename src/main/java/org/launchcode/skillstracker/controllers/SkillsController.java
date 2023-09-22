package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String skillsList() {
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                    "<body>" +
                        "<form action='skills' method='post' style='display: flex; flex-direction: column; width: 300px; padding: 10px;'>" +
                            "<label for='name'>Name: </label>" +
                            "<input type='text' name='name'/>" +
                            "<label for='first'>My favorite language: </label>" +
                            "<select name='first' id='first'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "<label for='second'>My second favorite language: </label>" +
                            "<select name='second' id='second'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "<label for='third'>My third favorite language: </label>" +
                            "<select name='third' id='third'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "<input type='submit' value='submit'/>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

//    @PostMapping(value="skills")
//    public String skillsPost(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
//        return "<html>" +
//                    "<body>" +
//                        "<h1>" + name + "</h1>" +
//                            "<ol>" +
//                                "<li>" + first + "</li>" +
//                                "<li>" + second + "</li>" +
//                                "<li>" + third + "</li>" +
//                            "</ol>" +
//                    "</body>" +
//                "</html>";
//    }
    @PostMapping(value="skills")
    public String skillsPost(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<table>" +
                            "<tr>" +
                                "<th>First</th>" +
                                "<th>Second</th>" +
                                "<th>Third</th>" +
                            "</tr>" +
                            "<tr>" +
                                "<td>" + first + "</td>" +
                                "<td>" + second + "</td>" +
                                "<td>" + third + "</td>" +
                            "</tr>" +
                        "</table>" +
                    "</body>" +
                "</html>";
    }

}
