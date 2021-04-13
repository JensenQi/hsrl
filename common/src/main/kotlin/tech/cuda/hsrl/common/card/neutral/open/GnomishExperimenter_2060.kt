package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GnomishExperimenter_2060 : Card() {
    override val id = 2060
    override val name = "侏儒实验技师"
    override val description = "<b>战吼：</b> 抽一张牌，如果该牌是随从牌，则将其变形成为一只小鸡。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "他的实验室总被路过的人误以为是鸡棚。"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/efd4616944e46c87e30e3a2b8e5c75f11ff88b96639d13b86db969f3e202c37d.png"
}
