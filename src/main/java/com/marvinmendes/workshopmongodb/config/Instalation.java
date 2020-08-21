package com.marvinmendes.workshopmongodb.config;

import com.marvinmendes.workshopmongodb.DTO.AuthorDTO;
import com.marvinmendes.workshopmongodb.domain.Post;
import com.marvinmendes.workshopmongodb.domain.User;
import com.marvinmendes.workshopmongodb.repository.PostRepository;
import com.marvinmendes.workshopmongodb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
@RequiredArgsConstructor
public class Instalation implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        postRepository.deleteAll();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        User andre = new User(null, "André Ribeiro", "andreribeiro@gmail.com");
        User carlos = new User(null, "Carlos Eduardo", "caroloseduardo@gmail.com");
        User fernando = new User(null, "Fernando Torres", "fernandotorres@gmail.com");
        userRepository.saveAll(Arrays.asList(andre, carlos, fernando));

        Post postOne = new Post(null, sdf.parse("21/08/2020"), "Saiu Álbum novo do The Killers!!!",
                "Rapaz, que belo dia para estar vivo. Ouvi a primeira música do disco e já estou empolgado.", new AuthorDTO(andre));
        Post postTwo = new Post(null, sdf.parse("20/08/2020"), "Cruzeirão cabuloso perdeu pra Chape...",
                "Eita que o cruzeiro começou a série B tal qual o galão começou a série A: ganhando os 3 primeiros jogos pra tomar na tarraqueta no 4° jogo....", new AuthorDTO(andre));

        postRepository.saveAll(Arrays.asList(postOne, postTwo));

        andre.getPosts().addAll(Arrays.asList(postOne, postTwo));
        userRepository.save(andre);

    }
}
