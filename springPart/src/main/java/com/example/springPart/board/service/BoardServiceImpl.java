package com.example.springPart.board.service;

import com.example.springPart.board.controller.form.WriteBoardRequestForm;
import com.example.springPart.board.entity.Board;
import com.example.springPart.board.repository.BoardRepository;
import com.example.springPart.board.repository.ContentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
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

    @Override
    public void delete(Long boardId) {
        Optional<Board> maybeBoard = boardRepository.findById(boardId);
        if(maybeBoard.isEmpty()) {
            log.debug("존재하지 않는 게시물 입니다.");
            return;
        }
        Board board = maybeBoard.get();
        boardRepository.delete(board);
    }
}
