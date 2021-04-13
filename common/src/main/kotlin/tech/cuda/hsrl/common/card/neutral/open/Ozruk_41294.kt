package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ozruk_41294 : Card() {
    override val id = 41294
    override val name = "欧泽鲁克"
    override val description = "<b>嘲讽，战吼：</b>在上个回合，你每使用一张元素牌，便获得+5生命值。"
    override var cost: Int? = 9
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "欧泽鲁克很在意自己的身材，是健身房里的常客。"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/166b49ede02f3bd775044544183138c022c471a85a579674c046ef94b6e55f55.png"
}
