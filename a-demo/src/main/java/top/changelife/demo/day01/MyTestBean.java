package top.changelife.demo.day01;

public class MyTestBean {
	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"testStr='" + testStr + '\'' +
				'}';
	}
}
