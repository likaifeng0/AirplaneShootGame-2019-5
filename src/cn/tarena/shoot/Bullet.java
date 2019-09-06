package cn.tarena.shoot;
/**
 * 子弹类
 * @author Administrator
 *
 */
/** 
 * 子弹类:是飞行物 
 */  
public class Bullet extends FlyingObject {  
    private int speed = 1;  //子弹移动的速度  

    /** 初始化数据 */  
    public Bullet(int x,int y){  
        this.x = x;  
        this.y = y;  
        this.image = ShootGame.bullet;  
    }  

    /** 移动 */  
    @Override  
    public void step(){     
        y-=speed;  
    }  

    /** 越界处理 */  
    @Override  
    public boolean outOfBounds() {  
        return y<-height;  
    }  

}

