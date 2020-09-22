package com.example.generate;

import java.io.Serializable;
import lombok.Data;

/**
 * userlist
 * @author 
 */
@Data
public class Userlist implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}