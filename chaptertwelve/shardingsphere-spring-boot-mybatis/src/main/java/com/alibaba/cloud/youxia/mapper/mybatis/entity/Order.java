package com.alibaba.cloud.youxia.mapper.mybatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Order implements Serializable {
    private static final long serialVersionUID = 661434701950670670L;
    private Long id;
    private Long userId;
    private String orderName;
    private Long addressId;
    private Integer status;
    private long orderId;
    private Integer isDeleted;
    private Date gmtCreate;
    private Date gmtModified;
}
