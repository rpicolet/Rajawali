package c.org.rajawali3d.scene.graph;

import android.support.annotation.NonNull;
import c.org.rajawali3d.annotations.RequiresReadLock;
import c.org.rajawali3d.annotations.RequiresWriteLock;
import c.org.rajawali3d.bounds.AABB;

import java.util.Collection;

/**
 * Interface defining methods common to all {@link SceneGraph} implementations. Implementations are expected to be
 * thread safe and protected via a Reentrant Read-Write system.
 *
 * @author Jared Woolston (Jared.Woolston@gmail.com)
 *
 * //TODO: I doubt this needs to be its own interface.
 */
public interface SceneGraph extends NodeParent, AABB {

    @RequiresWriteLock boolean add(@NonNull SceneNode node);

    @RequiresWriteLock boolean addAll(@NonNull Collection<? extends SceneNode> collection);

    @RequiresWriteLock void clear();

    @RequiresReadLock boolean contains(@NonNull SceneNode node);

    @RequiresReadLock boolean containsAll(@NonNull Collection<? extends SceneNode> collection);

    @RequiresReadLock boolean isEmpty();

    @RequiresWriteLock boolean remove(@NonNull SceneNode node);

    @RequiresWriteLock boolean removeAll(@NonNull Collection<? extends SceneNode> collection);

    @RequiresWriteLock boolean retainAll(@NonNull Collection<? extends SceneNode> collection);

    @RequiresReadLock int size();
}
