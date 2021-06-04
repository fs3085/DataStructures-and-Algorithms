package com.ywf.linkedlist;

//因为head节点不能动，因此我们需要一个辅助遍历
public class test {

    public static void main(String[] args) {
        HeroNode_test heroNode1 = new HeroNode_test(0, "adadasd", "adasdasdasd");
        HeroNode_test heroNode2 = heroNode1;
 //       System.out.println(heroNode1.getName());
//        heroNode2.setName("asdasdasdasd1232423432");
//        heroNode2.name = "2423432322534534534";

        HeroNode_test heroNode3 = new HeroNode_test(1, "aaaaaa", "aaaaaa");
        heroNode2 =  heroNode3;
        heroNode2.name = "2423432322534534534";
        System.out.println(heroNode1.getName());
        System.out.println(heroNode3.getName());

    }
}

class HeroNode_test {
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public HeroNode_test(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode2{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public int no;
    public String name;
    public String nickname;
}