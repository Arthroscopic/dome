package com.ylk.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * tb_order
 * @author 
 */
@Data
public class Order implements Serializable {
    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 需求标题
     */
    private String title;

    /**
     * 期望价格
     */
    private BigDecimal price;

    /**
     * 内容
     */
    private String content;

    /**
     * 订单状态，0表示待合作，1表示待发货，2表示完成，3表示完成但未评价
     */
    private Integer orderStatus;

    /**
     * 1销售订单，2需求订单
     */
    private String type;

    private String picture;

    /**
     * 发起订单人
     */
    private String ownName;

    /**
     * 合作人名字
     */
    private String cooperationName;

    private Date createTime;

    private Date updateTime;

    /**
     * 订单收货地址
     */
    private String address;

    private static final long serialVersionUID = 1L;
}