package com.wlz.java.twentyOne_concurrence;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class TestThreadPool {
	@Test
	public void CachedThreadPool() {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new LightOff());
		}
		// ��ֹ�������ύ��Executor,
		exec.shutdown();
	}

	@Test
	public void FixThreadPoll() {
		// ��ǰ�����Executor�е��߳�������ʡʱ��
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			exec.execute(new LightOff());

		}
		exec.shutdown();
	}

	@Test
	public void SingleThreadPool() {
		// �൱�ڽ������л�
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			exec.execute(new LightOff());
		}
		exec.shutdown();
	}
	@Test
	public void test(){
		Map map = new HashMap();
		map.put("shina", "zhongguo");
		map.put("b", "aaa");
		Set set = map.keySet();
		Iterator it = (Iterator)set.iterator();
		while(it.hasNext()){
			String next = (String)it.next();
		}
	}
}
