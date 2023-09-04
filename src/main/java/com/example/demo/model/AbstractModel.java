package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;


import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@MappedSuperclass

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)

public class AbstractModel implements Serializable {
	@Id
	private Long id;
	@LastModifiedDate
	protected Date lastUpdate;

	@LastModifiedBy
	protected String lastModifiedBy;

	@CreatedDate
	protected Date createDate;

	@CreatedBy
	protected String createdBy;

	@Version
	protected long rowVersion;
}
