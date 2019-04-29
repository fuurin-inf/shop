package cn.icloudit.pai.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.icloudit.common.api.ShopResult;
import cn.icloudit.entity.User;

@RequestMapping("/member")
public interface IUserService {

	@PostMapping("/regist")
	public ShopResult regist(@RequestBody User User);
	
	@PostMapping("/login")
	public ShopResult login(@RequestBody User user);

	@PostMapping("/getUser")
	public ShopResult getUser(@RequestParam("token") String token);
	
}
