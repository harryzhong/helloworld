package com.mmsearch.rec;

import java.util.UUID;
import java.util.List;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.dictionary.CustomDictionary;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
        
        String[] testCase = new String[]{
                "商品和服务",
                "结婚的和尚未结婚的确实在干扰分词啊",
                "买水果然后来世博园最后去世博会",
                "中国的首都是北京",
                "欢迎新老师生前来就餐",
                "工信处女干事每月经过下属科室都要亲口交代24口交换机等技术性器件的安装工作",
                "随着页游兴起到现在的页游繁盛，依赖于存档进行逻辑判断的设计减少了，但这块也不能完全忽略掉。",
        };
        CustomDictionary.add("和服务");
        for (String sentence : testCase)
        {
            List<Term> termList = HanLP.segment(sentence);
            System.out.println(termList);
        }
    }
    
    public String generateUniqueKey(){
    	
    	String id = UUID.randomUUID().toString();
    	return id;
    	
    }
}
