package com.kgc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReleaseeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReleaseeExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNull() {
            addCriterion("gradeid is null");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNotNull() {
            addCriterion("gradeid is not null");
            return (Criteria) this;
        }

        public Criteria andGradeidEqualTo(Integer value) {
            addCriterion("gradeid =", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotEqualTo(Integer value) {
            addCriterion("gradeid <>", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThan(Integer value) {
            addCriterion("gradeid >", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gradeid >=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThan(Integer value) {
            addCriterion("gradeid <", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThanOrEqualTo(Integer value) {
            addCriterion("gradeid <=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidIn(List<Integer> values) {
            addCriterion("gradeid in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotIn(List<Integer> values) {
            addCriterion("gradeid not in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidBetween(Integer value1, Integer value2) {
            addCriterion("gradeid between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("gradeid not between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andReltitleIsNull() {
            addCriterion("reltitle is null");
            return (Criteria) this;
        }

        public Criteria andReltitleIsNotNull() {
            addCriterion("reltitle is not null");
            return (Criteria) this;
        }

        public Criteria andReltitleEqualTo(String value) {
            addCriterion("reltitle =", value, "reltitle");
            return (Criteria) this;
        }

        public Criteria andReltitleNotEqualTo(String value) {
            addCriterion("reltitle <>", value, "reltitle");
            return (Criteria) this;
        }

        public Criteria andReltitleGreaterThan(String value) {
            addCriterion("reltitle >", value, "reltitle");
            return (Criteria) this;
        }

        public Criteria andReltitleGreaterThanOrEqualTo(String value) {
            addCriterion("reltitle >=", value, "reltitle");
            return (Criteria) this;
        }

        public Criteria andReltitleLessThan(String value) {
            addCriterion("reltitle <", value, "reltitle");
            return (Criteria) this;
        }

        public Criteria andReltitleLessThanOrEqualTo(String value) {
            addCriterion("reltitle <=", value, "reltitle");
            return (Criteria) this;
        }

        public Criteria andReltitleLike(String value) {
            addCriterion("reltitle like", value, "reltitle");
            return (Criteria) this;
        }

        public Criteria andReltitleNotLike(String value) {
            addCriterion("reltitle not like", value, "reltitle");
            return (Criteria) this;
        }

        public Criteria andReltitleIn(List<String> values) {
            addCriterion("reltitle in", values, "reltitle");
            return (Criteria) this;
        }

        public Criteria andReltitleNotIn(List<String> values) {
            addCriterion("reltitle not in", values, "reltitle");
            return (Criteria) this;
        }

        public Criteria andReltitleBetween(String value1, String value2) {
            addCriterion("reltitle between", value1, value2, "reltitle");
            return (Criteria) this;
        }

        public Criteria andReltitleNotBetween(String value1, String value2) {
            addCriterion("reltitle not between", value1, value2, "reltitle");
            return (Criteria) this;
        }

        public Criteria andRelneiIsNull() {
            addCriterion("relnei is null");
            return (Criteria) this;
        }

        public Criteria andRelneiIsNotNull() {
            addCriterion("relnei is not null");
            return (Criteria) this;
        }

        public Criteria andRelneiEqualTo(String value) {
            addCriterion("relnei =", value, "relnei");
            return (Criteria) this;
        }

        public Criteria andRelneiNotEqualTo(String value) {
            addCriterion("relnei <>", value, "relnei");
            return (Criteria) this;
        }

        public Criteria andRelneiGreaterThan(String value) {
            addCriterion("relnei >", value, "relnei");
            return (Criteria) this;
        }

        public Criteria andRelneiGreaterThanOrEqualTo(String value) {
            addCriterion("relnei >=", value, "relnei");
            return (Criteria) this;
        }

        public Criteria andRelneiLessThan(String value) {
            addCriterion("relnei <", value, "relnei");
            return (Criteria) this;
        }

        public Criteria andRelneiLessThanOrEqualTo(String value) {
            addCriterion("relnei <=", value, "relnei");
            return (Criteria) this;
        }

        public Criteria andRelneiLike(String value) {
            addCriterion("relnei like", value, "relnei");
            return (Criteria) this;
        }

        public Criteria andRelneiNotLike(String value) {
            addCriterion("relnei not like", value, "relnei");
            return (Criteria) this;
        }

        public Criteria andRelneiIn(List<String> values) {
            addCriterion("relnei in", values, "relnei");
            return (Criteria) this;
        }

        public Criteria andRelneiNotIn(List<String> values) {
            addCriterion("relnei not in", values, "relnei");
            return (Criteria) this;
        }

        public Criteria andRelneiBetween(String value1, String value2) {
            addCriterion("relnei between", value1, value2, "relnei");
            return (Criteria) this;
        }

        public Criteria andRelneiNotBetween(String value1, String value2) {
            addCriterion("relnei not between", value1, value2, "relnei");
            return (Criteria) this;
        }

        public Criteria andReldateIsNull() {
            addCriterion("reldate is null");
            return (Criteria) this;
        }

        public Criteria andReldateIsNotNull() {
            addCriterion("reldate is not null");
            return (Criteria) this;
        }

        public Criteria andReldateEqualTo(Date value) {
            addCriterion("reldate =", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateNotEqualTo(Date value) {
            addCriterion("reldate <>", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateGreaterThan(Date value) {
            addCriterion("reldate >", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateGreaterThanOrEqualTo(Date value) {
            addCriterion("reldate >=", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateLessThan(Date value) {
            addCriterion("reldate <", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateLessThanOrEqualTo(Date value) {
            addCriterion("reldate <=", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateIn(List<Date> values) {
            addCriterion("reldate in", values, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateNotIn(List<Date> values) {
            addCriterion("reldate not in", values, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateBetween(Date value1, Date value2) {
            addCriterion("reldate between", value1, value2, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateNotBetween(Date value1, Date value2) {
            addCriterion("reldate not between", value1, value2, "reldate");
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