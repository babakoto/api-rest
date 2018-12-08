package com.youngdev.apirest.model;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
public abstract class AuditModel implements Serializable {
    private Date createdAt;
    private Date updatedAt;
}
