package com.sebas.springboot.jpa.sprinboot_jpa.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Embeddable
public class Audit {
    @Column (name = "creat_at")
    private LocalDateTime creatAt;
    @Column (name = "update_at")
    private LocalDateTime updateAt ;

    @PrePersist
    public void prePersist () {
        System.out.println("Evento del cliclo de vida del obejto entity Pre-Percis");
        this.creatAt = LocalDateTime.now();
        }

    @PreUpdate
    public void preUpdate() {
        System.out.println("Evento del cliclo de vida del obejto entity Pre-Update");
        this.updateAt = LocalDateTime.now();
     }
     
 
    public LocalDateTime getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(LocalDateTime creatAt) {
        this.creatAt = creatAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
