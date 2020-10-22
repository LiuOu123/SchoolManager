package com.kgc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorksExample() {
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

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Integer value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Integer value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Integer value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Integer value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Integer value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Integer> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Integer> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Integer value1, Integer value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Integer value1, Integer value2) {
            addCriterion("wid not between", value1, value2, "wid");
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

        public Criteria andRelidIsNull() {
            addCriterion("relid is null");
            return (Criteria) this;
        }

        public Criteria andRelidIsNotNull() {
            addCriterion("relid is not null");
            return (Criteria) this;
        }

        public Criteria andRelidEqualTo(Integer value) {
            addCriterion("relid =", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidNotEqualTo(Integer value) {
            addCriterion("relid <>", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidGreaterThan(Integer value) {
            addCriterion("relid >", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("relid >=", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidLessThan(Integer value) {
            addCriterion("relid <", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidLessThanOrEqualTo(Integer value) {
            addCriterion("relid <=", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidIn(List<Integer> values) {
            addCriterion("relid in", values, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidNotIn(List<Integer> values) {
            addCriterion("relid not in", values, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidBetween(Integer value1, Integer value2) {
            addCriterion("relid between", value1, value2, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidNotBetween(Integer value1, Integer value2) {
            addCriterion("relid not between", value1, value2, "relid");
            return (Criteria) this;
        }

        public Criteria andWortitleIsNull() {
            addCriterion("wortitle is null");
            return (Criteria) this;
        }

        public Criteria andWortitleIsNotNull() {
            addCriterion("wortitle is not null");
            return (Criteria) this;
        }

        public Criteria andWortitleEqualTo(String value) {
            addCriterion("wortitle =", value, "wortitle");
            return (Criteria) this;
        }

        public Criteria andWortitleNotEqualTo(String value) {
            addCriterion("wortitle <>", value, "wortitle");
            return (Criteria) this;
        }

        public Criteria andWortitleGreaterThan(String value) {
            addCriterion("wortitle >", value, "wortitle");
            return (Criteria) this;
        }

        public Criteria andWortitleGreaterThanOrEqualTo(String value) {
            addCriterion("wortitle >=", value, "wortitle");
            return (Criteria) this;
        }

        public Criteria andWortitleLessThan(String value) {
            addCriterion("wortitle <", value, "wortitle");
            return (Criteria) this;
        }

        public Criteria andWortitleLessThanOrEqualTo(String value) {
            addCriterion("wortitle <=", value, "wortitle");
            return (Criteria) this;
        }

        public Criteria andWortitleLike(String value) {
            addCriterion("wortitle like", value, "wortitle");
            return (Criteria) this;
        }

        public Criteria andWortitleNotLike(String value) {
            addCriterion("wortitle not like", value, "wortitle");
            return (Criteria) this;
        }

        public Criteria andWortitleIn(List<String> values) {
            addCriterion("wortitle in", values, "wortitle");
            return (Criteria) this;
        }

        public Criteria andWortitleNotIn(List<String> values) {
            addCriterion("wortitle not in", values, "wortitle");
            return (Criteria) this;
        }

        public Criteria andWortitleBetween(String value1, String value2) {
            addCriterion("wortitle between", value1, value2, "wortitle");
            return (Criteria) this;
        }

        public Criteria andWortitleNotBetween(String value1, String value2) {
            addCriterion("wortitle not between", value1, value2, "wortitle");
            return (Criteria) this;
        }

        public Criteria andWorneiIsNull() {
            addCriterion("wornei is null");
            return (Criteria) this;
        }

        public Criteria andWorneiIsNotNull() {
            addCriterion("wornei is not null");
            return (Criteria) this;
        }

        public Criteria andWorneiEqualTo(String value) {
            addCriterion("wornei =", value, "wornei");
            return (Criteria) this;
        }

        public Criteria andWorneiNotEqualTo(String value) {
            addCriterion("wornei <>", value, "wornei");
            return (Criteria) this;
        }

        public Criteria andWorneiGreaterThan(String value) {
            addCriterion("wornei >", value, "wornei");
            return (Criteria) this;
        }

        public Criteria andWorneiGreaterThanOrEqualTo(String value) {
            addCriterion("wornei >=", value, "wornei");
            return (Criteria) this;
        }

        public Criteria andWorneiLessThan(String value) {
            addCriterion("wornei <", value, "wornei");
            return (Criteria) this;
        }

        public Criteria andWorneiLessThanOrEqualTo(String value) {
            addCriterion("wornei <=", value, "wornei");
            return (Criteria) this;
        }

        public Criteria andWorneiLike(String value) {
            addCriterion("wornei like", value, "wornei");
            return (Criteria) this;
        }

        public Criteria andWorneiNotLike(String value) {
            addCriterion("wornei not like", value, "wornei");
            return (Criteria) this;
        }

        public Criteria andWorneiIn(List<String> values) {
            addCriterion("wornei in", values, "wornei");
            return (Criteria) this;
        }

        public Criteria andWorneiNotIn(List<String> values) {
            addCriterion("wornei not in", values, "wornei");
            return (Criteria) this;
        }

        public Criteria andWorneiBetween(String value1, String value2) {
            addCriterion("wornei between", value1, value2, "wornei");
            return (Criteria) this;
        }

        public Criteria andWorneiNotBetween(String value1, String value2) {
            addCriterion("wornei not between", value1, value2, "wornei");
            return (Criteria) this;
        }

        public Criteria andWordateIsNull() {
            addCriterion("wordate is null");
            return (Criteria) this;
        }

        public Criteria andWordateIsNotNull() {
            addCriterion("wordate is not null");
            return (Criteria) this;
        }

        public Criteria andWordateEqualTo(Date value) {
            addCriterion("wordate =", value, "wordate");
            return (Criteria) this;
        }

        public Criteria andWordateNotEqualTo(Date value) {
            addCriterion("wordate <>", value, "wordate");
            return (Criteria) this;
        }

        public Criteria andWordateGreaterThan(Date value) {
            addCriterion("wordate >", value, "wordate");
            return (Criteria) this;
        }

        public Criteria andWordateGreaterThanOrEqualTo(Date value) {
            addCriterion("wordate >=", value, "wordate");
            return (Criteria) this;
        }

        public Criteria andWordateLessThan(Date value) {
            addCriterion("wordate <", value, "wordate");
            return (Criteria) this;
        }

        public Criteria andWordateLessThanOrEqualTo(Date value) {
            addCriterion("wordate <=", value, "wordate");
            return (Criteria) this;
        }

        public Criteria andWordateIn(List<Date> values) {
            addCriterion("wordate in", values, "wordate");
            return (Criteria) this;
        }

        public Criteria andWordateNotIn(List<Date> values) {
            addCriterion("wordate not in", values, "wordate");
            return (Criteria) this;
        }

        public Criteria andWordateBetween(Date value1, Date value2) {
            addCriterion("wordate between", value1, value2, "wordate");
            return (Criteria) this;
        }

        public Criteria andWordateNotBetween(Date value1, Date value2) {
            addCriterion("wordate not between", value1, value2, "wordate");
            return (Criteria) this;
        }

        public Criteria andIsverifyIsNull() {
            addCriterion("isverify is null");
            return (Criteria) this;
        }

        public Criteria andIsverifyIsNotNull() {
            addCriterion("isverify is not null");
            return (Criteria) this;
        }

        public Criteria andIsverifyEqualTo(Integer value) {
            addCriterion("isverify =", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyNotEqualTo(Integer value) {
            addCriterion("isverify <>", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyGreaterThan(Integer value) {
            addCriterion("isverify >", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("isverify >=", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyLessThan(Integer value) {
            addCriterion("isverify <", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyLessThanOrEqualTo(Integer value) {
            addCriterion("isverify <=", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyIn(List<Integer> values) {
            addCriterion("isverify in", values, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyNotIn(List<Integer> values) {
            addCriterion("isverify not in", values, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyBetween(Integer value1, Integer value2) {
            addCriterion("isverify between", value1, value2, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyNotBetween(Integer value1, Integer value2) {
            addCriterion("isverify not between", value1, value2, "isverify");
            return (Criteria) this;
        }

        public Criteria andWorimgIsNull() {
            addCriterion("worimg is null");
            return (Criteria) this;
        }

        public Criteria andWorimgIsNotNull() {
            addCriterion("worimg is not null");
            return (Criteria) this;
        }

        public Criteria andWorimgEqualTo(String value) {
            addCriterion("worimg =", value, "worimg");
            return (Criteria) this;
        }

        public Criteria andWorimgNotEqualTo(String value) {
            addCriterion("worimg <>", value, "worimg");
            return (Criteria) this;
        }

        public Criteria andWorimgGreaterThan(String value) {
            addCriterion("worimg >", value, "worimg");
            return (Criteria) this;
        }

        public Criteria andWorimgGreaterThanOrEqualTo(String value) {
            addCriterion("worimg >=", value, "worimg");
            return (Criteria) this;
        }

        public Criteria andWorimgLessThan(String value) {
            addCriterion("worimg <", value, "worimg");
            return (Criteria) this;
        }

        public Criteria andWorimgLessThanOrEqualTo(String value) {
            addCriterion("worimg <=", value, "worimg");
            return (Criteria) this;
        }

        public Criteria andWorimgLike(String value) {
            addCriterion("worimg like", value, "worimg");
            return (Criteria) this;
        }

        public Criteria andWorimgNotLike(String value) {
            addCriterion("worimg not like", value, "worimg");
            return (Criteria) this;
        }

        public Criteria andWorimgIn(List<String> values) {
            addCriterion("worimg in", values, "worimg");
            return (Criteria) this;
        }

        public Criteria andWorimgNotIn(List<String> values) {
            addCriterion("worimg not in", values, "worimg");
            return (Criteria) this;
        }

        public Criteria andWorimgBetween(String value1, String value2) {
            addCriterion("worimg between", value1, value2, "worimg");
            return (Criteria) this;
        }

        public Criteria andWorimgNotBetween(String value1, String value2) {
            addCriterion("worimg not between", value1, value2, "worimg");
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