package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaGeode_40381 : Card() {
    override val id = 40381
    override val name = "法力晶簇"
    override val description = "每当该随从获得治疗时，便召唤一颗2/2的水晶。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Msog
    override val background = "他真的会气炸，而你也真的会受伤。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7474f705debd5a562ebce45c262cd86d0692d8ea0479273ded59234cd54a980d.png"
}
