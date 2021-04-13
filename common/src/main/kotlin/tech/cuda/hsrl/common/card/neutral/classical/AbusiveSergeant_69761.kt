package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AbusiveSergeant_69761 : Card() {
    override val id = 69761
    override val name = "叫嚣的中士"
    override val description = "<b>战吼：</b>在本回合中，使一个随从获得+2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“把我加入你的套牌，白痴！”"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a5c25ccd328f4405d0efd6b732a89679af85f7f0635686c4e3b6ca19a821046c.png"
}
