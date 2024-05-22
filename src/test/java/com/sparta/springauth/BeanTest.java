package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

//SpringBootTest는 통합 테스트를 제공하는 기본적인 스프링 부트 테스트 어노테이션
@SpringBootTest
public class BeanTest {

//    @Autowired //Autowired는 기본적으로 Type(여기선 Food)로 Bean을 찾음! 그렇기 때문에 하나일 때만 가능한 것! 그런데 여기서는 Food에 pizza와 chicken이 두 개 걸려있으니까 Food food로는 불가능 한 것임. 같은 타입 Food안에 두 개가 있으니까 나 못골라. 니가 골라줘. 이런 거지
//    Food pizza; //Bean을 객체로 받을 때에는 소문자 시작!
//
//    @Autowired
//    Food chicken;

    @Autowired
    //Qualifier >>> Primary (Qualifier의 우선순위가 더 높음)
    //같은 타입의 Bean객체들이 여러개 있을 때에는 범용적으로 사용되는 Bean 객체에는 Primary, 지역적으로 사용되는 Bean 객체에는 Qualifier을 사용하는 것이 좋음
    //예를 들어 우리 식당에서 치킨의 매출이 95%다. -> Chicken쪽에 primary를 걸어주기.
    //=좁은 범위의 설정이 우선순위가 더 높다. 큰 범위의 설정이 우선순위가 더 낮다.
    @Qualifier("pizza") // Bean객체중에 primary로 지정이 안되어있지만 @Qulifier("빈빈빈") 빈빈빈에 해당 빈의 이름을 넣고 돌리면 같은 객체 값이어도 primary보다 먼저 선행해서 나오게 해줌
    Food food; //@Primary가 추가된다면 같은 타입의 빈이 있더라도 우선적으로 적용(Chicken class에 @Primary 적용함)

    @Test
    @DisplayName("테스트")
    void test1() {
//        pizza.eat();
//        chicken.eat();
        food.eat();
    }

}
