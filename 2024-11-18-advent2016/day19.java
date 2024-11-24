import java.util.ArrayList;

public class day19{
    public static void main(String[] args){
        System.out.println(solution(3001330));
    }

    public static int solution(int elves){
        ArrayList<Integer> presents = new ArrayList<Integer>();
        
        for (int i = 1; i < elves + 1; i++){
            presents.add(i);
        }
        System.out.println(presents);


        while (presents.size() > 1){
            for (int j = 0; j < presents.size(); j++){
                if (presents.get(j) != 0 && j == presents.size() - 1){
                    presents.remove(0);
                }
                else if (presents.get(j) != 0){
                    presents.remove(j+1);
                }
            }
            
        }

        return presents.get(0);
    }
}