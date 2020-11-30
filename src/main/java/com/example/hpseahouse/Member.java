package com.example.hpseahouse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Member {

    @RequestMapping(value = "/member", method = RequestMethod.GET)
    public String getIndex(Model model) {
        model.addAttribute("th_greet", "こんにちは！情報を入力してください");
        return "Member";
    }

    @RequestMapping(value = "/member", method = RequestMethod.POST)
    public String postIndex(@RequestParam("nickname") String nickname,
                            @RequestParam("radio_1") String sex,
                            @RequestParam("favorite_distribution") String distribution,
                            @RequestParam("email01") String email,
//                            long,intにして番号中に＜ー＞を入れたらエラーが起きるのでStringに変更
                            @RequestParam("tel01") String tell,
                            Model model) {
        String sexuality = sex.equals("male") ? "さん" : "さん";
        String message = "ありがとうございます！" + nickname + sexuality + "がお住まいの地域は" + distribution ;
        String message01 = "アドレス" + email + "電話番号" + tell + "を登録しました";
        model.addAttribute("th_greet", message);
        model.addAttribute("th_greet01",message01);
        return "Member";
    }
}
