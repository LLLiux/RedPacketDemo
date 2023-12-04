package com.lin.redPacketDemo.observer;

import com.lin.redPacketDemo.observer.Observer;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author L
 */
@Data
@AllArgsConstructor
public class GroupMember implements Observer {
    public int id;

    @Override
    public void update() {
        System.out.println("id:" + id + "收到新的红包");
    }
}
