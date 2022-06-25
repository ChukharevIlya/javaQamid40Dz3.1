public class BonusMilesService {
    public int calculate(int cost) {
        int miles; // итоговое количество бонусных миль для клиента
        miles = cost / 20;
        return miles;
    }
}