package com.lin.redPacketDemo.redPacketModel;

import com.lin.redPacketDemo.observer.Group;
import com.lin.redPacketDemo.state.EmptyState;


import java.util.Date;

/**
 * @author L
 */
public class EqualDivisionRedPacket extends RedPacket {

    public EqualDivisionRedPacket(double single, int totalNum, Group group, int creatorId) {
        super(single * totalNum, totalNum, group, creatorId);
    }

    @Override
    protected synchronized void allocateInner(int groupMemberId) {
        ReceiverInfo receiverInfo = new ReceiverInfo();
        receiverInfo.setGroupMemberId(groupMemberId);
        double single = amount / remainNum;
        receiverInfo.setAllocatedAmount(single);
        amount -= single;
        --remainNum;
        if (remainNum == 0) {
            redPacketState = new EmptyState();
        }
        receiverInfo.setTime(new Date());
        receiverInfoList.add(receiverInfo);
    }
}
