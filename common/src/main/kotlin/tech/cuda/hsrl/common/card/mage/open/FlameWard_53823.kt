package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlameWard_53823 : Card() {
    override val id = 53823
    override val name = "火焰结界"
    override val description = "<b>奥秘：</b>在一个随从攻击你的英雄后，对所有敌方随从造成 3点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "小心玩火，殃及四邻。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ab07212bea73843ce28aa1abb1dda6c6f1400309a4f91de68f0dda8893749b39.png"
}
