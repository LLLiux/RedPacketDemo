package com.lin.redPacketDemo.builder;

import com.lin.redPacketDemo.redPacketModel.RedPacket;

/**
 * @author L
 */
public class RedPacketBuilder {
    protected RedPacket redPacket;

    public RedPacketBuilder message(String message) {
        redPacket.message = message;
        return this;
    }

    public RedPacketBuilder picture(String picture) {
        redPacket.picture = picture;
        return this;
    }

    public RedPacket build() {
        redPacket.group.notifyAllObservers();
        return redPacket;
    }
}
