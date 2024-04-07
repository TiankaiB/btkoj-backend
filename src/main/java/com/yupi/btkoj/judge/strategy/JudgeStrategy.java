package com.yupi.btkoj.judge.strategy;

import com.yupi.btkoj.judge.CodeSandbox.model.JudgeInfo;

public interface JudgeStrategy {
    /**
     * 执行判题
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
