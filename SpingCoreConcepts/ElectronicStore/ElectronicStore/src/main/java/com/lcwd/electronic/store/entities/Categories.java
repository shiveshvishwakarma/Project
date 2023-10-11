package com.lcwd.electronic.store.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @Column(name = "id")
    private String categoriesId;

    @Column(name = "category_title",length = 60)
    private String title;

    @Column(name = "category_desc", length = 50)
    private String description;

    private String coverImage;
    // other attributes if yoy have

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Product> products= new ArrayList<>();
}
