package com.xw.xwoj.judge;

import com.xw.xwoj.judge.codesandbox.model.JudgeInfo;
import com.xw.xwoj.judge.strategy.DefaultJudgeStrategy;
import com.xw.xwoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.xw.xwoj.judge.strategy.JudgeContext;
import com.xw.xwoj.judge.strategy.JudgeStrategy;
import com.xw.xwoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
