package com.yupi.btkoj.judge;

import com.yupi.btkoj.judge.CodeSandbox.model.ExecuteCodeResponse;
import com.yupi.btkoj.model.entity.QuestionSubmit;
import com.yupi.btkoj.model.vo.QuestionSubmitVO;

/**
 * 判题服务
 */
public interface JudgeService {

    QuestionSubmit doJudge(long questionSubmitId);

}
