package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KnightOfTheWild_2788 : Card() {
    override val id = 2788
    override val name = "荒野骑士"
    override val description = "每当你召唤一个野兽，该随从牌的法力值消耗减少（1）点。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Tgt
    override val background = "他既是骑手又是坐骑，所以入场门票给打了折扣。"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0781cc30c8ee99c493e16dc44095c50cdc445c29a94208e70063453c9a144451.png"
}
