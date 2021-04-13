package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IntrepidInitiate_58972 : Card() {
    override val id = 58972
    override val name = "新生刺头"
    override val description = "<b>法术迸发：</b>获得+2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "你还想有好果子吃？"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb1347b494823dc4f1188ebb1f22bb15d7e2751d4864bd56ec3532d8ce252c46.png"
}
