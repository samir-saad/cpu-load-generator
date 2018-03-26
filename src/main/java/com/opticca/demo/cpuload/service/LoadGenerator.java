package com.opticca.demo.cpuload.service;

import org.springframework.stereotype.Component;

import com.opticca.demo.cpuload.thread.BusyThread;

@Component
public class LoadGenerator {

	public void run(double load, long duration) {
		new BusyThread("Thread " + System.currentTimeMillis(), load, duration).start();
	}
}
