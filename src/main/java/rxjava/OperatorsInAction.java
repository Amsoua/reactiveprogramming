package rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.Comparator;
import java.util.List;

public class OperatorsInAction {

    public static void main(String[] args) {
        Observable<Employee> source = Observable.just(
                new Employee(102,"Amadou", 100000, 5.0),
                new Employee(123,"John", 92000, 4.0),
                new Employee(113,"Moussa", 89000, 4.1),
                new Employee(201,"Maria", 75000, 3.9),
                new Employee(300,"Jane", 78000, 4.5),
                new Employee(231,"Rick", 56000, 4.2),
                new Employee(412,"Jimmy", 67000, 4.7)
        );

        source.filter(e -> e.getRating() > 4.0)
                .sorted(Comparator.comparingDouble(Employee::getRating))
                .map(Employee::getName)
                .take(4)
                //.toList()
                .subscribe(System.out::println);

        List<Integer> expenses = List.of(230, 400, 190, 590, 640, 345, 700, 809);

        Observable.fromIterable(expenses).scan((a,b)-> a+b)
                .subscribe(System.out::println);;

    }
}
