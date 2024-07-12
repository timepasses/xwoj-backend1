package com.xw.xwoj.judge.codesandbox;

import com.xw.xwoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.xw.xwoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
