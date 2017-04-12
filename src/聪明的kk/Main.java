/**
描述
聪明的“KK”
非洲某国展馆的设计灵感源于富有传奇色彩的沙漠中陡然起伏的沙丘，体现出本国不断变换和绚丽多彩的自然风光与城市风貌。展馆由五部分组成，馆内影院播放名为《一眨眼的瞬间》的宽银幕短片，反映了建国以来人民生活水平和城市居住环境的惊人巨变。
可移动“沙丘”变戏法 的灵感源于其独特而雄伟的自然景观——富于传奇色彩的险峻沙丘。宏伟的结构、可循环的建材，与大自然相得益彰。环绕一周，发现它正是从沙丘那不断变换的形态中汲取灵感的。外形逼真到无论从哪个角度去观察，都能清楚地辨识出沙丘的特征。
它“坡面”高达20米，微风吹来，你是否感觉到沙的流动？用手去触碰，却发现原来是“魔术戏法”。它表面的不锈钢面板呈现出一种富于变幻的色彩，从不同角度观察，呈现不同色泽，由此来模仿流动沙丘的光感。
走进第三展厅有一个超大的屏幕，通过奇妙的特效，让观众犹如亲身来到浩瀚的沙漠。更为奇妙的是，

只见一个小动物“KK”正从沙漠区域（矩形）的左上角沿着向右或向下的方向往右下角跑去。KK太聪明了，它居然能在跑的过程中会选择吃掉尽可能多的虫子线路。
你知道它吃掉多少虫子吗？
输入
第一行：N M (1≤N M≤20 0≤Xij≤500(i=1,2„.N, j=1,2„,M)
)表示沙漠是一个N*M的矩形区域
接下来有N行：每行有M个正整数，Xi1 Xi2 ……Xim 表示各位置中的虫子数（单个空格隔开）
假设“KK”只能向右走或向下走。
输出
输出有一个整数， 表示“KK”吃掉最多的虫子数。
样例输入
3 4
3 1 2 8
5 3 4 6
1 0 2 3
样例输出
24
 */
package 聪明的kk;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int[][] num = new int[x+1][y+1];
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				num[i][j] = scanner.nextInt();
			}
		}
		int[][] dp = new int[x+1][y+1];
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				dp[i][j] = Math.max(dp[i-1][j]+num[i][j], dp[i][j-1]+num[i][j]);
			}
		}
		System.out.println(dp[x][y]);
	}
}
