package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpitefulSmith_69763 : Card() {
    override val id = 69763
    override val name = "恶毒铁匠"
    override val description = "<b>激怒：</b>你的武器获得+2攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "她会为你代工一把好武器，但是你必须给她5个铁锭，3个土之微粒，以及她上一个顾客的头皮。"
    override val artist = "Justin Sweet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/732d4d7c04b240eeb38ea305b400e82473b1a1e5bd4796ace3c7ff2293cd8b9c.png"
}
