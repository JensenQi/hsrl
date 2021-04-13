package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wildwalker_2786 : Card() {
    override val id = 2786
    override val name = "荒野行者"
    override val description = "<b>战吼：</b>使一个友方野兽获得+3生命值。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Tgt
    override val background = "她拥有与生俱来的过人之处，只不过她现在还没搞清楚而已。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4a7a067b13c22f7d5a513494b5929981ef4271f1e76d4b2f61a7ae07c29b7978.png"
}
