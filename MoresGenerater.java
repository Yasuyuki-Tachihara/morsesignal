import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
public class MoresGenerater {

	public static void main(String args[]) {
		try {
		byte[] wave_data= new byte[44100*1000];                      // @A-sta@
        //double l1      = 44100.0/440.0;    // A 440hz
          double l1     = 44100.0/963.0;//ここが周波数
int j=0;
int m=0;
		Random r = new Random();
		int i;
		ArrayList<Integer> mores_bit = new ArrayList<Integer>();
		for(i=0;i < 100 ;i++) {
			int mozi = r.nextInt(65);

				switch(mozi) {
				case 0:
					//0
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 1:
					//1
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);

					break;
				case 2:
					//2
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 3:
					//3
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 4:
					//4
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 5:
					//5
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 6:
					//6
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 7:
					//7
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 8:
					//8
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 9:
					//9
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 10:
					//イ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 11:
					//ロ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 12:
					//ハ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 13:
					//ニ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 14:
					//ホ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 15:
					//ヘ
					mores_bit.add(1);
					break;
				case 16:
					//ト
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 17:
					//チ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 18:
					//リ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 19:
					//ヌ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 20:
					//ル
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 21:
					//ヲ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 22:
					//ワ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 23:
					//カ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 24:
					//ヨ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 25:
					//タ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 26:
					//レ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 27:
					//ソ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 28:
					//ツ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 29:
					//ネ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 30:
					//ナ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 31:
					//ラ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 33:
					//ム
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 34:
					//ウ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 35:
					//ヰ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 36:
					//ノ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 37:
					//オ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 38:
					//ク
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 39:
					//ヤ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 40:
					//マ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 41:
					//ケ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 42:
					//フ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 43:
					//コ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 44:
					//エ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 45:
					//テ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 46:
					//ア
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 47:
					//サ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 48:
					//キ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 49:
					//ユ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 50:
					//メ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 51:
					//ミ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 52:
					//シ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 53:
					//ヱ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 54:
					//ヒ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 55:
					//モ
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 56:
					//セ
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 57:
					//ス
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 58:
					//ン
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 59:
					//˝
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 60:
					//゜
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 61:
					//-
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 62:
					//)
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				case 63:
					//、
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					break;
				case 64:
					//」
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					mores_bit.add(0);
					mores_bit.add(1);
					break;
				}
						mores_bit.add(0);
						mores_bit.add(0);
						mores_bit.add(0);
						}
		for(i=0;i<4410000;i++)
		{
				j=mores_bit.get(m);
													if(j==0) {
															for(int k=0;k<4410;k++) {
																	wave_data[i]=(byte)0;
																	i++;
																				}
															}else{
																	for(int k=0;k<4410;k++) {
																		wave_data[i]=(byte)(110*Math.sin((i/l1)*Math.PI*2));
																			i++;}
			}m++;
        }

		//8から16にしたら高い音になった。
        AudioFormat   frmt= new AudioFormat(44100,16,1,true,false);// @B-sta@
        DataLine.Info info= new DataLine.Info(Clip.class,frmt);
        Clip          clip= (Clip)AudioSystem.getLine(info);
        clip.open(frmt,wave_data,0,wave_data.length);             // @B-end@
        clip.start();
        System.out.println(mores_bit.size());
        System.out.println(wave_data[100]);

        Thread.sleep(100);while(clip.isRunning()) {Thread.sleep(100);
        }
		}
        catch(Exception e){e.printStackTrace(System.err);
        }
        }
}
        //try
        //main
	//クラス

