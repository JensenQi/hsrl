package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Plaguebringer_54863 : Card() {
    override val id = 54863
    override val name = "瘟疫使者"
    override val description = "<b>战吼：</b>使一个友方随从获得<b>剧毒</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy1635
    override val background = "流感的传播元凶。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aa88635374089d9cea5dfcdd36861f1922c43230d1468bd1c70d1ac3be99bbc8.png"
}
