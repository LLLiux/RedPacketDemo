package com.lin.redPacketDemo.state;

import com.lin.redPacketDemo.redPacketModel.ReceiverInfo;
import com.lin.redPacketDemo.redPacketModel.RedPacket;

public class RemainingState implements RedPacketState {
    @Override
    public boolean canAllocate(RedPacket redPacket, int groupMemberId) {
        return !isAllocated(redPacket, groupMemberId);
    }

    @Override
    public void show() {
        System.out.println("还有剩余");
    }

    private boolean isAllocated(RedPacket redPacket, int groupMemberId) {
        for (ReceiverInfo receiverInfo : redPacket.receiverInfoList) {
            if (groupMemberId == receiverInfo.getGroupMemberId()) {
                return true;
            }
        }
        return false;
    }
}
