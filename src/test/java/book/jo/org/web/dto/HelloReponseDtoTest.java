package book.jo.org.web.dto;


import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloReponseDtoTest{

    @Test
    public void 롬복_기능_테스트(){

        //given 준비
        String name = "test";
        int amount = 1000;

        //when 실행
        HelloReponseDto dto = new HelloReponseDto(name,amount);

        //then 검증
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}