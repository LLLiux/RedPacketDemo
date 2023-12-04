package com.lin.redPacketDemo.redPacketModel;

import com.lin.redPacketDemo.observer.Group;
import com.lin.redPacketDemo.state.EmptyState;

import java.util.Date;

public class ExclusiveRedPacket extends RedPacket {

    public int groupMemberId;

    public ExclusiveRedPacket(double amount, int totalNum, int groupMemberId, Group group, int creatorId) {
        super(amount, totalNum, group, creatorId);
        this.groupMemberId = groupMemberId;
    }

    @Override
    protected synchronized void allocateInner(int groupMemberId) {
        if (!verify(groupMemberId)) {
            return;
        }
        ReceiverInfo receiverInfo = new ReceiverInfo();
        receiverInfo.setGroupMemberId(groupMemberId);
        receiverInfo.setAllocatedAmount(amount);
        amount = 0;
        --remainNum;
        if (remainNum == 0) {
            redPacketState = new EmptyState();
        }
        receiverInfo.setTime(new Date());
        receiverInfoList.add(receiverInfo);
    }

    private boolean verify(int groupMemberId) {
        return groupMemberId == this.groupMemberId;
    }
}
