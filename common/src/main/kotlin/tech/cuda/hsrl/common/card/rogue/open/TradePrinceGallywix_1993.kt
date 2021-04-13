package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TradePrinceGallywix_1993 : Card() {
    override val id = 1993
    override val name = "加里维克斯"
    override val description = "每当你的对手施放一个法术，获得该法术的复制，并使其获得一个幸运币。"
    override var cost: Int? = 6
    override var health: Int? = 8
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Gvg
    override val background = "供求关系是加里维克斯唯一的信条。只要你给钱，他就提供殴打服务。"
    override val artist = "Wei Wang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f81a84a0ceb59b77de346213073c378179eaa5d437f902a9f02f12fb24db43f5.png"
}
