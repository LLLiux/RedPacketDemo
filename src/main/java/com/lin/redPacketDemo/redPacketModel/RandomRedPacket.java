package com.lin.redPacketDemo.redPacketModel;

import com.lin.redPacketDemo.observer.Group;
import com.lin.redPacketDemo.state.EmptyState;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Random;

/**
 * @author L
 */
public class RandomRedPacket extends RedPacket {

    public RandomRedPacket(double amount, int totalNum, Group group, int creatorId) {
        super(amount, totalNum, group, creatorId);
    }

    @Override
    protected synchronized void allocateInner(int groupMemberId) {
        ReceiverInfo receiverInfo = new ReceiverInfo();
        receiverInfo.setGroupMemberId(groupMemberId);
        double rand = nextDouble(2 * (amount / remainNum));
        if (remainNum == 1) {
            rand = amount;
        }
        rand = new BigDecimal(rand).setScale(2, RoundingMode.HALF_UP).doubleValue();
        receiverInfo.setAllocatedAmount(rand);
        amount -= rand;
        --remainNum;
        if (remainNum == 0) {
            redPacketState = new EmptyState();
        }
        receiverInfo.setTime(new Date());
        receiverInfoList.add(receiverInfo);
    }

    private double nextDouble(double max) {
        return 0.01 + ((max - 0.01) * new Random().nextDouble());
    }
}
