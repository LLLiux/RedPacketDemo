package com.lin.redPacketDemo.redPacketModel;

import lombok.Data;


import java.util.Date;

/**
 * @author L
 */
@Data
public class ReceiverInfo {

    public int groupMemberId;

    public double allocatedAmount;

    public Date time;
}
