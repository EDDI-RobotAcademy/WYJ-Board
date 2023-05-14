package com.example.springPart;

import com.example.springPart.board.controller.form.WriteBoardRequestForm;
import com.example.springPart.board.entity.Board;
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
    @Transactional
    void 게시글_작성() {
        final Long ID = 0L;
        final String TITLE = "오리가 추우면?";
        final String CONTENT = "언덕";

        WriteBoardRequestForm writeBoardRequestForm = new WriteBoardRequestForm(ID, TITLE, CONTENT);
        Board writedBoard =  boardService.writeBoard(writeBoardRequestForm.toBoard);

        assertEquals(ID, writedBoard.getId());
        assertEquals(TITLE, writedBoard.getTitle());
        assertEquals(CONTENT, writedBoard.getContent().getContent());

    }
}
