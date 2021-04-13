package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FarSight_818 : Card() {
    override val id = 818
    override val name = "视界术"
    override val description = "抽一张牌，该牌的法力值消耗减少（3）点。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "德雷克塔尔失明了，但他依然能够看见很多东西。你懂得我的意思吗？你懂得用心灵去观察吗？"
    override val artist = "Lars Grant-West"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/99631b063611115ece5028aa9686c9bd7467eaf7e29a7b4ca4bd7e03096fa6f0.png"
}
