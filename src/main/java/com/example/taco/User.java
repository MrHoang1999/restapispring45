package com.example.taco;
import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.AccessLevel;
//may cai nay import de sinh tu dong csdl voi khoi tao cac ham get/set thoi
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue
	private final String id = "";
	private final String name = "";
}
