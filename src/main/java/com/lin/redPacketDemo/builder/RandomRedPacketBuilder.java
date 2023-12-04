package com.lin.redPacketDemo.builder;

import com.lin.redPacketDemo.observer.Group;
import com.lin.redPacketDemo.redPacketModel.RandomRedPacket;

/**
 * @author L
 */
public class RandomRedPacketBuilder extends RedPacketBuilder {
    public RandomRedPacketBuilder(double amount, int totalNum, Group group, int creatorId) {
        redPacket = new RandomRedPacket(amount, totalNum, group, creatorId);
    }
}
