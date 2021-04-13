package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OgreBrute_2033 : Card() {
    override val id = 2033
    override val name = "食人魔步兵"
    override val description = "50%几率攻击错误的敌人。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "食人魔的短期失忆症非常严重。"
    override val artist = "Vinod Rams"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/48d95bcf8183ab7fdf1e57cfb0d20a2b686b8f1c0b103870a4c10afa39f80159.png"
}
