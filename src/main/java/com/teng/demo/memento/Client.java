package com.teng.demo.memento;

/**
 * @author TengXiang
 * @date 2018/7/24
 * 备忘录模式：Client
 */
public class Client {

    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        //初始化
        gameRole.initState();
        gameRole.displayState();
        //备份
        RoleStateManager roleStateManager = new RoleStateManager();
        roleStateManager.setRoleStateMemento(gameRole.saveState());
        //战斗
        gameRole.fightBoss();
        gameRole.displayState();
        //恢复
        gameRole.recoveryState(roleStateManager.getRoleStateMemento());
        gameRole.displayState();
    }
}
