package sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class MainContorller {

    @RequestMapping("/sbb")
    @ResponseBody
    public String index(){
        return "HI!";
    }

    @RequestMapping("/")
    public String root(){
        return "redirect:/question/list";
    }

}
