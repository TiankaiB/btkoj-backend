package com.yupi.btkoj.judge.CodeSandbox.model;

import lombok.Data;

@Data
public class JudgeInfo {
    /**
     * 题目信息
     */
    private String message;

    /**
     * 时间信息
     */
    private Long time;

    /**
     * 空间信息
     */
    private Long memory;
}
