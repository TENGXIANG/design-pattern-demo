package com.teng.demo.memento;

/**
 * @author TengXiang
 * @date 2018/7/24
 * 备忘录模式：角色状态管理类
 */
public class RoleStateManager {

    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
