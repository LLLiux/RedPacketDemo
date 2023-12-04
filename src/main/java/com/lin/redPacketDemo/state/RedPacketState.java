package com.lin.redPacketDemo.state;

import com.lin.redPacketDemo.redPacketModel.RedPacket;

public interface RedPacketState {
    boolean canAllocate(RedPacket redPacket, int groupMemberId);

    void show();
}
