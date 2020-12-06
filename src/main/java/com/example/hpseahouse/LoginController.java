package com.example.hpseahouse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("LoginForm")
public class LoginController {
    LoginForm form = new LoginForm();

    //    リクエストを受けた時の処理
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginGet(Model model) {
//        LoginFormクラスのオブジェクトをModelに追加する
        model.addAttribute("LoginForm",form);
//        Login画面の表示
        return"login";
    }
//    リクエストを送信した時の処理
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginPost(LoginForm form,Model model){
//        POSTパラメータからIDとPasswordを所得
        String id = form.getId();
                String pass = form.getPass();
//                ログインチェック
//        IDがUser、パスワードがPasswordなら成功。その場合の処理
        if((id.equals("Naoto"))&&(pass.equals("Naoto"))){
            System.out.println("ログイン成功");
            return"redirect:/"; //afterlogin切り取り

        }
//        ログイン失敗の場合
        else{
            System.out.println("ログイン失敗");
            model.addAttribute("message","IDまたはパスワードに誤りがあります。");
            return"login";

        }
    }
}

