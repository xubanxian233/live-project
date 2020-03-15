package dao;

import pojo.Campaign;

public interface CampaignDAO {
	void add(Campaign c);//
	Campaign get();//获取最大的轮次号
	void update(Campaign c);//修改总的口罩数
	int getTimes(); //获取目前的轮数
}
