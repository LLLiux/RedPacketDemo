package com.lin.redPacketDemo.redPacketModel;

import com.lin.redPacketDemo.observer.Group;
import com.lin.redPacketDemo.state.RedPacketState;
import com.lin.redPacketDemo.state.RemainingState;


import java.util.ArrayList;
import java.util.List;

/**
 * @author L
 */
public abstract class RedPacket {
    public int creatorId;

    public String message;

    public String picture;

    public double amount;

    public int totalNum;

    public int remainNum;

    public List<ReceiverInfo> receiverInfoList;

    public RedPacketState redPacketState;

    public Group group;

    protected RedPacket(double amount, int totalNum, Group group, int creatorId) {
        redPacketState = new RemainingState();
        receiverInfoList = new ArrayList<>();
        this.amount = amount;
        this.totalNum = totalNum;
        this.group = group;
        this.creatorId = creatorId;
        remainNum = totalNum;
    }

    protected abstract void allocateInner(int groupMemberId);

    public void allocate(int groupMemberId) {
        if (!redPacketState.canAllocate(this, groupMemberId)) {
            return;
        }
        allocateInner(groupMemberId);
    }

    public void show() {
        redPacketState.show();
    }

    public void details() {
        for (ReceiverInfo receiverInfo : receiverInfoList) {
            System.out.println(receiverInfo);
        }
    }
}
