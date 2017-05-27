public class Sort {
	// 生成无序的数组
	public static int[] initData(int length) {
		int[] datas = new int[length];
		for (int i = 0; i < length; i++) {
			int num = (int) (Math.random() * length);
			datas[i] = num;
		}
		return datas;
	}

	// 交换两个数
	public static void swap(int[] datas, int i, int j) {
		datas[i] = datas[i] ^ datas[j];
		datas[j] = datas[i] ^ datas[j];
		datas[i] = datas[i] ^ datas[j];
	}

	// 冒泡排序
	public static void bubbleSort(int[] datas) {
		for (int i = 0; i < datas.length; i++) {
			for (int j = i + 1; j < datas.length; j++) {
				if (datas[i] > datas[j]) {
					swap(datas, i, j);
				}
			}
		}
	}

	// 插入排序
	public static void insertSort(int[] datas) {
		for (int i = 1; i < datas.length; i++) {
			if (datas[i - 1] > datas[i]) {
				int temp = datas[i];
				int j = i;
				while (j > 0 && datas[j - 1] > temp) {
					datas[j] = datas[j - 1];
					j--;
				}
				datas[j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] datas = initData(10);
		for (int i = 0; i < datas.length; i++)
			System.out.print(datas[i] + " ");
		System.out.println();

		insertSort(datas);

		for (int i = 0; i < datas.length; i++)
			System.out.print(datas[i] + " ");
	}
}
