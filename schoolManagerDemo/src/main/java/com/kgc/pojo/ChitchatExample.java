package com.kgc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ChitchatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChitchatExample() {
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

        public Criteria andChidIsNull() {
            addCriterion("chid is null");
            return (Criteria) this;
        }

        public Criteria andChidIsNotNull() {
            addCriterion("chid is not null");
            return (Criteria) this;
        }

        public Criteria andChidEqualTo(Integer value) {
            addCriterion("chid =", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidNotEqualTo(Integer value) {
            addCriterion("chid <>", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidGreaterThan(Integer value) {
            addCriterion("chid >", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chid >=", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidLessThan(Integer value) {
            addCriterion("chid <", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidLessThanOrEqualTo(Integer value) {
            addCriterion("chid <=", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidIn(List<Integer> values) {
            addCriterion("chid in", values, "chid");
            return (Criteria) this;
        }

        public Criteria andChidNotIn(List<Integer> values) {
            addCriterion("chid not in", values, "chid");
            return (Criteria) this;
        }

        public Criteria andChidBetween(Integer value1, Integer value2) {
            addCriterion("chid between", value1, value2, "chid");
            return (Criteria) this;
        }

        public Criteria andChidNotBetween(Integer value1, Integer value2) {
            addCriterion("chid not between", value1, value2, "chid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andHaoidIsNull() {
            addCriterion("haoid is null");
            return (Criteria) this;
        }

        public Criteria andHaoidIsNotNull() {
            addCriterion("haoid is not null");
            return (Criteria) this;
        }

        public Criteria andHaoidEqualTo(Integer value) {
            addCriterion("haoid =", value, "haoid");
            return (Criteria) this;
        }

        public Criteria andHaoidNotEqualTo(Integer value) {
            addCriterion("haoid <>", value, "haoid");
            return (Criteria) this;
        }

        public Criteria andHaoidGreaterThan(Integer value) {
            addCriterion("haoid >", value, "haoid");
            return (Criteria) this;
        }

        public Criteria andHaoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("haoid >=", value, "haoid");
            return (Criteria) this;
        }

        public Criteria andHaoidLessThan(Integer value) {
            addCriterion("haoid <", value, "haoid");
            return (Criteria) this;
        }

        public Criteria andHaoidLessThanOrEqualTo(Integer value) {
            addCriterion("haoid <=", value, "haoid");
            return (Criteria) this;
        }

        public Criteria andHaoidIn(List<Integer> values) {
            addCriterion("haoid in", values, "haoid");
            return (Criteria) this;
        }

        public Criteria andHaoidNotIn(List<Integer> values) {
            addCriterion("haoid not in", values, "haoid");
            return (Criteria) this;
        }

        public Criteria andHaoidBetween(Integer value1, Integer value2) {
            addCriterion("haoid between", value1, value2, "haoid");
            return (Criteria) this;
        }

        public Criteria andHaoidNotBetween(Integer value1, Integer value2) {
            addCriterion("haoid not between", value1, value2, "haoid");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
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