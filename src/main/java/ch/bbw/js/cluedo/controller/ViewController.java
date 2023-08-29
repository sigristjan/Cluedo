package ch.bbw.js.cluedo.controller;

import ch.bbw.js.cluedo.factory.DataFactory;
import ch.bbw.js.cluedo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/")
    public String homeMapping(Model model) {
        List<Person> people = DataFactory.people;
        model.addAttribute("people", people);
        return "ViewTemplate";
    }
}
