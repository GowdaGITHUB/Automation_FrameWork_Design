package SeleniuGrid;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGParameter {
	@Parameters({"city","area"})
	@Test
public void testA(@Optional("Bangalore")String c,@Optional("SP Road")String a) {
	
	Reporter.log(c+a,true);
}}