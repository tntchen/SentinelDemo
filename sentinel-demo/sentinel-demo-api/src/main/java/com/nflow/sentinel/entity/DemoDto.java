package com.nflow.sentinel.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Jonah.Chen
 * @Date: 2021/7/13 11:32
 * @Description:
 */
@Data
public class DemoDto implements Serializable {

    private static final long serialVersionUID = 3107819154774605993L;
    private Long id;

    private String demoName;
    private String createTime;
    private String updateTime;
}