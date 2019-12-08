package com.vp.ds.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.vp.utils.TimeWatch;

public class LamdaStreamEg {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		for(int i=0;i<100000;i++)
		{
		names.add("Rajesh" + i);
		names.add("Suresh" + i);
		names.add("Venkat" + i);
		names.add("Guna" + i);
		names.add("Kumar" + i);
		names.add("Smith" + i);
		names.add("Ratheesh" + i);
		}
		
		TimeWatch watch = TimeWatch.start();
	
		Stream<String> namesStream=names.stream();
		Stream <String> processedSteam=namesStream.filter(a->a.startsWith("R"));
		List<String> processedList= processedSteam.collect(Collectors.toList());
		//System.out.println("processedList using lamda : " + processedList);
		//processedSteam.forEach(d->System.out.println(d));
		
		long passedTimeInMilliSeconds = watch.time(TimeUnit.MILLISECONDS);

		System.out.println("duration using lambda " + passedTimeInMilliSeconds);
		
		/*
		TimeWatch watch = TimeWatch.start();
		List<String> tradList=new ArrayList<String>();
		for(String s:names)
		{
			if(s.startsWith("R"))
			{
				tradList.add(s);
				
			}
		}
		//System.out.println("processedList in Traditional " + tradList);	
		long passedTimeInMilliSeconds = watch.time(TimeUnit.MILLISECONDS);

		System.out.println("duration using traditional " + passedTimeInMilliSeconds);
		*/
		
	}

}


