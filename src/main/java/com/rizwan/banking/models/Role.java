package com.rizwan.banking.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role extends AbstractEntity{

    private String name;

    @OneToOne
    @JoinColumn(name= "is_user")
    private User user;
}
