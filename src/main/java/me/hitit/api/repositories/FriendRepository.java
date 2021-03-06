package me.hitit.api.repositories;

import me.hitit.api.domains.Friend;
import me.hitit.api.domains.primary_keys.FriendPrimaryKey;
import me.hitit.api.repositories.querydsls.interfaces.FriendQuerydslInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository<Friend, FriendPrimaryKey>, FriendQuerydslInterface {
}
