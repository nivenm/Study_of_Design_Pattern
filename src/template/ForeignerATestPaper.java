package template;
/**
 * 老外A的答卷
 *在这个类里面你就不用再去抄一遍题目了 因为题目已经在模板类里面给你“打印”好了
 *对于考卷这个类来将不变的是考题，变得是各个不同学生的答案
 *所以在模板类里面讲不变的“考题”封装起来，留下变的“答案”给各自的子类去实现
 */
public class ForeignerATestPaper extends TestPaper {

	@Override
	public String answerQuestion1() {
		return "不擦";
	}

	@Override
	public String answerQuestion2() {
		return "不去";
	}

	@Override
	public String answerQuestion3() {
		return "“你”先说";
	}

	@Override
	public String answerQuestion4() {
		return "不见";
	}

}
