package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NecroticGeist_45307 : Card() {
    override val id = 45307
    override val name = "死灵恶鬼"
    override val description = "每当你的其他随从死亡时，召唤一个2/2的食尸鬼。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "以眼换眼，以鬼换鬼。"
    override val artist = "Ian Ameling"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c6a22abe88d033fc4393bc9d8052ae01353abbddd4717ba85dca1c843c9ce52f.png"
}
