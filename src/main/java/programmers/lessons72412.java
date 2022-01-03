package programmers;

public class lessons72412 {
//순위검색 https://programmers.co.kr/learn/courses/30/lessons/72412?language=java
    public static void main(String[] args) {
        String[] infos = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
        solution(infos,query);
    }

    public static int[] solution(String[] info, String[] query){
       int[] answer = new int[query.length];
       for(int i=0; i<query.length; i++){
           answer[i] = test(info,query[i]);
       }
       return answer;
    }
    public static TestCase splitQuery(String query){
        String[] args = query.split(" and ");
        TestCase testCase = new TestCase();
        testCase.setLanguage(args[0]);
        testCase.setPosition(args[1]);
        testCase.setCareer(args[2]);
        String[] inputs = args[3].split(" ");
        testCase.setSoulFood(inputs[0]);
        testCase.setCodingScore(Integer.parseInt(inputs[1]));
        return testCase;
    }
    public static int test(String[] info, String query){
        int count = 0;
        TestCase testCase = splitQuery(query);
        for(int i=0; i<info.length; i++){
            String[] infos = info[i].split(" ");
            boolean passLanguage, passPosition, passCareer, passSoulFood, passCodingScore;
            passLanguage = testCase.test(testCase.getLanguage(),infos[0]);
            passPosition = testCase.test(testCase.getPosition(),infos[1]);
            passCareer = testCase.test(testCase.getCareer(),infos[2]);
            passSoulFood = testCase.test(testCase.getSoulFood(),infos[3]);
            passCodingScore = testCase.test(testCase.getCodingScore(),Integer.parseInt(infos[4]));
            if(passLanguage && passPosition && passCareer && passSoulFood && passCodingScore){
                count++;
            }
        }
        return count;
    }
}
class TestCase{

   private String language;
   private String position;
   private String career;
   private String soulFood;
   private int codingScore;

   public boolean test(Object tester,Object param){
    if(tester instanceof String){
        if(tester.equals(param) || tester.equals("-")){
            return true;
        } else {
            return false;
        }
    } else {
        if((int)param >= (int)tester){
            return true;
        } else {
            return false;
        }
    }

   }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getSoulFood() {
        return soulFood;
    }

    public void setSoulFood(String soulFood) {
        this.soulFood = soulFood;
    }

    public int getCodingScore() {
        return codingScore;
    }

    public void setCodingScore(int codingScore) {
        this.codingScore = codingScore;
    }
}
