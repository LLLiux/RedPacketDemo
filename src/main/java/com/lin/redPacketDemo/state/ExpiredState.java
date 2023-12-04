package com.lin.redPacketDemo.state;

import com.lin.redPacketDemo.redPacketModel.RedPacket;

public class ExpiredState implements RedPacketState {
    @Override
    public boolean canAllocate(RedPacket redPacket, int groupMemberId) {
        System.out.println("当前红包已过期");
        return false;
    }

    @Override
    public void show() {
        System.out.println("已过期");
    }
}
