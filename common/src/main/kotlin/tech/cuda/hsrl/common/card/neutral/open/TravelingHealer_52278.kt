package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TravelingHealer_52278 : Card() {
    override val id = 52278
    override val name = "旅行医者"
    override val description = "<b>圣盾，战吼：</b>恢复 3点生命值。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "某些英雄的坚硬外壳之下有一颗柔软的心。"
    override val artist = "Tod Harris"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c2ad2fbdd5c468b275cd6073227451b5ee98f50a992f12135350b83230693eb.png"
}
