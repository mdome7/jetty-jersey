package com.labs2160.example;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean
@Singleton
public class AppManager {

    private static final Logger logger = LoggerFactory.getLogger(AppManager.class);

	private AppStatus status;

	@PostConstruct
	public void initialize() {
		status = AppStatus.RUNNING;
		logger.info("{} initialized", this.getClass().getSimpleName());
	}

	public void setStatus(AppStatus status) {
		this.status = status;
	}

	public AppStatus getStatus() {
		return status;
	}
}
