package template;
/**
 * 普通话六级考试 试卷~~~
 * @author wangth89
 *
 */
public abstract class TestPaper {
	public void askQuestion1() {
		System.out.println("“小明，窗台上落了鸟屎，去擦一下好么？” “我擦！我不擦！！”\n问：小明擦不擦窗台？");
		System.out.println("答：" + answerQuestion1());
	}

	public void askQuestion2() {
		System.out.println("“小明，今晚上有思修课呢！你去不去？”“我去！！你有病啊！！”\n问：小明去不去思修课？");
		System.out.println("答：" + answerQuestion2());
	}

	public void askQuestion3() {
		System.out.println("“小明，你想好了么？”“想好了。”“你先说还是我先说？”“我说……你说吧。”\n问：谁先说？");
		System.out.println("答：" + answerQuestion3());
	}

	public void askQuestion4() {
		System.out.println("“小明，今天我妹妹来看我，要不要和我一起去见她啊？”“见你妹啊，不见！”\n问：小明到底要不要去见人家妹妹？");
		System.out.println("答：" + answerQuestion4());
	}

	public abstract String answerQuestion1();

	public abstract String answerQuestion2();

	public abstract String answerQuestion3();

	public abstract String answerQuestion4();
}
