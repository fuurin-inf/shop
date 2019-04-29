package cn.incloudit.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.util.StringUtils;

import cn.icloudit.common.api.ShopResult;
import cn.icloudit.common.constants.DBTableName;
import cn.icloudit.dao.IUserDao;
import cn.icloudit.entity.User;
import cn.icloudit.pai.service.IUserService;
import cn.icloudit.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	public ShopResult regist(@RequestBody User user) {
		// TODO Auto-generated method stub
		if (StringUtils.isEmpty(user.getUserName())) {
			return ShopResult.build(400, "用户名称不能为空！");
		}
		if (StringUtils.isEmpty(user.getPassword())) {
			return ShopResult.build(400, "密码不能为空");
		}
		try {
			user.setCreated(DateUtils.getTimestamp());
			user.setUpdated(DateUtils.getTimestamp());
			String phone = user.getPhone();
			String password = user.getPassword();
			user.setPassword(md5PassSalt(phone,password));
			userDao.save(user, DBTableName.TABLE_MB_USER);
		} catch (Exception e) {
			// TODO: handle exception
			
			
		}
		
		return null;
		
		
		
	}

	private String md5PassSalt(String phone, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopResult login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopResult getUser(String token) {
		// TODO Auto-generated method stub
		return null;
	}

}
