package com.example.hpseahouse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Member {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(Model model) {
        model.addAttribute("th_greet", "こんにちは！情報を入力してください");
        return "Member";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postIndex(@RequestParam("nickname") String nickname,
                            @RequestParam("radio_1") String sex,
                            @RequestParam("favorite_distribution") String distribution,
                            Model model) {
        String sexuality = sex.equals("male") ? "さん" : "さん";
        String message = "ありがとうございます！" + nickname + sexuality + "がお住まいの地域は" + distribution + "で登録致しました";
        model.addAttribute("th_greet", message);
        return "Member";
    }
}
