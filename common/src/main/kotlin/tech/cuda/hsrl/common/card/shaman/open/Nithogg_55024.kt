package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Nithogg_55024 : Card() {
    override val id = 55024
    override val name = "尼索格"
    override val description = "<b>战吼：</b>召唤两个0/3的龙卵。下个回合它们将孵化为4/4并具有<b>突袭</b>的幼龙。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“你是霍格”读快了就成了尼索格。"
    override val artist = "Peet Cooper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fc21a563e267933f55e0fcf3b96ee040f7e8cf5b3c23a823316dd37ae0e5e722.png"
}
