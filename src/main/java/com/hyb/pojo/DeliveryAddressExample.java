package com.hyb.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeliveryAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliveryAddressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDnameIsNull() {
            addCriterion("dname is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("dname is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("dname =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("dname <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("dname >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("dname >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("dname <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("dname <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("dname like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("dname not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("dname in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("dname not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("dname between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("dname not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDtelphoneIsNull() {
            addCriterion("dtelphone is null");
            return (Criteria) this;
        }

        public Criteria andDtelphoneIsNotNull() {
            addCriterion("dtelphone is not null");
            return (Criteria) this;
        }

        public Criteria andDtelphoneEqualTo(String value) {
            addCriterion("dtelphone =", value, "dtelphone");
            return (Criteria) this;
        }

        public Criteria andDtelphoneNotEqualTo(String value) {
            addCriterion("dtelphone <>", value, "dtelphone");
            return (Criteria) this;
        }

        public Criteria andDtelphoneGreaterThan(String value) {
            addCriterion("dtelphone >", value, "dtelphone");
            return (Criteria) this;
        }

        public Criteria andDtelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("dtelphone >=", value, "dtelphone");
            return (Criteria) this;
        }

        public Criteria andDtelphoneLessThan(String value) {
            addCriterion("dtelphone <", value, "dtelphone");
            return (Criteria) this;
        }

        public Criteria andDtelphoneLessThanOrEqualTo(String value) {
            addCriterion("dtelphone <=", value, "dtelphone");
            return (Criteria) this;
        }

        public Criteria andDtelphoneLike(String value) {
            addCriterion("dtelphone like", value, "dtelphone");
            return (Criteria) this;
        }

        public Criteria andDtelphoneNotLike(String value) {
            addCriterion("dtelphone not like", value, "dtelphone");
            return (Criteria) this;
        }

        public Criteria andDtelphoneIn(List<String> values) {
            addCriterion("dtelphone in", values, "dtelphone");
            return (Criteria) this;
        }

        public Criteria andDtelphoneNotIn(List<String> values) {
            addCriterion("dtelphone not in", values, "dtelphone");
            return (Criteria) this;
        }

        public Criteria andDtelphoneBetween(String value1, String value2) {
            addCriterion("dtelphone between", value1, value2, "dtelphone");
            return (Criteria) this;
        }

        public Criteria andDtelphoneNotBetween(String value1, String value2) {
            addCriterion("dtelphone not between", value1, value2, "dtelphone");
            return (Criteria) this;
        }

        public Criteria andDaddressIsNull() {
            addCriterion("daddress is null");
            return (Criteria) this;
        }

        public Criteria andDaddressIsNotNull() {
            addCriterion("daddress is not null");
            return (Criteria) this;
        }

        public Criteria andDaddressEqualTo(String value) {
            addCriterion("daddress =", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotEqualTo(String value) {
            addCriterion("daddress <>", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressGreaterThan(String value) {
            addCriterion("daddress >", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressGreaterThanOrEqualTo(String value) {
            addCriterion("daddress >=", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressLessThan(String value) {
            addCriterion("daddress <", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressLessThanOrEqualTo(String value) {
            addCriterion("daddress <=", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressLike(String value) {
            addCriterion("daddress like", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotLike(String value) {
            addCriterion("daddress not like", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressIn(List<String> values) {
            addCriterion("daddress in", values, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotIn(List<String> values) {
            addCriterion("daddress not in", values, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressBetween(String value1, String value2) {
            addCriterion("daddress between", value1, value2, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotBetween(String value1, String value2) {
            addCriterion("daddress not between", value1, value2, "daddress");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}