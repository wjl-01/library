package org.assien.library.modules.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtQueryChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.assien.library.modules.user.entity.User;
import org.assien.library.modules.user.mapper.UserMapper;
import org.assien.library.modules.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author ：WUJILIANG
 * @date ：2021/7/29 16:15
 * @description：用户
 * @version: 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public boolean save(User entity) {
        return UserService.super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<User> entityList) {
        return UserService.super.saveBatch(entityList);
    }

    @Override
    public boolean saveBatch(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList) {
        return UserService.super.saveOrUpdateBatch(entityList);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean removeById(Serializable id) {
        return UserService.super.removeById(id);
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return UserService.super.removeByMap(columnMap);
    }

    @Override
    public boolean remove(Wrapper<User> queryWrapper) {
        return UserService.super.remove(queryWrapper);
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return UserService.super.removeByIds(idList);
    }

    @Override
    public boolean updateById(User entity) {
        return UserService.super.updateById(entity);
    }

    @Override
    public boolean update(Wrapper<User> updateWrapper) {
        return UserService.super.update(updateWrapper);
    }

    @Override
    public boolean update(User entity, Wrapper<User> updateWrapper) {
        return UserService.super.update(entity, updateWrapper);
    }

    @Override
    public boolean updateBatchById(Collection<User> entityList) {
        return UserService.super.updateBatchById(entityList);
    }

    @Override
    public boolean updateBatchById(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(User entity) {
        return false;
    }

    @Override
    public User getById(Serializable id) {
        return UserService.super.getById(id);
    }

    @Override
    public List<User> listByIds(Collection<? extends Serializable> idList) {
        return UserService.super.listByIds(idList);
    }

    @Override
    public List<User> listByMap(Map<String, Object> columnMap) {
        return UserService.super.listByMap(columnMap);
    }

    @Override
    public User getOne(Wrapper<User> queryWrapper) {
        return UserService.super.getOne(queryWrapper);
    }

    @Override
    public User getOne(Wrapper<User> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<User> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count() {
        return UserService.super.count();
    }

    @Override
    public int count(Wrapper<User> queryWrapper) {
        return UserService.super.count(queryWrapper);
    }

    @Override
    public List<User> list(Wrapper<User> queryWrapper) {
        return UserService.super.list(queryWrapper);
    }

    @Override
    public List<User> list() {
        return UserService.super.list();
    }

    @Override
    public <E extends IPage<User>> E page(E page, Wrapper<User> queryWrapper) {
        return UserService.super.page(page, queryWrapper);
    }

    @Override
    public <E extends IPage<User>> E page(E page) {
        return UserService.super.page(page);
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<User> queryWrapper) {
        return UserService.super.listMaps(queryWrapper);
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return UserService.super.listMaps();
    }

    @Override
    public List<Object> listObjs() {
        return UserService.super.listObjs();
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return UserService.super.listObjs(mapper);
    }

    @Override
    public List<Object> listObjs(Wrapper<User> queryWrapper) {
        return UserService.super.listObjs(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<User> queryWrapper, Function<? super Object, V> mapper) {
        return UserService.super.listObjs(queryWrapper, mapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<User> queryWrapper) {
        return UserService.super.pageMaps(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return UserService.super.pageMaps(page);
    }


    @Override
    public Class<User> getEntityClass() {
        return null;
    }

    @Override
    public QueryChainWrapper<User> query() {
        return UserService.super.query();
    }

    @Override
    public LambdaQueryChainWrapper<User> lambdaQuery() {
        return UserService.super.lambdaQuery();
    }

    @Override
    public KtQueryChainWrapper<User> ktQuery() {
        return UserService.super.ktQuery();
    }

    @Override
    public KtUpdateChainWrapper<User> ktUpdate() {
        return UserService.super.ktUpdate();
    }

    @Override
    public UpdateChainWrapper<User> update() {
        return UserService.super.update();
    }

    @Override
    public LambdaUpdateChainWrapper<User> lambdaUpdate() {
        return UserService.super.lambdaUpdate();
    }

    @Override
    public boolean saveOrUpdate(User entity, Wrapper<User> updateWrapper) {
        return UserService.super.saveOrUpdate(entity, updateWrapper);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
