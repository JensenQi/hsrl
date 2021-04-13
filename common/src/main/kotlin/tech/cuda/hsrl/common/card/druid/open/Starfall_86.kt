package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Starfall_86 : Card() {
    override val id = 86
    override val name = "星辰坠落"
    override val description = "<b>抉择：</b>对一个随从造成 5点伤害；或者对所有敌方随从造成 2点伤害。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy3
    override val background = "天塌下来了吗？是的。一点一点塌下来了。"
    override val artist = "Richard Wright"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d5a8ce49e69b79e79b1daf35ccef4f422c38d606dc350262dde5f002a84bba08.png"
}
