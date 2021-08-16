package com.atguigu.ct.consumer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        Configuration conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum", "hadoop001,hadoop002,hadoop003");
        Connection conn = ConnectionFactory.createConnection(conf);
        Admin admin = conn.getAdmin();

    }
}
