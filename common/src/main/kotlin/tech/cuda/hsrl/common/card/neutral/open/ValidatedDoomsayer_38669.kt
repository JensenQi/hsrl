package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ValidatedDoomsayer_38669 : Card() {
    override val id = 38669
    override val name = "末日践行者"
    override val description = "在你的回合开始时，将该随从的攻击力 变为7。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "上古之神的出现让他自我感觉变得越来越好……当然，他也很怀念过去开载人收割机的那段美好时光。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8d0f2e378ae22f7d7d9dcdc386aaf74deb825128070dd80c1a5487b8ee45d8b4.png"
}
