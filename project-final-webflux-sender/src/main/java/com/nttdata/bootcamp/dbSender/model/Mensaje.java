package com.nttdata.bootcamp.dbSender.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;

@Document(collection = "mensaje")
@Builder
public class Mensaje {
	long id_msg;
	String msg;

	/**
	 * @return the id_msg
	 */

	@Id
	public long getId_msg() {
		return id_msg;
	}

	/**
	 * @param id_msg the id_msg to set
	 */
	public void setId_msg(long id_msg) {
		this.id_msg = id_msg;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Mensaje [id_msg=" + id_msg + ", msg=" + msg + "]";
	}
}
