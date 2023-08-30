package ch.bbw.js.cluedo.controller;

import ch.bbw.js.cluedo.model.DataHolder;
import ch.bbw.js.cluedo.model.Person;
import ch.bbw.js.cluedo.model.Room;
import ch.bbw.js.cluedo.model.Weapon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/")
    public String homeMapping(Model model) {
        List<Person> people = DataHolder.people;
        model.addAttribute("people", people);
        List<Weapon> weapons = DataHolder.weapons;
        model.addAttribute("weapons", weapons);
        List<Room> rooms = DataHolder.rooms;
        model.addAttribute("rooms", rooms);
        return "ViewTemplate";
    }
}
