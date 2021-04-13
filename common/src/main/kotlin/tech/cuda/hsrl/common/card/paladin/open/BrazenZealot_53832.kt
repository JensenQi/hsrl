package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BrazenZealot_53832 : Card() {
    override val id = 53832
    override val name = "英勇狂热者"
    override val description = "每当你召唤一个随从，获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "圣光晒多了，火气也大。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/066bb5df261513c55e5a7d9e7a7cd1d62d76a16cf751ca7dd0e76b7cb81d1089.png"
}
