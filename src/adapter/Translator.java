package adapter;
/**
 * 由于中国球员刚到美国往往听不懂英语，所以需要翻译
 * 翻译告诉他attack就是要做进攻任务 defense就是要做防守任务
 * 所以这边的这个翻译就相当于适配器模式中的适配器类
 * @author wangth89
 *
 */
public class Translator extends Player {
   ChineseCenter chineseCenter;
	public Translator(String name) {
		super(name);
		chineseCenter = new ChineseCenter(this.name);
	}

	@Override
	public void attack() {
		chineseCenter.JingGong();
	}

	@Override
	public void defense() {
		chineseCenter.Fangshou();
	}

}
