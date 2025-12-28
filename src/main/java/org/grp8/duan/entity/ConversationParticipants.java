package org.grp8.duan.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConversationParticipants {
    @EmbeddedId
    private ConversationParticipantId id;

    @ManyToOne
    @MapsId("conversationId")
    private Conversations conversation;

    @ManyToOne
    @MapsId("userId")
    private Users user;
}


