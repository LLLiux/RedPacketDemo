package com.lin.redPacketDemo.builder;

import com.lin.redPacketDemo.observer.Group;
import com.lin.redPacketDemo.redPacketModel.EqualDivisionRedPacket;

public class EqualDivisionRedPacketBuilder extends RedPacketBuilder {
    public EqualDivisionRedPacketBuilder(double single, int totalNum, Group group, int creatorId) {
        redPacket = new EqualDivisionRedPacket(single, totalNum, group, creatorId);
    }
}
