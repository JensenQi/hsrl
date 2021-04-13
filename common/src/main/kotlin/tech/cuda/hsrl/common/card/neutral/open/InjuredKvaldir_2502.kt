package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InjuredKvaldir_2502 : Card() {
    override val id = 2502
    override val name = "受伤的克瓦迪尔"
    override val description = "<b>战吼：</b>对自身造成3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "不用担心。只要擦点护肤霜，他又会焕然一新的。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9ddd6aa02d53d3d8074a2794e1da6179573502417f55ad2151b9ebf0a28d416c.png"
}
