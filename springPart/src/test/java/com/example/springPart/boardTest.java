package com.example.springPart;

import com.example.springPart.board.controller.form.WriteBoardRequestForm;
import com.example.springPart.board.entity.Board;
import com.example.springPart.board.repository.BoardRepository;
import com.example.springPart.board.service.BoardService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class boardTest {
    @Autowired
    BoardService boardService;

    @Test
    @DisplayName("게시글을 작성 합니다.")
    void 게시글_작성() {
        final Long AUTHORID = 0L;
        final String TITLE = "오리가 추우면?";
        final String CONTENT = "언덕";

        WriteBoardRequestForm writeBoardRequestForm = new WriteBoardRequestForm(AUTHORID, TITLE, CONTENT);
        Board writedBoard =  boardService.writeBoard(writeBoardRequestForm);
        System.out.println(writedBoard);

        assertEquals(AUTHORID, writedBoard.getAuthor());
        System.out.println(writedBoard.getAuthor());
        assertEquals(TITLE, writedBoard.getTitle());
        System.out.println(writedBoard.getTitle());
        assertEquals(CONTENT, writedBoard.getContent().getContent());
    }
}
