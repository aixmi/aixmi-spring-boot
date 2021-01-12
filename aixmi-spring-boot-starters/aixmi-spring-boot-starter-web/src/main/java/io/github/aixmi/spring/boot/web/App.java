package io.github.aixmi.spring.boot.web;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xyk
 * @date 2021-01-05 下午 16:20
 */
@Slf4j
public class App {
	public static void main(String[] args) {
		log.error("", new Exception());
		new Exception().printStackTrace();
	}
}
