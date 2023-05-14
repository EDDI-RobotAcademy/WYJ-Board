package com.example.springPart.board.controller;

import com.example.springPart.board.controller.form.WriteBoardRequestForm;
import com.example.springPart.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    final private BoardService boardService;
    @PostMapping("/write-board")
    public Long writeBoard(WriteBoardRequestForm requestForm) {
        log.info("writeBoard()");
        Long boardId = boardService.writeBoard(requestForm).getId();
        return boardId;
    }
}
