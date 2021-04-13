package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Brukan_63074 : Card() {
    override val id = 63074
    override val name = "布鲁坎"
    override val description = "<b>自然法术伤害+3</b>"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "布鲁坎人老体衰，自觉大限将至。然而在教导洛卡拉这样的勇士时，他又找回了对未来的希望。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0932c7313d0edf7fc20b2429f0e6a6b90f9575f5de8b59ef7a2696a2ae367c3b.png"
}
