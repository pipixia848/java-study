package d9_斗地主发牌;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    //需要有一副牌
    private List<Card> allCards = new ArrayList<>();

    public Room(){

        //1.做出54张牌，存入到集合allCard中
        // a.点数，个数确定，类型确定

        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"方块","红桃","梅花","黑桃"};

        //遍历点数，再遍历花色
        int size = 0;
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                //得到一张牌
                Card c = new Card(number,color,size);
                //将牌加入牌库中
                allCards.add(c);
            }
        }

        //定义小大王
        Card c1 = new Card("","小王",++size);
        Card c2 = new Card("","大王",++size);

        Collections.addAll(allCards,c1,c2);
        System.out.println(allCards);

    }

    public  void start(){
        //1.将牌库中的牌打乱顺序
        Collections.shuffle(allCards);

        //2.定义三个玩家，将牌发给三个玩家
        List<Card> game1 = new ArrayList<>();
        List<Card> game2 = new ArrayList<>();
        List<Card> game3 = new ArrayList<>();

        for (int i = 0; i < allCards.size() - 3; i++) {

            if(i%3==0){
                game1.add(allCards.get(i));
            }
            else if (i%3 == 1) {
                game2.add(allCards.get(i));
            }
            else{
                game3.add(allCards.get(i));
            }

        }

        //看三个玩家的牌
        System.out.println("玩家1:"+game1);
        System.out.println("玩家2:"+game2);
        System.out.println("玩家3:"+game3);

        //看底牌
        List<Card> lastCard = allCards.subList(allCards.size()-3,allCards.size());
        System.out.println("底牌"+ lastCard);

        //对玩家的牌进行排序
//        game1.sort(new Comparator<Card>() {
//            @Override
//            public int compare(Card o1, Card o2) {
//                return o1.getSize() - o2.getSize();
//            }
//        });
        game1.sort(( o1,  o2)->  o1.getSize() - o2.getSize());
        game2.sort(( o1,  o2)->  o1.getSize() - o2.getSize());
        game3.sort(( o1,  o2)->  o1.getSize() - o2.getSize());

        //看三个玩家的牌
        System.out.println("玩家1:"+game1);
        System.out.println("玩家2:"+game2);
        System.out.println("玩家3:"+game3);

    }


}
