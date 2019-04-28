package cn.icloudit.pai.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.icloudit.common.api.ShopResult;
import cn.icloudit.entity.User;

@RequestMapping("/member")
public interface IUserService {

	@PostMapping("/regist")
	public ShopResult regist(@RequestBody User User);
}
