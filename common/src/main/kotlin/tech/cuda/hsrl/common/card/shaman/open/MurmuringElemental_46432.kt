package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurmuringElemental_46432 : Card() {
    override val id = 46432
    override val name = "低语元素"
    override val description = "<b>战吼：</b>你在本回合中的下一个<b>战吼</b>将触发两次。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "是不是有一种似曾相识的感觉？"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/342062b2f5149691f7320984fa96bae819030513de57b9dc3db106cf5354cd46.png"
}
