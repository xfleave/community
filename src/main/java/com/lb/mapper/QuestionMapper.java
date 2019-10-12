package com.lb.mapper;

import com.lb.model.Question;
import org.apache.ibatis.annotations.Insert;

/**
 * @author 李彪(libiao)
 * 2019/10/12   12:17
 */
public interface QuestionMapper {
    @Insert("")
    public int insert(Question question);
}
