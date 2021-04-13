package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritOfTheDead_50352 : Card() {
    override val id = 50352
    override val name = "亡者之灵"
    override val description = "<b>潜行</b>一回合。在一个友方随从死亡后，将它的一张复制洗入你的牌库，其法力值消耗为（1）。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RastakhansRumble
    override val background = "生是队里的人，死是队里的死人。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/829e2f9570e28a2b1097afba49848c27d7609b86ceed0d9d79617201a7c3ba26.png"
}
