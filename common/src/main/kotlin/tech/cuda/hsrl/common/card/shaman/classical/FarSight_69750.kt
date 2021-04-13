package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FarSight_69750 : Card() {
    override val id = 69750
    override val name = "视界术"
    override val description = "抽一张牌，该牌的法力值消耗减少（3）点。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "德雷克塔尔失明了，但他依然能够看见很多东西。你懂得我的意思吗？你懂得用心灵去观察吗？"
    override val artist = "Lars Grant-West"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d3f693e1c1e6cb0be67587f10745519a603479a1d30cf48a6304092cf98059f8.png"
}
