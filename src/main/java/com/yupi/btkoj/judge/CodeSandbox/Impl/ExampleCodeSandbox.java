package com.yupi.btkoj.judge.CodeSandbox.Impl;

import com.yupi.btkoj.judge.CodeSandbox.CodeSandbox;
import com.yupi.btkoj.judge.CodeSandbox.model.ExecuteCodeRequest;
import com.yupi.btkoj.judge.CodeSandbox.model.ExecuteCodeResponse;
import com.yupi.btkoj.judge.CodeSandbox.model.JudgeInfo;
import com.yupi.btkoj.model.enums.JudgeInfoMessageEnum;
import com.yupi.btkoj.model.enums.QuestionSubmitStatusEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 示例代码沙箱
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        //System.out.println("沙箱1");
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);

        
        return executeCodeResponse;
    }
}
