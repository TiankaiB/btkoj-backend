package com.yupi.btkoj.judge.CodeSandbox;

import com.yupi.btkoj.judge.CodeSandbox.Impl.ExampleCodeSandbox;
import com.yupi.btkoj.judge.CodeSandbox.Impl.RemoteCodeSandbox;
import com.yupi.btkoj.judge.CodeSandbox.Impl.ThirdPartyCodeSandbox;

/**
 * 根据字符串参数创建代码实例
 */
public class CodeSandboxFactory {

    public static CodeSandbox newInstance(String type){
        switch (type){
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}
