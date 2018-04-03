package cn.zynworld.hnister.common.mappers;

import cn.zynworld.hnister.common.domain.BBSTopic;
import cn.zynworld.hnister.common.domain.BBSTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BBSTopicMapper {
    long countByExample(BBSTopicExample example);

    int deleteByExample(BBSTopicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BBSTopic record);

    int insertSelective(BBSTopic record);

    List<BBSTopic> selectByExample(BBSTopicExample example);

    BBSTopic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BBSTopic record, @Param("example") BBSTopicExample example);

    int updateByExample(@Param("record") BBSTopic record, @Param("example") BBSTopicExample example);

    int updateByPrimaryKeySelective(BBSTopic record);

    int updateByPrimaryKey(BBSTopic record);
}