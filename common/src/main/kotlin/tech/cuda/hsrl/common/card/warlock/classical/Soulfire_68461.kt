package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Soulfire_68461 : Card() {
    override val id = 68461
    override val name = "灵魂之火"
    override val description = "造成 4点伤害，随机弃一 张牌。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "是把别人的灵魂点燃？还是用自己的灵魂把别人点燃？这似乎是有很大区别的。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/035b48e2d91ca5742ec117197e301931ad9664e4dcb64b33df3da9c2ca01b8e6.png"
}
