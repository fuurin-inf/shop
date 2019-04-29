
package cn.icloudit.adapter;

import com.alibaba.fastjson.JSONObject;

public interface MessageAdapter {
	//接受消息
    public void distribute(JSONObject jsonObject);
}
