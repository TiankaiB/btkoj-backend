package com.yupi.btkoj.judge.CodeSandbox.Impl;

import com.yupi.btkoj.judge.CodeSandbox.CodeSandbox;
import com.yupi.btkoj.judge.CodeSandbox.model.ExecuteCodeRequest;
import com.yupi.btkoj.judge.CodeSandbox.model.ExecuteCodeResponse;

public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("沙箱3");
        return null;
    }
}
