package cn.zynworld.hnister.news.mappers;

import cn.zynworld.hnister.common.domain.NewsModule;
import cn.zynworld.hnister.common.domain.NewsModuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsModuleMapper {
    int countByExample(NewsModuleExample example);

    int deleteByExample(NewsModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsModule record);

    int insertSelective(NewsModule record);

    List<NewsModule> selectByExample(NewsModuleExample example);

    NewsModule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewsModule record, @Param("example") NewsModuleExample example);

    int updateByExample(@Param("record") NewsModule record, @Param("example") NewsModuleExample example);

    int updateByPrimaryKeySelective(NewsModule record);

    int updateByPrimaryKey(NewsModule record);
}