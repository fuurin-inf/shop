
package cn.icloudit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.icloudit.base.controller.BaseController;
import cn.icloudit.common.api.ShopResult;
import cn.icloudit.common.constants.Constants;
import cn.icloudit.entity.User;
import cn.icloudit.feign.UserFeign;
import cn.icloudit.utils.CookieUtil;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class LoginConroller extends BaseController {
	private static final String LOGIN = "login";
	private static final String INDEX = "index";
	@Autowired
	private UserFeign userFeign;

	@RequestMapping("/locaLogin")
	public String locaLogin() {
		return LOGIN;
	}

	@RequestMapping("/login")
	public String login(User user, HttpServletRequest request, HttpServletResponse response) {
		log.debug("phone:" + user.getPhone() + ", password:" + user.getPassword());
		ShopResult login = userFeign.login(user);
		
		 Integer code = login.getStatus();
		if (!code.equals(200)) {
			String msg = (String) login.getMsg();
			log.debug("msg:" + msg);
			return setError(request, msg, LOGIN);
		}
		// 登录成功之后,获取token.将这个token存放在cookie
		String token = (String) login.getData();
		CookieUtil.addCookie(response, "token", token, Constants.WEBUSER_COOKIE_TOKEN_TERMVALIDITY);
		return "redirect:/index";

	}

}
