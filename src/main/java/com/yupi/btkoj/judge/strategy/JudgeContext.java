package com.yupi.btkoj.judge.strategy;

import com.yupi.btkoj.model.dto.question.JudgeCase;
import com.yupi.btkoj.judge.CodeSandbox.model.JudgeInfo;
import com.yupi.btkoj.model.entity.Question;
import com.yupi.btkoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中的参数）
 */
@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private  List<String> outputList;

    private Question question;

    private List<JudgeCase> judgeCaseList;

    private QuestionSubmit questionSubmit;
}
