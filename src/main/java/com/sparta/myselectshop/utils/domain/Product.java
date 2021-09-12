package com.sparta.myselectshop.utils.domain;


import com.sparta.myselectshop.models.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

// Product : 관심 상품 테이블
@Entity
@NoArgsConstructor // 기본생성자를 만듭니다.
@Getter
public class Product extends Timestamped {
}
