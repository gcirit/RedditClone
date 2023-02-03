package com.gcirit.springredditclone.repository;

import com.gcirit.springredditclone.model.Post;
import com.gcirit.springredditclone.model.User;
import com.gcirit.springredditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
