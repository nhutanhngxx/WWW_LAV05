package vn.com.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import vn.com.iuh.fit.backend.ids.CandidateSkillId;

@Getter
@Setter
@Entity
@Table(name = "candidate_skill", schema = "works")
public class CandidateSkill {
    @EmbeddedId
    private CandidateSkillId id;

    @MapsId("canId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "can_id", nullable = false)
    private Candidate can;

    @MapsId("skillId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @Column(name = "more_infos", length = 1000)
    private String moreInfos;

    @Column(name = "skill_level", nullable = false)
    private Byte skillLevel;

}