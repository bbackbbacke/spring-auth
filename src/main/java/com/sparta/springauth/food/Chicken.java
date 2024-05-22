package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//component는 개발자가 직접 작성한 Class를 Bean으로 만드는 것. = 이 클래스를 정의했으니 빈으로 등록하라.
@Component

//같은 타입의 빈 중에서 메인 값으로 설정해줌! 그래서 Test코드 쓸 때 Food food; 했고 food에 피자와 치킨이 둘 다 있지만 치킨에 @Primary를 붙여줌으로서 기본적으로 치킨값이 들어감. Food food; 가 오류가 안나게 됨.
@Primary

//implements는 구현하다는 뜻으로 인터페이스 내부의 추상메서드를 완성해준다.
public class Chicken implements Food {

    //override는 상속 관계에 있는 부모 클래스에서 이미 정의된 메소드를 자식 클래스에서 같은 시그니쳐를 갖는 메소드로 다시 정의
    @Override
    public void eat() {
        System.out.println("치킨을 먹습니다.");
    }
}