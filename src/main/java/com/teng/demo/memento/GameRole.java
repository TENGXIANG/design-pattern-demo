package com.teng.demo.memento;

/**
 * @author TengXiang
 * @date 2018/7/24
 * 备忘录模式：游戏角色类
 */
public class GameRole {
    /**
     * 生命力
     */
    private int vit;
    /**
     * 攻击力
     */
    private int atk;
    /**
     * 防御力
     */
    private int def;

    /**
     * 保存状态
     * @return
     */
    public RoleStateMemento saveState(){
        return new RoleStateMemento(this.vit,this.atk,this.def);
    }

    /**
     * 恢复状态
     * @param roleStateMemento
     */
    public void recoveryState(RoleStateMemento roleStateMemento){
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    public void initState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void displayState(){
        System.out.println("=========================");
        System.out.println(" this.vit  = " + this.vit);
        System.out.println(" this.atk  = " + this.atk);
        System.out.println(" this.def  = " + this.def);
    }

    public void fightBoss(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }
}
