package com.zgm.aotodemo.blogs.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BlogsPojo {
    //id
    private Integer blogsId;
    //浏览次数
    private Integer browseCount;

}
