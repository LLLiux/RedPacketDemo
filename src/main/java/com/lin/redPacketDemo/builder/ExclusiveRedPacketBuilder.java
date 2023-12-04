package com.lin.redPacketDemo.builder;

import com.lin.redPacketDemo.observer.Group;
import com.lin.redPacketDemo.redPacketModel.ExclusiveRedPacket;

/**
 * @author L
 */
public class ExclusiveRedPacketBuilder extends RedPacketBuilder {
    public ExclusiveRedPacketBuilder(double amount, int totalNum, int groupMemberId, Group group, int creatorId) {
        redPacket = new ExclusiveRedPacket(amount, totalNum, groupMemberId, group, creatorId);
    }
}
