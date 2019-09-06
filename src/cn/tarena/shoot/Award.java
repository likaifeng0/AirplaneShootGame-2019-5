package cn.tarena.shoot;
/**
 * 奖励接口        </br>
 * @author Administrator
 *
 */
public interface Award {
	int DOUBLE_FIRE  = 0;     //双倍火力默认值
	int LIFE = 1;             //生命条数默认值
	
	/**获得奖励类型(0:双活力,1:加命)**/
	int getType();            //奖励类型
}
