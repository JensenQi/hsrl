package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RunedOrb_63056 : Card() {
    override val id = 63056
    override val name = "符文宝珠"
    override val description = "造成 2点伤害。<b>发现</b>一张法术牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "最危险的冬幕节饰品。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d7c6a5dd5a819201b9b23c2692fb686cc52ceb93f7c5d8a7cee76162e6eb3937.png"
}
