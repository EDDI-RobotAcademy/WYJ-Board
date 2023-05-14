package com.example.springPart.board.service;

import com.example.springPart.board.controller.form.WriteBoardRequestForm;
import com.example.springPart.board.entity.Board;
import com.example.springPart.board.entity.Content;
import com.example.springPart.board.repository.BoardRepository;
import com.example.springPart.board.repository.ContentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
    final private BoardRepository boardRepository;
    final private ContentRepository contentRepository;

    @Override
    public Board writeBoard(WriteBoardRequestForm requestForm) {
        Board board = requestForm.toBoard();

        contentRepository.save(board.getContent());
        return boardRepository.save(board);
    }
}
