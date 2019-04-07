package jp.co.ginga.conference_room.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ログイン周りのリクエストを受け付けるコントローラ
 * 
 * @author
 *
 */
@Controller
public class LoginController {
	@RequestMapping("/")
	public String init() {
		return "login/login";
	}
}
