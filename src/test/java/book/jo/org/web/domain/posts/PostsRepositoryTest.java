package book.jo.org.web.domain.posts;


import book.jo.org.domain.posts.Posts;
import book.jo.org.domain.posts.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

    // 게시글 저장된걸 불러오려면 우선 데이타가 있어야 함
    @Test
    public void 게시글저장_불러오기(){
        // given ( 준비 )
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("zzz@naver.com")
                .build());

        // when ( 실행 )
        List<Posts> postsList = postsRepository.findAll();

        //then ( 검증 )

        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);




    }


}
