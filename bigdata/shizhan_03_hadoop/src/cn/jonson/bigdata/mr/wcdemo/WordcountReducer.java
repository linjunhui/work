package cn.jonson.bigdata.mr.wcdemo;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordcountReducer extends Reducer<LongWritable, Text, Text, IntWritable> {
	@Override
	protected void reduce(LongWritable key, Iterable<Text> values, Reducer<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
			
		int count = 0;
	}
}
