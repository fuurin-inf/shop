package cn.icloudit.utils;

import cn.icloudit.common.api.ShopResult;

public class ResultUtils {

	public static Object getResultMap(ShopResult reusltItemDesc) {
		
		if (reusltItemDesc.getStatus().equals(200)) {
			Object object = reusltItemDesc.getData();
			return object;
		}
		return null;
	}

}
