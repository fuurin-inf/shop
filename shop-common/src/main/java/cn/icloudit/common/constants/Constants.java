
package cn.icloudit.common.constants;

public interface Constants {
	//用户会话保存90天
	Long USER_TOKEN_TERMVALIDITY = 60 * 60 * 24 * 90l;
	int WEBUSER_COOKIE_TOKEN_TERMVALIDITY = 1000*60 * 60 * 24 * 90;
	String USER_TOKEN = "token";
	
	/**
	 * 购物车有效期
	 */
	Long WEBUSER_SHOP_TERMVALIDITY = 1000 * 60 * 60 * 24 * 90l;
	

	String PAY_SUCCES = "ok";
	String PAY_FAIL = "fail";
}
