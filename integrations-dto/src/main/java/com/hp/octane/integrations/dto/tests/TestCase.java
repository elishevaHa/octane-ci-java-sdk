package com.hp.octane.integrations.dto.tests;

import com.hp.octane.integrations.dto.DTOBase;

/**
 * Created by lev on 31/05/2016.
 */

public interface TestCase extends DTOBase {
	String getTestName();

	TestCase setTestName(String name);

	String getTestTime();

	TestCase setTestTime(String time);

	String getTestStatus();

	TestCase setTestStatus(String status);

	String getTestClassName();

	TestCase setTestClassName(String className);
}