package com.study.board.controller.Service;

import com.study.board.controller.Repository.BoardRepository;
import com.study.board.controller.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    BoardRepository boardRepository;

    public void write(Board board) {
        boardRepository.save(board);
    }

    public List<Board> boardList() {
        return boardRepository.findAll();
    }
}
