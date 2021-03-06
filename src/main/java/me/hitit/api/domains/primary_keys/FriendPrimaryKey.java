package me.hitit.api.domains.primary_keys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.hitit.api.domains.User;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FriendPrimaryKey implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne()
    @JoinColumn(name = "tuidx")
    private User targetUser;

    @ManyToOne()
    @JoinColumn(name = "fuidx")
    private User friendUser;
}
