package com.lin.redPacketDemo;

import com.lin.redPacketDemo.observer.Group;
import com.lin.redPacketDemo.observer.GroupMember;
import com.lin.redPacketDemo.redPacketModel.RedPacket;
import com.lin.redPacketDemo.builder.RandomRedPacketBuilder;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Group group = new Group();
        GroupMember groupMember1 = new GroupMember(1);
        GroupMember groupMember2 = new GroupMember(2);
        GroupMember groupMember3 = new GroupMember(3);
        group.addObserver(groupMember1);
        group.addObserver(groupMember2);
        group.addObserver(groupMember3);

        RandomRedPacketBuilder randomRedPacketBuilder = new RandomRedPacketBuilder(100.00, 3, group, groupMember1.id);
        RedPacket redPacket = randomRedPacketBuilder.message("恭喜发财，大吉大利").build();

        Thread.sleep(1000);

        redPacket.show();
        redPacket.allocate(groupMember1.getId());
        redPacket.allocate(groupMember2.getId());
        redPacket.allocate(groupMember3.getId());
        redPacket.details();
        redPacket.show();
    }
}