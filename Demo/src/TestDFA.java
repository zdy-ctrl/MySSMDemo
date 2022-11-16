/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/10 18:21
 * @Abstract：
 */
package python;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Angel_Kitty
 * @createTime 2018年11月21日 上午2:23:33
 */
/**状态转换式构造类*/
class edge {
    char PriorityState;
    char ch;
    char NextState;
    edge(char p,char c, char n){
        PriorityState = p;
        ch = c;
        NextState = n;
    }
    @Override
    public String toString() {
        return "edge [PriorityState=" + PriorityState + ", ch=" + ch + ", NextState=" + NextState + "]";
    }
}
/**DFA的构造*/
public class TestDFA {
    static List<edge> listEdge = new ArrayList<edge>();//状态集
    //static HashMap<edge, Character> mapEdge = new HashMap<>();
    static String S;//初态集
    static String Z;//终态集
    //flag is here
    static boolean judeZ(char ch){
        int j=0;
        for(; j<Z.length(); j++){
            if(Z.charAt(j)==ch) return true;
        }
        return false;
    }
    static void input() {
        Scanner in = new Scanner(System.in);
        String instr = null;
        String subStr[] = null;
        System.out.println("请输入开始符：");
        S = in.next();
        System.out.println("请输入终态集(终集符组成的一个字符串)：");
        Z = in.next();
        System.out.println("请输入正规文法以end结尾(形式如下图)：");
        System.out.println("----------");
        System.out.println("|  0-a1  |");
        System.out.println("|  0-b0  |");
        System.out.println("|  1-b2  |");
        System.out.println("|  ....  |");
        System.out.println("|  eof   |");
        System.out.println("----------");
        while(in.hasNext()){
            instr = in.next();
            if("eof".equals(instr)) break;
            subStr = instr.split("-|\\|");
            String s = subStr[0];//读取一行f(转换函数)
            for(int i=1; i<subStr.length; i++){
                edge e = null;
                if(subStr[i].length()==2){
                    char c = subStr[i].charAt(0);//有穷符号表
                    char n = subStr[i].charAt(1);//状态集
                    listEdge.add(new edge(s.charAt(0),c,n));//f(0,a)=1
                }

                if(subStr[i].length()==1){
                    char c = subStr[i].charAt(0);
                    listEdge.add(new edge(s.charAt(0),c,Z.charAt(0)));
                }
            }
        }
    }

    static char judeNextState(char s,char ch){
        for(int i=0; i<listEdge.size(); i++){
            if(s==listEdge.get(i).PriorityState && ch==listEdge.get(i).ch){
                return listEdge.get(i).NextState;
            }
        }
        return '0';
    }

    static void judeDFA(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要判断的字符串:");
        while(in.hasNext()){
            String str = in.next();
            if(str.equals("#")){
                System.out.println("程序已退出，欢迎下次使用!");
                return;
            }
            char temp = S.charAt(0);
            int i=0;
            for(; i<str.length(); i++){
                if(str.charAt(i)=='a'){
                    temp = judeNextState(temp, 'a');
                }
                else if(str.charAt(i)=='b'){
                    temp = judeNextState(temp, 'b');
                }
                else break;
            }
            if(i>=str.length() && judeZ(temp)) System.out.println("此字符串“属于”该文法！");
            else System.out.println("此字符串“不属于”该文法！");
            System.out.println("再次判断请输入字符串(退出程序输入#):");
        }

    }

    public static void main(String[] args) {
        TestDFA.input();
        TestDFA.judeDFA();
    }
}

/*test example*/
/*
 *
//start symbol
S
//end symbol
Q
//Regular Grammar1
S-aU
S-bV
U-bV
U-aQ
V-aU
V-bQ
Q-aQ
Q-bQ
end
//judge string
->test sample1: baab
->test sample2: abab
//start symbol
S
//end symbol
Q,V
//Regular Grammer2
S-aU
S-bV
U-bV
U-aQ
Q-aQ
Q-bQ
end
//judge string
-> test sample1: ab
-> test sample2: abb
if you input '#',The program will exit.
 *
 * */
