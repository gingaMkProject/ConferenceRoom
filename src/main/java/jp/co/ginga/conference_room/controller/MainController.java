package jp.co.ginga.conference_room.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * スケジューラ周りのリクエストを受け付けるコントローラ
 * 
 * @author
 *
 */
@Controller
public class MainController {
	@RequestMapping("/main")
	public String init() {
		return "main/main";
	}
}
