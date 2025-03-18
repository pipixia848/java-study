package maopao;

import java.util.List;

/**
 * 冒泡排序接口.
 */
public interface MaoPaoSort {

    /**
     * 排序方法.
     * @param randomList 随机列表
     * @return List 正序排列好的列表
     */
    List<Integer> sort(List<Integer> randomList);

}
