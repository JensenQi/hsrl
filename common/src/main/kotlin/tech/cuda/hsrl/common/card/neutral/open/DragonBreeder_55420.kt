package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonBreeder_55420 : Card() {
    override val id = 55420
    override val name = "幼龙饲养员"
    override val description = "<b>战吼：</b>选择一条友方的龙。将它的一张复制置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "死亡之翼要是被这家伙一手带大，或许还能变得好一点。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9d47f5e7db3b6d2b2a25d160b3652de45fd90565e15a5d4a5b97b245ef912c05.png"
}
