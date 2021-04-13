package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Crystalweaver_40391 : Card() {
    override val id = 40391
    override val name = "魔瘾结晶者"
    override val description = "<b>战吼：</b>使你的所有恶魔获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Msog
    override val background = "窍门就是将晶体泡在38度的热牛奶里一整夜。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68cf70dd8763109de2cc08f2504bf98a568fec467073a09694e537f97ad7bf85.png"
}
