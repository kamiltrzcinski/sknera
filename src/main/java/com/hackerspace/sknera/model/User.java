package com.hackerspace.sknera.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@Data
@Entity
@EqualsAndHashCode
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final String memberId;

    private final boolean active;

    private final String slackUserName;

    private final String name;

    private final String surname;

    private final String address;

    private final boolean isStudent;

    private final boolean isBigFish;

}
