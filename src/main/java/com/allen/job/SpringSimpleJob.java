package com.allen.job;

import java.util.Date;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class SpringSimpleJob implements SimpleJob{

    @Override
    public void execute(final ShardingContext shardingContext) {
        // TODO Auto-generated method stub
        System.out.println(new Date()+" job名称："+shardingContext.getJobName()
        +" 分片数量："+shardingContext.getShardingTotalCount()
        +" 当前分区："+shardingContext.getShardingItem()
        +" 当前分区名称："+shardingContext.getShardingParameter()
        +" 当前自定义参数："+shardingContext.getJobParameter()+"============start=================");
    }

}
