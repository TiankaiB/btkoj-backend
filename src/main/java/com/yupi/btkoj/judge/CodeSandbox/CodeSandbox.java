package com.yupi.btkoj.judge.CodeSandbox;

import com.yupi.btkoj.judge.CodeSandbox.model.ExecuteCodeRequest;
import com.yupi.btkoj.judge.CodeSandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
