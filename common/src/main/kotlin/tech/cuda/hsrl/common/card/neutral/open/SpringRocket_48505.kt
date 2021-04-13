package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpringRocket_48505 : Card() {
    override val id = 48505
    override val name = "弹簧火箭犬"
    override val description = "<b>战吼：</b>造成2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "自从有了火箭做推进器，弹簧就成为了过去式。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/32b39e47563753abaf8c381062d044c95f329b61b4a6344b4d7d5cfba3c94cac.png"
}
