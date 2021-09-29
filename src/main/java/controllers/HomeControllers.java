package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ciro")
@RestController
public class HomeControllers {

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "Estudo api rest";
    }

//    @RequestMapping(value = "/olamundo/{nome}", method = RequestMethod.GET)
//    @ResponseStatus(HttpStatus.OK)
//    public String retornaOlaMundo(@PathVariable String nome) {
//        return "Ola mundo " + nome;
//    }
}
