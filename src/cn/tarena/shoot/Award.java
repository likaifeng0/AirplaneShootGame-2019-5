package cn.tarena.shoot;
/**
 * �����ӿ�        </br>
 * @author Administrator
 *
 */
public interface Award {
	int DOUBLE_FIRE  = 0;     //˫������Ĭ��ֵ
	int LIFE = 1;             //��������Ĭ��ֵ
	
	/**��ý�������(0:˫����,1:����)**/
	int getType();            //��������
}
