package com.moredb.demo.mapper;

import com.moredb.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface UserMapper {

    User Sel(int id);
}
