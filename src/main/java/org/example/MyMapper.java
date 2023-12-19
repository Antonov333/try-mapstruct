package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MyMapper {
    MyMapper INSTANCE = Mappers.getMapper(MyMapper.class);

    @Mapping(source = "sourceNumber", target = "targetId")
    Target fromSourceToTarget(Source source);
}
