package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Akama_56530 : Card() {
    override val id = 56530
    override val name = "阿卡玛"
    override val description = "<b>潜行</b> <b>亡语：</b>将“终极阿卡玛”洗入你的牌库。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“对于我的众多族人而言，我是个叛徒……是伊利丹的走狗。现在，我会留在阴影之中……或许，我其实应该永远留在阴影之中。”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/758af16761903cc34875f313947e78f76cdffbb406aaeb18310521eb6364d216.png"
}
