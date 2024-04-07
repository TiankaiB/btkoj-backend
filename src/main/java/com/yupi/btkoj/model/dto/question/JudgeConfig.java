package com.yupi.btkoj.model.dto.question;

import lombok.Data;

@Data
public class JudgeConfig {
    /**
     * 时间限制
     */
    private Long timeLimit;

    /**
     * 空间限制
     */
    private Long memoryLimit;

    /**
     * 栈限制
     */
    private Long stackLimit;
}
