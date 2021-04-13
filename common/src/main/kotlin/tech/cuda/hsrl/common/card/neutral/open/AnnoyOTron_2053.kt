package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnnoyOTron_2053 : Card() {
    override val id = 2053
    override val name = "吵吵机器人"
    override val description = "<b>嘲讽，圣盾</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "发明吵吵机器人的工程师先是被工匠学院立即开除，然后被赶出了工匠镇，最后被驱逐出了东部王国。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/13ec60c427fc122ca2658f6453d2bd27853d9c8c8763a8e54397c6685bb117e8.png"
}
