package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FencingCoach_2581 : Card() {
    override val id = 2581
    override val name = "击剑教头"
    override val description = "<b>战吼：</b>你的下一个英雄技能的法力值消耗减少（2）点。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "击剑也是有技巧的，不过兽人完全不在意这一点。"
    override val artist = "Howard Lyon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/afbc85b748272eb8f56a5c3df889c74ef034cf3292af73dcaf22651cdd9a2965.png"
}
