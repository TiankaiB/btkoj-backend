package com.yupi.btkoj.judge;

import com.yupi.btkoj.judge.strategy.DefaultJudgeStrategy;
import com.yupi.btkoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.yupi.btkoj.judge.strategy.JudgeContext;
import com.yupi.btkoj.judge.strategy.JudgeStrategy;
import com.yupi.btkoj.judge.CodeSandbox.model.JudgeInfo;
import com.yupi.btkoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

@Service
public class JudgeManager {
    JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if("java".equals(language)){
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }

        return judgeStrategy.doJudge(judgeContext);

    }
}
