package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpitefulSmith_61 : Card() {
    override val id = 61
    override val name = "恶毒铁匠"
    override val description = "该随从受伤时使你的武器获得+2攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "她会为你代工一把好武器，但是你必须给她5个铁锭，3个土之微粒，以及她上一个顾客的头皮。"
    override val artist = "Justin Sweet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a7c257a3391e28f08a5be6543b4df779fc5a9bdbb9f0b890abaa5262f6f12997.png"
}
