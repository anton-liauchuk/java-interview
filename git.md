# Git
- [Различия между merge и rebase?](#различия-между-merge-и-rebase)
- [Что такое reset?](#что-такое-reset)
- [Различия между soft reset и hard reset?](#различия-между-soft-reset-и-hard-reset)

## Различия между merge и rebase?
- Both commits D and E are still here, but we create merge commit M that inherits changes from both D and E. However, this creates diamond shape, which many people find very confusing.
- We create commit R, which actual file content is identical to that of merge commit M above. But, we get rid of commit E, like it never existed (denoted by dots - vanishing line). Because of this obliteration, E should be local to developer Ed and should have never been pushed to any other repository.
###### Relative links:
- https://stackoverflow.com/questions/16666089/whats-the-difference-between-git-merge-and-git-rebase

## Что такое reset?
git-reset - Reset current HEAD to the specified state
###### Relative links:
- https://git-scm.com/docs/git-reset
- https://www.atlassian.com/git/tutorials/undoing-changes/git-reset

## Различия между soft reset и hard reset?
- soft: uncommit changes, changes are left staged (index).
- mixed (default): uncommit + unstage changes, changes are left in working tree.
- hard: uncommit + unstage + delete changes, nothing left.
###### Relative links:
- https://stackoverflow.com/questions/3528245/whats-the-difference-between-git-reset-mixed-soft-and-hard
