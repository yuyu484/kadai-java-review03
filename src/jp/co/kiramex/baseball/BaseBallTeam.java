package jp.co.kiramex.baseball;

public class BaseBallTeam {
  //　フィールドの定義
  private String name; // 氏名
  private int win;     // 勝ち
  private int lose;    //　負け
  private int draw;    // 引き分け
  
  // 引数なしのコンストラクタ
  public BaseBallTeam() {
}

  // 引数ありのコンストラクタ
  public BaseBallTeam(String name,int win, int lose, int draw) {
      this.name = name;
      this.win = win;
      this.lose = lose;
      this.draw = draw;
 }
  
  // 勝数メソッド
  public double getRate() {
      double rate =((double)this.win / (this.win + this.lose));
      return rate;
  }
  
  // reportメソッド
  public void report() {
      System.out.println(getName()+"の2022年の成績は" + getWin()+ "勝"+ getLose() + "敗"+ getDraw() +"分"+"勝率は"+ getRate() + "です。");
  }
  public String getName() {
      return name;
  }
  
  public void setName(String name) {
      this.name = name;
  }
  
  public int getWin() {
      return win;
  }
  
  public void setWin(int win) {
      this.win = win;
  }
  
  public int getLose() {
      return lose;
  }
  public void setLose(int lose) {
      this.lose = lose;
  }
  
  public int getDraw() {
      return draw;
  }
  
  public void setDraw(int draw) {
      this.draw = draw;
  }
  
}

  